package ex.IMC;

// /**
//  * Hello world!
//  */
 public final class App {
     private App() {
    }

//     /**
//      * Says hello to the world.
//      * @param args The arguments of the program.
//      */
/**
 * @param args
 */
public static void main(String[] args) {
    Person anne = new Person(58.0f, 1.65f);
     IMC anneImc = new IMC(anne);
    anneImc.setPersonState();

    }
 }



   



