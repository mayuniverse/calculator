import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
     
        
        //değişkenleri tanımlayalım
        double number1,number2;
        int hesap;


        // import sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        
        //Kullanıcıdan input alalım
        System.out.println("Birinci sayısı seçiniz");
        number1 = input.nextDouble();

        System.out.println("İkinci sayıyı seçiniz");
        number2 = input.nextDouble();

        System.out.println("Yapacağınız işlemi seçiniz (toplama icin 1 ,cikarma icin 2 ,carpma icin 3 , bolme icin 4)");
        hesap = input.nextInt();

        System.out.println("Birinci sayiniz " + number1);
        System.out.println("ikinci sayiniz " + number2);
        System.out.println("yapacağınız hesap (toplama icin 1 , cikarma için 2 , carpma icin 3 , bolme icin 4) " + hesap);

        switch(hesap){
            case 1:
            System.out.println(number1 + number2);
            break;

            case 2:
            System.out.println(number1 - number2);
            break;

            case 3:
            System.out.println(number1 * number2);
            break;

            case 4:
            System.out.println(number1 / number2);
            break;

            default:
            System.out.println("4 adet işlem bulunmaktadır. Toplama için 1, Çıkarma için 2, Çarpma için 3, Bölme için 4");

        }



        
        }
        

    }
