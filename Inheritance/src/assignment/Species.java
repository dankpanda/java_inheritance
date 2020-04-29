package assignment;

public class Species extends Genus{
	private String speciesName;
	public Species(String s, String g) {
		super(g);
		speciesName = s;
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	
	public String toString() {
		return "Species: " + getGenusName()+ " " + speciesName;
	}
	
	public boolean equals(Species s) {
		return speciesName.contentEquals(s.getSpeciesName());
	}
}
