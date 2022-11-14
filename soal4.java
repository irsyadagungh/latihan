import java.util.Scanner;
public class soal4 {
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka, pangkat;
        
        angka = s.nextInt();
        pangkat = s.nextInt();
        
        int hasil = perpangkatan(angka, pangkat);
        System.out.print(hasil);

    }
    private static int perpangkatan(int angka, int pangkat) {
    
        if(pangkat == 0){
            return angka = 1;
        } else if (pangkat == 1){
            return angka;
        }else{
           return angka * perpangkatan(angka, pangkat - 1);
        }
        
    }

}
