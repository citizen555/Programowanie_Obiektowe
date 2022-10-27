import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,randA,randB,randC;
        Scanner input=new Scanner(System.in);
        Random generator = new Random();

        //zad1
        Lab_zadania.Ja();

        //zad2
        System.out.println("Podaj a= ");
        a=input.nextInt();
        System.out.println("Podaj b= ");
        b=input.nextInt();
        Lab_zadania.Oblicz(a,b);

        //zad3
        System.out.println("Podaj liczbę do sprawdzenia czy jest parzysta: ");
        a=input.nextInt();
        System.out.println(Lab_zadania.parzysta(a));

        //zad4
        System.out.println("Podaj liczbę do sprawdzenia czy jest podzielna przez 3 i 5: ");
        a=input.nextInt();
        System.out.println(Lab_zadania.dziel3i5(a));

        //zad5
        System.out.println("Podaj do ^3: ");
        a=input.nextInt();
        System.out.println((int)Lab_zadania.Potega(a));

        //zad6
        System.out.println("Podaj liczbe do sqrt: ");
        a=input.nextInt();
        System.out.println((int)Lab_zadania.sqrt(a));

        //zad7
        System.out.println("Podaj zakres losowania liczb <a,b>: ");
        System.out.println("a: ");
        a=input.nextInt();
        System.out.println("b: ");
        b=input.nextInt();
        System.out.println("<"+a+","+b+">");
        randA=generator.nextInt(a,b+1);
        randB=generator.nextInt(a,b+1);
        randC=generator.nextInt(a,b+1);
        System.out.println(Lab_zadania.trojkat(randA,randB,randC));
    }
}