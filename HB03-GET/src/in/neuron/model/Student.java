package in.neuron.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;

@Entity
@DynamicInsert(value = true)
public class Student {
 @Id

private Integer sid; 
 private String sname;
 private String eaddress; 
 private Integer eage;

 public Student() {
	System.out.println("hibernate zero argument constructor internally");
}

public Integer getSid() {
	return sid;
}

public void setSid(Integer sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getEaddress() {
	return eaddress;
}

public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}

public Integer getEage() {
	return eage;
}

public void setEage(Integer eage) {
	this.eage = eage;
}

@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", eaddress=" + eaddress + ", eage=" + eage + "]";
	}
}
