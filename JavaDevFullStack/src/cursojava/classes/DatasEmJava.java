package cursojava.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException, InterruptedException {

        Calendar calendar = Calendar.getInstance(); // Novo método parar trabalhar com Data e Hora.

        // Método depreciado DATE.
        Date date = new Date();
        System.out.println("DATE do mês: " + date.getDate());
        System.out.println("CALENDAR dia do mês: " + calendar.get(calendar.DAY_OF_MONTH));
        System.out.println("_____________________________________________________________________\n");

        System.out.println("DATE Dia da semana: " + date.getDay());
        System.out.println("CALENDAR dia da semana: " + calendar.get(calendar.DAY_OF_WEEK));
        System.out.println("_____________________________________________________________________\n");

        System.out.println("DATE Hora do dia: " + date.getHours());
        System.out.println("CALENDAR hora do dia: " + calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("_____________________________________________________________________\n");

        System.out.println("DATE Minuto da Hora: " + date.getMinutes());
        System.out.println("CALENDAR minuto da hora do dia: " + calendar.get(calendar.MINUTE));

        System.out.println("DATE Segundos: " + date.getSeconds());
        System.out.println("CALENDAR segundos dos minutos: " + calendar.get(calendar.SECOND));

        System.out.println("DATE Ano: " + (date.getYear() + 1900));
        System.out.println("CALENDAR Ano : " + calendar.get(calendar.YEAR));

        System.out.println("_____________________________________________________________________\n");

        // SIMPLE DATE FORMAT

        SimpleDateFormat simpleDateFormatTela = new SimpleDateFormat("dd/MM/yyyy");// Formato de TELA

        System.out.println("Data atual em formato padrão e String: " + simpleDateFormatTela.format(date));
        System.out.println("CALENDAR Data atual : " + simpleDateFormatTela.format(calendar.getTime()));

        System.out.println("_____________________________________________________________________\n");

        SimpleDateFormat simpleDateFormatTelaHorario = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");// Formato de TELA
        System.out.println("Data atual em formato padrão e String: " + simpleDateFormatTelaHorario.format(date));
        System.out.println("CALENDAR Data atual : " + simpleDateFormatTelaHorario.format(calendar.getTime()));

        System.out.println("_____________________________________________________________________\n");

        SimpleDateFormat simpleDateFormatDb = new SimpleDateFormat("yyyy-MM-dd");// Formato de DB
        System.out.println("Data atual em formato DB e String: " + simpleDateFormatDb.format(date));
        System.out.println("CALENDAR Data atual : " + simpleDateFormatDb.format(calendar.getTime()));

        System.out.println("_____________________________________________________________________\n");

        //////////////////////////////////////////////////////////////////////////////////////////////
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");

        // Comparando datas AFTER e BEFORE

        // AFTER
        Date dataVencimentoBoleto = simpleDateFormat.parse("02/02/2023");

        Date dataAtualHoje = simpleDateFormat.parse("31/01/2023");

        // Se a data do vencimento é maior que a data ATUAL:
        if (dataVencimentoBoleto.after(dataAtualHoje)) {
            System.out.println("Boleto não vencido");
        } else {
            System.out.println("Boleto Vencido");
        }

        // BEFORE

        // Se a data do vencimento é maior que a data ATUAL:
        if (dataVencimentoBoleto.before(dataAtualHoje)) {
            System.out.println("Boleto Vencido");
        } else {
            System.out.println("Boleto não vencido!");

        }
        System.out.println("_____________________________________________________________________\n");


        ////////////// MANIPULANDO DATAS

        Calendar calendar2 = Calendar.getInstance(); // Pega a data atual.

        // Simulando data vindo do DB

        calendar2.setTime(new SimpleDateFormat("dd-MM-yyy").parse("10-03-2021")); // Definido uma data qualquer.

        calendar2.add(Calendar.DAY_OF_MONTH, 45); // Adiciona a data o montante de DIAS
        System.out.println("Somando os dias: " + new SimpleDateFormat("dd-MM-yyy").format(calendar2.getTime()));

        calendar2.add(Calendar.MONTH, 3); // Adiciona a data o montante de MESES..
        System.out.println("Somando os meses: " + new SimpleDateFormat("dd-MM-yyy").format(calendar2.getTime()));

        calendar2.add(Calendar.YEAR, 10); // Adiciona a data o montante de ANOS
        System.out.println("Somando os anos: " + new SimpleDateFormat("dd-MM-yyy").format(calendar2.getTime()));

        // Método estático para contagem de dias.
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-01-01"), LocalDate.now());

        System.out.println("Número de dias entre as faixas de datas " + dias);
        System.out.println("_____________________________________________________________________\n");


        ////////////////////////// GERAÇÃO DE DATAS DE BOLETOS ///////////////////////

        // estancio a data inicial

        Date dateInicial = new SimpleDateFormat("dd/MM/yy").parse("31/01/23");

        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(dateInicial);

        for (int parcela = 1; parcela <= 6; parcela++) {
            calendar3.add(Calendar.MONTH, 1);
            System.out.println("Parcela: " + parcela + "x, vencimento do boleto em "
                    + new SimpleDateFormat("dd/MM/yy.").format(calendar3.getTime()));

        }
        System.out.println("_____________________________________________________________________\n");


        // NOVA API DATA APARTIR DO JAVA 8

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual com LOCALDATE " + dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora Atual com LOCALTIME " + horaAtual);

        LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora Atual com LOCALDATETIME " + dataAtualHoraAtual);

        System.out.println(
                "Data e Hora atual Formatado " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("_____________________________________________________________________\n");

        /////////////// DURAÇÕES DE TEMPO ///////////////////////////
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());

        Instant inicio = Instant.now();
        Instant ifinal = Instant.now();

        Thread.sleep(1000); // Simulando um intervalo nos processos

        Duration duracao = Duration.between(inicio, ifinal);

        System.out.println("Nanos Segundos " + duracao.toNanos());
        System.out.println("Milissegundos " + duracao.toMillis());
        System.out.println("Minutos " + duracao.toMinutes());
        System.out.println("Horas " + duracao.toHours());
        System.out.println("Dias " + duracao.toDays());
        System.out.println("_____________________________________________________________________\n");

        ////////////////////////////// COMPARAÇÕES DE DATA COM LOCALDATE

        LocalDate dataAntiga = LocalDate.of(2018, 1, 7);

        LocalDate dataNova = LocalDate.of(2023, 2, 7);

        System.out.println("Data antiga é posterior a data nova: " + dataAntiga.isAfter(dataNova));
        System.out.println("Data antiga é anterior a data nova: " + dataAntiga.isBefore(dataNova));
        System.out.println("Data antiga é igual a data nova: " + dataAntiga.isEqual(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias tem esta faixa de período. " + periodo.getDays());
        System.out.println("Quantos meses tem esta faixa de período. " + periodo.getMonths());
        System.out.println("Quantos anos tem esta faixa de período. " + periodo.getYears());
        System.out.println("_____________________________________________________________________\n");

        //////////////ADICIONANDO OU REMOVENDO DATAS

        LocalDate dataBase = LocalDate.parse("2018-01-07");
        
        System.out.println(dataBase.plusDays(5));
        System.out.println(dataBase.plusWeeks(5));
        System.out.println(dataBase.plusMonths(5));
        System.out.println(dataBase.plusYears(5));
        System.out.println("_____________________________________________________________________\n");





    }
}
