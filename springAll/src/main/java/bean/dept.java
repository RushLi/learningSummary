package bean;

public class dept {
	private int did;
	private String dname;
	public dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
