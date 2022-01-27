import java.util.Scanner;

public class Buscar extends Transplante {
  private String Nombre[];
  private int disponibles[];

  Scanner scan = new Scanner(System.in);

  public Buscar(String Nombre[], int disponibles[]) {
    super(Nombre, disponibles);
  }

  public void BuscarT(String nombre) throws Exception {

    for (int i = 0; i < Nombre.length; i++) {

      if (Nombre[i] == nombre && disponibles[i] > 0) {

        System.out.println("Transplante Encontrado!");
        System.out.println("" + Nombre[i]);

        String op = scan.nextLine();
        try {
          System.out.println("Desea reservar el transplante Encontrado?");

        } catch (Exception e) {
          System.out.println("Ha ocurrido un Error! vuelva a intentarlo :( ");
        }

        if (op.toLowerCase() == "si") {
          disponibles[i] -= 1;
          System.out.println("Transplante" + Nombre[i] + "Reservado");
        }
      } else
        System.out.println("Transplante No Encontrado");
    }
  }
}