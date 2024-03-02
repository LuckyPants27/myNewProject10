import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2400);
        defineOsVersion(1,2025);
        System.out.println("Потребуется дней: " + deliveryDays(101));
    }

    private static void isLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void defineOsVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        int iOS = 0;

        if (clientDeviceYear < currentYear) {
            if (clientOS == iOS) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == iOS) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static int deliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 0) {
            return 0;
        }
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays++;
            return deliveryDays;
        } else {
            deliveryDays++;
        }
        if (deliveryDistance <= 60) {
            deliveryDays++;
            return deliveryDays;
        } else {
            deliveryDays++;
        }
        if (deliveryDistance <= 100) {
            deliveryDays++;
            return deliveryDays;
        } else {
            return 0;
        }
    }
}