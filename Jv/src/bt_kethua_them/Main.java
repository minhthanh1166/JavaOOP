package bt_kethua_them;

import java.util.Scanner;

public class Main {
    public static void sapXepGiam(NhanVien[] nv, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nv[i].getTienLuong() < nv[j].getTienLuong()) {
                    NhanVien temp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            nv[i].hienThiThongTin();
            System.out.println("\t --------- ");
        }
    }

    public static void sapXepTang(NhanVien[] nv, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nv[i].getTienLuong() > nv[j].getTienLuong()) {
                    NhanVien temp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            nv[i].hienThiThongTin();
            System.out.println("\t ----------");
        }
    }

    public static void danhSachThuong(NhanVien[] nv, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (nv[i].tinhThuong() > 0) {
                nv[i].hienThiThongTin();
                System.out.println("Tiền thưởng: " + nv[i].tinhThuong());
                System.out.println("\t ----------");
                dem++;
            }
        }
        System.out.println("-> Số nhân viên được thưởng là: " + dem);
    }

    public static int demNV(NhanVien[] nv, int n, String x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (nv[i].getPhongBan().equals(x)) {
                dem++;
            }
        }
        return dem;
    }

    public static int luongLonNhat(NhanVien[] nv, int n) {
        int maxLuong = 0;
        for (int i = 0; i < n; i++) {
            if (nv[i].getTienLuong() > maxLuong) {
                maxLuong = nv[i].getTienLuong();
            }
        }
        return maxLuong;
    }

    public static void xoaNV(NhanVien[] mang, int soPT, String x) {
        int y = 0;
        for (int i = 0; i < soPT; i++) {
            if (!mang[i].hoTen.equals(x)) {
                mang[y] = mang[i];
                y++;
            }
        }
        soPT = y;
        for (int i = 0; i < soPT; i++) {
            mang[i].hienThiThongTin();
        }
    }

    public static int menu() {
        Scanner luaChon = new Scanner(System.in);
        System.out.println("\t Chọn thao tác cần thực hiện ");
        System.out.println("1. Nhập thông tin và hiển thị danh sách nhân viên");
        System.out.println("2. Sắp xếp và hiển thị danh sách nhân viên theo lương tăng dần ");
        System.out.println("3. Đếm số nhân viên được thưởng và hiển thị danh sách");
        System.out.println("4. Đếm số nhân viên phòng kỹ thuật");
        System.out.println("5. Danh sách nhân viên có lương cao nhất");
        System.out.println("6. Danh sách nhân viên phòng kế toán");
        System.out.println("7. Danh sách nhân viên phòng hành chính giảm dần theo lương");
        System.out.println("8. Kiểm tra có nhân viên “Nguyen Thu Phuong” không?");
        System.out.println("9. Chuyển nhân viên “Le Tuan” từ phòng kỹ thuật sang phòng hành chính.");
        System.out.println("10. Xóa nhân viên “Nguyen Le Hang” khỏi danh sách.");
        System.out.println(" phím khác để thoát! ");
        System.out.println("------------------------------------------------------");
        System.out.print("Nhập lựa chọn: ");
        return luaChon.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        NhanVien[] nv = null;
        int n = 0;
        boolean f = true;
        while (f) {
            switch (menu()) {
                case 1: {
                    System.out.print("Số nhân viên cần nhập: ");
                    n = sc.nextInt();

                    nv = new NhanVien[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("\t Nhập thông tin nhân viên " + (i + 1));
                        nv[i] = new NhanVien();
                        nv[i].nhapThongTin();
                    }

                    System.out.println("\t Danh sách nhân viên");
                    for (int i = 0; i < n; i++) {
                        nv[i].hienThiThongTin();
                        System.out.println("----------");
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t Danh sách nhân viên theo lương tăng dần ");
                    sapXepTang(nv, n);
                    break;
                }
                case 3: {
                    System.out.println("\t Danh sách nhân viên được thưởng ");
                    danhSachThuong(nv, n);
                    break;
                }
                case 4: {
                    System.out.println("Có " + demNV(nv, n, "ky thuat") + " nhân viên phòng kỹ thuật");
                    break;
                }
                case 5: {
                    System.out.println("\t Danh sách nhân viên có tiền lương cao nhất ");

                    for (int i = 0; i < n; i++) {
                        if (nv[i].getTienLuong() == luongLonNhat(nv, n))
                            nv[i].hienThiThongTin();
                    }
                    break;
                }
                case 6: {
                    System.out.println("\t Danh sách nhân viên phòng kế toán");

                    for (int i = 0; i < n; i++) {
                        if (nv[i].getPhongBan().equals("kế toán") || nv[i].getPhongBan().equals("ke toan"))
                            nv[i].hienThiThongTin();
                    }
                    break;
                }
                case 7: {
                    System.out.println("\t Danh sách nhân viên phòng hành chính theo lương giảm dần");

                    int demnvhc = demNV(nv, n, "hanh chinh");

                    NhanVien[] nvhc = new NhanVien[demnvhc];
                    int j = 0;
                    for (int i = 0; i < n; i++) {
                        if (nv[i].getPhongBan().equals("hành chính") || nv[i].getPhongBan().equals("hanh chinh")) {
                            nvhc[j] = nv[i];
                            j++;
                        }
                    }
                    sapXepGiam(nvhc, demnvhc);
                    break;
                }
                case 8: {
                    System.out.println("\t Hiển thị thông tin nhân viên 'Nguyen Thu Phuong' ");
                    for (int i = 0; i < n; i++) {
                        if (nv[i].hoTen.equals("Nguyen Thu Phuong"))
                            nv[i].hienThiThongTin();
                    }
                    break;
                }
                case 9: {
                    System.out.println(" Chuyển Nhân viên “Le Tuan” từ phòng kỹ thuật sang phòng hành chính.");
                    for (int i = 0; i < n; i++) {
                        if (nv[i].hoTen.equals("Le Tuan") && nv[i].getPhongBan().equals("ky thuat")) {
                            nv[i].setPhongBan("hanh chinh");
                            nv[i].hienThiThongTin();
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("Danh sách sau khi xoá nhân viên “Nguyen Le Hang”.");
                    xoaNV(nv, n, "Nguyen Le Hang");
                    break;
                }
                default: {
                    System.out.println("Thoát!");
                    f = false;
                }
            }
        }
    }
}
