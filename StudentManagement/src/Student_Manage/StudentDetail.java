package Student_Manage;

public class StudentDetail {
     private int sId;
     private String sName;
     private String sContact;
     private String sCity;
     
	public StudentDetail(int sId, String sName, String sContact, String sCity) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sContact = sContact;
		this.sCity = sCity;
	}

	public StudentDetail(String sName, String sContact, String sCity) {
		super();
		this.sName = sName;
		this.sContact = sContact;
		this.sCity = sCity;
	}

	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	

	public StudentDetail(int sId) {
		super();
		this.sId = sId;
	}

	@Override
	public String toString() {
		return "StudentDetail [sId=" + sId + ", sName=" + sName + ", sContact=" + sContact + ", sCity=" + sCity + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsContact() {
		return sContact;
	}

	public void setsContact(String sContact) {
		this.sContact = sContact;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	
     
     
}
