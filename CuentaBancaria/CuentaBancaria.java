

/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

  //
  // Fields
  //

  private double saldo;
  
  //
  // Constructors
  //
  public CuentaBancaria (double saldo) {
	this.saldo = saldo;
 };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Get the value of saldo
   * @return the value of saldo
   */
  public double getSaldo () {
    return saldo;
  }

  //
  // Other methods
  //

  /**
   * @param        cantidad
   */
  public void depositar(double monto)
  {
	System.out.println("deposito = "+ monto);
	if (monto > 0 ){
	saldo += monto;
	}
  }


  /**
   * @param        cantidad
   */
  public void retirar(double monto)
  {
	System.out.println("retirando " + monto);

	if (monto <= saldo){
	saldo -= monto;
	System.out.println ("retiro = "+ monto);
	} else {
	System.out.println ("Fondo insuficiente ...");

	}  
  }


}
