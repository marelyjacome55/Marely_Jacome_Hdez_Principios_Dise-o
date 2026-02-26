

/**
 * Class SMSNotificacion
 */
public class SMSNotificacion extends Notificacion implements Envia{
  private double costo = 0.10;
  //
  // Fields
  //

  
  //
  // Constructors
  //
  public SMSNotificacion (String mensaje, String destinatario) {
	super(mensaje, destinatario);
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
  public void enviar()
  {
	System.out.println("Enviando SMS al numero  " + destinatario + "[costo: $"+ costo + "]");
  }


}
