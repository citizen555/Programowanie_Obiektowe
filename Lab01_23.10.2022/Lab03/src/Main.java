import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);

        //zad1
        System.out.println("zad1");
        System.out.println("Podaj ilosc studentow:");
        a=input.nextInt();
        System.out.println("Srednia liczba punktow wnosi "+Lab_zadania.zadanie1(a)+" punktow");

        //zad2
        System.out.println("zad2");
        Lab_zadania.zadanie2();

        //zad3
        System.out.println("zad3");
        Lab_zadania.zadanie3();

        //zad4
        System.out.println("zad4");
        Lab_zadania.zadanie4();

        //zad5
        System.out.println("zad5");
        Lab_zadania.zad5();

    }
}