import java.util.Scanner;

public class sayılarısıralama {
    public static void main(String[] args) {

        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        a = input.nextDouble();

        System.out.print("b sayısını giriniz: ");
        b = input.nextDouble();

        System.out.print("c sayısını giriniz: ");
        c = input.nextDouble();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a<b<c");

            } else {
                System.out.println("a<c<b");
            }

        } else if ((b < a) && (b < c)) {

            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else if ((c < a && c < b)) {


            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }

        }
    }
}




