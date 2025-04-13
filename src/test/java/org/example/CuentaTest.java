package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

private Cuenta cuenta; // inicializar mi variable cuenta
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
// inserta
   @Test
    public void ingresarDinero() {
        cuenta.ingresarDinero(50.0);
        assertEquals(150.0, cuenta.getSaldo(), 0.001);
    }
// saca
    @Test
    public void extraerDinero() {
        cuenta.extraerDinero(30.0);
        assertEquals(70.0, cuenta.getSaldo(), 0.001);
    }
//muestra
    @Test
    public void mostrarCuenta() {
        assertDoesNotThrow(() -> cuenta.mostrarCuenta());
    }
}
