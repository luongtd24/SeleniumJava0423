package BT3.ToanTuDieuKienIfElse;

public class ToanTu {
    public static void main(String[] args) {
        int a = 24;
        int b = 2;

        Boolean checkA = (a > 20) && (b < 20);
        Boolean checkB = (a == 20) && (b > 20);
        Boolean checkC = (a == 24) || (b > 20);
        Boolean checkD = (a < 20) || (b == 20);

        System.out.println(checkA);
        System.out.println(checkB);
        System.out.println(checkC);
        System.out.println(checkD);
    }
}
