package com.company;

import java.util.Scanner;

public class Main {
public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	NDrob fract1 = new NDrob();
//	fract1.num=3;
//	fract1.denom=5;
		fract1.setNum(3);
		fract1.setDenom(5);
	NDrob fract2 = new NDrob();
//	fract2.num = in.nextInt();
//	fract2.denom = in.nextInt();
		fract2.setNum(in.nextInt());
		fract2.setDenom(in.nextInt());
        System.out.println(fract2);
        fract1.print();
		System.out.println(fract1.multi(fract2));
		System.out.println(fract1.divi(fract2));
		System.out.println(fract1.add(fract2));
		System.out.println(fract1.sub(fract2));
    }
}
