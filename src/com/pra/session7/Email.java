package com.pra.session7;



public class Email {
 
	// 
	private String content;
	String subject;

	private Email() {
		System.out.println("Call me here");
	}
/*
	public Email() {
		System.out.println("Call me here");
	}
	*/
	
	private void sendEmail()
	{
		System.out.println("private method call");
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	public static void recEmail() {
		
	System.out.println("Message passed to the person");
		
	}
}
