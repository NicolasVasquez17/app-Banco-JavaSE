package model;

public class Cliente {

    //Atributos

    private String nombre;
    private String ocupacion;
    private String dni;
    private String genero;
    private CuentaBancaria cuenteaBancaria;

    public Cliente(String nombre, String ocupacion, String dni, String genero) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.dni = dni;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public CuentaBancaria getCuenteaBancaria() {
        return cuenteaBancaria;
    }

    public void setCuenteaBancaria(CuentaBancaria cuenteaBancaria) {
        this.cuenteaBancaria = cuenteaBancaria;
    }

    public void consultarSaldo(CuentaBancaria cuenteaBancaria){


        System.out.printf("su saldo es: "+ cuenteaBancaria.getSaldo());
    }

    public void procesarTransaccion(Transaccion transaccion){

        transaccion.ejcutarTransaccion();

    }

}

