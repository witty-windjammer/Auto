
package claseauto;

import java.util.Scanner;


public class ClaseAuto {

    public static void main(String[] args) {
        
        //aqui se crean los autos (se instancían).
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre de su primer Auto:  ");
        String primerNombreDeAuto = scan.nextLine();
       
        System.out.println("\nIngrese tipo del primer Auto");
        String primerTipoDeAuto = scan.nextLine();
        
        System.out.println("\nIngrese la velocidad del primer auto: ");
        int primerVelocidad = scan.nextInt();
        
        //aqui definimos por pimera vez la variable auto1.
        Autos auto1 = new Autos(primerNombreDeAuto, primerTipoDeAuto, primerVelocidad);
        
        
        System.out.println("Ingrese nombre de su segundo Auto: ");
        String segundoNombreDeAuto = scan.nextLine();
       
        System.out.println("\nIngrese tipo del segundo Auto");
        String segundoTipoDeAuto = scan.nextLine();
        
        System.out.println("\n Ingrese la velocidad del segundo auto");
        int segundaVelocidad = scan.nextInt();
        
        //aqui definimos por primera vez la variale auto2.
        Autos auto2 = new Autos (segundoNombreDeAuto, segundoTipoDeAuto, segundaVelocidad);
        
        
        
       // Autos obj1 = new Autos("ferrari", "deportivo", "200.0");
        //Autos obj2 = new Autos("Audi", "deportivo", "150.0");
        
        
        //variable que esta llamando a todo lo que tiene dentro.
      //  compararVelocidad();
        
     
    }
    
    //metodo
    private static void compararVelocidad(){
    
        
        
    }
}
