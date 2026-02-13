

/**
 * Class Pelota
 */
public class Pelota {

  //
  // Fields
  //

  public String forma;
  public String tipo;
  protected String material;
  private String color;
  
  //
  // Constructors
  //
  public Pelota () {
	System.out.println("Construyo una pelota");
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
   * Set the value of tipo
   * @param newVar the new value of tipo
   */
  public void setTipo (String tipo) {
   this.tipo = tipo;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  public String getTipo () {
    return tipo;
  }

  /**
   * Set the value of material
   * @param newVar the new value of material
   */
  public void setMaterial (String material) {
   this.material = material;
  }

  /**
   * Get the value of material
   * @return the value of material
   */
  public String getMaterial () {
    return material;
  }

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String color) {
    this.color = color;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  //
  // Other methods
  //

  /**
   * @param        forma1
   * @param        color1
   * @param        material1
   * @param        tipo1
   */
  public void Pelota(String forma1, String color1, String material1, String tipo1)
  {
  }


  /**
   */
  public void botar()
  {
	System.out.println("La pelota esta botando");
  }


  /**
   */
  public void desinflar()
  {
	System.out.println("Pelota ya se desinflo");
  }


}
