package day1;

public class Usecomputer {
	public static void main(String[]args) {
		Computer a = new Computer();
		a.brand = "HP";
		a.displaysize =7.5f;
		a.price = 50000;
		a.taxamount=(a.price*2/100);
		System.out.println("brand ="+a.brand);
		System.out.println("displaysize ="+a.displaysize);
		System.out.println("price ="+a.price);
		System.out.println("taxamount ="+a.taxamount);
		System.out.println("taxpercentage ="+((a.price*2/100)+a.price));
		
		
		
	}

}
