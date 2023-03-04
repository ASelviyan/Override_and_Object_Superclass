
//#1: Extends
    //In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
    // subclass (child) - the class that inherits from another class
    //superclass (parent) - the class being inherited from
//#2: Override
    //In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
//#3: Super-Classes
    //the class being inherited from (parent)

import java.time.LocalDate;

//extends(#1) allows the cat class to borrow Pet classes methods, properties, fields to add additional behaviors that would be more specific to a cat that pet doesn't have
public class Cat extends Pet {

    public void meow(){
        System.out.println("Meow Meow");
    }

    //here we are overriding(#2) Pet class ToString method with Cat own toString method
    //I do this because Pet classes toString method isn't exactly what I want my cat object to have
    @Override
    public String toString() {
        //here we are returning Pets(#3 and #1)
        return "Cat - name: tony ";
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
    }
}
