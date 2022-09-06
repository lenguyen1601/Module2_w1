import java.util.Scanner;

public class change_money {
    public static void main(String[] args) {
        double VND = 23000;
        double  USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien USD");
        USD = sc.nextDouble();
        double quydoi=USD*23000;
        System.out.println("so tien quy doi sang VND la: "+quydoi);
    }
}
