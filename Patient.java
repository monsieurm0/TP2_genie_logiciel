package tp_git;

public class Patient {
	
	private String name;
	private String prenom;
	private int age;
	private String adresse;

	public Patient() {
		super();
	}

	public Patient(String name, String prenom, int age, String adresse) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
