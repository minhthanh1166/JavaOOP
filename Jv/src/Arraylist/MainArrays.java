package Arraylist;

import bt_kethua_them.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainArrays {
    static ArrayList<employee> dsnv = new ArrayList<>();

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng nhân viên: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            employee nv = new employee();
            System.out.println("\t Nhập thông tin nhân viên " + (i + 1));
            nv.inPut();
            dsnv.add(nv);
        }
    }

    public static void output() {
        System.out.println("\t Danh sách nhân viên");
        for (int i = 0; i < dsnv.size(); i++) {
            System.out.println(dsnv.get(i));
        }
    }

    public static void sapXepLuongTang() {
        dsnv.sort(Comparator.comparingInt(employee::getTienLuong));
        System.out.println("\t Danh sách nhân viên theo lương tăng dần ");

        for (Arraylist.employee emp : dsnv) {
            System.out.println(emp);
        }
    }

    public static int demThuong() {
        int d = 0;
        for (Arraylist.employee employee : dsnv) {
            if (employee.tinhThuong() > 0) {
                System.out.println(employee);
                System.out.println("Tiền thưởng: " + employee.tinhThuong());
                System.out.println("\t ---------");
                d++;
            }
        }
        return d;
    }

    public static int demNVKT() {
        int demnvkt = 0;
        for (Arraylist.employee emp : dsnv) {
            if (emp.getPhongBan().contains("ky thuat") || emp.getPhongBan().contains("kỹ thuật"))
                demnvkt++;
        }
        return demnvkt;
    }

    public static float luongCaoNhat() {
        float maxLuong = 0;
        for (Arraylist.employee empmax : dsnv) {
            if (empmax.getTienLuong() > maxLuong) {
                maxLuong = empmax.getTienLuong();
            }
        }
        return maxLuong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            switch (Main.menu()) {
                case 1: {
                    input();
                    output();
                    break;
                }
                case 2: {
                    //Sắp xếp và hiển thị danh sách nhân viên theo lương tăng dần
                    sapXepLuongTang();
                    break;
                }
                case 3: {
                    //Đếm số nhân viên được thưởng và đưa danh sách ra màn hình
                    System.out.println("\t Danh sách nhân viên được thưởng");
                    System.out.println("-> Số nhân viên được thưởng: " + demThuong());
                    break;
                }
                case 4: {
                    // Đếm số nhân viên phòng kỹ thuật
                    System.out.println("Có " + demNVKT() + " nhân viên phòng kỹ thuật!");
                    break;
                }
                case 5: {
                    //Đưa ra danh sách nhân viên có lương cao nhất.
                    System.out.println("\t Danh sách nhân viên có lương cao nhất");
                    for (Arraylist.employee em : dsnv) {
                        if (em.getTienLuong() >= luongCaoNhat())
                            System.out.println(em);
                    }
                    break;
                }
                case 6: {
                    //Đưa danh sách nhân viên phòng kế toán ra màn hình
                    System.out.println("\t Danh sách nhân viên phòng kế toán");
                    for (int i = 0; i < dsnv.size(); i++) {
                        if (dsnv.get(i).getPhongBan().equals("ke toan"))
                            System.out.println(dsnv.get(i));
                    }
                }
                case 7: {
                    //Sắp xếp danh sách nhân viên phòng hành chính giảm dần theo lương và đưa danh sách sắp xếp ra màn hình

                    System.out.println("\t danh sách nhân viên phòng hành chính theo lương giảm dần");
                    ArrayList<employee> dsnvhc = new ArrayList<>();
                    for (Arraylist.employee employee : dsnv) {
                        if (employee.getPhongBan().equals("hanh chinh")) {
                            dsnvhc.add(employee);
                        }
                    }
                    dsnvhc.sort((nv1, nv2) -> Integer.compare(nv2.getTienLuong(), nv1.getTienLuong()));
                    for (Arraylist.employee empty : dsnvhc) {
                        System.out.println(empty);
                    }
                    break;
                }
                case 8: {
                    //Kiểm tra nhân viên “Nguyen Thu Phuong” có thuộc danh sách không, nếu có đưa thông tin của nhân viên này ra màn hình.
                    System.out.println("\t Thông tin nhân viên 'Nguyen Thu Phuong' ");
                    for (int i = 0; i < dsnv.size(); i++) {
                        if (dsnv.get(i).hoTen.contains("Nguyen Thu Phuong")) {
                            System.out.println(dsnv.get(i));
                        }
                    }
                    break;
                }
                case 9: {
                    //Chuyển nhân viên “Le Tuan” từ phòng kỹ thuật sang phòng hành chính.
                    System.out.println("Chuyển nhân viên 'Le Tuan'");
                    for (int i = 0; i < dsnv.size(); i++) {
                        if (dsnv.get(i).hoTen.contains("Le Tuan") && dsnv.get(i).getPhongBan().contains("ky thuat")) {
                            dsnv.get(i).setPhongBan("hanh chinh");
                            System.out.println(dsnv.get(i));
                        }
                    }
                    break;
                }
                case 10: {
                    //Xóa nhân viên “Nguyen Le Hang” khỏi danh sách.
                    System.out.println("\t Danh sách sau khi xoá nhân viên 'Nguyen Le Hang' ");
                    for (int i = 0; i < dsnv.size(); i++) {
                        if (dsnv.get(i).hoTen.contains("Nguyen Le Hang")) {
                            dsnv.remove(i);
                        }
                    }
                    for (Arraylist.employee emp : dsnv) {
                        System.out.println(emp);
                    }
                    break;
                }
                default: {
                    System.out.println("Thoát");
                    flag = false;
                }
            }
        }
    }
}
