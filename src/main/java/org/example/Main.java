package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int a,b;
        for (a = 0; a<=n; a++) {
            for(b=0; b<a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("2222222222222222222");

        int n2 = 5;
        int a2,b2;
        for (a2 = n2; a2>=0; a2--) {
            for(b2=0; b2<a2; b2++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("333333333333333333");
        int n3 = 5;
        String s = "*";
        int a3,b3;
        for (a3 = 0; a3<=n; a3++) {
            for (b3 = n3; b3>0;b3--) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println("333333333333333333");

    }
}