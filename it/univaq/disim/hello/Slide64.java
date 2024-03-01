package it.univaq.disim.hello;

public class Slide64 {
    public static void main(String [] args) {
        Saluti oggetto1 = new Saluti();
        oggetto1.stampaSaluto();
        //int i = oggetto1.stampaSaluto(); // Cosa succede qui?
        System.out.println(Character.isJavaIdentifierStart('a'));
        System.out.println(Character.isJavaIdentifierStart('2'));
        System.out.println(Character.isJavaIdentifierPart('a'));
        System.out.println(Character.isJavaIdentifierPart('2'));

    }
}
class Saluti {
    public void stampaSaluto() {
        System.out.println("Ciao!");
    }
}