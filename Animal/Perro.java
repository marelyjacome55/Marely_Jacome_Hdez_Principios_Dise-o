

/**
 * Class Perro
 */
public class Perro extends Animal implements Sonido {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Perro (String nombre) {
	super(nombre);
 };
  
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
  @Override 
  public void mover()
  {
	System.out.println("El perro corre");
  }


  /**
   */
  @Override
  public void hacerSonido()
  {
	System.out.println("Guau Guau");
  }


}
