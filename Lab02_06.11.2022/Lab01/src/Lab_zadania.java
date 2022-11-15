import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import com.sun.security.jgss.GSSUtil;
public class Lab_zadania {
        public static int[] zad1Random(){
            Random generator=new Random();
            int tab[]=new int[10];
            for (int i=0;i<10;i++){
                tab[i]= generator.nextInt(-50,50);
            }
            return tab;
        }
        public static int[] zad6Random(){
            Random generator=new Random();
            int tab[]=new int[5];
            for (int i=0;i<5;i++){
                tab[i]= generator.nextInt(1,8);
            }
            return tab;
        }
        public static void zad1(){
            int tab[]=zad1Random();
            int sum=0;
            float avg=0;
            for (int i=0;i<tab.length;i++){
                sum+=tab[i];
            }
            avg=sum/tab.length;
            System.out.println("Petla for: ");
            System.out.println("Suma wynosi: "+sum+" a srednia "+avg);
            //###
            sum=0;
            avg=0;
            for(int i:tab){
                sum+=i;
            }
            avg=sum/tab.length;
            System.out.println("Petla forn each: ");
            System.out.println("Suma wynosi: "+sum+" a srednia "+avg);
        }
        public static void zad2(){
            int tab1[]={1,2,3,4,5,6};
            int tab2[]={7,8,9,10,11};
            for(int i=0;i< tab1.length;i+=2){
                System.out.print(tab1[i]+" ");
            }
            System.out.println("\n");
            for(int i=0;i< tab2.length;i+=2){
                System.out.print(tab2[i]+" ");
            }
            System.out.println("\n");
        }
        public static void zad3(){
            String [] tabString={"NiedzIelA","POnieDZilek","NieDZIEla"};
            for(String elemnt:tabString){
                System.out.println(elemnt.toUpperCase());
            }
        }
        public static void zad4(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Podaj 5 slow do tablicy:");
            String[] slowo=new String[5];
            for(int i=0; i< slowo.length;i++){
                slowo[i]=scan.next();
            }
            for(int i= slowo.length-1;i>=0;i--){
                for(int j= slowo[i].length()-1;j>=0;j--){
                    System.out.print(slowo[i].charAt(j));
                }
                System.out.println();
            }
        }
        public static void zad5() {
            int tab[] = zad1Random();
            int temp;
            for (int i = 0; i <tab.length;i++){
                for (int j=i+1;j<tab.length;j++) {
                    if (tab[i] > tab[j]) {
                        temp = tab[i];
                        tab[i] = tab[j];
                        tab[j] = temp;
                    }
                }
            }
            for(int i:tab){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
        public static void zad6(){
            int[] tab=zad6Random();
            for(int i=0;i<tab.length;i++){
                int silnia=1;
                for(int j=1;j<=tab[i];j++){
                    silnia=silnia*j;
                }
                System.out.print(silnia+" ");
            }
            System.out.println("\n");
        }
        public static void zad7(){
            String [] tab1;
            String [] tab2;
            tab1=new String[]{"Konstantynopolitanczykowianeczka"};
            tab2=new String[]{"Konstantynopolitanczykowianeczka"};
            if(tab1[0].equals(tab2[0])){
                System.out.println("Tablice sa takie same");
            }else{
                System.out.println("Tablice sa rozne");
            }
        }
}
