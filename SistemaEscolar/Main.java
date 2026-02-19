

/**
 * Class Main
 */
public class Main {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public  Main () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public static void main(String[] args)
  {
	Persona persona1 = new Persona();
	persona1.mostrarDatos("Julia",23,"femenino");

	System.out.println("-----------------------------");

	Estudiante estudiante1 = new Estudiante();
	estudiante1.mostrarDatos("Gabriel",21,"masculino");
	estudiante1.datosDeAlumno(24003965,8.0,"ingenieria en software");

	System.out.println("-----------------------------");
	Docente docente1 = new Docente();
	docente1.mostrarDatos("Rita", 47, "femenino");
	docente1.datosDocente(34003921,3500.76,"ingenieria");


  }


}
