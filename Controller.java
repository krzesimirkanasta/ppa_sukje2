package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller {
    public RadioButton rb2;
    public RadioButton rb1;
    public RadioButton rb3;
    public Button button;
    public Label label;
    final ToggleGroup group = new ToggleGroup();

    public void initialize(){
        rb1.setUserData(rb1.getText());
        rb2.setUserData(rb2.getText());
        rb3.setUserData(rb3.getText());
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
    }

    public void click(ActionEvent actionEvent) {
        Toggle which_one = group.getSelectedToggle();
        label.setText(String.valueOf(which_one.getUserData()));
    }

    public void select1(ActionEvent actionEvent) {
        rb1.setSelected(true);
    }

    public void select2(ActionEvent actionEvent) {
        rb2.setSelected(true);
    }

    public void select3(ActionEvent actionEvent) {
        rb3.setSelected(true);
    }
}
