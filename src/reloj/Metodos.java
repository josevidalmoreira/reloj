
package reloj;

import javax.swing.JOptionPane;


public class Metodos {
    Tiempo t=new Tiempo(Integer.parseInt(JOptionPane.showInputDialog("hora")),Integer.parseInt(JOptionPane.showInputDialog("minutos")),Integer.parseInt(JOptionPane.showInputDialog("segundos")));
     int cont=0,segundo=t.getSegundo(),minuto=t.getMinuto(),horas=t.getHora(); 
   
     
     
     
     public void Start(){
      
       int h=Integer.parseInt(JOptionPane.showInputDialog("hora alarma" )), m=Integer.parseInt(JOptionPane.showInputDialog("minutos alarma"));
       
       
        do{
         if(horas==h && minuto==m){
             System.out.println("despierta vago" );
             cont=1;
         }
            if (segundo<60){
               segundo=segundo+1;
            } if(segundo==60){
              segundo=0;
              minuto=minuto+1;
                
            }if(minuto==60){
                minuto=0;
                horas=horas+1;
            }if(horas==24){
                horas=0;
                
            }
            System.out.println("horas: "+horas+" minutos: "+minuto+"segundos: "+segundo);
            
            
        }while(cont==0);
            
      
     }
    
    
    
    
    
}
