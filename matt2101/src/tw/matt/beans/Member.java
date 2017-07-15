package tw.matt.beans;

import java.io.Serializable;

/*
 * JavaBean rules
 * 1. implements Serializable
 * 2. public class
 * 3. field member can not a public
 * 4. getter & setter => getXxx, setXxx => field xxx
 * 5. none argument Constructor (default Constructor)
 */
//public class Member implements Serializable {
public class Member {	
	private String id, name;
	public Member() {
		System.out.println("Member()");
	}
	public Member(String id, String name) {
		System.out.println("Member(String,String)");
		this.id=id; this.name=name;
	}
	
	public void setId(String id) {this.id=id;}
	public void setName(String name) {this.name=name;}
	public String getId() {return id;}//return set的東西  string為自訂 new出member後用 member.getid()
	public String getName() {return name;} 

	public void m1() {
		System.out.println("member.m1()");
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
	
}
