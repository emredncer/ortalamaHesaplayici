import java.util.Scanner;

public class basari_Ortalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("0-100 aralığında girilmeyen notlar ortalamaya dahil edilmeyecektir!");
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        double average ;
        int counter = 0, total = 0;
        if (mat > 100 || mat < 0){
        }else {
            total += mat;
            counter += 1;
        }if (fizik > 100 || fizik < 0){
        }else {
            total += fizik;
            counter += 1;
        }if (kimya > 100 || kimya < 0){
        }else {
            total += kimya;
            counter += 1;
        }if (turkce > 100 || turkce < 0){
        }else {
            total += turkce;
            counter += 1;
        }if (muzik > 100 || muzik < 0){
        }else {
            total += muzik;
            counter += 1;
        }
        average = total / counter;
        if (average < 55) {
            System.out.print("sınıf tekrarı");
        }else {
            System.out.println("Başarılı");
        }
        System.out.println("ortalamanız :"+average);
    }
}
