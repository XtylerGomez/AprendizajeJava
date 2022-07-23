//02.- En este programa aprendo el uso de variables y el scanner para leer datos, ademas de unos plugins mas para sublime text
import java.util.Scanner;

public class Variables{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);

		System.out.println("Ingresa tu Nombre : ");
		String nombre = read.nextLine();
		
		System.out.println("Ingresa tu Domicilio : ");
		String dom = read.nextLine();

		System.out.println("Ingresa tu Edad : ");
		int edad = read.nextInt();
		
		System.out.println("Ingresa tu año de Nacimiento : ");
		int nacimiento = read.nextInt();

		System.out.println("Nombre : "+nombre);
		System.out.println("Domicilio : "+dom);
		System.out.println("Edad : "+edad);
		System.out.println("Año de Nacimiento : "+nacimiento);
	}
}
