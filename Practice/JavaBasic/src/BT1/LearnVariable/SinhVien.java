package BT1.LearnVariable;

public class SinhVien {
    //Khai bao bien local
    public void dataSv(){
        String name = "Luong.TD";
        int age = 24;
        String address = "Ha Noi";

        System.out.println("Ho và ten: " + name);
        System.out.println("Toi " + age + " tuoi");
        System.out.println("Dang song tai: " + address);
    }
    // Khai bao bien instance
    public String bietdanh;
    private int tuoi;
    public String addr;

    public SinhVien(String bietdanh, String addr) {
        this.bietdanh = bietdanh;
        this.addr = addr;
    }

    public void setAge(int tuoi) {
        this.tuoi = tuoi;
    }

    public void showSv(){
        System.out.println("Ho va ten: " + bietdanh);
        System.out.println("Toi " + tuoi + " tuoi");
        System.out.println("Dang song tai: " + addr);
    }

    //Khai bao bien Static
    public static String name = "Luong.TD";
    public static int age = 24;
    public static String address = "Ha Noi";

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Luong.TD", "Ha Noi");
        sv.dataSv();
        sv.setAge(25);
        sv.showSv();

        System.out.println("Ten toi la: " + Infor.hoten);
        System.out.println("Toi " + age + " tuoi");
        System.out.println("Dang song o: " + address);
    }
}
