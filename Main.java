import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int istek;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();
        if (userName.equals("seyit") && password.equals("123456")) {
            System.out.println("Başarılı Giriş");
        } else {
            System.out.println("Hatalı Giriş!");
        }
    }
}
