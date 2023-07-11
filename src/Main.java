//paso a paso para convertir dias en segundos


import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de días: ");
        int days = scanner.nextInt();
        int segundos = days * 24*60*60;

        System.out.println(days + " días equivalen a " + segundos + " segundos.");
    }
}
