pimport java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 100000;

        System.out.println("منوی بانک");
        System.out.println("مشاهده موجودی: 1 ");
        System.out.println("برداشت پول: 2 ");
        System.out.println("واریز پول: 3 ");
        System.out.println("خروج: 4 ");

        System.out.print("یک گزینه انتخاب کنید: ");
        int option = Integer.parseInt(sc.nextLine());

        if (option == 1) {
            System.out.println("موجودی فعلی: " + balance);
        }
        else if (option == 2) {
            System.out.print("مبلغ برداشت: ");
            int withdraw = Integer.parseInt(sc.nextLine());

            if (withdraw <= balance) {
                balance -= withdraw;
                System.out.println("برداشت موفق، موجودی فعلی: " + balance);
            } else {
                System.out.println("موجودی کافی نیست");
            }

        }
        else if (option == 3) {
            System.out.print("مبلغ واریزی: ");
            int deposit = Integer.parseInt(sc.nextLine());
            balance += deposit;
            System.out.println("واریزی موفق بود، موجودی فعلی شما: " + balance);
        }
        else if (option == 4) {
            System.out.println("خروج");
        }
        else {
            System.out.println("گزینه درست را انتخاب کنید");
        }

        sc.close();
    }
}
