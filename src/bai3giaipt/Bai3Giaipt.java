
package bai3giaipt;

import java.util.Scanner;

public class Bai3Giaipt {

    public static void main(String[] args) {
        float a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = sc.nextFloat();
        System.out.println("Nhap so b: ");
        b = sc.nextFloat();
        // cac truong hop
        if (a==0){
            System.out.println("phuong trinh vo nghiem");
        }else if (b==0){
            System.out.println("phuong trinh vo so nghiem");
        }else {
            x = -b/a;
            System.out.println("nghiem x= "+x);
        }
    }
    
}
