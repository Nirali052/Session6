package com.pra.session3;

public class Rectangle {
	int len=10;
	int bred=20;
	


	public Rectangle(){
	System.out.println("Constructor called");
	this.len = 100;
	this.bred = 20;
	} 


	public void  calArea(){
		System.out.println("Area is " + len*bred);
	}

	public int getLength(){
		return this.len;
	}

	public int getBredth(){
		return this.len;
	}

	public void setLength(int len){
	this.len = len;
	}

	public void setBredth(int bred){
	this.bred = bred;
	}
	public static void main(String[] args) {
		
		//a
		Rectangle rec = new Rectangle();
		rec.calArea();
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();

		// b
	/*	if(rec1 == rec2){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}*/
		
		// c
		
	/*	if(rec1.getLength == rec2.getLength){
			System.out.println("Equal");
			}
			else{
				System.out.println("Not Equal");
			}
		//d
		
		rec1.setLength(12);
		rec2.setLength(20);

		if(rec1.getLength == rec2.getLength){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		// d
		rec1= rec2;

				if(rec1 == rec2){
					System.out.println("Equal");
				}
				else{
					System.out.println("Not Equal");
				}*/

		
	}

}


