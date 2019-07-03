package advanced;

public class Main {

	public static void main(String[] args) {
		//with only empty constructor
//		Person obj1=new Person();
//		obj1.setAge(26);
//		obj1.setId(1);
//		obj1.setName("nick");
//		
//		System.out.println(obj1.getAge());
//		System.out.println(obj1.getId());
//	    System.out.println(obj1.getName());
//        //with other constructor
//		Person obj2=new Person(1,26,"nick");
//		obj2.getAge();
//		obj2.getId();
//		obj2.getName();
//			System.out.println(obj2.getId());
//			System.out.println(obj2.getAge());
//			System.out.println(obj2.getName());
	Triangle tri=new Triangle();
	System.out.println("Area of Triangle is:\n" + tri.areaTriangle());
	Square sq=new Square();
	
	System.out.println("Area of Square is:\n" +sq.areaSquare());
	
		}

}
