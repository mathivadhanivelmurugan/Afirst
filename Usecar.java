package day1;

public class Usecar {
public static void main(String[]args) {
	Car car = new Car();
	car.brand = args[0];
	car.colour = args[1];
	car.price = Integer.parseInt(args[2]);
	System.out.println(car.brand+" "+car.colour+" "+car.price);
	
}
}
