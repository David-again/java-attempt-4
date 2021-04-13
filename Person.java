// OOP example:  A Person Class is used to instantiate girlFriend and onlyBrother objects.

public class Person {
    int age;
    String fName;
    String eyeColor = "Brown";
    final int numLegs = 2;  // This attribute is fixed for all objects.

    public Person(String personName){
        // This is the constructor for the object upon creation.
        fName = personName;
        // The above line initializes the fName attribute upon object creation.
        // So, this is only useful when setting attributes at object creation time.
    }

    public static void main(String[] args){
        // declare instances of Person object
        Person girlFriend = new Person("Amber");
        Person onlyBrother = new Person("Craig");

        // initialize attribute
        onlyBrother.fName = "Joseph";
        
        // System.out.println(onlyBrother.numLegs);
        System.out.println(onlyBrother.fName + " has " + onlyBrother.numLegs + " legs " + " and " + onlyBrother.eyeColor + " eyes.");
        // System.out.println(onlyBrother.eyeColor);
        
        System.out.println(girlFriend.numLegs);
        System.out.println(girlFriend.fName);
        System.out.println(girlFriend.eyeColor);
        
    }
}
