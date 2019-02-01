import Calculadora.Clases.Interfaces.*;
import Calculadora.Clases.*;
import javax.swing.*;
import Calculadora.Clases.Pila;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        iPila<String> pila = new Pila<String>();
        iCalculadora calculadora = new Calculadora();
        String operation = readTextFile();
        char operator = ' ';
        double a = 0, b = 0;
        String resultado = "";

        for (int i = 0; i < operation.length() ; i++) {
            if(operation.charAt(i) != ' '){
                operator = operation.charAt(i);
                if(Character.isDigit(operator)){
                    pila.push(String.valueOf(operator));
                }else{
                    b = Double.parseDouble(pila.pop());
                    a = Double.parseDouble(pila.pop());
                    switch (operator){
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