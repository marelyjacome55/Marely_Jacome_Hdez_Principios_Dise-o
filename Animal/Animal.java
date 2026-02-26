

/**
 * Class Animal
 */
abstract public class Animal {

  //
  // Fields
  //

  protected String nombre;
  
  //
  // Constructors
  //
  public Animal (String nombre) {
	this.nombre = nombre;
 };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String nombre) {
    this.nombre = nombre;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  //
  // Other methods
  //

  /**
   */
  public void mover()
  {
  }


}
