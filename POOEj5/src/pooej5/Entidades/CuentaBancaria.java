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
package pooej5.Entidades;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CuentaBancaria {
    
    public int numeroCuenta;
    public long dni;
    public int saldoActual;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual, float interes){
       this.numeroCuenta = numeroCuenta;
       this.dni = dni;
       this.saldoActual = saldoActual;
       interes = interes;      
    }

    public CuentaBancaria(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
          

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public CuentaBancaria crearCuenta(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su número de cuenta");
        int numero = leer.nextInt();
        System.out.println("Ingrese su dni");
        long dni2 = leer.nextLong();        
        System.out.println("Ingrese el dinero a acreditar como saldo");
        int saldo = leer.nextInt();
        
        return new CuentaBancaria(numero, dni2, saldo);
              
        
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
   
}

    

