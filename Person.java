public class Person {
    int age;
    String fName;
    final int numLegs = 2;  // This attribute is fixed for all objects.

    public static void main(String[] args){
        // declare instances of Person object
        Person girlFriend = new Person();
        Person onlyBrother = new Person();

        // initialize attribute
        onlyBrother.fName = "Joseph";
        
        System.out.println(onlyBrother.numLegs);
        System.out.println(onlyBrother.fName);

        System.out.println(girlFriend.numLegs);
        System.out.println(girlFriend.fName);
        
    }
}
