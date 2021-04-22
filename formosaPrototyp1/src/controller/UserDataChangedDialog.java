package controller;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
public class UserDataChangedDialog extends Dialog<ButtonType> {

	public UserDataChangedDialog(String header, String content) {
		this.setContentText(content);
		this.setHeaderText(header);
		this.getDialogPane().getButtonTypes().add(ButtonType.OK);
		this.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
	}
}