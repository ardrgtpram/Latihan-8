package latihan8;
public class Inter implements D1, I1 {
    public Inter(){
    }
    public void D1(){
        System.out.println("Angka merupakan hasil pecahan/angka desimal/tipe data double");
    }
    public void I1(){
        System.out.println("Angka merupakan angka bulat/angka yang hasil modulonya 0/tipe data integer");
    }
}