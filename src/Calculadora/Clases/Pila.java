package Calculadora.Clases;

import Calculadora.Clases.Interfaces.iPila;

import java.util.Stack;
import java.util.Vector;


public class Pila<E> implements iPila<E> {
    protected Vector<E>  data;


    public Pila(){


        data = new Vector<E>();

    }


    @Override
    public void push(E item) {

         data.add(item);

    }

    @Override
    public E pop() {
         return data.remove(size()-1);
    }

    @Override
    public E peek() {
        return data.get(size());
    }

    @Override
    public boolean empty() {
        return data.size() == 0 ;
    }

    @Override
    public int size() {
        return 0;
    }
}
