package it.univaq.disim.hello;

import java.time.Duration;
import java.time.Instant;
/**
 * La prima classe implementate durante il corso di LPO 22-23
 * @author Juri Di Rocco
 */
public class HelloWorld {
    /**
    * The public value field
    */
    public int value;
    /**
     * Questa è il metodo main
     * @param args parametri presi dalla command line. Sono necessari 2 parametri: il primo è il numero intero da verificare se è primo, 
     * il secondo è il numero intero sul quale verificare la congettura di Goldbach
     */
    public static void main(String[] args) {
        Instant inizio = Instant.now();
        int primo = 0;
        int goldbach = 0;
        if(args.length != 2)
            System.out.printf("il numero di parametri (%d) è errato\n", args.length);
        else {
            //TODO Possibili errori di casting dovranno essere gestiti.
            primo = Integer.parseInt(args[0]);      
            goldbach = Integer.parseInt(args[1]);
            
            System.out.printf("il numero %d %s è primo\n", primo, isPrime(primo) ? "" : "non ");
            System.out.printf("Il numero %d %s verifica la concettura di Goldbach\n", goldbach, goldbach(goldbach) ? "" : "non");
            Duration timeElapsed = Duration.between(inizio, Instant.now());
            System.out.printf("Tempo trascorso: %d millisecondi", timeElapsed.toMillis());
        }
    }
    /**
     * Questo metodo restituisce true se il numenro passato come parametro è primo
     * @param a il numero da verificare se è primo
     * @return true se il numro è primo
     */
    public static boolean isPrime(int a){
        for(int number = 2; number < Math.sqrt(a);  number++)
            if (a % number == 0)
                return false; 
        return true;
    }
    /**
     * Il metodo, dato un numero intero n, verifica che la congettura di Goldbach è vera per tutti i numeri minori di n. Usare isPrime.
     * Una congettura matematica ancora aperta è quella di Goldbach: ogni numero pari piú grande di 4 è la somma di due numeri primi. 
     * Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 + 3, .
     * @param n il numero fino al quale verificare la congettura
     * @return true se la congettura è vera fino a quel numero
     */
    public static boolean goldbach(int n) {
        int j;
        boolean ok;
        //ITERARE SOLO SUI NUMERI PARI
        for (int i = 4; i <= n; i += 2) {
          ok = false;
          j = 2;
          //RAGIONIAMO...
          while (!ok && j <= (i/2)) {
            if (isPrime(j) && isPrime(i - j)) 
              ok = true;
            j++ ;
          }
          if (!ok) 
            return false;
          
        }
        return true;
      }
    
}