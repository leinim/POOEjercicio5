/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej5;

import java.util.Scanner;
import pooej5.Entidades.CuentaBancaria;

/**
 *
 * @author Mile
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria();
        double ingresar, retirar;
        
        c1 = c1.crearCuenta();
        
        System.out.println("Inserte la cantidad de dinero a ingresar");
        ingresar = leer.nextDouble();
        System.out.println("Ingrese la cantidad de dinero a retirar");
        retirar = leer.nextDouble();               
        
        c1.setSaldoActual(ingresar(ingresar, c1.getSaldoActual()));
        c1.setSaldoActual(retirar(retirar, c1.getSaldoActual()));
        c1.setSaldoActual(extraccionRapida(c1.getSaldoActual()));
        consultarSaldo(c1);
        mostrarDatos(c1);       
        
   
    }
    
    public static int ingresar(double ingresar, int saldo){
        saldo += (int) ingresar;
                
        return saldo;
        
    }
    
    public static int retirar(double retirar, int saldo){
        if (retirar <= saldo){
            saldo -= (int) retirar;
        } else {
            saldo = 0;
        }
        
        return saldo;
    }
    
    public static int extraccionRapida(int saldo){
        Scanner leer = new Scanner(System.in);
        System.out.println("Extraccion rapida");
        int extraccion = leer.nextInt(); 
        if (extraccion <= saldo * 0.2){
            saldo -= extraccion;
        } else {
            System.out.println("El valor a retirar supera el 20% del saldo actual");
        }
        
        return saldo;
        
        
    }
    
    public static void consultarSaldo(CuentaBancaria c1){
        
               
        System.out.println(c1.getSaldoActual());
    }
    
    public static void mostrarDatos(CuentaBancaria c1){
        
        System.out.println(c1.toString());
        
                
    }
}
    
    
    