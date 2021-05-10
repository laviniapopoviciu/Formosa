package controller;


	import javafx.scene.control.ButtonType;
	import javafx.scene.control.Dialog;
	public class ModalDialog  extends Dialog<ButtonType> {

		public ModalDialog(String dialog) {
		this.setContentText(dialog);
			this.setHeaderText("Info");
			this.getDialogPane().getButtonTypes().add(ButtonType.OK);

		}
	}

