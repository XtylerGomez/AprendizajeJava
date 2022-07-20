import java.util.Scanner;

public class MayorMenor{

	public static void main(String args[]){
		Scanner read=new Scanner(System.in);

		int x, y, z;
		System.out.println("Ingresa el primer numero : ");
		x=read.nextInt();

		System.out.println("Ingresa el segundo numero : ");
		y=read.nextInt();
		
		System.out.println("Ingresa el tercer numero : ");
		z=read.nextInt();

		int sum = x+y+z;
		float prom = (Float.valueOf(sum))/3;

		
		System.out.println("El promedio de los tres numeros es : "+prom+".");
		if(x>y){
			System.out.println("El primer numero ("+x+") es mayor al segundo ("+y+").");
		}else{
			System.out.println("El primer numero ("+x+") es menor al segundo ("+y+").");
		}
		if(y>z){
			System.out.println("El segundo numero ("+y+") es mayor al tercero ("+z+").");
		}else{
			System.out.println("El segundo numero ("+y+") es menor al tercero ("+z+").");
		}
		if(z>x){
			System.out.println("El tercer numero ("+z+") es mayor al primero ("+x+").");
		}else{
			System.out.println("El tercer numero ("+z+") es menor al primero ("+x+").");
		}

	}
}