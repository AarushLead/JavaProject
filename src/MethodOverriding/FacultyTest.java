package MethodOverriding;


/**
 * @author Shobhit Sharma
 *@Description :(1) In case of method overriding if same method present in super class and sub class 
 *              then using the object of subclass ,subclass method will call.
 *              (2) If we are doing upcasting in  method overriding then using the reference of super class
 *              subclass method will call
 */
public class FacultyTest {

	public static void main(String[] args) {
		Faculty fj=new Faculty();
		fj.teach(); //Faculty method will call
		fj.takingExams();
		JavaFaculty jf=new JavaFaculty();
		jf.teach(); //JavaFaculty method will call
		Pythonfaculty pf=new Pythonfaculty();
		pf.teach(); //Python method will call
		Faculty fjf=new JavaFaculty();
		fjf.teach();  //JavaFaculty method will call
		Faculty fpf=new Pythonfaculty();
		fpf.teach();  //Python method will call
	}

}
class Faculty
{
	void teach()
	{
		System.out.println("Faculty teaches");
	}
	void takingExams()
	{
		System.out.println("I can take exam");
	}
}
class JavaFaculty extends Faculty
{   
	@Override
	void teach()
	{
		System.out.println("Javafaculty can teach better");
	}
}
class Pythonfaculty extends Faculty
{   
	@Override
	void teach()
	{
		System.out.println("PythonFaculty can teach better");
	}
}
