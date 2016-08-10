package punto1155;

import java.util.Scanner;

/**
 *
 * @author Aldebarantech
 */
public class Cliente extends PERSONAL_DATE {
    private Scanner lector;
    private double Saldo;
    
    public void Actualizar_datos(){
        lector = new Scanner(System.in);
        System.out.println("Digite Direccion: ");
        this.setDireccion(lector.next());
        System.out.println("Digite Telefono: ");
        this.setTelefono(lector.next());
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
    
}
