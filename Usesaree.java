package day1;

public class Usesaree {
public static void main(String[]args) {
	Saree s1 = new Saree();
	s1.material = "cotton";
	s1.colour = "red";
	s1.price = 1000;
	s1.discountamount=(s1.price*20)/100;
	System.out.println("material = "+s1.material);
	System.out.println("colour ="+s1.colour);
	System.out.println("price ="+s1.price);
	System.out.println("discountamount ="+s1.discountamount);
	System.out.println("discountpercentage ="+(s1.price-(s1.price*20)/100));
	
}
}
