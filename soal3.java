import java.util.Scanner;
public class soal3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int angka1, angka2;

        angka1 = s.nextInt();
        angka2 = s.nextInt();

        String[] ratusan = {"", "seratus ", "dua ratus ", "tiga ratus ", "empat ratus ", "lima ratus ", 
                            "enam ratus ", "tujuh ratus ", "delapan ratus ", "sembilan ratus "};
        String[] puluhan = {"", "belas ", "dua puluh ", "tiga puluh ", "empat puluh ", "lima puluh ",
                            "enam puluh ", "tujuh puluh ", "delapan puluh ", "sembilan puluh "};
        String[] satuan = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};

        int hasil = angka1 + angka2;
        // int ratus = (hasil / 100);
        // int puluh = (hasil % 100) / 10;
        // int satu = (hasil % 10);

        // System.out.println(ratusan[ratus] + puluhan[puluh] + satuan[sat]);


        if (hasil < 999 && hasil > 0) {
            int ratus = (hasil / 100);
            int puluh = (hasil % 100) / 10;
            int satu = (hasil % 10);
            System.out.println(hasil);
            if (puluh == 1 && satu != 0 && satu != 1) {
                puluh = (hasil % 100) / 100;
                System.out.println(ratusan[ratus] + "se" + satuan[satu]);
            } else if (puluh == 1 && satu == 0 ) {
                System.out.println(ratusan[ratus] + "sepuluh");
            }else if (puluh != 1 && satu == 0) {
                System.out.println(ratusan[ratus] + puluhan[puluh]);
            } else if (puluh == 1 && satu == 1){
                System.out.println(ratusan[ratus] + "se" + puluhan[puluh]);
            }else{
                System.out.println(ratusan[ratus] + puluhan[puluh] + satuan[satu]);
            }
        } else {
            
        }

    }

}
