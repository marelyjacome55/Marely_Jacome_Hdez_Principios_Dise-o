

/**
 * Class Estudiante
 */
public class Estudiante extends Persona {

  //
  // Fields
  //

  public int matricula;
  public double promedio;
  public String licenciatura;
  
  //
  // Constructors
  //
  public Estudiante (){ };
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of matricula
   * @param newVar the new value of matricula
   */
  public void setMatricula (int matricula) {
    this.matricula = matricula;
  }

  /**
   * Get the value of matricula
   * @return the value of matricula
   */
  public int getMatricula () {
    return matricula;
  }

  /**
   * Set the value of promedio
   * @param newVar the new value of promedio
   */
  public void setPromedio (double promedio) {
    this.promedio = promedio;
  }

  /**
   * Get the value of promedio
   * @return the value of promedio
   */
  public double getPromedio () {
    return promedio;
  }

  /**
   * Set the value of licenciatura
   * @param newVar the new value of licenciatura
   */
  public void setLicenciatura (String licenciatura) {
    this.licenciatura = licenciatura;
  }

  /**
   * Get the value of licenciatura
   * @return the value of licenciatura
   */
  public String getLicenciatura () {
    return licenciatura;
  }

  //
  // Other methods
  //

  /**
   * @param        matricula
   * @param        promedio
   * @param        licenciatura
   */
  public void datosDeAlumno(int matricula, double promedio, String licenciatura)
  {
	setMatricula(matricula);
	setPromedio(promedio);
	setLicenciatura(licenciatura);

	System.out.println("Matricula: " + getMatricula());
	System.out.println("Promedio "+ getPromedio());
	System.out.println("Licenciatura: "+ getLicenciatura());
  }


}
