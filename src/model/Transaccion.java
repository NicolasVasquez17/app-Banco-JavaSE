package model;

import javax.swing.*;

public class Transaccion {


    private double monto;
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    //  private double saldo;
    private double transaccionmonto;

    public Transaccion(double monto, CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino,double transaccionmonto) {
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        //  this.saldo = saldo;
        this.transaccionmonto = transaccionmonto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    /* public double getSaldo() {
         return saldo;
     }
 */
      /* public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
*/
    public double getTransaccionmonto() {
        return transaccionmonto;
    }

    public void setTransaccionmonto(double transaccionmonto) {
        this.transaccionmonto = transaccionmonto;
    }

    public void ejcutarTransaccion(){


        if (cuentaOrigen.getSaldo() >= transaccionmonto){

            cuentaOrigen.retirar(transaccionmonto);
            cuentaOrigen.consignar(transaccionmonto);


        }

        else{
            JOptionPane.showMessageDialog(null,"fondos insuficiente");
        }
    }

    public void enviar(){
        
        if(cuentaOrigen.getSaldo() >=transaccionmonto){

         //   cuentaOrigen.consignar(cuentaDestino);

        }
        
    }
    
    
}

/*
*
* crear metodo de transacion donde se reste monto de cuenta de origen.get saldo y se sume en cuenta de destino.get saldo
*
* */