import java.util.Scanner;

public class Ejercicio12{

	public static void main(String[] args) {
		


		
		Scanner sc = new Scanner(System.in);

		int promedioEdad = 0;
		int promedioAlturaM = 0;
		int promedioAlturaF = 0;
		int contadorM=0, contadorF=0, contadorEdad=0;
		int altura,edad=0,sumaEdadM=0,sumaAlturaM=0,sumaAlturaF=0,sumaEdadF=0;
		int sexo;




	
		System.out.println("\nIngrese la altura");
		altura = sc.nextInt();

		while (altura > 0) {
			

			System.out.println("Ingrese 1 si eres mujer o 2 si eres Hombre");
			sexo = sc.nextInt();

		
			if (sexo==2) {

					System.out.println( "Ingrese la edad: ");
					edad = sc.nextInt();

					contadorM = contadorM + 1;
					contadorEdad = contadorEdad + edad;
					sumaAlturaM = sumaAlturaM + altura;
					sumaEdadM = sumaEdadM + edad;
					promedioAlturaM = sumaAlturaM / contadorM;
					promedioEdad =(sumaEdadF +sumaEdadM) /(contadorM +contadorF);
			}

			
			else{

				System.out.println("Ingrese la edad: ");
				edad = sc.nextInt();

				contadorF = contadorF + 1;
				contadorEdad = contadorEdad + edad;
				sumaAlturaF = sumaAlturaF + altura;
				sumaEdadF = sumaEdadF + edad;
				promedioAlturaF = sumaAlturaF / contadorF;
				promedioEdad =(sumaEdadF +sumaEdadM) /(contadorM +contadorF);



			}
			
		
			System.out.println("Ingrese la altura");
			altura = sc.nextInt();

		
			
			
		}
	
		
		
			
		
		System.out.println("El promedio de altura entre lo varones es de: " + promedioAlturaM + ", el promedio de altura entre las mujeres es de: " +promedioAlturaF +" y el promedio de edad entre los participantes es de: "+promedioEdad);
	 






	}



}