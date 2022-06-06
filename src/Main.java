import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        searchLeapYear();
        identifyAppVersion();
        days();

    }
    public static int currentYear(){
        return LocalDate.now().getYear();
    }
    public static void searchLeapYear() {
        boolean leapYear = ((currentYear() % 4 == 0) && (currentYear() % 100 != 0) || (currentYear() % 400 == 0));
        if (leapYear) {
            System.out.println(currentYear() + " ��� �������� ����������");
        } else {
            System.out.println(currentYear() + " ��� �� �������� ����������");
        }
    }
    public static int clientOS(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �� ������ ����������, ��� IOS ��� 0 � Android ��� 1");
        return scanner.nextInt();
    }
    public static void identifyAppVersion() {
        int clientIOS = 0;
        int clientAndroid = 1;
        int year = 2015;
        int os = clientOS();
        if (os == clientIOS && currentYear() >= year) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (os == clientIOS) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else if (os == clientAndroid && currentYear() >= year) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (os == clientAndroid) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }
    }
    public static int deliveryDistance(){
        return 95;
    }
    public static void days(){
        System.out.println("�������� ������ " + deliverCart() + " ���");
    }
    public static int deliverCart(){
    int delivery = 1;
         if (deliveryDistance() > 60) {
        delivery++;
    }
          if ( deliveryDistance() <= 100) {
        delivery++;
    }
        return delivery;
}

}
