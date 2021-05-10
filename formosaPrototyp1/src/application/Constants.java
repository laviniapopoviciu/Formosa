package application;

import java.time.format.DateTimeFormatter;

public class Constants {
	public static final String PATH_TO_START_FXML = "/application/Start.fxml";
	public static final String PATH_TO_LOGIN_FXML = "/application/Login.fxml";
	public static final String PATH_TO_MY_ACCOUNT_FXML = "/application/MyAccount.fxml";
	public static final String PATH_TO_SEARCH_RESULT_FXML = "/application/SearchResult.fxml";
	public static final String PATH_TO_PARTNER_FXML = "/application/Partner.fxml";
	public static final String PATH_TO_SALONS_FXML = "/application/Salons.fxml";
	public static final String PATH_TO_REGISTER_FXML = "/application/Register.fxml";
	
	public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.hh.mm");
}
