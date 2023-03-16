package model;

public class CuentaBancaria {

    private double saldo;
    private int numero_de_cuenta;
    private Cliente cliente;



    public CuentaBancaria(double saldo, int numero_de_cuenta, Cliente cliente) {
        this.saldo = saldo;
        this.numero_de_cuenta = numero_de_cuenta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void consignar (double monto){

        this.saldo +=monto;

    }

    public void retirar(double monto){

        if (saldo>= monto){

            System.out.println("retiro exitoso");
            this.saldo -=monto;
        }

        else {

            System.out.println("no cuentas con el saldo");
        }


    }

}
