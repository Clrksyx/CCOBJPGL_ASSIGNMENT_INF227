public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("Her eyes are a lovely shade of " + myPet.eyeColor +".");
        System.out.println("My cat weight " + myPet.weight + " and stands " + myPet.height +" tall.");     
        System.out.println("My cat is very " + myPet.characteristic +" to me, and she also enjoys eating " + myPet.food + ".");
     

    }
}
