package bean;

public class student {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void say() {
		System.out.println("����һ��ѧ�����ҵı���ǣ�"+sid+"�ҵ������ǣ�"+sname);
	}
}
