package com.csg.algorithm;

import java.util.Scanner;
public class A003 {

	public static void main(String[] args){
        System.out.println("（求最小公倍数与最大公约数）");
        System.out.println("请输入第一个数：");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        System.out.println("请输入第二个数：");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();
        System.out.println(a+"和"+b+"的最小公倍数是："+a*b/caculate(a,b) );
        System.out.println(a+"和"+b+"的最大公约数是："+caculate(a,b) );
	}

	/**
	 *  
 	求最大公约数一般采用欧几里德算法。
	欧几里德算法又称辗转相除法， 用于计算两个整数a, b的最大公约数。其计算原理依赖于下面的定理：
	定理： gcd(a, b) = gcd(b, a mod b)  
	最小公倍数和最大公约数之间的关系：最大公约数 * 最小公倍数 = a * b 
	 * @param a
	 * @param b
	 * @return  最大公约数
	 */
	
	private static int caculate(int a, int b) {

		while(a != b){
			if(a > b){
				a = a - b;
			}else{
				b = b - a;
			}
		}
		return a;
	}

}
