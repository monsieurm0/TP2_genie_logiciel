package tp_git;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Patient patient = new Patient("Dupont", "David", 42, "3 Rue Genie logiciel 59300");
		List<Symptome> symptomes = List.of(Symptome.Fiève, Symptome.Maux_de_gorge, Symptome.Etourdissement);
		Requête requête = new Requête(symptomes, patient);
		
		System_hospitalier system_hospitalier = new System_hospitalier();
		system_hospitalier.recevoirRequete(requête);
	}

}
