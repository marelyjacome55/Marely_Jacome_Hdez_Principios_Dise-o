

/**
 * Class Motocicleta
 */
public class Motocicleta extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  
  //
  // Constructors
  //
  public Motocicleta (String marcaModelo, int precioDia, int numllantas, int numAsientos) {
	super(marcaModelo, precioDia, numllantas);
	this.numAsientos = numAsientos;
 };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numAsientos
   * @param newVar the new value of numAsientos
   */
  public void setNumAsientos (int numAsientos) {
    this.numAsientos = numAsientos;
  }

  /**
   * Get the value of numAsientos
   * @return the value of numAsientos
   */
  public int getNumAsientos () {
    return numAsientos;
  }

  //
  // Other methods
  //

  /**
   */
  public void mostrarDatos()
  {
	System.out.println("marca: "+ this.marcaModelo);
	System.out.println("precio: " + this.precioDia);
	System.out.println("numero de llantas: " + this.numllantas);
	System.out.println("numero de asientos: " + this.numAsientos);
  }


  /**
   */
  public void pruebaDelMotor()
  {
	System.out.println("motocicleta funcionando...");
  }


}
