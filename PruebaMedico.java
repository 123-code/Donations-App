import java.util.Scanner;

public class PruebaMedico {

    public static void main(String[] args) {

        PerfilPaciente persona = new PerfilPaciente("Martín", "Vargas", 'M', 8, 10, 2002, 1.70, 75);// Ejemplo Anterior Paciente
        Scanner input = new Scanner(System.in);

        System.out.println("PACIENTE 1 *Ejemplo*");
        System.out.printf("Nombre: %s %s", persona.getNombre(), persona.getApellido());
        System.out.printf("%nGenero: %c", persona.getGenero());
        System.out.println("");
        persona.edadPersona();
        System.out.println("");
        persona.frecCardProm();//Frecuencia Cardiaca Promedio
        System.out.println("");
        persona.iMC();//IMC del paciente

        System.out.println("\n\nIngrese los datos del paciente");
        System.out.print("Nombre: ");
        String name = input.nextLine();
        System.out.print("Apellido: ");
        String lastName = input.nextLine();
        System.out.print("Genero (M o F): ");
        char genero = input.next().charAt(0);
        System.out.println("Fecha de Nacimiento (Dia/Mes/Año)");
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Mes: ");
        int mes = input.nextInt();
        System.out.print("Año: ");
        int año = input.nextInt();
        System.out.print("Altura en metros: ");
        double altura = input.nextDouble();
        System.out.print("Peso en kilogramos: ");
        double peso = input.nextDouble();

        persona.setNombre(name);
        persona.setApellido(lastName);
        persona.setGenero(genero);
        persona.setDia(dia);
        persona.setMes(mes);
        persona.setAño(año);
        persona.setAltura(altura);
        persona.setPeso(peso);

        System.out.println("\nPACIENTE 2");
        System.out.printf("Nombre: %s %s", persona.getNombre(), persona.getApellido());
        System.out.printf("%nGenero: %c", persona.getGenero());
        System.out.println("");
        persona.edadPersona();
        System.out.println("");
        persona.frecCardProm();//Frecuencia Cardiaca Promedio
        System.out.println("");
        persona.iMC();//IMC del paciente
    }
}