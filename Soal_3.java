import java.util.Scanner;
public class Soal_3 {
    private int i;
    public int Vbola(){
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM VOLUME BOLA");
        System.out.println("Masukan Nilai Jari-Jari : ");
        double jari2 = in.nextDouble();
        double luas = (((Math.PI * Math.pow(jari2,3)*4)/3));
        System.out.println("Volume Bola dari Jari-Jari = "+jari2+" Adalah "+luas);
        return i;
    }
}
