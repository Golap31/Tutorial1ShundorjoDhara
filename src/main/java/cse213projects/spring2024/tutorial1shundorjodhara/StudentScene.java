/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cse213projects.spring2024.tutorial1shundorjodhara;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class StudentScene
{
    @javafx.fxml.FXML
    private TextField AgeTextField;
    @javafx.fxml.FXML
    private ComboBox<Integer> StudentCB;
    @javafx.fxml.FXML
    private Label DetailsLabel;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private TextField IDTextField;
    private ArrayList<Student> student = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ViewButtonOnClick(ActionEvent actionEvent) {
        int selectedID = StudentCB.getValue();
        for (Student student : student) {
            if (student.getID() == selectedID) {
                DetailsLabel.setText(student.toString());
            break;
            }
        }
    }

    @javafx.fxml.FXML
    public void AddButtonOnClick(ActionEvent actionEvent) {
        int id = Integer.parseInt(IDTextField.getText());
        int age  = Integer.parseInt(AgeTextField.getText());
        String name = NameTextField.getText();
        Student newstudent = new Student(id, name,age);
        StudentCB.getItems().add(id);
        student.add(newstudent);

    }
}