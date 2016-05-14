package latihan8;
import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Inter inter = new Inter();
        System.out.print("Masukkan angka: ");
        double angka = in.nextDouble();
        if(angka%1==0){
            inter.I1();
        } else {
            inter.D1();
        }
    }   
}