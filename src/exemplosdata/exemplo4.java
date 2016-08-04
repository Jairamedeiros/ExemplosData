
package exemplosdata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class exemplo4 extends JFrame{
    
     private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 *60*60* 24;
    
    
    public exemplo4(){
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
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(agora);
                int dia = calendario.get(Calendar.DATE);
                int mes = calendario.get(Calendar.MONTH)+1;
                int ano = calendario.get(Calendar.YEAR);
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minuto = calendario.get(Calendar.MINUTE);
                int segundo = calendario.get(Calendar.SECOND);
                int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
                String semana = "";
                if(diaDaSemana == Calendar.SATURDAY || diaDaSemana == Calendar.SUNDAY){
                    semana = "Fim de Semana";
            }else{
                
                semana = "Dia Util";
                
                }                
                taTexto.setText("Dia = " + dia +
                "\nMes = " + mes +
                "\nAno = " + ano +
                "\nHora = " + hora +
                "\nMinuto = " + minuto +
                "\nSegundo = " + segundo +
                "\nDia da semana = " + diaDaSemana +   
                "\n" + semana        
                );      
                        
                             

               
            }
        });
        
    }
        
        public static void main(String[] args){
            JFrame janela = new exemplo4();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
           
        
    
   }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

