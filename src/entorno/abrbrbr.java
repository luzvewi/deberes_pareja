package entorno;
import java.util.Scanner;
public class abrbrbr {
	public static void main (String[]args) {
		Scanner sc =new Scanner(System.in);
		int array[]= new int[9];
		System.out.println("introduce una secuencia de numeros del 0 al 10 en el orden que quieras (puedes repetir los numeros)");
		for(int i=0;i<9;i++) {
			int num=sc.nextInt();
			switch(num) {
			case 1: array[0]++;break;
			case 2: array[1]++;break;
			case 3: array[2]++;break;
			case 4: array[3]++;break;
			case 5: array[4]++;break;
			case 6: array[5]++;break;
			case 7: array[6]++;break;
			case 8: array[7]++;break;
			case 9: array[8]++;break;
			case 10: array[9]++;break;
			}
		}
		for(int a=0; a<9;a++) {
			System.out.println((a+1)+" tiene: "+array[a]+" marcas");
		}
	}
}
