import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg;
        double m;
        double sonuc;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu Giriniz Metre Cinsinden : ");
        m = girdi.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = girdi.nextDouble();
        sonuc = (kg/(m*m));
        System.out.print("VÜCUT KİTLE ENDEKSİNİZ : " + sonuc);

    }
}