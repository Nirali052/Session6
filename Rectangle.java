package pra.com.session6;

public class Rectangle {

		int len;
		int bred;
		public static int prem=10;
		static int instancecount;
		
		static {
			prem=10;
			System.out.println("Static block prem"+prem);
			instancecount++;
		}
		{
			len=10;
			bred=20;
			System.out.println("Non static block");
			instancecount ++;
		}
		public int getLen() {
			return len;
		}
		public void setLen() {
			this.len=len;
			
		}
		public int getBred() {
			return bred;
		}
		public void setBred() {
			this.bred=bred;
			
		}

		public Rectangle(){
		System.out.println("Constructor called");
		this.len = 100;
		this.bred = 20;
		instancecount++;
		} 
		public int getinstancecount() {
			return instancecount;
		}
		public static void main(String[] args) {
			Rectangle rec=new Rectangle();
			Rectangle rec1=new Rectangle();

			System.out.println("Number of instance "+instancecount);
		}
		
}
