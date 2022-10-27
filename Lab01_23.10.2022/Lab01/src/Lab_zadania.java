public class Lab_zadania {

     //zad1
     public static void Ja(){
         System.out.println("Tomek, 22");
     }

     //zad2
     public static void Oblicz(int a, int b){
         System.out.println(a+" + "+b+" = "+(a+b));
         System.out.println(a+" - "+b+" = "+(a-b));
         System.out.println(a+" * "+b+" = "+(a*b));
     }

     //zad3
     public static boolean parzysta(int a){
         if(a%2==0)return true;
         else return false;
     }

    //zad4
    public static boolean dziel3i5(int a) {
        if (a % 3 == 0 && a % 5 == 0) return true;
        else return false;
    }

    //zad5
    public static double Potega(double a){
        return Math.pow(a,3);
    }

    //zad6
    public static double sqrt(int a){
        return Math.sqrt(a);
    }

    //zad7
    public static boolean trojkat(double a, double b, double c){
        a=Math.pow(a,2);
        b=Math.pow(b,2);
        c=Math.pow(c,2);
        if(a+b==c)return true;
        else return false;
    }
}
