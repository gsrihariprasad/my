package io.sriharilabs.generics;

public class Box<T extends Number> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
       // integerBox.inspect("some text"); // error: this is still String!
        
        Box<Number> integerBox1 = new Box<Number>();
    }
}