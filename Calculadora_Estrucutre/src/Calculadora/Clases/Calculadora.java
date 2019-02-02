package Calculadora.Clases;

import Calculadora.Clases.Interfaces.iCalculadora;

public class Calculadora implements iCalculadora {


    @Override
    public double sumar(double a, double b) {
         return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }

}
