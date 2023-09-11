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
        CuentaBancaria miCuenta = new CuentaBancaria("Santiago", 400000);
        int total = miCuenta.depositar(200000);
        miCuenta.obtenerBalance();
        total = miCuenta.retirar(180000);
        miCuenta.obtenerBalance();


    }




    
}
