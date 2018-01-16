package edu.fju.exam;
import java.util.Scanner;
import java.util.ArrayList;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> goods= new ArrayList<>();
		goods.add(10);
		goods.add(15);
		goods.add(10);
		goods.add(18);
		goods.add(10);
		goods.add(20);
		goods.add(15);
		goods.add(18);
		int cash = 0;
		boolean power = true;
		Scanner input = new Scanner(System.in);	
		while(power){
			System.out.println("販賣機餘額："+cash+"元");
			System.out.println("請投幣或選擇飲料(a,b,c,d,e,f,g,h),或輸入0結束：");
			String in = input.next();
			switch(in){
			case"1":
				cash = cash+1;
				break;
			case"5":
				cash = cash+5;
				break;
			case"10":
				cash = cash+10;
				break;
			case"a":
				if(goods.get(0)>cash){
					System.out.println("BEEP!");
				}
				else{
					System.out.println("DON!");
				}
			}
		}
	}

}
