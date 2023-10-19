package day1;

public class Boolean {
public static void main(String[]args) {
	String world = "onesofts";
	String world1 = "Onesofts";
	boolean a = world.equals(world1);
	boolean b = world.equalsIgnoreCase(world1);
	boolean c = world.contains("sof");
	String d = world.concat(world1); 
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
