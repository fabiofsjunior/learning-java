package cursojava.executavel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.PlanilhaGastos;

/* [Forma mais simples]
Iniciar o programa: 
solicitar valores até que finalize a quantidade de transações.
adicionar os valores numa lista.
somar os valores
printar o valor total da soma.



[+Features]
separar por tags (cria uma nova lista por tags)
apresenta opções de print por tags (MENU OPÇÕES)
printar o valor total da soma por tag.
excluir valores
gerar gráficos de gastos
integrar campos no site. 
https://fabiofsjunior.github.io/gestorfinanceiro/

Plano de Contas = "Tags : Receitas/Despesas / Crédito"

*/

public class GestorFinanceiro {
    public static void main(String[] args) throws FileNotFoundException {

        // Configurações iniciais
        PlanilhaGastos planilhaMensal = new PlanilhaGastos();
        String senha;
        String login;
        Boolean autenticado = false;

        // Classe que realiza a leitura do PATH do arquivo.

        FileInputStream entradaPathArquivo = new FileInputStream(new File(JOptionPane.showInputDialog("cole o diretório:")));
        
        FileInputStream entradaArquivo = new FileInputStream(new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.txt"));

        // Classe que abre o arquivo e identifica o padrão de leitura.
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
        
        // Necessário Estanciar uma lista para adicionar os objetos que serão
        // "SPLITADOS".
        // Lendo e realizando o Split
        // while (lerArquivo.hasNext()) {
        //     String linha = lerArquivo.nextLine();
        //     String[] dados = linha.split("\\$");

        //     ItemTransacao itemTransacao = new ItemTransacao(null, null, 0, null, null, null);
        //     itemTransacao.setValorTransacao(Double.parseDouble(dados[1]));
        //     itemTransacao.setNomeTransacao(dados[2]);

        //     transacoes.add(itemTransacao);

        //     // Verifica se a linha está em branco.
        //     if (linha != null && !linha.isEmpty()) {
        //         System.out.println(linha);
        //     }
        // }

        // // Retorna todos os objetos da lista.
        // for (ItemTransacao itemTransacao : transacoes) {
        //     System.out.println(itemTransacao);

        // }
        

        senha = JOptionPane.showInputDialog("Informe o Login! ");
        login = JOptionPane.showInputDialog("Informe o Senha! ");

        // ESTA LINHA TENTA PRIMEIRA AUTENTICAÇÃO
        if (planilhaMensal.autenticar(login, senha)) {

            autenticado = true;

            planilhaMensal.setListNome("Lista De Gastos Mensal");

            PlanilhaGastos listaTagAlimentacao = new PlanilhaGastos(); // TAG == 1
            listaTagAlimentacao.setListNome("Tag Alimentação");
            listaTagAlimentacao.setListaTagList("1");

            PlanilhaGastos listaTagTransporte = new PlanilhaGastos(); // TAG == 2
            listaTagTransporte.setListNome("Tag Transporte");
            listaTagTransporte.setListaTagList("2");

            PlanilhaGastos listaTagSaude = new PlanilhaGastos(); // TAG == 3
            listaTagSaude.setListNome("Tag Saúde");
            listaTagSaude.setListaTagList("3");

            PlanilhaGastos listaTagLazer = new PlanilhaGastos(); // TAG == 4
            listaTagLazer.setListNome("Tag Lazer");
            listaTagLazer.setListaTagList("4");

            PlanilhaGastos listaTagRoupas = new PlanilhaGastos(); // TAG == 5
            listaTagRoupas.setListNome("Tag Roupas");
            listaTagRoupas.setListaTagList("5");

            PlanilhaGastos listaTagOutros = new PlanilhaGastos(); // TAG == 6
            listaTagOutros.setListNome("Tag Outros");
            listaTagOutros.setListaTagList("6");

            PlanilhaGastos listaPagDinheiro = new PlanilhaGastos(); // TAG == 1
            listaPagDinheiro.setListNome("(Pagamentos em Dinheiro)");
            listaPagDinheiro.setListaFormaPagamento("1");

            PlanilhaGastos listaPagCredito = new PlanilhaGastos(); // TAG == 2
            listaPagCredito.setListNome("(Pagamentos em Cartão Crédito)");
            listaPagCredito.setListaFormaPagamento("2");

            PlanilhaGastos listaPagDebito = new PlanilhaGastos(); // TAG == 3
            listaPagDebito.setListNome("(Pagamentos em Cartão Débito)");
            listaPagDebito.setListaFormaPagamento("3");

            PlanilhaGastos listaPagPix = new PlanilhaGastos(); // TAG == 4
            listaPagPix.setListNome("(Pagamentos em Pix)");
            listaPagPix.setListaFormaPagamento("4");

            //// Todos os objetos Carregados em memória e pronto para usar.

            JOptionPane.showMessageDialog(null, "Gestor de Gastos Pessoais v1.0");
            // Precisa melhorar esse método de Login com Interfaces.

            // Chamada inicial para o método que adiciona transações e imprime no console.
            // Em breve exportar em Excel

            planilhaMensal.adicionarTransacao();
            planilhaMensal.continuarAddTransacao();
            planilhaMensal.mostrarGastos();

            // CLASSIFICAÇÃO DAS LISTAS POR TAGS
            // se estiver preenchida Imprime no console com o metodo mostrarGastos().

            listaTagAlimentacao.listarPorTags(planilhaMensal.getListaDeGastos());
            // listaTagAlimentacao.verificaSeListaVazia(listaTagAlimentacao);
            listaTagAlimentacao.mostrarGastos();

            listaTagLazer.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagLazer.mostrarGastos();

            listaTagSaude.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagSaude.mostrarGastos();

            listaTagTransporte.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagRoupas.mostrarGastos();

            listaTagRoupas.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagTransporte.mostrarGastos();

            listaTagOutros.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagOutros.mostrarGastos();

            // Classificação das listas por Forma de Pagamento
            // listaPagDinheiro.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagDinheiro.mostrarGastos();

            // listaPagCredito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagCredito.mostrarGastos();

            // listaPagDebito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagDebito.mostrarGastos();

            // listaPagPix.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagPix.mostrarGastos();

        } else if (autenticado == false) { // AQUI REALIZA UMA NOVA TENTATIVA DE AUTENTICAÇÃO

            JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos.");
            for (int tentativas = 2; tentativas >= 0; --tentativas) {

                senha = JOptionPane.showInputDialog("Informe o Login! ");
                login = JOptionPane.showInputDialog("Informe o Senha! ");

                if (planilhaMensal.autenticar(login, senha)) {
                    break;

                } else if (tentativas == 0) {
                    JOptionPane.showMessageDialog(null, "Acesso Bloqueado, contate o suporte");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Login ou Senha Inválidos. Tentativas restantes " + (tentativas - 1));
                }
            }
            planilhaMensal.setListNome("Lista De Gastos Mensal");

            PlanilhaGastos listaTagAlimentacao = new PlanilhaGastos(); // TAG == 1
            listaTagAlimentacao.setListNome("Tag Alimentação");
            listaTagAlimentacao.setListaTagList("1");

            PlanilhaGastos listaTagTransporte = new PlanilhaGastos(); // TAG == 2
            listaTagTransporte.setListNome("Tag Transporte");
            listaTagTransporte.setListaTagList("2");

            PlanilhaGastos listaTagSaude = new PlanilhaGastos(); // TAG == 3
            listaTagSaude.setListNome("Tag Saúde");
            listaTagSaude.setListaTagList("3");

            PlanilhaGastos listaTagLazer = new PlanilhaGastos(); // TAG == 4
            listaTagLazer.setListNome("Tag Lazer");
            listaTagLazer.setListaTagList("4");

            PlanilhaGastos listaTagRoupas = new PlanilhaGastos(); // TAG == 5
            listaTagRoupas.setListNome("Tag Roupas");
            listaTagRoupas.setListaTagList("5");

            PlanilhaGastos listaTagOutros = new PlanilhaGastos(); // TAG == 6
            listaTagOutros.setListNome("Tag Outros");
            listaTagOutros.setListaTagList("6");

            PlanilhaGastos listaPagDinheiro = new PlanilhaGastos(); // TAG == 1
            listaPagDinheiro.setListNome("(Pagamentos em Dinheiro)");
            listaPagDinheiro.setListaFormaPagamento("1");

            PlanilhaGastos listaPagCredito = new PlanilhaGastos(); // TAG == 2
            listaPagCredito.setListNome("(Pagamentos em Cartão Crédito)");
            listaPagCredito.setListaFormaPagamento("2");

            PlanilhaGastos listaPagDebito = new PlanilhaGastos(); // TAG == 3
            listaPagDebito.setListNome("(Pagamentos em Cartão Débito)");
            listaPagDebito.setListaFormaPagamento("3");

            PlanilhaGastos listaPagPix = new PlanilhaGastos(); // TAG == 4
            listaPagPix.setListNome("(Pagamentos em Pix)");
            listaPagPix.setListaFormaPagamento("4");

            //// Todos os objetos Carregados em memória e pronto para usar.

            JOptionPane.showMessageDialog(null, "Gestor de Gastos Pessoais v1.0");
            // Precisa melhorar esse método de Login com Interfaces.

            // Chamada inicial para o método que adiciona transações e imprime no console.
            // Em breve exportar em Excel

            planilhaMensal.adicionarTransacao();
            planilhaMensal.continuarAddTransacao();
            planilhaMensal.mostrarGastos();

            // CLASSIFICAÇÃO DAS LISTAS POR TAGS
            // se estiver preenchida Imprime no console com o metodo mostrarGastos().

            listaTagAlimentacao.listarPorTags(planilhaMensal.getListaDeGastos());
            // listaTagAlimentacao.verificaSeListaVazia(listaTagAlimentacao);
            listaTagAlimentacao.mostrarGastos();

            listaTagLazer.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagLazer.mostrarGastos();

            listaTagSaude.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagSaude.mostrarGastos();
            ;

            listaTagTransporte.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagRoupas.mostrarGastos();

            listaTagRoupas.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagTransporte.mostrarGastos();

            listaTagOutros.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagOutros.mostrarGastos();

            // Classificação das listas por Forma de Pagamento
            // listaPagDinheiro.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagDinheiro.mostrarGastos();

            // listaPagCredito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagCredito.mostrarGastos();

            // listaPagDebito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagDebito.mostrarGastos();

            // listaPagPix.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            // listaPagPix.mostrarGastos();

        } else {
            JOptionPane.showMessageDialog(null, "Acesso Bloqueado, contate o suporte");
        }

        JOptionPane.showMessageDialog(null,
                "FICAMOS FELIZES EM AJUDAR VOCÊ COM SUAS FINANÇAS, \n Encerrando programa!");
    }
}
