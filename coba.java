import java.util.Scanner;
public class coba{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka1, angka2, angka3;
        angka1 = s.nextInt();
        angka2 = s.nextInt();
        angka3 = s.nextInt();

        int ratusan = (angka1 / 100) % 10;
        int puluhan = (angka2 / 10) % 10;
        int satuan = angka3 % 10;

        System.out.println(ratusan + puluhan + satuan);

    }

}