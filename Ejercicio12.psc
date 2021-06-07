Algoritmo Ejercicio12
	
	promedioEdad = 0
	PromedioAlturaM = 0
	PromedioAlturaF = 0
	
	Escribir "Ingrese la altura"
	leer altura
	
	Mientras altura > 0 Hacer
		
		Escribir  "Ingrese la edad"
		leer edad
		
		Escribir "Ingrese f si eres mujer o m si eres Hombre"
		leer sexo
		
		Si sexo = m Entonces
			contadorM = contadorM + 1
			sumaAlturaM = sumaAlturaM + altura
			sumaEdadM = sumaEdadM + edad
			PromedioAlturaM = sumaAlturaM / contadorM
			promedioEdad =(sumaEdadF +sumaEdadM) /(contadorM +contadorF)
			
		SiNo
			
		Fin Si
		
		Escribir "Ingrese la altura"
		leer altura
	Fin Mientras
	
FinAlgoritmo
