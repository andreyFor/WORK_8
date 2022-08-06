import java.time.LocalDate;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("задание номер 1");
        int year =2022;
        printLeapYear(year);
        System.out.println("задание номер 2");
        int clientDeviceYear = 2005;
        int clientOS = 0;
        suggestVersion(clientDeviceYear,clientOS);
        System.out.println("задание номер 3");
        int deliveryDistance = 95;
        System.out.println("количество дней на доставку "+calculateDeliveryDays(deliveryDistance));

    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printLeapYear(int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println();
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год - не високосный.");
        }
    }
     public static void suggestVersion(int clientDeviceYear,int clientOS){
         if (clientOS == 0 && clientDeviceYear == 2022){
             System.out.println("вам нужна современная версия приложения для ios");
         }else if (clientOS == 0 && clientDeviceYear < 2022){
             System.out.println("вам нужна облегченная версия для ios");
         }else if (clientOS == 1 && clientDeviceYear == 2022){
             System.out.println("вам нужна современная версия приложения для android");
         }else if (clientOS == 1 && clientDeviceYear < 2022){
             System.out.println("вам нужна облегченная версия приложения для android");
         }else{
             System.out.println("такая версия ОС не поддерживается");
         }

     }
     public static int calculateDeliveryDays(int distance){
        if (distance< 20 && distance>0){
            return 1;
        }else if (distance<60 && distance>20){
            return 2;
        }else if (distance<100 && distance>60){
            return 3;
        }else {
            throw new RuntimeException("доставка не осущствляется");
        }
     }




}
