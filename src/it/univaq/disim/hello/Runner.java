package it.univaq.disim.hello;

import java.time.Duration;
import java.time.Instant;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;


public class Runner {

	
	
	
	/**
	 * Questo metodo crea le opzioni da riga di comando ovvero:
	 *  - uno e un sola opzione tra primo e golbach
	 *  - deve essereci un -value seguito da un intero 
	 * @return un Options che soddisfa i criteri sopra elencati
	 */
	private static Options buildOptions() {
		Options ops = new Options();

		OptionGroup optionGroup = new OptionGroup();
		// Option o = new Option("prima", "calcola se il valore è primo");
		Option primeMode = Option.builder("primo").argName("primo").desc("Calcola se il valore è primo").build();
		Option goldbackMode = Option.builder("goldbach").argName("goldbach")
				.desc("Calcola se la congettura di goldback è valida per il valore").build();
		optionGroup.addOption(goldbackMode);
		optionGroup.addOption(primeMode);
		optionGroup.setRequired(true);

		Option value = Option.builder().option("value").required().type(Integer.class).argName("value").desc("Valore")
				.hasArg().build();
		Option help = Option.builder().option("help").argName("help").desc("stampa messaggio di aiuto").build();
		ops.addOption(help);
		ops.addOptionGroup(optionGroup);
		ops.addOption(value);
		return ops;
	}
//
	/**
	 * Questa è il metodo main
	 * 
	 * @param args parametri presi dalla command line. Sono necessari 2 parametri:
	 *             il primo è l'operazione da eseguire golbach o prime e un value da controllare.
	 */
	public static void main(String[] args) {

		CommandLineParser clp = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		Options ops = buildOptions();
		// parse the command line arguments

		CommandLine line;
		try {
			line = clp.parse(ops, args);
			Integer numeroDaVerificare = Integer.parseInt(line.getOptionValue("value"));
			if (line.hasOption("help"))
				formatter.printHelp("Ecco la stampa di aiuto", ops);

			if (line.hasOption("primo")) {
				System.out.printf("il numero %d %s è primo\n", numeroDaVerificare,
						SupportoNumeriLPO.isPrime(numeroDaVerificare) ? "" : "non ");
				SupportoNumeriLPO.isPrime(numeroDaVerificare);
			}

			if (line.hasOption("goldbach")) {
				Instant inizio = Instant.now();
				System.out.printf("Il numero %d %s verifica la concettura di Goldbach\n", numeroDaVerificare,
						SupportoNumeriLPO.goldbach(numeroDaVerificare) ? "" : "non");
				Duration timeElapsed = Duration.between(inizio, Instant.now());
				System.out.printf("Tempo trascorso: %d millisecondi\n", timeElapsed.toMillis());
			}
		} catch (org.apache.commons.cli.ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
