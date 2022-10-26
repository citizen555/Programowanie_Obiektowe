import java.util.Random;
import java.util.Scanner;

public class Lab_zadania {
    static Scanner input=new Scanner(System.in);
    static Random losowe=new Random();

    //zad1
    public static float zadanie1(int n){
        int i=0,  nTemp=n, a;
        float suma=0;
        while(i!=n){
            System.out.println("Podaj ilosc punktow "+(i+1)+" studenta");
            a=input.nextInt();
            suma=suma+a;
            i++;
        }
        return suma/nTemp;
    }

     //zad2
     public static void zadanie2(){
         int a, sumUj=0, sumDod=0, countUj=0, countDod=0;
         System.out.println("Podaj 10 liczb:");
         for(int i=0;i<10;i++){
             System.out.print((i+1)+": ");
             a=input.nextInt();
             if(a>=0){
                 sumDod+=a;
                 countDod++;
             }else{
                 sumUj+=a;
                 countUj++;
             }
         }
         System.out.println("Dodatnie ilosc: "+countDod+" ### Dodatnie suma: "+sumDod);
         System.out.println("Ujemne ilosc: "+countUj+" ### Ujemne suma: "+sumUj);
     }

     //zad3
    public static void zadanie3(){
        int sum=0;
        int[] ciag= {1,55,32,4,-15,-38,0,2,-60};
        for (int i=0; i<ciag.length;i++){
            if(ciag[i]>0)
                if(ciag[i]%2==0)sum=sum+ciag[i];
        }
        System.out.println("Suma liczb parzystych dodatnich wynosi: "+sum);
    }

    //zad4
    public static void zadanie4(){
        int n,sum=0;
        System.out.println("Podaj n: ");
        n=input.nextInt();
        int[] tab=new int[n];
        for (int i=0;i<n;i++){
            tab[i]=losowe.nextInt(-9,45);
            if(tab[i]%2==0)sum+=tab[i];
        }
        System.out.println("Suma liczb parzystych losowanych z zakresu (-10,45) wynosi "+sum);
    }

    //zad5
    public static int zad5(){
        input.nextLine();
        String word;
        System.out.println("Podaj slowo: ");
        word=input.nextLine();
        for (int i=0;i<word.length()/2;i++){
            int j=word.length();
            if(word.charAt(i)==word.charAt(j-1))j--;
                else {
                    System.out.println("Slowo nie jest palindromem");
                    return 0;
            }
        }
        System.out.println("Slowo jest palindromem");
        return 0;
    }
}
