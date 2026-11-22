class Araba{
    String model;
    String renk;
    int yil;
    int hiz;
void bilgileriGoster(){
    System.out.println("Model:"+ model +", renk: "+renk +", yıl: "+yil);
    System.out.println("bilgisayar degisikligi");

}
}
public class test2{
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.model = "Mercedes";
        araba1.renk ="siyah";
        araba1.yil = 2023;

        Araba araba2 = new Araba();
        araba2.model = "Range Rover";
        araba2.renk ="beyaz";
        araba2.yil = 2026;

        araba1.bilgileriGoster();
        araba2.bilgileriGoster();
    }
}
