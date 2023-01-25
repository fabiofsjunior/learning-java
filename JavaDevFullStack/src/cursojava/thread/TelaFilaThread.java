package cursojava.thread;

import static java.awt.GridBagConstraints.WEST;

import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;


/*
 * Preciso da tela e seus componentes
 * em seguida preciso de um objeto com os dados a serem adicionados dentro da fila (ObjetoFilaThread.java)
 * criar a fila e inserir o objeto dentro dela. (ImplementacaoFilaThread)
 * 
 */
public class TelaFilaThread extends JDialog {
    // Componentes
    JPanel jPanel = new JPanel(new GridBagLayout());

    JLabel descricaoHora1 = new JLabel("Nome");
    JTextField mostraTempo1 = new JTextField();

    JLabel descricaoHora2 = new JLabel("Email");
    JTextField mostraTempo2 = new JTextField();

    JButton jButtonStart = new JButton("Add Lista");
    JButton jButtonStop = new JButton("Stop");

    ImplementacaoFilaThread fila = new ImplementacaoFilaThread(); //Necessário ja instanciar o objeto fila quando a tela estiver totalmente criada.

    public TelaFilaThread() { // Executa o que tiver dentro no momento da abertura ou execução
        // Configurações Iniciais
        setTitle("Minha Tela de Timer com Threads");
        setSize(new DimensionUIResource(240, 240));
        setLocationRelativeTo(null); // centraliza na tela
        setResizable(false); // deixa a tela tamanho padrão inicial, sem redimensionar.
        // Primeira parte concluída

        // controlador de posicionamento de componentes na tela.
        GridBagConstraints GridBagConstraints = new GridBagConstraints();
        GridBagConstraints.gridx = 0;
        GridBagConstraints.gridy = 0;
        GridBagConstraints.gridwidth = 2;
        GridBagConstraints.insets = new InsetsUIResource(5, 10, 5, 5);
        GridBagConstraints.anchor = WEST;

        descricaoHora1.setPreferredSize(new DimensionUIResource(200, 25));
        jPanel.add(descricaoHora1, GridBagConstraints);

        mostraTempo1.setPreferredSize(new DimensionUIResource(200, 25));
        GridBagConstraints.gridy++;
        jPanel.add(mostraTempo1, GridBagConstraints);

        descricaoHora2.setPreferredSize(new DimensionUIResource(200, 25));
        GridBagConstraints.gridy++;
        jPanel.add(descricaoHora2, GridBagConstraints);

        mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
        GridBagConstraints.gridy++;
        jPanel.add(mostraTempo2, GridBagConstraints);

        /****************************************** */
        GridBagConstraints.gridwidth = 1;

        jButtonStart.setPreferredSize(new DimensionUIResource(92, 25));
        GridBagConstraints.gridy++;
        jPanel.add(jButtonStart, GridBagConstraints);

        jButtonStop.setPreferredSize(new DimensionUIResource(92, 25));
        GridBagConstraints.gridx++;
        jPanel.add(jButtonStop, GridBagConstraints);

        jButtonStart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (fila == null) {
                    fila = new ImplementacaoFilaThread();
                    fila.start(); //Implementar o método START quando ativar o botão.
                }
                for (int qtd = 0; qtd <= 10; qtd++) {

                    ObjetoFilaThreads filaThread = new ObjetoFilaThreads();
                    //Captura o campo de texto
                    filaThread.setNome(mostraTempo1.getText()); 
                    filaThread.setEmail(mostraTempo2.getText() + " " + qtd);
                    fila.add(filaThread); // adiciona o objeto a pilha.
                }

            }
        });

        jButtonStop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                fila.stop();
                fila = null;

            }

        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        // Método que torna a tela visível ao user. deve ser sempre a última linha do
        // bloco.
        setVisible(true);
    }
}
