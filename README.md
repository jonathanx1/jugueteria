# JUGUETERIA
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita una juguetería para registrar sus ventas. Desea registrar nombre, identificación y teléfono de contacto, así como el juguete y la cantidad que va a comprar, calcular el total a pagar de ese mismo cliente y las ganancias que ha obtenido el negocio. Aclaraciones:

• En el programa debe mostrar los juguetes y su costo, que este la opción de registrar más facturas cuando lleguen más clientes

 • Debe realizar cálculos del total que debe pagar así como las ventas totales de dicho negocio

 • No se realiza validación de los datos. 
 ## Diagrama de caso de uso
![](captura.png)
## Plantilla historia de uso
![](/image1.png)

![](/image2.png)
![](/image3.png)
![](/image4.png)
## Diagrama de flujo
![](/image5.PNG)
![](/image6.PNG)
![](/image7.PNG)
![](/Diagrama.png)
![](/Diagrama2.png)
 
Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes
aclaraciones y comentarios:

• En el duagrana se puede visualizar tantos condicionales que son las opciones que aparecen anteriormente

• una pequeña parte no esta completa por temas tecnicos ya que hace falta mecionar que depende del resultado de opc se puede regresar al inicio com un ciclo
• algunos cuadros representan datos alamcenados para las operaciones e imprimirlas com una factura por la compra

## Pseudocodigo
Definir cod,can,pre,total,id,totalg Como Entero

Definir jug,nombre,telefono,opc Como Caracter
	
    Dimension pago[50]
	i=50
Hacer

Hacer
			
		
	Limpiar Pantalla
	escribir"              Lista de juguetes                "
	Escribir"codigo    nombre               precio"
	escribir"1.        Volqueta CBT         $14.500"
	Escribir"2.        Helicoptero Pila     $49.800"
	Escribir"3.        Avion Control Remoto $64.600"
	Escribir"4.        Robot Luces y Sonido $49.800" 
	Escribir"5.        Muñeca Scooter       $93.400"
	Escribir ""
	escribir"Digite el codigo del juguete"
	leer cod

Hasta Que cod>=1  Y cod<=5

	Segun cod Hacer
		1:
			jug="Volqueta CBT"
			pre=14500
		2:
			jug="Helicoptero Pila"
			pre=49800
		3:
			jug="Avion Control Remoto"
			pre=64600
		4: 
			jug="Robot Luces y Sonido"
			pre=49800
		5:
			jug="Muñeca Scooter"
			pre=93400
	FinSegun

	Escribir  "Digite el nombre del cliente"
	Leer  nombre
	escribir "Digite la identificacion del cliente"
	leer id
	Escribir "Digite el telefono de contacto"
	leer telefono
	Escribir "Digite la cantidad que desee comprar"
	leer can
 	Escribir ""
	Escribir "---------------------------------------------"
	escribir"Nombre: " nombre
	escribir"identificacion: " id 
	escribir"Telefono: " telefono
	Escribir ""
	Escribir "producto                    cantidad"
	Escribir jug " "   "                 " can
	total = can*pre
	pago[i]=total
	Escribir "El total a pagar es: $" pago[i]=total
	Escribir "----------------------------------------------"
	Escribir ""
	Escribir "Desea realizar otra facturacion"
	leer opc 
	totalg=totalg+total
Hasta Que opc <> 'si'

Escribir "la ganacias del negocio fueron: " totalg
## Codigo en programacion estructurada en java
import java.util.Scanner;

public class jugueteria

{

   public static void main(String[] args){
    
   Scanner sc = new Scanner(System.in);

   int cod=0 ,can ,pre=0 ,total=0 , id,totalg=0,
   opc;

   String jug="",nombre, telefono;
   do{
    do{
           
    System.out.println("              Lista de juguetes                ");
    System.out.println("codigo    nombre               precio");
    System.out.println("1.        Volqueta CBT         $14.500");
    System.out.println("2.        Helicoptero Pila     $49.800");
    System.out.println("3.        Avion Control Remoto $64.600");
    System.out.println("4.        Robot Luces y Sonido $49.800"); 
    System.out.println("5.        Muñeca Scooter       $93.400");
    System.out.println("Digite el codigo del juguete");
    cod= sc.nextInt();
    }while(cod<=1 && cod>=5);
    switch(cod){
        case 1:
            jug="Volqueta CBT";
            pre=14500;
            break;
        case 2:
            jug="Helicoptero Pila";
            pre=49800;
            break;
        case 3:
            jug="Avion Control Remoto";
            pre=64600;
            break;
        case 4:
            jug="Robot Luces y Sonido";
            pre=49800;
            break;
        case 5:
            jug="Muñeca Scooter";
            pre=93400;
            break;
    }
    System.out.println("Digite el nombre del cliente");
	nombre= sc.next();
    System.out.println("Digite la identificacion del cliente");
	id= sc.nextInt();
    System.out.println("Digite el telefono de contacto");
	telefono= sc.next();
    System.out.println("Digite la cantidad que desee comprar");
	can=sc.nextInt();	
	System.out.println("\n---------------------------------------------");
	System.out.println("Nombre: "+ nombre);
	System.out.println("identificacion: "+ id);
	System.out.println("Telefono: "+ telefono);
	System.out.println("producto                      cantidad");
	System.out.println( jug  +"                    "+ can);
	total = can*pre;
	System.out.println( "El total a pagar es: $" +total);
	System.out.println( "----------------------------------------------");
	System.out.println( "");
	System.out.println( "Desea realizar otra facturacion");
	opc= sc.nextInt();
	System.out.println( "1.si");
	System.out.println( "2.no");
	totalg=totalg+pago[i];
	
	
}while(opc!=2);

System.out.println( "la ganacias del negocio fueron: "+ totalg);
} 
}
## Codigo de programacion orientada a objetos
public class jugueteriaPOO

{

    String jug,nombre,telefono,opc, color;

    int cod,can,pre,total,id,totalg;
}

import java.util.Scanner;

public class ventas

{

    public static void main(String[] args){
    
   Scanner sc = new Scanner(System.in);

   int cod ,can ,pre=0 ,total=0 , id,totalg=0,opc;

   jugueteriaPOO[] jueguetes = new jugueteriaPOO[50];

   String jug="",nombre,telefono, color;

   do{
       
    System.out.println("              Lista de juguetes                ");
    System.out.println("codigo    nombre               precio");
    System.out.println("1.        Volqueta CBT         $14.500");
    System.out.println("2.        Helicoptero Pila     $49.800");
    System.out.println("3.        Avion Control Remoto $64.600");
    System.out.println("4.        Robot Luces y Sonido $49.800"); 
    System.out.println("5.        Muñeca Scooter       $93.400");
	
    System.out.println("Digite el codigo del juguete");
    cod= sc.nextInt();

    

    switch(cod){
        case 1:
            jug="Volqueta CBT";
            pre=14500;
            break;
        case 2:
            jug="Helicoptero Pila";
            pre=49800;
            break;
        case 3:
            jug="Avion Control Remoto";
            pre=64600;
            break;
        case 4:
            jug="Robot Luces y Sonido";
            pre=49800;
            break;
        case 5:
            jug="Muñeca Scooter";
            pre=93400;
            break;
    }
    System.out.println("Digite el nombre del cliente");
	nombre= sc.next();
    System.out.println("Digite la identificacion del cliente");
	id= sc.nextInt();
    System.out.println("Digite el telefono de contacto");
	telefono= sc.next();
    System.out.println("Digite la cantidad que desee comprar");
	can=sc.nextInt();
	System.out.println("\n---------------------------------------------");
	System.out.println("Nombre: "+ nombre);
	System.out.println("identificacion: "+ id);
	System.out.println("Telefono: "+ telefono);
	System.out.println("producto                      cantidad");
	System.out.println( jug  +"                    "+ can);
	total = can*pre;
	System.out.println( "El total a pagar es: $" +total);
	System.out.println( "----------------------------------------------");
	System.out.println( "");
	System.out.println( "Desea realizar otra facturacion");
	System.out.println( "1.si");
	System.out.println( "2.no");
	opc= sc.nextInt();
	totalg=totalg+total;
	
}while(opc!=2);

System.out.println( "la ganacias del negocio fueron: "+ totalg);

}

}
