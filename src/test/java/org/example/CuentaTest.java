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

   @Test
    public void getSaldo() {
        assertEquals(100.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void setNumero() {
        cuenta.setNumero("54321");
        assertEquals("54321", cuenta.getNumero());
    }

    @Test
    public void setSaldo() {
        cuenta.setSaldo(250.0);
        assertEquals(250.0, cuenta.getSaldo(), 0.001);
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
