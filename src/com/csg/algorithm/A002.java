package com.csg.algorithm;

/**
 * 十六进制转化成十进制
 * @author CSG
 *
 */
public class A002 {
	public static void main(String[] args) {
		String a = "1A";
		int b = T16to10(a);
		System.out.println(b);
	}

	/**
	 * 
	 * @param str 十六进制的字符串
	 * @return 十进制的整数
	 */
	private static int T16to10(String str) {
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			String b=str.substring(str.length()-1,str.length());
			str = str.substring(0,str.length()-1);
			int c = TurnToInt(b);
			System.out.println(b+"="+c);
			count+=c*pow(16,i);
		}
		return count;
	}

	/**
	 * 
	 * @param x
	 * @param n
	 * @return  x的n次方
	 */
	private static int pow(int x, int n) {
		if(n==0){
			return 1;
		}
		int temp=pow(x,n-1);
		return temp*x;
	}

	/**
	 * 把十六进制的单个字符转化成int类型
	 * @param b
	 * @return
	 */
	private static int TurnToInt(String b) {
		char c=b.charAt(0);
		switch (c) {
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		default:
			return Integer.parseInt(String.valueOf(c));
		}
	}

}
