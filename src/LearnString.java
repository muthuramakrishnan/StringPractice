public class LearnString {
    public static void main(String[] args) {
        String fruit = "Apple";
        String anotherFruit = "Apple";
        String vegetable = new String("cauliflower");
        String anotherVegetable = new String("cauliflower");

        System.out.println(fruit == anotherFruit); //true
        System.out.println(vegetable == anotherVegetable); //false
    }
}
