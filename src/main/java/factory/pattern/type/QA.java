package factory.pattern.type;

import factory.pattern.user.User;

public class QA implements User {
	private final String timework;
	private String type;
	private String name;
	
	public void setTypeUser(String Type) {
		this.type = Type;
	}

	@Override
	public void setNameUser(String Name) {
	this.name = Name;
		
	}
	
	public QA() {
		timework = "QA : 9:00 AM to 5:00 PM";
	}

	@Override
	public void prepare() {
		System.out.println("name : " +this.name +" timework : "+this.timework+ " type : "+this.type);

	}
}
