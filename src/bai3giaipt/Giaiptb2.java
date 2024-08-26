
package bai3giaipt;

import java.util.Scanner;

public class Giaiptb2 {
    public static void main(String[] args) {
        Double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        b = sc.nextDouble();
         System.out.println("Nhap so c: ");
        c = sc.nextDouble();
        // cac truong hop
        delta = Math.pow(b, 2) - 4*a*c;
        
        if (delta<0){
            System.out.println("phuong trinh vo ");
        }else if(delta==0){
            x1= -b/2*a;
            System.out.println("phuong trinh co nghiem kep x1=x2: "+x1);
        } else {
            System.out.println("phuong trinh co hai nghiem: ");
            x1 = (-b-Math.sqrt(delta)) / (2*a);
            x2 = (-b+Math.sqrt(delta)) / (2*a); 
            System.out.println("nghiem x1= "+x1);
            System.out.println("nghiem x2= "+x2);
        }
    }
}
