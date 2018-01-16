package edu.fju.exam;

public class Niner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++){
			for(int j=2;j<=5;j++){
				if(j<5){
					if(i*j<10){
						System.out.print(j+"x"+i+"="+j*i+"   ");
					}
					else{
						System.out.print(j+"x"+i+"="+j*i+"  ");
					}
				}
				else{
					if(i*j<10){
						System.out.println(j+"x"+i+"="+j*i);
					}
					else{
						System.out.println(j+"x"+i+"="+j*i);
					}
				}
			}
		}

	}

}
