import java.util.Scanner;
public class jugueteria
{
   public static void main(String[] args){
    
   Scanner sc = new Scanner(System.in);
   int cod=0 ,can ,pre=0 ,total=0 , id,totalg=0,opc;
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
    totalg=totalg+total;
    
    
}while(opc!=2);
System.out.println( "la ganacias del negocio fueron: "+ totalg);
} 
}
