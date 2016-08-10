package punto1155;

import java.util.Scanner;

/**
 *
 * @author Aldebarantech
 */
public class Punto1155 {
    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);
    static Cliente cliente=new Cliente();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option;
    do{
        System.out.println("\nDigite Una Opcion ");
        System.out.println("1. Ingresar Datos");
        System.out.println("2. Mostrar Datos");
        System.out.println("3. Actualizar Datos");
        System.out.println("4. Retirar");
        System.out.println("5. Consultar Saldo");
        System.out.println("6. Consignar");
        System.out.println("0. Salir\n");
        option=lector.nextInt();
        
        switch (option){
            case 1: cliente.Loading_Data();
                break;
            case 2: cliente.Data_Show();
                break;
            case 3: cliente.Actualizar_datos();
                break;
            case 4:Retirar();
                break;
            case 5: System.out.println(cliente.getSaldo());
                break;
            case 6: Consignacion();
                break;                      
        }
    }while(option!=0);
    }
            
    private static void Consignacion(){
        double saldo;
        System.out.println("\nDigite El valor a consignar ");
        saldo=cliente.getSaldo();
        saldo=saldo+lector.nextDouble();
        cliente.setSaldo(saldo);
    }
    private static void Retirar(){
        double saldo,retirar;
        System.out.println("\nDigite El valor a retirar ");
        retirar=lector.nextDouble();
        saldo=cliente.getSaldo();
        if(retirar>saldo)
             System.out.println("\nSaldo Insuficiente");
        else{
            saldo=saldo-retirar;
            cliente.setSaldo(saldo);
        }
        
        
        
    }
   
    
    
}
