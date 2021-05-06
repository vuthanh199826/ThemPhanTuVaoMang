package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,5};
        System.out.println("nhap so can chen vao day");
        int x = sc.nextInt();
        System.out.println("nhap vi tri can chen vao day");
        int index = sc.nextInt();
        if(index <= 1 || index >= array.length-1){
            System.out.println("Khong chen dc vao mang");
        }else {
            array[index]=x;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
