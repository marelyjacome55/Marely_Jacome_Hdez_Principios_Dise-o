

/**
 * Class Principal
 */
public class Principal {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Principal () { };
  
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
  public static void main(String[] args)
  {
	CuentaBancaria cuenta = new CuentaBancaria (1000.0);

	System.out.println("Saldo inicial = " + cuenta.getSaldo());
	cuenta.depositar (500.0);
	cuenta.retirar (1500);
	
	System.out.println("Saldo actual: " + cuenta.getSaldo());
	cuenta.retirar(100.0);

  }


}
