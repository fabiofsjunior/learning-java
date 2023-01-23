package cursojava.thread;

import static java.awt.GridBagConstraints.WEST;

import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

public class TelaTimeThread extends JDialog {
    // Componentes
    JPanel jPanel = new JPanel(new GridBagLayout());

    JLabel descricaoHora1 = new JLabel("Time Thread 1");
    JTextField mostraTempo1 = new JTextField();

    JLabel descricaoHora2 = new JLabel("Time Thread 2");
    JTextField mostraTempo2 = new JTextField();

    JButton jButtonStart = new JButton("Start");
    JButton jButtonStop = new JButton("Stop");

    Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (true) {

                mostraTempo1
                        .setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };

    Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true) {

                mostraTempo2
                        .setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };

    Thread threadTime1;
    Thread threadTime2;

    public TelaTimeThread() { // Executa o que tiver dentro no momento da abertura ou execução
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
        mostraTempo1.setEditable(false);
        jPanel.add(mostraTempo1, GridBagConstraints);

        descricaoHora2.setPreferredSize(new DimensionUIResource(200, 25));
        GridBagConstraints.gridy++;
        jPanel.add(descricaoHora2, GridBagConstraints);

        mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
        GridBagConstraints.gridy++;
        mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2, GridBagConstraints);

        /****************************************** */
        GridBagConstraints.gridwidth = 1;

        jButtonStart.setPreferredSize(new DimensionUIResource(92, 25));
        GridBagConstraints.gridy++;
        jPanel.add(jButtonStart, GridBagConstraints);

        jButtonStop.setPreferredSize(new DimensionUIResource(92, 25));
        GridBagConstraints.gridx++;
        jPanel.add(jButtonStop, GridBagConstraints);

        jButtonStart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                threadTime1 = new Thread(thread1);
                threadTime1.start();                
                threadTime2 = new Thread(thread2);
                threadTime2.start(); 
                jButtonStart.setEnabled(false);               
                jButtonStop.setEnabled(true);
            }
        });

        jButtonStop.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                threadTime1.stop();
                threadTime2.stop();
                jButtonStart.setEnabled(true);
                jButtonStop.setEnabled(false);

            }

        });
        jButtonStop.setEnabled(false);

        add(jPanel, BorderLayout.WEST);
        // Método que torna a tela visível ao user. deve ser sempre a última linha do
        // bloco.
        setVisible(true);
    }
}
