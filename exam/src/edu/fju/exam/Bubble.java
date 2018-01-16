package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int storage = 0;
 		//int[] numbers = {45, 81, 9, 72, 4, 6};
 		int[] numbers = {6, 5, 2, 8, 1, 9, 13, 4, 11, 7}; 
 		for (int i=0;i<numbers.length-1;i++){
 			for (int j=i+1;j<numbers.length;j++){
 				if(numbers[i]<numbers[j]){
 					storage = numbers[i];
 					numbers[i]=numbers[j];
 					numbers[j]=storage;
 				}
 			}
 		}
 		for (int k=0;k<numbers.length;k++){
 			System.out.print(numbers[k]+" ");
 		}
 	}
}
