import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main(String[] args)throws Exception{
    Buscar busqueda = new Buscar();
    List <Transplante> transplantes = new ArrayList<Transplante>(); 

  //Buscar buscar = null;
  
  //buscar = Buscar();
  
    int opcionMenu=0;

    Scanner scan = new Scanner(System.in);

    do{
      
      System.out.println("Bienvenid@ a Donate Plus App\n");

do{
  try{
      System.out.println("Que desea Hacer?\n 1: Realizar una donación para transplante\n 2: Buscar transplantes disponibles\n 3: Salir de la Aplicación \n");

      opcionMenu = scan.nextInt();}
      
      catch(Exception e){
        System.out.println("Ha ocurrido un Error!");
      }
}while(opcionMenu<1 || opcionMenu>3);

  switch (opcionMenu){

        case 1: {
          try{
          System.out.println("Ingrese el nombre del transplante que desea donar:");
          String busq = scan.nextLine();

          Buscar busqueda = new Buscar(busq);
          /*Array List 
          ArrayList<Buscar> busquedas = new ArrayList<Buscar>();
          */

        } catch(Exception e){
          System.out.println("Ha ocurrido un Error!");
        }   
          }
        case 2: {
        try{
          System.out.println("Ingrese el nombre del transplante a buscar:");
          String busq = scan.nextLine();

          //Buscar buscar = new Buscar({busq},{0});
          //buscar.BuscarT(busq);

        } catch(Exception e){
          System.out.println("Ha ocurrido un Error!");
        }       
          }

        case 3: {
          System.out.println("Ha salido de la aplicación exitosamente :) ");
          }
        default: {
          System.out.println("Opcion seleccionada invalida. Intente de nuevo");
          }  
      }
    }while (opcionMenu != 3);
    scan.close();
  }
}