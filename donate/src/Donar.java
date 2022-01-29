package donate.src;

import java.util.Scanner;
public class Donar extends Transplante{
    public Donar(){
        super();
        }
        
        Transplante transplante = new Transplante();
        
        @Override
        public void leerdatos(){
          int op;
          Scanner scan = new Scanner(System.in);
          System.out.println("Que es lo que va a donar? 1. Corazon 2.Corneas");
        op = scan.nextInt();
        
        switch(op){
          case 1:
          System.out.println("Digite'si' para confirmar su donacion:");
          String conf = scan.nextLine();
        
        // falta codigo debajo.
        if(conf.equals("si")){
          transplante.setdisp();
          transplante.setcorazones();
          transplante.setdonaciones();
        }
        
        else{
          System.out.println("Donacion Cancelada :(");
        }
        
        case 2:
         System.out.println("Digite'si' para confirmar su donacion:");
          String confirmar = scan.nextLine();
        
        // falta codigo debajo.
        if(confirmar.equals("si")){
          transplante.setdisp();
          transplante.setcorneas();
          transplante.setdonaciones();
        
        }
        
        else{
          System.out.println("Donacion Cancelada :(");
        }
        }
        
        }
}
