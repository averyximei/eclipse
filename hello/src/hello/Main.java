package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in=new Scanner(System.in);
	String s = in.nextLine();
	int numSpace=0;
	//字符串有几个空格；
	for(int i =0; i<s.length(); ) {
		if(s.indexOf(' ', i)!=-1) {
			numSpace+=1;
			i=(s.indexOf(' ', i))+1;
		}	else {
			i++;
		}
	}
//System.out.print("有空格个数"+numSpace);
	if(numSpace==0) {
		System.out.print(s.length()-1);
	}else {
		int[]a=new int[numSpace];
		numSpace=0;
		for(int i =0; i<s.length();){
			if(s.indexOf(' ', i)!=-1) {
				a[numSpace]=s.indexOf(' ', i);
				numSpace+=1;
				i=(s.indexOf(' ', i))+1;
			}	else {
				i++;
			}
		}
//	 for(int i=0; i<a.length;i++) {
//		 System.out.println(a[i]);
		System.out.print(a[0]);
		for(int i=1; i<a.length;i++) {
			System.out.print(" "+((a[i]-a[i-1])-1));
		}
		System.out.print(" "+((s.length()-1)-a[a.length-1]-1));
		}

	}
}


	

	
	
	
	
	
	
	
	
	


	
