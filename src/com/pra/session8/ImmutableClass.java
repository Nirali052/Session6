package com.pra.session8;

public class ImmutableClass {

	public static void main(String[] args) {
		
		Student student=new Student();
		Student student1=new Student("Nirali",50);
		//I
		//s1.name("Ni");
		student.setName("Nanncy");

		student1.setRollNumber(30);
		System.out.println("Student Rollnumber is "+student1.getRollNumber());
		System.out.println("Student Name: "+student.getName());
		
		// a
		// In this case they creating two different object that reason this two references are not same
		String str1 = "Manish";
		String str = new String("Manish");
		if(str1 == str){
			System.out.println("Strings are same");
		}else{
			System.out.println("Strings are not same");
		}

		
		// b. 
		// In this case .intern() method check in string pool if same value is their or not.
		//In 2nd instance .toString() method call and it is return value directly
		String s = new String("Test").intern();
		String s1 = new String("Test");

		if(s == s1){
			System.out.println("We are equal");
		}else{
			System.out.println("we are not equal");
		}
		/*
		 * outpu:String are equal 
		 *equals comparing the values
		 * 
		if(s.equals(s1))
		{
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}
		*/
		

		// c. 
		//In this case sting checking the value not references.
		
		String string1 = "Test";
		String string2 = new String("Test");
		if(string1.equals(string2))
		{
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}
		
		/*
		 * checking references and value
		 * 
		
		if(string1 == string2){
			System.out.println("Strings are same");
		}else{
			System.out.println("Strings are not same");
		}
		*/
		

		
	}

}
