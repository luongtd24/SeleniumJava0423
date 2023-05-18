package BaiTapSo4;

public class VongLapForVaMang {
    public static void main(String[] args) {
        int mang[] = new int[26];
        int memory = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                mang[memory] = i;
                memory++;
            }
            //System.out.println(memory);
        }
        for (int i : mang) {
            System.out.println(i);
        }
    }
}
