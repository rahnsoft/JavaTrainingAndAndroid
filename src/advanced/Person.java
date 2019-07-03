package advanced;

public class Person {
	private int id,age;
	private String name;
	
	Person(){
	//empty constructor
	}
//setting id,age,name
	 Person(int i, int a, String n) {
		this.id = i;
		this.age = a;
		this.name = n;
	}
	/*we are setting again incase one uses the constructor with no params
	 Person(){
	 }*/
	public void setName(String n) {
	this.name=n;
	}
	public void setAge(int a) {
		this.age=a;
		}
	public void setId(int i) {
		this.id=i;
		}
	public String getName() {
	return this.name;
	}
	public int getAge() {
		return this.age;
		}
	public int getId() {
		return this.id;
		}
	}


