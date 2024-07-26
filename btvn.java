package btvn1;

import java.util.Scanner;

public class btvn {
//BT1: Tính diện tích và chu vi
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		Float r=sc.nextFloat();
//		Float dienTich=dienTich(r);
//		Float chuVi=chuVi(r);
//		System.out.printf("%.3f %.3f", dienTich, chuVi);
//	
//	}
//	public static Float dienTich(Float r) {
//		return 3.14f*(r*r);
//	}
//	public static Float chuVi(Float r) {
//		return 2*3.14f*r;
//	}
//BT2: 
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		if(n%2==0) {
//			arr[n-1]+=arr[n-2];
//		}
//		int l=0;
//		int r=2;
//		while(r<n) {
//			arr[l+1]+=Math.abs(arr[r]-arr[l]);
//			l+=2;
//			r+=2;
//		}
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
//
//	}
//BT3: Mảng xoắn ốc
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][n];
	    int m = n * n;
	    int[] b = new int[m];
	    int t = 1;
	    int k = 0;
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            arr[i][j] = t;
	            b[k] = arr[i][j];
	            k++;
	            t++;
	        }
	    }
	    sort(arr, n, b);
	    print(arr, n);
	}

	public static void sort(int[][] arr, int n, int[] b) {
	    int t = 0;
	    int dongMin = 0, dongMax = n - 1, cotMin = 0, cotMax = n - 1;
	    while (dongMin <= dongMax && cotMin <= cotMax) {
	        
	        for (int i = cotMin; i <= cotMax; i++) {
	            arr[dongMin][i] = b[t];
	            t++;
	        }
	        dongMin++;
	        
	        
	        for (int i = dongMin; i <= dongMax; i++) {
	            arr[i][cotMax] = b[t];
	            t++;
	        }
	        cotMax--;
	        
	        
	        if (dongMin <= dongMax) {
	            for (int i = cotMax; i >= cotMin; i--) {
	                arr[dongMax][i] = b[t];
	                t++;
	            }
	            dongMax--;
	        }
	        
	        
	        if (cotMin <= cotMax) {
	            for (int i = dongMax; i >= dongMin; i--) {
	                arr[i][cotMin] = b[t];
	                t++;
	            }
	            cotMin++;
	        }
	    }
	}

	private static void print(int[][] arr, int n) {
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}
