import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username, password, select, newp;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        if (!username.equals("patika") || (!password.equals("java123")){

            System.out.println("Kullanici Adini Hatali Girdiniz. ");

        } else if (((username.equals("patika")) && (password.equals("java123")))) {

            System.out.println("Giris Yaptiniz.");
        }   else {
            System.out.println("Hatali Giris Yaptiniz. ");

            System.out.println("Sifreyi Sifirlamak Ister misiniz?");

            System.out.println("n - Hayir sifremi sifirlamak istemiyorum.\ny - Evet sifremi sifirlamak isterim.");

            System.out.print("Seciminiz : ");
            select = input.nextLine();

            if (select.equals("n")) {

                System.out.println("Mevcut Sifreniz ile Devam Edebilirsiniz.");
            } else if (select.equals("y")) {

                System.out.println("Yeni Sifrenizi Giriniz : ");
                newp = input.nextLine();

                if ((newp.equals(password)) || (newp.equals("java123"))) {

                    System.out.println("Yeni sifreniz mevcut sifreniz ile ayni olamaz.");

                    System.out.println("Tekrar sifre olusturunuz. ");
                } else {
                    System.out.println("Yeni sifreniz olusturuldu.");
                }
            } else {
                System.out.println("Hatali secim yaptiniz lutfen tekrar deneyin.");
            }
        }
    }
}


