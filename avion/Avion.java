

/**
 * Class Avion
 */
public class Avion {

  //
  // Fields
  //

  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidad_de_motores;
  
  //
  // Constructors
  //
  public Avion () { 
	System.out.println("Construyo un avion");
};
  
  //
  // Methods
  //
	

  //
  // Accessor methods
  //

  /**
   * Set the value of aerolinea
   * @param newVar the new value of aerolinea
   */
  public void setAerolinea (String aerolinea) {
    this.aerolinea = aerolinea;
  }

  /**
   * Get the value of aerolinea
   * @return the value of aerolinea
   */
  public String getAerolinea () {
    return aerolinea;
  }

  /**
   * Set the value of capacidad
   * @param newVar the new value of capacidad
   */
  public void setCapacidad (String capacidad) {
    this.capacidad = capacidad;
  }

  /**
   * Get the value of capacidad
   * @return the value of capacidad
   */
  public String getCapacidad () {
    return capacidad;
  }

  /**
   * Set the value of velocidad
   * @param newVar the new value of velocidad
   */
  public void setVelocidad (String velocidad) {
    this.velocidad = velocidad;
  }

  /**
   * Get the value of velocidad
   * @return the value of velocidad
   */
  public String getVelocidad () {
    return velocidad;
  }

  /**
   * Set the value of cantidad_de_motores
   * @param newVar the new value of cantidad_de_motores
   */
  public void setCantidad_de_motores (String cantidad_de_motores) {
    this.cantidad_de_motores = cantidad_de_motores;
  }

  /**
   * Get the value of cantidad_de_motores
   * @return the value of cantidad_de_motores
   */
  public String getCantidad_de_motores () {
    return cantidad_de_motores;
  }

  //
  // Other methods
  //

  /**
   * @param        aerolinea1
   * @param        cantidaddemotores1
   * @param        velocidad1
   * @param        capacidad1
   */
  public void Avion(String aerolinea1, String cantidaddemotores1, String velocidad1, String capacidad1)
  {
  }


  /**
   */
  public void acelerar()
  {
	System.out.println("El avion acelero");
  }


  /**
   */
  public void elevarse()
  {
	System.out.println("El avion se elevo");
  }

}
