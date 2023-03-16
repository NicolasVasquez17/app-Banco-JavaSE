import javax.swing.JOptionPane;
import model.Cliente;
import model.CuentaBancaria;
import model.Transaccion;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        double valor = 0;
        double plata = 0;
        int vuelta;
        //String consulta;
        boolean bandera = true;

        Random RNM = new Random();
        Random RCuenta = new Random();

        JOptionPane.showMessageDialog(null, "********* BIENVENIDO AL BANCO *********");


        Cliente N1 = new Cliente("NICOLAS", "INGENIERO AGROPECUARIO", "1025641585", "DIOS");
        Cliente N2 = new Cliente("CAMILO", "INGENIERO AGROPECUARIO", "8792789870", "GAY");


        CuentaBancaria A1 = new CuentaBancaria(RNM.nextDouble(10000000), RCuenta.nextInt(1000000000), N1);

        plata = RNM.nextDouble(10000000);
        CuentaBancaria A2 = new CuentaBancaria(RNM.nextDouble(10000000), RCuenta.nextInt(1000000000), N2);

        do {

            vuelta = Integer.parseInt(JOptionPane.showInputDialog("****Que Deseas Hacer****\n\n1.Consignar\n2.Retirar\n3.Consultarsaldo\n4.Salir del banco"));
            switch (vuelta) {

                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("cual es el monto de la transaccion"));
                    A1.consignar(valor);
                    break;

                case 2:
                    A1.retirar(valor);
                    break;

                case 3:
                    N1.consultarSaldo(A1);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Salis del banco");
                    bandera = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "elegiste una opcion invalida vuelva a intentarlo por favor");
                    break;
            }

        }

        while (bandera);


        Transaccion T1 = new Transaccion(valor, A1, A2, valor);


        // N1.procesarTransaccion(T1);

    }
/*

cosas pendientes-----------------------------------------------------------------------

* falta hacer el condicional para decidir si consignar o retirar
* generar aleatoriamente los numeros de las cuentas y que no puedan ser iguales
*
*
* cambios-------------------------------------------------------------------------------
*
* se agrego el que resta el monto del saldo
*
* elimine la variable saldo de la clase transaccion tambien en los constructores y en la creacion de objetos del main
*
* comente todo lo que tuviera  que ver con saldo en la clase de transaccion
*
* en la clase cliente modifique el metodo de consultarsaldo alterando el atributo que recibian de transaccion por el de cuentaBancaria
*
* hasta el momento todo funciona bien

--------------------------------------------------------------------------------------
*
* niggas in paris
*
* preguntas????????--------------------------------------------------------------------
*
* pedir datos de usuarios?
*
* cual es la funcionalidad de transaccionmonto? se pone lo mismo que en monto?
*
* el saldo lo pido ? o de donde putas me lo saco
*
*
* */


}
