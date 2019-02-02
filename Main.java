/**Fernando José Garavito Ovando 18071
 * Javier Salazar 18764
 * Hoja de trabajo No. 2
 * 01 de febrero de 2019
 */

//Librerías para que se puedadn leer los archivos y las clases
import Calculadora.Clases.Interfaces.*;
import Calculadora.Clases.*;
import javax.swing.*;
import Calculadora.Clases.Pila;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    //Inicio del Main
    public static void main(String[] args) {

        //Se crea un stack
        iPila<String> pila = new Pila<String>();
        iCalculadora calculadora = new Calculadora();
        String operation = readTextFile();

        //Declaramos nuestras variables de tipo númericos y textos
        char operator = ' ';
        double a = 0, b = 0;
        String resultado = "";

        //Se analiza la longitud del carácter
        for (int i = 0; i < operation.length() ; i++) {
            if(operation.charAt(i) != ' '){
                operator = operation.charAt(i);
                if(Character.isDigit(operator)){
                    pila.push(String.valueOf(operator));
                }else{

                    //En el .pop podemos eliminar datos
                    b = Double.parseDouble(pila.pop());
                    a = Double.parseDouble(pila.pop());
                    switch (operator){

                        //Imprimimos los resultados de las operaciones
                        case '+' :  resultado = String.valueOf(calculadora.sumar(a, b)); pila.push(resultado); break;
                        case '-' :  resultado = String.valueOf(calculadora.restar(a, b));pila.push(resultado); break;
                        case '*' :  resultado  = String.valueOf(calculadora.multiplicar(a, b)); pila.push(resultado); break;
                        case '/' :  resultado = String.valueOf(calculadora.dividir(a, b)); pila.push(resultado); break;
                    }
                }
            }
        }
        System.out.println(resultado);

    }


    public static String readTextFile(){
        String path = "";
        String line = "";
        try {
            JFileChooser fileChooser = new JFileChooser();
            int retValue = fileChooser.showOpenDialog(new JPanel());
            if (retValue == JFileChooser.APPROVE_OPTION) {
                path = fileChooser.getSelectedFile().getPath();
            }
            Path document = Paths.get(path);
            Scanner scanner = new Scanner(document);

            while(scanner.hasNextLine()){
                //process each line
                line = scanner.nextLine();

            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }
}