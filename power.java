package lecture_34;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int p=scn.nextInt();
		int ans=power(n,p);
		System.out.println(ans);
	}
public static int power(int x,int n) {
	if(n==0) {
		return 1;
	}
	if(n%2==1) {
	int sp=power(x, n/2);
	return sp*sp*x;

	}
	else {
		int sp=power(x, n/2);
		return sp*sp;
	}
}
}
