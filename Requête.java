package tp_git;

import java.util.List;

public class Requête {
	
	
	private List<Symptome> symptomes;
	private Patient patient;
	
	
	public Requête() {
		super();
	}
	

	public Requête(List<Symptome> symptomes, Patient patient) {
		super();
		this.symptomes = symptomes;
		this.patient = patient;
	}



	public List<Symptome> getSymptomes() {
		return symptomes;
	}

	public void setSymptomes(List<Symptome> symptomes) {
		this.symptomes = symptomes;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	

}
