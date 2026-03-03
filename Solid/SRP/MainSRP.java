
public class MainSRP {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Marely", "marelyjacome782@gmailcom");
        UsuarioRepository repo = new UsuarioRepository();
        EmailService email = new EmailService();

        repo.guardar(usuario);
        email.enviarBienvenida(usuario);
    }
}
