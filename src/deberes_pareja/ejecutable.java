package deberes_pareja;

import java.util.Scanner;

public class ejecutable {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String nombre=sc.next();
	int edad =sc.nextInt();
	
	personas jose=new personas(nombre,edad);
	
	
	
}
}
