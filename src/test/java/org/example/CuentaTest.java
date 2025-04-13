package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {


    @BeforeEach
    /*
    he creado una nueva cuenta y
    esto asegura que cada test limpio, sin depender de lo que ha pasado  en otros teses.
    */
   public void prepararCuenta() {
        Cuenta cuenta = new Cuenta("12345", 100.0);
    }

// con assertEquals prueba para getNumero
  @Test
    public void getNumero() {
        assertEquals("12345", cuenta.getNumero());
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
