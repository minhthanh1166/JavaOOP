package kbb;

import java.util.Random;
import java.util.Scanner;

public class KeoBuaBao {
    public static int player() {
        int lc;
        do {
            Scanner sc = new Scanner(System.in);
            lc = sc.nextInt();
            if (lc == 0 || lc == 1 || lc == 2)
                break;
            System.out.print("Chọn sai, mời chọn lại: ");
        }
        while (true);
        return lc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t  0 = búa; 1 = giấy; 2 = kéo ");
        System.out.print("Lựa chọn của người chơi: ");
        int luaChon = player();

        Random generator = new Random();
        int value = generator.nextInt(3);

        switch (luaChon) {
            case 0 -> {
                System.out.println("Bạn đã chọn búa");
                switch (value) {
                    case 0:
                        System.out.println("Máy ra búa \n -> Hòa");
                        break;
                    case 1:
                        System.out.println("Máy ra giấy \n -> Bạn thua");
                        break;
                    case 2:
                        System.out.println("Máy ra kéo \n -> Bạn thắng");
                        break;
                }
            }
            case 1 -> {
                System.out.println("Bạn đã chọn giấy");
                switch (value) {
                    case 0:
                        System.out.println("Máy ra búa \n -> Bạn thắng");
                        break;
                    case 1:
                        System.out.println("Máy ra giấy \n -> Hòa");
                        break;
                    case 2:
                        System.out.println("Máy ra kéo \n -> Bạn thua");
                        break;
                }
            }
            case 2 -> {
                System.out.println("Bạn đã chọn kéo");
                switch (value) {
                    case 0:
                        System.out.println("Máy ra búa \n -> Bạn thua");
                        break;
                    case 1:
                        System.out.println("Máy ra giấy \n -> Bạn thắng");
                        break;
                    case 2:
                        System.out.println("Máy ra kéo \n -> Hòa");
                        break;
                }
            }
            default -> {
                System.out.println("Không có lựa chọn này!");
            }
        }
    }
}
