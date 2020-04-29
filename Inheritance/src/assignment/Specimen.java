package assignment;
import java.util.LinkedList;

public class Specimen {
	private String name;
	private int cageNumber;
	private Species toa;
	public Specimen(String a, int c, Species s) {
		name = a;
		cageNumber = c;
		toa = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCageNumber() {
		return cageNumber;
	}
	public void setCageNumber(int cageNumber) {
		this.cageNumber = cageNumber;
	}
	public Species getToa() {
		return toa;
	}
	public void setToa(Species toa) {
		this.toa = toa;
	}
	
	public String toString() {
		return name + " is a " + toa + " in cage " + cageNumber;
	}
	
	public int countSpecimens(Specimen[] animals, Species s) {
		int total = 0;
		for(Specimen i: animals) {
			if(i.toa.equals(s)) {
				total++;
			}
		}
		return total; 
	}
	
	public Species[] listSpecies(Specimen[] animals) {
		Species[] output = new Species[animals.length];
		int index = 0;
		for(Specimen i: animals) {
			output[index] = i.getToa();
			index++;
		}
		return output; 
	}
	
	public LinkedList<Specimen> makeList(Specimen[] animals) {
		LinkedList<Specimen> myList = new LinkedList<Specimen>();
		for(Specimen i: animals) {
			myList.add(i);
		}
		return myList; 
	}
	
	public LinkedList<Species> makeSpeciesList(LinkedList<Specimen> animals){
		LinkedList<Species> myList = new LinkedList<Species>();
		for(Specimen i: animals) {
			myList.add(i.getToa());
		}
		return myList; 
	}
	
	public LinkedList<Species> makeSpeciesListUnique(LinkedList<Species> allSpecies){
		LinkedList<Species> myList = new LinkedList<Species>();
		for(Species i: allSpecies) {
			if(myList.contains(i) == false) {
				myList.add(i);
			}
		}
		return myList;
	}
}
