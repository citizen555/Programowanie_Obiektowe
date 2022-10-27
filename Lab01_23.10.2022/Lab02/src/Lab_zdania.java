import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Lab_zdania {

    static Scanner scan=new Scanner(System.in);
    //zad1
    public static void zad1(){
        float a,b,c,delta,x1,x2;
        System.out.println("Podaj a:");
        a=scan.nextFloat();
        System.out.println("Podaj b:");
        b=scan.nextFloat();
        System.out.println("Podaj b:");
        c=scan.nextFloat();
        delta=(b*b)-(4*a*c);
        if(delta>0){
            x1= (float) ((((-b)-Math.sqrt(delta)))/(2*a));
            x2= (float) ((((-b)+Math.sqrt(delta)))/(2*a));
            System.out.println("Rownanie ma dwa rozwiazania x1: "+x1+" oraz x2: "+x2);
        }else if(delta==0){
            x1=(-b)/(2*a);
            System.out.println("Rownanie ma jedno rozwiazanie x: "+x1);
        }else {
            System.out.println("Rownanie nie ma rozwiazan");
        }
    }

    //zad2
    public static void zad2(){
        float x;
        System.out.println("Podaj argument x do obliczenia funkci a(x), b(x), c(x):");
        System.out.print("x: ");
        x=scan.nextFloat();
        //a(x)
        if(x>0)System.out.println("a(x) = "+(2*x));
            else if(x==0)System.out.println("a(x) = "+0);
                else if(x<0)System.out.println("a(x) = "+(-3*x));
        //b(x)
        if(x>=1)System.out.println("b(x) = "+x*x);
            else if(x<1)System.out.println("b(x) = "+x);
        //c(x)
        if(x>2)System.out.println("a(x) = "+(2+x));
            else if(x==2)System.out.println("a(x) = "+8);
                else if(x<2)System.out.println("a(x) = "+(x-4));
    }

    //zad3
    public static void zad3(){
        float[] tab=new float[3];
        System.out.println("Podaj x, y, z do posortowania rosnąco: ");
        for(int i=0;i<3;i++){
            System.out.print("Argument "+(i+1)+": ");
            tab[i]=scan.nextFloat();
        }
        Arrays.sort(tab);
        System.out.println("Tablica po sortowaniu:");
        for(int i=0;i<3;i++){
            System.out.print("Argument "+(i+1)+": ");
            System.out.println(tab[i]);
        }
    }

    //zad4
    public static int zad4(){
        int deszcz, autobus;
        System.out.print("Czy pada deszcz? (1/0): ");
        deszcz=scan.nextInt();
        if(deszcz!=1&&deszcz!=0) {
            System.out.println("Dopuszczalna odpowiedz to '1' lub '0'");
            return 0;
        }
        System.out.print("Czy jest autobus? (1/0): ");
        autobus=scan.nextInt();
        if(autobus!=1&&autobus!=0) {
            System.out.println("Dopuszczalna odpowiedz to '1' lub '0'");
            return 0;
        }
        //warunek
        if(deszcz==1&&autobus==1) System.out.println("Wez parasol, Dostaniesz sie na uczelnie.");
            else if(deszcz==1&&autobus==0) System.out.println("Nie dostaniesz sie na uczelnie.");
                else if(deszcz==0&&autobus==1) System.out.println("Dostaniesz sie na uczelnie, Milego dnia i pieknej pogody.");
        return 0;
    }

    //zad5
    public static int zad5(){
        int samochod, premia;
        System.out.print("Czy jest znizka na samochod? (1/0): ");
        samochod=scan.nextInt();
        if(samochod!=1&&samochod!=0) {
            System.out.println("Dopuszczalna odpowiedz to '1' lub '0'");
            return 0;
        }
        System.out.print("Czy otrzymales/as premie? (1/0): ");
        premia=scan.nextInt();
        if(premia!=1&&premia!=0) {
            System.out.println("Dopuszczalna odpowiedz to '1' lub '0'");
            return 0;
        }
        //warunek
        if(samochod==0||premia==1) System.out.println("Możesz kupić samochód ! Zniżki na samochód nie ma.");
            else if(samochod==0||premia==0) System.out.println("Zakup samochód trzeba odłożyć na później... Zniżki na samochód nie ma");
                else if(samochod==1||premia==1) System.out.println("Możesz kupić samochód !");
        return 0;
    }

    //zad6
    public static int zad6(){
        int a;
        float x,y;
        System.out.println("Dostepne dzialania:");
        System.out.println("1 Aby wykonac dodawanie");
        System.out.println("2 Aby wykonac odejmowanie");
        System.out.println("3 Aby wykonac mnozenie");
        System.out.println("4 Aby wykonac dzielenie");
        System.out.println("5 Aby wykonac reszte z dzielenia");
        System.out.print("\nWybierz dzialanie: ");
        a=scan.nextInt();
        if(a!=1&&a!=2&&a!=3&&a!=4&&a!=5) {
            System.out.println("Aby wykonac dzialania wybiez liczbe od 1 do 5.");
            return 0;
        }
        switch (a){
            case 1:
                System.out.print("x: ");
                x=scan.nextInt();
                System.out.print("y: ");
                y=scan.nextInt();

                System.out.println("Wynik to: "+(x+y));
                break;
            case 2:
                System.out.print("x: ");
                x=scan.nextInt();
                System.out.print("y: ");
                y=scan.nextInt();

                System.out.println("Wynik to: "+(x-y));
                break;
            case 3:
                System.out.print("x: ");
                x=scan.nextInt();
                System.out.print("y: ");
                y=scan.nextInt();

                System.out.println("Wynik to: "+(x*y));
                break;
            case 4:
                System.out.print("x: ");
                x=scan.nextInt();
                System.out.print("y: ");
                y=scan.nextInt();

                System.out.println("Wynik to: "+(x/y));
                break;
            case 5:
                System.out.println("Reszta z dzielenia liczy x przez y");
                System.out.print("x: ");
                x=scan.nextInt();
                System.out.print("y: ");
                y=scan.nextInt();

                System.out.println("Wynik to: "+(x%y));
                break;
            default:
                return 0;
        }
        return 0;
    }
}
