//Write a Java program to invoke parent class constructor from a child class. Create
//Child class object and parent class constructor must be invoked. Demonstrate by
//writing a program. Also explain key points about Constructor.
package ineuron;

// Parent class
class Parent {
    public Parent() {
        System.out.println("Parent class constructor invoked.");
    }
}

// Child class
class Child extends Parent {
    public Child() {
        super(); // Invoking parent class constructor we super keyword
        System.out.println("Child class constructor invoked.");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Child child = new Child(); // Creating Child class object
    }
}


//Key points about constructors:
//
//1.Constructors are special methods that are used to initialize objects of a class.
//2.Constructors have the same name as the class and do not have a return type (not even void).
//3.Constructors can be overloaded, which means a class can have multiple constructors with different parameter lists.
//4.When a child class is created, its constructor implicitly or explicitly invokes the constructor of the parent class using the super() keyword.
//5.If a constructor does not explicitly call a parent class constructor using super(), the compiler automatically inserts a parameterless super() call as the first statement of the child class constructor.
//6.Constructors can perform initialization tasks, set default values, or validate parameters before object creation.
//7.Constructors can be public, private, protected, or package-private (default). The access modifier determines the visibility of the constructor.
//8.Constructors can also call other constructors within the same class using the this() keyword for constructor chaining.
//9.If a constructor is not explicitly defined in a class, the compiler provides a default constructor (without parameters) that initializes instance variables to their default values.
//10.Constructors can throw exceptions, allowing error handling during object creation.