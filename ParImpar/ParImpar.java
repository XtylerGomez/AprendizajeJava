//04.- Empecé a aplicar un metodo sencillo ademas de un ciclo do while
import java.util.Scanner;

public class ParImpar{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
		int flag = 1;
		do{
			System.out.println("Ingresa el un numero : ");
			int x=read.nextInt();
				if(Check(x)==0){
					System.out.println(x+" es un numero Par");
				}else{
					System.out.println(x+" es un numero Impar");
				}
				if(x==0){
					flag=0;
				}
			}while (flag==1);
		}

	public static int Check(int i)
	{
		return i % 2;
	}
}



