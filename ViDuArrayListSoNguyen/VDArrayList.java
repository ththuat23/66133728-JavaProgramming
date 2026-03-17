package ViDuArrayListSoNguyen;

import java.util.ArrayList;
import java.util.Scanner;

public class VDArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
        Scanner banPhim = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            System.out.println("Mời nhập phần tử thứ "+ i + ": ");
        }
        Integer tam = banPhim.nextInt();
        dsSoNguyen.add(tam);

        System.out.println("Danh sach vua nhap la: \n");
        for (int i=0; i<dsSoNguyen.size(); i++) {
            Integer tam = dsSoNguyen.get(i);
            System.out.println(tam + " ");
        }
        // for (Integer x: dsSoNguyen) {
        //     System.out.println(x + " ");
        // }
        int soLuongPTChan = 0;
        for (Integer x: dsSoNguyen) {
            if (x % 2 ==0) {
                soLuongPTChan=soLuongPTChan+1;
            }
        }
        // for (int i=0; i<dsSoNguyen.size(); i++) {
        //     Integer tam = dsSoNguyen.get(i);
        //     if (tam % 2 ==0) soLuongPTChan=soLuongPTChan+1;
        // }
    }
}