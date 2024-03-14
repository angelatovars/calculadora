package com.example.calculadora;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class OperacionesTest {

    @Test
    public void dadosDosNumeros_alSumar_entoncesRetornarResultado() {
        Operaciones operaciones=new Operaciones();
        double a = 2, b = 3;

        double resultado = operaciones.sumar(a, b);

        assertEquals(5.0, resultado, 0.0);
    }
    @Test
    public void dadosDosNumeros_alRestar_entoncesRetornarResultado() {
        Operaciones operaciones=new Operaciones();
        double a = 8, b = 2;

        double resultado = operaciones.restar(a, b);

        assertEquals(6.0, resultado, 0.0);
    }
    @Test
    public void dadosDosNumeros_alMultiplicar_entoncesRetornarResultado() {
        Operaciones operaciones=new Operaciones();
        double a = 2, b = 3;

        double resultado = operaciones.multiplicar(a, b);

        assertEquals(6.0, resultado, 0.0);
    }
    @Test
    public void dadosDosNumeros_alDividir_entoncesRetornarResultado() {
        Operaciones operaciones=new Operaciones();
        double a = 2, b = 1;

        double resultado = operaciones.dividir(a, b);

        assertEquals(2.0, resultado, 0.0);
    }

    @Test
    public void dadoUnNumero_alCalcularFactorial_entoncesRetornarFactorialCorrecto() {
        Operaciones operaciones=new Operaciones();
        int n = 5;

        int resultado = operaciones.factorial(n);

        assertEquals(120, resultado);
    }
}


