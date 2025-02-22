# LEZIONE 2 - Primo programma Java e congettura di Goldback
Questo repository contiene il codice sviluppato inclasse il 02 marzo 2023. Un primo approccio alla programmazione in JAVA.
Una congettura matematica ancora aperta è quella di Goldbach: ogni numero pari piú grande di 4 è la somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 + 3, ...
Scrivere un programma che, dato un numero intero n, verifica che la congettura è vera per tutti i numeri minori di n. Si può usare il metodo isPrime definito nell'esercizio A1. Preso da (http://www-sop.inria.fr/marelle/personnel/Laurent.Thery/lsp/soluzioni.html#A3)[http://www-sop.inria.fr/marelle/personnel/Laurent.Thery/lsp/soluzioni.html#A3]
## Per compilare la classe eseguite il comando

```javac it/univaq/disim/hello/HelloWorld.java```

## Per eseguire il programma eseguite
```java it.univaq.disim.hello.HelloWorld <numero-primo> <numero-di-goldback-100000>```

### Per generare la documentazione
```javadoc -d <CARTELLA DI OUTPUT> <Nome del package>```

Per il nostro esempio:

```javadoc -d doc2 it.univaq.disim.hello```

# Lezione4-Librerie
Questo repository contiene il codice sviluppato in classe durante la 4 lezione. Tale codice usa la libreria apache commons cli [https://commons.apache.org/proper/commons-cli/](https://commons.apache.org/proper/commons-cli/) per il recupero degli argomenti da linea di comando.

## Importare il progetto in eclipse
Dopo aver "scaricato" (più in avanti vedremo come clonare il repository con il Version Control System (VCS) git). per importare il progetto in eclipse usare la funzionalità ```import```.

![image](https://user-images.githubusercontent.com/7288605/224267468-e702cc98-d828-42d8-b95f-23ce7628b3f7.png)

Selezionare la cartella appena scaricata

![image](https://user-images.githubusercontent.com/7288605/224267921-bea7349c-59b2-4ce5-88d4-d4b7e914dedb.png)

che rileverà il progetto (grazie al file ```.project```) e vi permetterà di importarlo.

Per lanciare e giocare con il progetto usare i configuratori (come mostrato durante l'esercitazione di lunedì 6 marzo).
