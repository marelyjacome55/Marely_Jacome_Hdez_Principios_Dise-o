

/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;
  private int numVentilas;
  
  //
  // Constructors
  //
  public Autobus (String marcaModelo, int precioDia, int numllantas, int numAsientos, int numPuertas, int numVentilas) {
	super(marcaModelo, precioDia, numllantas);
	this.numAsientos = numAsientos;
	this.numPuertas = numPuertas;
	this.numVentilas = numVentilas;
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

  /**
   * Set the value of numPuertas
   * @param newVar the new value of numPuertas
   */
  public void setNumPuertas (int numPuertas) {
    this.numPuertas = numPuertas;
  }

  /**
   * Get the value of numPuertas
   * @return the value of numPuertas
   */
  public int getNumPuertas () {
    return numPuertas;
  }

  /**
   * Set the value of numVentilas
   * @param newVar the new value of numVentilas
   */
  public void setNumVentilas (int numVentilas) {
    this.numVentilas = numVentilas;
  }

  /**
   * Get the value of numVentilas
   * @return the value of numVentilas
   */
  public int getNumVentilas () {
    return numVentilas;
  }

  //
  // Other methods
  //

  /**
   */
  public void mostrarDatos()
  {
	System.out.println("marca: " + this.marcaModelo);
	System.out.println("precio: " + this.precioDia);
	System.out.println("numero de llantas: " + this.numllantas);
	System.out.println("numero de asientos: " + this.numAsientos);
	System.out.println("numero de puertas: " + this.numPuertas);
	System.out.println("numero de ventilas: " + this.numVentilas);
  }


  /**
   */
  public void pruebaDelMotor()
  {
	System.out.println("Autobus funcionando");
  }


}
