package be.vdab;

import java.io.File;
import java.net.URL;
//import java.util.Date;
import java.util.Locale;

public class ClassA implements InterfaceA {
	private String telefoonNrHelpDesk;
	private URL koersenURL;
	private Locale defaultTaalEnLand;
	private File importData;
	private BladRichtingInPrinter defaultBladRichting;
	private EmailAdres webMasterEmailAdres;
//	private Date websiteGestart;

	@Override
	public String getBoodschap() {
		return "ClassA object";
	}

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
	}

	public URL getKoersenURL() {
		return koersenURL;
	}

	public void setKoersenURL(URL koersenURL) {
		this.koersenURL = koersenURL;
	}

	public Locale getDefaultTaalEnLand() {
		return defaultTaalEnLand;
	}

	public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
		this.defaultTaalEnLand = defaultTaalEnLand;
	}

	public File getImportData() {
		return importData;
	}

	public void setImportData(File importData) {
		this.importData = importData;
	}

	public BladRichtingInPrinter getDefaultBladRichting() {
		return defaultBladRichting;
	}

	public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
		this.defaultBladRichting = defaultBladRichting;
	}

	public EmailAdres getWebMasterEmailAdres() {
		return webMasterEmailAdres;
	}

	public void setWebMasterEmailAdres(EmailAdres webMasterEmailAdres) {
		this.webMasterEmailAdres = webMasterEmailAdres;
	}

//	public Date getWebsiteGestart() {
//		return websiteGestart;
//	}
//
//	public void setWebsiteGestart(Date websiteGestart) {
//		this.websiteGestart = websiteGestart;
//	}
	
}
