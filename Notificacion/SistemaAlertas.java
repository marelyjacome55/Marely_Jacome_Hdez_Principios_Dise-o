

/**
 * Class SistemaAlertas
 */
public class SistemaAlertas {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public SistemaAlertas () { };
  
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
	EmailNotificacion email = new EmailNotificacion("Bienvenido!", "marely@mail.com");
	email.enviar();
	email.registrarLog();

	SMSNotificacion sms = new SMSNotificacion("Tu codigo es 1234", "+522713047086");
	sms.enviar();
	sms.enviar();

  }


}
