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

        for (int i=0; i<dsSoNguyen.size(); i++) {
            Integer tam = dsSoNguyen.get(i);
            System.out.println(tam + " ");
        }
    }
}