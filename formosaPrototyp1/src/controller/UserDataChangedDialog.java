package controller;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
public class UserDataChangedDialog extends Dialog<ButtonType> {

	public UserDataChangedDialog() {
		this.setContentText("Daten wurden geändert");
		this.setHeaderText("Info");
		this.getDialogPane().getButtonTypes().add(ButtonType.OK);

	}
}