package com.lakers.day32;

import java.util.Scanner;

/**
 * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,
 * 然后再加上原先的数得到"相反数"。例如,为了得到1325的"相反数",
 * 首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,
 * 我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。
 * 例如n = 100, 颠倒之后是1. 
 * @author m1563
 *
 */
public class OppositeNnumber {
	public static void main(String[] args) {
		//最终输出结果
		int result = 0;
		
		//获得用户输入值
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		//先加上初始值
		result += num1;
		
		//将用户输入值取反存入数组
		int[] arr = new int[10];
		//数组真实长度
		int count = 0;
		//获得取反后的数组
		while(num1>0) {
			int yushu = num1%10;
			arr[count++] = yushu;
			num1 = num1/10;
		}
		//计算取反后的值
		int num2 = 0;
		boolean flag = false;
		int tempCount = count;
		//拼成数字
		for(int i=0; i<count; i++) {
			tempCount = count-i;
			if(arr[i]==0&&!flag) { //如果第一个是0
				flag = true;
				continue;
			}
			while(--tempCount>0) {
				arr[i] = arr[i]*10;
			}
			num2 += arr[i];
		}
		//最种结果是由输入值  + 取反后的值
		result += num2;
		
		System.out.println("取反后的结果" + result);
	}
}
