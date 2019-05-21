package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.Student;
import model.StudentBag;

public class MainController implements Initializable {
	@FXML
	private Button click_me;
	@FXML
	private ComboBox stateBox;
	@FXML
	private Button cancel;
	
	private StudentBag myBag;
	
	private ObservableList<String> list = FXCollections.observableArrayList("NY", "NJ", "MA");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		stateBox.setItems(list);
		myBag = new StudentBag(20);
	}
	
	public void stateSelected(ActionEvent event) {
		Student s = new Student((String)stateBox.getValue(), "111");
		myBag.insert(s);
	}
	
	public void canceled(ActionEvent e) {
		Platform.exit();
	}

}
