
package exemplosdata;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class Exemplo1 extends JFrame {
    
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 *60*60* 24;
    
    
    public Exemplo1(){
        inicializarComponentes();
        definirEventos();  
    }
    
    private void inicializarComponentes(){
        setTitle("Manipulação de Datas e Horas");
        setBounds(100,100,300,200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto,"Center");
        add(btMostrar,"North");
        agora = new Date();
    
    }

    private void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                long tempo = agora.getTime();
                Date novaData = new Date(agora.getTime() + (MILI_SEGUNDOS_POR_DIA *10));
                taTexto.setText("Milisegundos desde 1970: " + tempo +
                "\nDias: " + tempo/MILI_SEGUNDOS_POR_DIA +
                "\nMeses: " + tempo/MILI_SEGUNDOS_POR_DIA/30 +
                "\nAnos: " + tempo/MILI_SEGUNDOS_POR_DIA/365 +
                "\nData: " + novaData);        
                
              
            }
        });
        
    }
        
        public static void main(String[] args){
            JFrame janela = new Exemplo1();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
          
   }
}