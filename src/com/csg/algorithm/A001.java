package com.csg.algorithm;

import java.util.Arrays;

/**
 * 整型数组里找出符合要求的元素，满足前面的元素比该元素小，后面的元素比该元素大
 * @author Administrator
 *
 */
public class A001 {

	public static void main(String[] args) {
		int a[]={3,5,4,6,8};
		String b[]=chooseElement(a);
		System.out.println(Arrays.toString(b));
	}
	
	/**
	 * 使用max数组记录，当前位置前面最大的元素
	 * 使用min数组记录，当前位置后面最小的元素
	 * 最后判断  max[i]<=a[i]<=min[i] 
	 * @param a 整型数组
	 * @return String[]
	 */
	private static String[] chooseElement(int[] a) {
        // 扫描到当前位置时,该元素前面的最大元素
        int max[] = new int[a.length];
        // 扫描到当前位置时,该元素后面的最小元素
        int min[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            max[i] = a[i];
            min[i] = a[i];
        }
        for (int i = 1; i < a.length; i++) {
            if (max[i] < max[i - 1]) {
                max[i] = max[i - 1];
            }
        }
        for (int i = a.length - 2; i >= 0; i--) {
            if (min[i] > min[i + 1]) {
                min[i] = min[i + 1];
            }
        }
        String result[] = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max[i] && a[i] <= min[i]) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }
        return result;
    }

}
