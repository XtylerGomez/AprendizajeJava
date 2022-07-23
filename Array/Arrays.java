//05.- Aqui veo el tema de los arrays y de los ciclos for, ademas de una solucion 

import java.util.Scanner;
import java.util.ArrayList;

public class Arrays{
	public static void main(String args[]){
		
		Nombres();
	}

	public static void Nombres(){
		Scanner read=new Scanner(System.in);

		String Nombres[];
		System.out.println("Ingresa la cantidad de nombres a registrar : ");
		int x=read.nextInt();

		read.nextLine();//NextLine para que lea el resto de nextlines

		Nombres = new String[x];
		for(int i=0;i<x;i++){
			System.out.println("Ingresa el nombre n°"+(i+1)+". ");
			Nombres[i]=read.nextLine();
		}

		for(int j=0;j<x;j++){
			System.out.println("El nombre n°"+(j+1)+" Es : "+Nombres[j]);
		}
	}
}