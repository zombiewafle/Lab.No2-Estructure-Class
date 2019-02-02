/**Fernando José Garavito Ovando 18071
 * Javier Salazar 18764
 * Hoja de trabajo No. 2
 * 01 de febrero de 2019
 */

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
