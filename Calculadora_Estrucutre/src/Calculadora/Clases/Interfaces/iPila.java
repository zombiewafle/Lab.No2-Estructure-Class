package Calculadora.Clases.Interfaces;

public interface iPila<E> {

     void push(E item);
    //pre:
    //post: Item is added to the stack will be popped next if no intervening push

     public E pop();
    //pre: Stack is not empty
    //post: Most recently pushed item is removed and returned

     public E peek();
    //pre: Stack  is not empty
    //post: Top value,(next to be popped) is returned

     public boolean empty();
    //post: Returns true if and only if the stack is empty

     public int size();
    //post: returns the number of elements in the stack


}
