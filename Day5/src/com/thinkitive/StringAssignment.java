package com.thinkitive;

public class StringAssignment {

	public static void main(String[] args) {
		
		String s = "hello World how are you";
		
		//1 make first letter of a string capital without using replace method
		System.out.println(s);
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		System.out.println(s+" first \n");
		
		//2 reverse a string
		String temp = "";
		for (int i=0; i < s.length(); i++) {
			temp = s.substring(i, i+1) + temp;
		}
		s = temp;
		System.out.println(s+" second \n");
		
		//3 make first letter of every word in string capital
		s = "hello world how are you";
		System.out.println(s);
		String arr[] = s.split(" ");
		temp = "";
		for (int i=0; i < arr.length; i++) {
			arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
			temp = temp+arr[i]+" ";
		}
		s = temp;
		System.out.println(s+" third \n");
		
		//4 reverse every word in string
		System.out.println(s);
		String arr1[] = s.split(" ");
		temp = "";
		for (int i=0; i < arr1.length; i++) {
			String temp1 = "";
			for (int j=0; j < arr[i].length(); j++) {
				temp1 = arr[i].substring(j, j+1) + temp1;
			}
			temp = temp+temp1+" ";
		}
		s = temp;
		System.out.println(s+" fourth \n");
		
		//5 find frequency of words
		s = "moon red Red moon Red white Red green ";
		System.out.println(s);
		String arr2[] = s.split(" ");
		String arr3[] = new String[10];
		int arr4[] = new int[10];
		int count = 0;
		for(int i=0;i<arr2.length;i++) {
			int counter = 0;
			temp = arr2[i];
			int flag = 0;
			for(int j=0;j<count;j++) {
				if(temp.equals(arr3[j])) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				arr3[count] = arr2[i];
				for(int k=i+1;k<arr2.length;k++) {
					if(arr2[i].equals(arr2[k])) {
						counter++;
					}
				}
				arr4[count] = counter + 1;
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(arr3[i]+" "+arr4[i]);
		}
		
	}
}
