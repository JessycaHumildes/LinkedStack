package com.jhumildes;

public class Main {

    public static void main(String[] args) {

        Employee biaLinda = new Employee("Bia","Linda",4563);
        Employee doraLicia = new Employee("Dora","Licia",6743);
        Employee jakeYoung = new Employee("Jake","Young",907);
        Employee wiviBento = new Employee("Wivi","Bento",7854);

        LinkedStack stack = new LinkedStack();

        stack.push(biaLinda);
        stack.push(doraLicia);
        stack.push(jakeYoung);
        stack.push(wiviBento);

        stack.printStack();
        System.out.println("------------------------------------------------------------");

        System.out.println(stack.peek());
        stack.printStack();
        System.out.println("----------------------------------------------------------------");


        System.out.println(" Popped: " + stack.pop());
        System.out.println(stack.peek());
        
    }
}
