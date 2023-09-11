import java.util.Scanner;

public class CuentaBancaria {
    String titularCuenta = "";
    int balance = 0;

    CuentaBancaria(String titular, int balance){
        this.titularCuenta = titular;
        this.balance = balance;
    }

    public int depositar(int deposito){
        this.balance = this.balance + deposito;
        return this.balance;
    }

    public int retirar(int retiro){
        if(retiro > this.balance){
            System.out.println("no tienes saldo suficiente para retirar " + retiro);
            return this.balance;
        }
        this.balance = this.balance - retiro;
        return this.balance;
    }

    public int obtenerBalance(){
        /*
         * actualmente tienes balance en la cuenta
         */
        System.out.println("Actualmente tienes " + this.balance + " en la cuenta");
        return this.balance;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titular de la cuenta : ");
        String titular1 = scanner.nextLine();
        System.out.println("Ingrese el balance : ");
        int balance1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la operacion : ");
        String operacion = scanner.nextLine();

        CuentaBancaria miCuenta = new CuentaBancaria(titular1,balance1);
        if(operacion.equals("deposito")){
            System.out.println("ingrese el deposito : ");
            int deposito1 = Integer.parseInt(scanner.nextLine());
            int total = miCuenta.depositar(deposito1);
        }
        else if(operacion.equals("retiro")){
            System.out.println("ingrese el valor de retiro : ");
            int retiro1 = Integer.parseInt(scanner.nextLine());
            int total = miCuenta.retirar(retiro1);
        }
        else{
            System.out.println("operacion invalida");
        }
        
        
        miCuenta.obtenerBalance();


    }




    
}
