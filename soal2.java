import java.util.Scanner;
public class soal2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double tinggi, berat, bmi;

        berat = s.nextDouble();
        tinggi = s.nextDouble() / 100;

        bmi = berat / (tinggi * tinggi);

        if (bmi < 18.5) {
            System.out.printf("BMI Anda adalah %.2f. termasuk underweight", bmi);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("BMI Anda adalah %.2f. termasuk normal", bmi);
        } else if (bmi >= 15 && bmi <= 29.9) {
            System.out.printf("BMI Anda adalah %.2f. termasuk overweight", bmi);
        } else if (bmi >= 30){
            System.out.printf("BMI Anda adalah %.2f. termasuk obesitas", bmi);
        }
        

    }

}
