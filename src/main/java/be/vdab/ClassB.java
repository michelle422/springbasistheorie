package be.vdab;

public class ClassB implements InterfaceB {
	private final String telefoonNrHelpDesk;
	private final int aantalPogingUpdateKlant;
	
	public ClassB(String telefoonNrHelpDesk, int aantalPogingUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingUpdateKlant = aantalPogingUpdateKlant;
	}

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public int getAantalPogingUpdateKlant() {
		return aantalPogingUpdateKlant;
	}

	@Override
	public String getBoodschap() {
		return "ClassB object";
	}
	
}
