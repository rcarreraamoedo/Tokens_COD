import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;


public class app {
    public static void main(String[] args) throws IOException {
        String usuario = JOptionPane.showInputDialog("Escribe tu usuario de Github: ");
        String password = JOptionPane.showInputDialog("Escribe tu contraseña de Github: ");
        String nombre = JOptionPane.showInputDialog("Escribe nombre del repositorio: ");
        String descrip = JOptionPane.showInputDialog("Escribe una descripción del respositorio: ");

        GitHub github = new GitHubBuilder().withPassword(usuario, password).build();
        GHRepository repo = github.createRepository(
                nombre, descrip,
                "https://github.com/rcarreraamoedo", false/*public*/);
    }
}
