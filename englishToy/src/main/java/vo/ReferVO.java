package vo;

public class ReferVO {
	int kdiction_no;
	int ediction_no;
	
	public ReferVO() {
		
	}
	
	public ReferVO(int kdiction_no, int ediction_no) {
		this.ediction_no = ediction_no;
		this.kdiction_no = kdiction_no;
	}

	public int getKdiction_no() {
		return kdiction_no;
	}

	public void setKdiction_no(int kdiction_no) {
		this.kdiction_no = kdiction_no;
	}

	public int getEdiction_no() {
		return ediction_no;
	}

	public void setEdiction_no(int ediction_no) {
		this.ediction_no = ediction_no;
	}
	
	
}
