package BT3.ToanTuDieuKienIfElse;

public class DieuKienIfElse {

    static int number = 100;

    public static void sosanh() {
        int n = 99;
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

