import java.util.Scanner;

public class Donar extends Transplante {

  private String Nombre[];
  private int donar[];
  int opcionMenu;

  Scanner scan = new Scanner(System.in);

  public Donar(String Nombre[], int donar[]) {
    super(Nombre, donar);
  }

  public void DonarT(String nombre) throws Exception {

    System.out.println("Bienvenid@ a la Sección donante de Donate Plus App\n");
    try {
      do {
        System.out.println("Que organo desea donar?\n 1:Hígado \n 2:Transplante renal \n 3:Córneas \n 4:Médula \n 5: Transplante de Tejido\n 6:Transplante cardiaco\n o 7: Donar sangre\n 8: Salir de la sección \n");

        opcionMenu = scan.nextInt();
      } while (opcionMenu < 0);

    } catch (Exception e) {
      System.out.println("Ha ocurrido un Error :( ,intentelo de nuevo");
    }
    switch (opcionMenu) {

      case 1: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de Higado, esta seguro de guardar la información  ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de Higado de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 2: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de Transplante renal, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de Transplante renal de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 3: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println( "Ha registrado donación de Córneas, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de Córneas de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 4: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de Médula, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de Médula de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 5: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de transplante de Tejido, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de transplante de Tejido de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 6: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de transplante cardiaco, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }

            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println("La donacion de transplante cardiaco de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }
      case 7: {

        for (int i = 0; i < Nombre.length; i++) {

          if (Nombre[i] == nombre && donar[i] > 0) {
            String op = scan.nextLine();
            try {
              System.out.println("Ha registrado donación de sangre, esta seguro de guardar la información ?\n Si o No");
              op = scan.nextLine();
            } catch (Exception e) {
              System.out.println("Ha ocurrido un Error!");
            }
            if (op.toLowerCase() == "si") {
              donar[i]++;
              System.out.println( "A que tipo de Sangre Pertenece:\n 1: A+ \n 2: A-\n 3: O+\n 4: O-\n 5: B+\n 6: B-\n 7:AB+\n 8:AB-\n");

              System.out.println("La donacion de sangre de parte de" + Nombre[i] + "ha sido registrada exitosamente");
            }
          }
        }
      }

      case 8: {
        System.out.println("Ha salido de la aplicación exitosamente");
      }
      default: {
        System.out.println("Opcion seleccionada invalida. Intente de nuevo");
      }
    }
  }
}