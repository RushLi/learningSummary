package bean;

import java.util.Date;

public class emp {
	private int eid;
	private String ename;
	private Date birthday;
	private int did;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", birthday=" + birthday + ", did=" + did + "]";
	}
	
}
