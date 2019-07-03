package intermediate;

public class Methods {

	public char Grader (int m) 
	{
				char g='A';
switch (m) {
case 30:
	g='E';
	break;
case 40:
	g='D';
case 50:
	g='C';
default:
	break;
}

	return g;

	}
}


