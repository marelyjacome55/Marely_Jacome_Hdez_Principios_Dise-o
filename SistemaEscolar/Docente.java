

/**
 * Class Docente
 */
public class Docente extends Persona {

  //
  // Fields
  //

  public int idTrabajador;
  public double salario;
  public String departamento;
  
  //
  // Constructors
  //
  public Docente (){ };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idTrabajador
   * @param newVar the new value of idTrabajador
   */
  public void setIdTrabajador (int idTrabajador) {
    this.idTrabajador = idTrabajador;
  }

  /**
   * Get the value of idTrabajador
   * @return the value of idTrabajador
   */
  public int getIdTrabajador () {
    return idTrabajador;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (double salario) {
    this.salario = salario;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public double getSalario () {
    return salario;
  }

  /**
   * Set the value of departamento
   * @param newVar the new value of departamento
   */
  public void setDepartamento (String departamento) {
    this.departamento = departamento;
  }

  /**
   * Get the value of departamento
   * @return the value of departamento
   */
  public String getDepartamento () {
    return departamento;
  }

  //
  // Other methods
  //

  /**
   * @param        idTrabajador
   * @param        salario
   * @param        departamento
   */
  public void datosDocente(int idTrabajador, double salario, String departamento)
  {
	setIdTrabajador(idTrabajador);
	setSalario(salario);
	setDepartamento(departamento);


	System.out.println("ID de Trabajador: " + getIdTrabajador());
	System.out.println("Salario: $" + getSalario());
	System.out.println("Departamento: "+ getDepartamento());
  }


}
