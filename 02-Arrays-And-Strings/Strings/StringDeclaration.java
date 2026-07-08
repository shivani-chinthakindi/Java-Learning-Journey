class StringDeclaration{
    public static void main(String[] args) {
        String name; //Declaration
        name = "Shivani Patel"; //Intialization
        System.out.println(name); //Printing output
        String age = "18"; // Original string with old object
        System.out.println(age);
        age = "19"; //just a new object is created but it is not modified
        System.out.println(age);
    }
}