package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EncryptNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		List<String> ls=new ArrayList<String>();
		for(int i=0;i<size;i++) {
			if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122) {
				ls.add((char)i+"");
				System.out.println((char)i);
			}else if(arr[i]<65 || arr[i]>90 && arr[i]<97 || arr[i]>122) {
			ls.add(-1+"");
		}
		}
		System.out.println(ls);
	}
}