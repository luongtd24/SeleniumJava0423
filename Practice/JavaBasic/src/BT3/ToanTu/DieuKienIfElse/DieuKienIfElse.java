package BT3.ToanTu.DieuKienIfElse;

public class DieuKienIfElse {

    static int number = 100;

    public static void sosanh() {
        int n = 101;
        if (n == number) {
            System.out.println("Tham so n bang " + number);
        } else if (n < number) {
            System.out.println("Tham so n nho hon " + number);
        } else {
            System.out.println("Tham so n lon hon " + number);
        }
    }

    public static void main(String[] args) {
        sosanh();
    }
}

