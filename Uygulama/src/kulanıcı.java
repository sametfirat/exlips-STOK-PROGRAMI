
public class kulanıcı {
	private int  iD;
	private String Ad;
	private String sifre;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getKulanıcıAd() {
		return Ad;
	}
	public void setKulanıcıAd(String kulanıcıAd) {
		this.Ad = kulanıcıAd;
	}
	public kulanıcı () {}
	public kulanıcı(int iD, String ad, String sifre) {
		super();
		this.iD = iD;
		Ad = ad;
		this.sifre = sifre;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
}
