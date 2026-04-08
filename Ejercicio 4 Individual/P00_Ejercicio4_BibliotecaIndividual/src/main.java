import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro l1 = new Libro("Cervantes", "Fantasia", 1605, 50, "Don Quijote");

        int opcion;
        do {
            System.out.println("\n--- MENU BIBLIOTECA ---");
            System.out.println("1. Mostrar Informacion");
            System.out.println("2. Prestar unidades");
            System.out.println("3. Devolver unidades");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println(l1.mostrarInformacion());
            }
            else if(opcion == 2){
                System.out.print("¿Cuantas unidades desea prestar?: ");
                int cant = sc.nextInt();
                if(l1.prestarCantidad(cant)){
                    System.out.println("Prestamo exitoso de " + cant + " unidades.");
                } else {
                    System.out.println("No se pudo prestar. No hay suficiente stock.");
                }
            }
            else if(opcion == 3){
                System.out.print("¿Cuantas unidades va a devolver?: ");
                int cant = sc.nextInt();
                if(l1.devolverCantidad(cant)){
                    System.out.println("Devolucion exitosa de " + cant + " unidades.");
                } else {
                    System.out.println("Error: No puedes devolver mas de lo que se ha prestado.");
                }
            }

        } while(opcion != 0);

        System.out.println("Programa finalizado.");
    }
}