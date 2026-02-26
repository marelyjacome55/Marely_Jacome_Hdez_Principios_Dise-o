

/**
 * Class Gato
 */
public class Gato extends Animal implements Sonido {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Gato (String nombre) {
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
	System.out.println("El gato salta");
  }


  /**
   */
 @Override
  public void hacerSonido()
  {
	System.out.println("Miau");
  }


}
