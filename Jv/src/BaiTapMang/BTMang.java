package BaiTapMang;

import java.util.Scanner;

public class BTMang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length;i++){
            System.out.print("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        do{
        System.out.print("\n Câu số: ");
        int cau = sc.nextInt();
            switch (cau) {
                case 1: { // Tính tổng các phẩn từ của mảng
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += a[i];
                    }
                    System.out.println("\n Tổng các phẩn từ của mảng là: " + tong);
                    break;
                }
                case 2: { // Tính tổng các phần từ dương | các phần tử âm của mảng
                    int tongDuong = 0, tongAm = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] >= 0)
                            tongDuong += a[i];
                        else
                            tongAm += a[i];
                    }
                    System.out.println("\n Tổng các phẩn từ dương của mảng là: " + tongDuong);
                    System.out.println("\n Tổng các phẩn từ âm của mảng là: " + tongAm);
                    break;
                }
                case 3: { // Tính tổng các phần từ chẳn | các phần tử lẻ của mảng
                    int tongChan = 0, tongLe = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] % 2 == 0)
                            tongChan += a[i];
                        else
                            tongLe += a[i];
                    }
                    System.out.println("\n Tổng các phẩn từ chẵn của mảng là: " + tongChan);
                    System.out.println("\n Tổng các phẩn từ lẻ của mảng là: " + tongLe);
                    break;
                }
                case 4: { //Tính tổng các phần tử chia hết cho 3
                    int tong3 = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] % 3 == 0)
                            tong3 += a[i];
                    }
                    System.out.println("\n Tổng các phần tử chia hết cho 3 là: " + tong3);
                    break;
                }
                case 5: { //Tính tổng các phần từ chia hết cho 5
                    int tong5 = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] % 5 == 0)
                            tong5 += a[i];
                    }
                    System.out.println("\n Tổng các phần tử chia hết cho 5 là: " + tong5);
                    break;
                }
                case 6: { //Đếm số phần từ dương | số phần tử âm của mảng
                    int demDuong = 0, demAm = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] >= 0)
                            demDuong++;
                        else
                            demAm++;
                    }
                    System.out.println("\n Số phần từ dương của mảng là: " + demDuong);
                    System.out.println("\n Số phần từ âm của mảng là: " + demAm);
                    break;
                }
                case 7: { // Đếm số phần từ chẵn | số phần tử lẻ của mảng
                    int demChan = 0, demLe = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] % 2 == 0)
                            demChan++;
                        else
                            demLe++;
                    }
                    System.out.println("\n Số phần từ chẵn của mảng là: " + demChan);
                    System.out.println("\n Số phần từ lẻ của mảng là: " + demLe);
                    break;
                }
                case 8: { //Tìm phần từ bé nhất của mảng
                    int min = a[0];
                    for (int i = 0; i < n; i++) {
                        if (a[i] < min)
                            min = a[i];
                    }
                    System.out.println("\n Phần từ bé nhất của mảng là: " + min);
                    break;
                }
                case 9: { // Tìm phần tử lớn nhất của mảng
                    int max = a[0];
                    for (int i = 0; i < n; i++) {
                        if (a[i] > max)
                            max = a[i];
                    }
                    System.out.println("\n Phần từ lớn nhất của mảng là: " + max);
                    break;
                }
                case 10: { // Tính trung bình cộng của các phần từ
                    float avg, s = 0;
                    for (int i = 0; i < n; i++) {
                        s += a[i];
                    }
                    avg = s / n;
                    System.out.println("\n Trung bình cộng của các phần từ là: " + avg);
                    break;
                }
                case 11: { //Sắp xếp mảng tăng dần
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (a[i] > a[j]) {
                                int tg = a[i];
                                a[i] = a[j];
                                a[j] = tg;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi xếp tăng dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                }
                case 12: { //Sắp xếp mảng giảm dần
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (a[i] < a[j]) {
                                int tg = a[i];
                                a[i] = a[j];
                                a[j] = tg;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi xếp giảm dần: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                }
                case 13: {//Tính trung bình của các phần tử ở vị trị lẻ và có giá trị chia hết cho 3
                    float tb, x = 0;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0 && a[i] % 3 == 0) {
                            x += a[i];
                        }
                    }
                    tb = x / n;
                    System.out.println("Trung bình của các phần tử ở vị trí lẻ và có giá trị chia hết cho 3 là: " + tb);
                    break;
                }
                case 14: { // Đếm số lần xuất hiện của phần tử có giá trị c (c nhập từ bàn phím)
                    System.out.print("Nhập một giá trị: ");
                    int c = sc.nextInt();
                    int demc = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] == c)
                            demc++;
                    }
                    System.out.println("số lần xuất hiện của phần tử có giá trị " + c + " là: " + demc + " (lần)");
                    break;
                }
                case 15: { // Tìm phần tử bất kỳ c xuất hiện đầu tiên trong mảng, sau đó đưa ra giá trị và vị trí.
                    System.out.print("Nhập một giá trị: ");
                    int t = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (a[i] == t) {
                            System.out.println(" Phần tử có giá trị " + a[i] + " đầu tiên xuất hiện tại vị trí thứ " + (i + 1));
                            break;
                        }
                    }
                    break;
                }
                case 16: { // 23. Đếm số lần xuất hiện của phần tử có giá trị c và đưa ra các vị trí xuất hiện (c nhập từ bàn phím).
                    System.out.print("Nhập một giá trị: ");
                    int v = sc.nextInt();
                    int demv = 0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] == v) {
                            demv++;
                            System.out.println(" Phần tử có giá trị " + a[i] + " xuất hiện tại vị trí thứ " + (i + 1));
                        }
                    }
                    System.out.println("Số lần xuất hiện của phần tử có giá trị " + v + " là: " + demv + " (lần)");
                    break;
                }
                case 17: { // 24. Tìm số lớn nhất trong mảng. Số lớn nhất nằm ở những vị trí nào trong mảng?
                    int soLonNhat = a[0];
                    for (int i = 0; i < n; i++) {
                        if (a[i] > soLonNhat) {
                            soLonNhat = a[i];
                        }
                    }
                    System.out.println("\n Số lớn nhất của mảng là: " + soLonNhat);
                    for (int i = 0; i < n; i++) {
                        if (a[i] == soLonNhat)
                            System.out.println("Số " + a[i] + " xuất hiên tại vị trí thứ " + (i + 1));
                    }
                    break;
                }
                case 18: {/*
                25. Tìm những phần tử nào trong mảng mà có giá trị nhỏ hơn hoặc bằng c (c
được nhập từ bàn phím) thì thay bằng 0, sau đó in ra mảng ra màn hình.
Đếm trong mảng sau khi thay thế có bao nhiêu phần tử có giá trị lẻ, in kết
quả ra màn hình.
                 */
                    System.out.print("Nhập một số: ");
                       int k= sc.nextInt();
                       int demk=0;
                       for(int i=0;i<n;i++){
                           if(a[i]<=k)
                               a[i] = 0;
                       }
                       for(int i=0;i<n;i++){
                           System.out.print(a[i] +" ");
                       }
                       for(int i=0;i<n;i++){
                           if(a[i]%2!=0)
                               demk++;
                       }
                       System.out.println("\n Mảng mới có "+demk+" phần tử lẻ.");
                       break;
                }
                case 19:{/*
                    26. Tìm trong mảng những phần tử nào có giá trị bằng a thì thay chúng bằng b
(a,b được nhập từ bàn phím), sau đó in mảng ra màn hình.              */
                    System.out.print("Nhập a= ");
                        int A = sc.nextInt();
                    System.out.print("Nhập b = ");
                        int B = sc.nextInt();
                    for(int i=0;i<n;i++){
                        if(a[i]==A)
                            a[i] = B;
                    }
                    for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                    }
                    break;
                }
                case 20:{ /*
                 27. Tính trung bình cộng các phần tử trong mảng sau khi đã thay các phần tử a
bằng b, in kết quả ra màn hình.         */
                    for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                    }
                    float tong2=0;
                    for(int i=0;i<n;i++){
                        tong2 += a[i];
                    }
                    float tbc = tong2 / n;
                    System.out.println("\n trung bình cộng các phần tử trong mảng sau khi đã thay các phần tử a bằng b là: "+ tbc);
                    break;
                }
                case 21: {
                    /* 28. Tính tổng các phần tử lẻ đồng thời chia hết cho 3. Đếm các các phần tử có
                    giá trị lớn hơn 7 trong mảng. */
                    int lc3=0, dem7=0;
                    for(int i=0;i<n;i++){
                        if(a[i]%2!=0 && a[i]%3==0)
                            lc3 += a[i];
                        if(a[i]>7)
                            dem7++;
                    }
                    System.out.println("Tổng các phần tử lẻ đồng thời chia hết cho 3 là: " + lc3);
                    System.out.println("Số phần tử có giá trị lớn hơn 7 trong mảng là: " + dem7);
                    break;
                }
                case 22:{// 29. Tính tổng các phần tử dương, chẵn. In kết quả ra màn hình.
                    int dc=0;
                    for(int i=0;i<n;i++){
                        if(a[i]>=0 && a[i]%2==0)
                            dc += a[i];
                    }
                    System.out.println("tổng các phần tử dương, chẵn là: " + dc);
                    break;
                }
                case 23:{/*
                    30. In các số không chia hết cho 3 trên 1 dòng. Dòng tiếp theo in các số chia hết
cho 3 nhưng không chia hết cho 5. Dòng thứ 3 in tất cả các phần tử trong
mảng.      */
                    System.out.println("các số không chia hết cho 3: ");
                    for(int i=0;i<n;i++){
                        if(a[i]%3 != 0)
                            System.out.print(a[i]+" ");
                    }
                    System.out.println("\n các số chia hết cho 3 nhưng không chia hết cho 5: ");
                    for(int i=0;i<n;i++){
                        if(a[i]%3 == 0 && a[i]%5 != 0)
                            System.out.print(a[i]+" ");
                    }
                    System.out.println("\n tất cả các phần tử trong mảng: ");
                    for(int i=0;i<n;i++){
                            System.out.print(a[i]+" ");
                    }
                    break;
                }
                case 26:{//31. Tính tổng các số có giá trị nằm trong đoạn [a, b] với (a<b) là các số nguyên được nhập từ bàn phím
                    int total=0;
                    System.out.print("Nhập a= ");
                    int k = sc.nextInt();
                    System.out.print("Nhập b= ");
                    int l = sc.nextInt();
                    while(l<=k){
                        System.out.print("Nhập lại b= ");
                        l = sc.nextInt();
                    }
                    for(int i=0;i<n;i++){
                        if(k<=a[i] && a[i]<=l)
                            total += a[i];
                    }
                    System.out.println("tổng các số có giá trị nằm trong đoạn ["+k+","+l+"] là: "+total);
                    break;
                }
                case 27:{//32. Đếm các phần từ là số chính phương của mảng
                    int demcp=0;
                    for(int i=0;i<n;i++){
                        if(soChinhPhuong(a[i]))
                            demcp++;
                    }
                    System.out.println("Số phần từ là số chính phương của mảng: "+ demcp);
                    break;
                }
                case 28:{//33. Đếm các phần tử là số nguyên tố của mảng
                    int demnt=0;
                    for(int i=0;i<n;i++){
                        if(soNguyenTo(a[i]))
                            demnt++;
                    }
                    System.out.println("Số phần từ là số nguyên tố của mảng: "+ demnt);
                    break;
                }
                default:
                    System.out.println("Không thực hiện!!!");
            }
        }
        while (true);

    }
    public static boolean soChinhPhuong(int n){
        double sqr= Math.sqrt(n);
        if(sqr * sqr == n)
            return true;
        else
            return false;
    }
    public static boolean soNguyenTo(int n){
        if(n<=1)
            return false;
        else if (n==2)
            return true;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;
            }
        return true;
        }


    }

}