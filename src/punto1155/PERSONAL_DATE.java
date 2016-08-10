package punto1155;

import java.util.Scanner;

/**
 *
 * @author Aldebarantech
 */
public class PERSONAL_DATE {
     private String Nombre, Apellido, Edad, Cedula, Nacimiento, Direccion, Telefono;
     private Scanner lector;

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    

  
     
     public void Loading_Data(){
        lector = new Scanner(System.in);
        System.out.println("\nDigite el nombre: ");
        Nombre=lector.next();
        System.out.println("\nDigite el Apellido: ");
        Apellido=lector.next();
        System.out.println("\nDigite edad: ");
        Edad=lector.next();
        System.out.println("\nDigite Cedula: ");
        Cedula=lector.next();
        System.out.println("\nDigite Fecha de Nacimiento: ");
        Nacimiento=lector.next();
        System.out.println("\nDigite Direccion: ");
        Direccion=lector.next();
        System.out.println("\nDigite Telefono: ");
        Telefono=lector.next();
     } 
     
     public void Data_Show(){
         System.out.println("\nNombre: "+Nombre+
                 " \nApellido: "+Apellido+
                 " \nEdad: "+Edad+
                 " \nCedula: "+Cedula+
                 " \nFecha de Nacimiento: "+Nacimiento+
                 " \nDireccion: "+Direccion+
                 " \nTelefono: "+Telefono);
     }

}
