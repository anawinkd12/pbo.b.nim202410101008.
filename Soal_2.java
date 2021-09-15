import java.util.Scanner;
public class Soal_2 {
    public static void main (String[]args){
        double c,r,f,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu celsius = ");
        c = input.nextInt();
        r = c*4/5;
        f = (c*9/5)+32;
        k = c+273.15;
        System.out.println("  ");
        System.out.println("Celsius = " +c);
        System.out.println("Reamur = "+r);
        System.out.println("Fahrenheit = "+f);
        System.out.println("Kelvin = "+k);
    }
}
