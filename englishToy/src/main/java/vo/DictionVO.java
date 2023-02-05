package vo;

public class DictionVO {
	private int Diction_no;
	private String Diction_word;
	private String lang;
	
	public DictionVO() {
	}
	
	public DictionVO(int Diction_no, String Diction_word, String lang) {
		this.Diction_no = Diction_no;
		this.Diction_word = Diction_word;
		this.lang = lang;
	}
	public int getDiction_no() {
		return Diction_no;
	}
	public void setDiction_no(int diction_no) {
		Diction_no = diction_no;
	}
	public String getDiction_word() {
		return Diction_word;
	}
	public void setDiction_word(String diction_word) {
		Diction_word = diction_word;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	


}
