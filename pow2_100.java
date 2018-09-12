package com.rjg.lianxi2;

import java.util.Scanner;

public class pow2_100 {

	public static void main(String[] args) {
		int[] date = new int[10000];
		date[1] = 1;
		int weishu = 1; // 求出来的值的位数
		System.out.println("求2的n次方的值");
		System.out.print("n=");
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= weishu; j++) {
		date[j] = date[j] * 2;
		}
		// 确保除最高位外的每位不大于9
		for (int j = 1; j < weishu; j++) {
		if (date[j] >= 10) {
		date[j + 1] += date[j] / 10;
		date[j] = date[j] % 10;
		}
		}
		//确保最高位不大于9
		while (date[weishu] >= 10) {
		weishu++;
		date[weishu] += date[weishu - 1] / 10;
		date[weishu - 1] = date[weishu - 1] % 10;
		}
		}
		System.out.print("2的" + n + "次方= ");
		for (int k = weishu; k >= 1; k--) {
		System.out.print(date[k]);
		}
		System.out.println("");
	}

}
