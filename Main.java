
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int seria1 = 1;
        float sumaCalosc = 0;
        String decyzja = "t";

        Scanner skaner = new Scanner(System.in);
        System.out.print("Wpisz swoje dane. \n Aktualna waga: ");
        Float wagaOsoby = skaner.nextFloat();

        System.out.println("Wybierz cwiczenie: \n 1. benchpress \n 2. pullups \n 3. deadlift \n \n 4. Zakoncz trening");
        int cwiczenie = skaner.nextInt();

        if (cwiczenie == 1) {
            do {
                System.out.println("BENCHPRESS \nNumer serii: " + seria1);
                System.out.print("Jakie obciazenie?: ");
                float obciazenie1 = skaner.nextFloat();
                System.out.print("Ile powtorzen?: ");
                float powtorzenia1 = skaner.nextFloat();
                float suma = obciazenie1 * powtorzenia1;
                sumaCalosc = sumaCalosc + suma;
                System.out.println("Brawo, wykonana ilość serii: " + seria1 + ". Podniosłeś lacznie: " + sumaCalosc + "kg.");
                System.out.print("Czy kontynuujesz to ćwiczenie?: (T/N) ");
                decyzja = skaner.next();
                seria1++;
            } while (decyzja.equals("t") || decyzja.equals("T"));


        } else if (cwiczenie == 2) {
            do {
            System.out.println("PULLUPS \nNumer serii: " + seria1);
            System.out.print("Jakie obciazenie?: ");
            float obciazenie1 = skaner.nextFloat();
            System.out.print("Ile powtorzen?: ");
            float powtorzenia1 = skaner.nextFloat();
            float suma = obciazenie1 * powtorzenia1;
            sumaCalosc = sumaCalosc + suma;
            System.out.println("Brawo, wykonana ilość serii: " + seria1 + ". Podniosłeś lacznie: " + sumaCalosc + "kg.");
            System.out.print("Czy kontynuujesz to ćwiczenie?: (T/N) ");
            decyzja = skaner.next();
            seria1++;
        } while (decyzja.equals("t") || decyzja.equals("T"));

        } else if (cwiczenie == 3) {
            do {
            System.out.println("DEADLIFT \nNumer serii: " + seria1);
            System.out.print("Jakie obciazenie?: ");
            float obciazenie1 = skaner.nextFloat();
            System.out.print("Ile powtorzen?: ");
            float powtorzenia1 = skaner.nextFloat();
            float suma = obciazenie1 * powtorzenia1;
            sumaCalosc = sumaCalosc + suma;
            System.out.println("Brawo, wykonana ilość serii: " + seria1 + ". Podniosłeś lacznie: " + sumaCalosc + "kg.");
            System.out.print("Czy kontynuujesz to ćwiczenie?: (T/N) ");
            decyzja = skaner.next();
            seria1++;
        } while (decyzja.equals("t") || decyzja.equals("T"));

        }

    }
}