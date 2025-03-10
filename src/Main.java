import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a Tamagotchi!");
        System.out.println("Elige un nombre para tu Tamagotchi:");
        
        String nombre = scanner.nextLine();
        int salud = 100;
        int hambre = 0;
        int felicidad = 100;
        Tamagotchi tamagotchi = new Tamagotchi(nombre, salud, hambre, felicidad);

        while (true) {
            System.out.println("\n¿Qué acción quieres realizar?");
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Comprobar estado");
            System.out.println("5. Salir");
            System.out.println("Elige una opción");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tamagotchi.alimentar();
                    break;
                case 2:
                    tamagotchi.jugar();
                    break;
                case 3:
                    tamagotchi.dormir();
                    break;
                case 4:
                    tamagotchi.comprobarEstado();
                    break;
                case 5:
                    System.out.println("¡Gracias por jugar!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Vuelve a inntentarlo.");
            }
            tamagotchi.pasarTiempo();
            if (tamagotchi.isCriticalState()){
                System.out.println(nombre + "está en estado crítico.");
                break;
            }
        }
    }
}
