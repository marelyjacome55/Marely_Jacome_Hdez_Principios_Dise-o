

/**
 * Class Television
 */
public class Television {

  //
  // Fields
  //

  public String forma;
  public String calidad_de_video;
  protected String marca;
  private String tamaño;
  
  //
  // Constructors
  //
  public Television () {
	System.out.println("Construyo una Television");
 };
  
  //
  // Methods
  //
	

  //
  // Accessor methods
  //

  /**
   * Set the value of forma
   * @param newVar the new value of forma
   */
  public void setForma (String forma) {
    this.forma = forma;
  }

  /**
   * Get the value of forma
   * @return the value of forma
   */
  public String getForma () {
    return forma;
  }

  /**
   * Set the value of calidad_de_video
   * @param newVar the new value of calidad_de_video
   */
  public void setCalidad_de_video (String calidad_de_video) {
    this.calidad_de_video = calidad_de_video;
  }

  /**
   * Get the value of calidad_de_video
   * @return the value of calidad_de_video
   */
  public String getCalidad_de_video () {
    return calidad_de_video;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    this.marca = marca;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of tamaño
   * @param newVar the new value of tamaño
   */
  public void setTamaño (String tamaño) {
    this.tamaño = tamaño;
  }

  /**
   * Get the value of tamaño
   * @return the value of tamaño
   */
  public String getTamaño () {
    return tamaño;
  }

  //
  // Other methods
  //

  /**
   * @param        forma1
   * @param        tamaño1
   * @param        calidaddevideo1
   * @param        marca
   */
  public void Television(String forma1, String tamaño1, String calidaddevideo1, String marca)
  {

  }


  /**
   */
  public void apagada()
  {
	System.out.println("Television apagada");
  }
  /**
   */
  public void prendida()
  {
	System.out.println("Television encendida");
  }


  /**
   * @param        forma1
   */
 
}
