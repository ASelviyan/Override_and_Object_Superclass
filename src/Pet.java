//DEFINITIONS----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//#1 Object as a Superclass
    //The Object class, in the java.lang package, sits at the top of the class hierarchy tree. Every class is a descendant, direct or indirect, of the Object class. Every class you use or write inherits the instance methods of Object. You need not use any of these methods, but, if you choose to do so, you may need to override them with code that is specific to your class.
//END OF DEFINITIONS----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.time.LocalDate;

//(EX #1)
public class Pet extends Object{
    private String name;
    private LocalDate dob;

    public Pet(){

    }

    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public  String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public  LocalDate getDob(){
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //you would think that Pet is the top parent class because the class is not extending anything, so it wouldn't need to override anything but its actually not the top level parent.
    //for every single class in java, if that class is not already extending a class explicitly like the cat class, there is a default parent class that it will extend. For example Pet isn't explicitly extending anything but its is implicitly extending Object(EX #1)(#1)
    //object is in each class, but it just might be a grand grand grand super class
    //there are many methods in the object class, one of them is the toString method and that is why it needs to be extended.
    @Override
    public String toString(){
        return "Pet{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
