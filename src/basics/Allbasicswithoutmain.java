package basics;

public class Allbasicswithoutmain {

		public void substrings(){
			// TODO Auto-generated method stub
	String x="this is a new day.its wednesday";
	String y="34";
	//this is a new day.
	System.out.println(x.substring(0,18));
	//its wednesday
	System.out.println(x.substring(18,31));

	}
		public void dowhile() {
			// TODO Auto-generated method stub
			int i=0;
			String[] name = {"ken","nick","david","tony"};
	do {
	System.out.println(name[i]);
	i++;
	} while (i<4);
		}
	public void forloop() {
		// TODO Auto-generated method stub
		String[] names = {"ken","nick","david","tony"};
		
		for(int i=0;i<4;i++) { 
			System.out.println(names[i]);
	}
	// For-each loop
	for(String name: names) {
	System.out.println(name);

	}
	}

	public void swych() {
		// TODO Auto-generated method stub

		String[] name = {"ken","nick","david","tony"};
		for(int i=0;i<4;i++) { 
			
	switch (i) {

	case 2:
	System.out.println(name[i]);
	break;
	default:
	break;
	}
		}}
		public void whileloop() {
			// TODO Auto-generated method stub
	int i =0;
	int j= 0;
	//pre increment ++i
	//System.out.println(++i);

	//post increment  i++
	//System.out.println(j++);
	String[] name = {"ken","nick","david","tony"};
	while (i<4) {
		
		System.out.println(name[i]);
	i++;
	}
		}

	}


