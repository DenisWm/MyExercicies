package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField senhaField;
	
	public void entrar() {
		boolean emailValido = emailField.getText().equalsIgnoreCase("aluno@cod3r.com.br");
		boolean senhaValida = senhaField.getText().equalsIgnoreCase("12345678");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
		} else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usuário e Senha Inválidos")
			.showError();
		}
	}
}
