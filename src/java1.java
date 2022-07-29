import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        double Armut = 2.14,Elma=3.67 ,Domates = 1.11,Muz =0.95,Patlican = 5,q,w,e,r,t;
        Scanner i = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        q= i.nextDouble();
        Scanner a = new Scanner(System.in);
        System.out.print("Elma kaç kilo ? : ");
        w = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.print("Domates kaç kilo ? :");
        e = b.nextDouble();
        Scanner v = new Scanner(System.in);
        System.out.print("Muz kaç kilo ? :");
        r = v.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.print("Patlıcan kaç kilo ? :");
        t = c.nextDouble();
        double toplam = (q*Armut)+(w*Elma)+(e*Domates)+(r*Muz)+(Patlican*t);
        System.out.print("Toplam Tutar : "+toplam+" TL");
    }
}
