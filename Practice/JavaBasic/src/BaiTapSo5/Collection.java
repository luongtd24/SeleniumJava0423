package BaiTapSo5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    public void inforPersonal() {
        Map<String, String> caNhan = new HashMap<String, String>();
        caNhan.put("Họ và tên", "Trương Đức Lương");
        caNhan.put("Giới tính", "Nam");
        caNhan.put("Năm Sinh", "02/1999");
        caNhan.put("Địa chỉ", "Hà Nội");
        caNhan.put("Mã số NV", "HN101199");
        caNhan.put("Số điện thoại", "0123456789");
        System.out.println(caNhan);
    }

    public static void main(String[] args) {

        List<Integer> soThuc = new ArrayList<Integer>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                soThuc.add(i);
            }
        }
        System.out.println(soThuc);

        Collection showData = new Collection();
        showData.inforPersonal();
    }
}
