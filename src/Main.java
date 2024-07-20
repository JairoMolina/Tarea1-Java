import java.util.Scanner;

public class Main {
    public static void holaMundo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, Mundo!");

        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void sumaNumeros() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el primer número:");
        num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa el segundo número:");
        num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void parImpar() {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número:");
        num = scanner.nextInt();
        scanner.nextLine();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es un número par!!!");
        }
        else {
            System.out.println("El número " + " es un número impar!!!");
        }

        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void factorialNumero() {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Ingresa un número:");
        num = scanner.nextInt();
        scanner.nextLine();

        if (num < 0){
            System.out.println("Factorial no definido");
        }
        else if (num == 0){
            System.out.println("El factorial de " + num + " es 1");
        }
        else{int factorial = 1;
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }

            System.out.println("El factorial de " + num + " es " + factorial);
        }
        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número:");
        num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nTabla del " + num + " ascendente:");
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.println("\nTabla del " + num + " descendente:");
        for (int i = 10; i >= 1; i--){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void datosNumericos() {
        Scanner scanner = new Scanner(System.in);
        int num, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Ingrese un número:");

        while (true) {
            num = scanner.nextInt();
            scanner.nextLine();

            if (num <= -1){
                break;
            }
            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("\nEl número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);

        System.out.println("\nPresione cualquier tecla para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("----- Menu de Ejercicios: -----");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Extra!!!!");
            System.out.println("7. Salida");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;

                case 2:
                    sumaNumeros();
                    break;

                case 3:
                    parImpar();
                    break;

                case 4:
                    factorialNumero();
                    break;

                case 5:
                    tablaMultiplicar();
                    break;

                case 6:
                    datosNumericos();
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
                    break;
            }
        } while (option != 7);

        scanner.close();
    }
}