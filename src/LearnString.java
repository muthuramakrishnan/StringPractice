public class LearnString {
    public static void main(String[] args) {
        String fruit = "Apple";
        String anotherFruit = "Apple";
        String vegetable = new String("cauliflower");
        String anotherVegetable = new String("cauliflower");

        System.out.println(fruit == anotherFruit); //true
        System.out.println(vegetable == anotherVegetable); //false

        String myText = " ";
        System.out.println(myText.isEmpty());
        System.out.println(myText.isBlank());

        String firstName = "  Muthu  ";
        System.out.format("'%s'", firstName);
        System.out.println();
        System.out.format("'%s'", firstName.trim());
        System.out.println();
        System.out.format("'%s'", firstName.strip());
        System.out.println();
        System.out.format("'%s'", firstName.stripLeading());
        System.out.println();
        System.out.format("'%s'", firstName.stripTrailing());

        //Java now supports multi line text
        //from java 15

        String myText2 = """
                                
                This is a multiline text block
                Line 2
                Line 3
                """;
        System.out.println(myText2);
    }
}
