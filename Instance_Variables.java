import java.io.*;

public class Instance_Variables {
    // Declared Instance Variable
    public String Iname;

    public Instance_Variables() {
        // Default Constructor
        this.Iname = "Pritam Samui";
    }

    public static void main(String[] args) {
        // create object
        Instance_Variables name = new Instance_Variables();

        System.out.println("My name is " + name.Iname);
    }
}
