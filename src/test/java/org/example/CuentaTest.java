package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {


    @BeforeEach
    /*
    he creado una nueva cuenta y
    esto asegura que cada test limpio, sin depender de lo que ha pasado  en otros teses.
    */
    void prepararCuenta() {
        Cuenta cuenta = new Cuenta("12345", 100.0);
    }


    @org.junit.jupiter.api.Test
    void getNumero() {
    }

    @org.junit.jupiter.api.Test
    void getSaldo() {
    }

    @org.junit.jupiter.api.Test
    void setNumero() {
    }

    @org.junit.jupiter.api.Test
    void setSaldo() {
    }

    @org.junit.jupiter.api.Test
    void ingresarDinero() {
    }

    @org.junit.jupiter.api.Test
    void extraerDinero() {
    }

    @org.junit.jupiter.api.Test
    void mostrarCuenta() {
    }
}
