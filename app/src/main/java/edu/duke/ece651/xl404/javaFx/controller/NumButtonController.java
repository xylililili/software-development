package edu.duke.ece651.xl404.javaFx.controller;

import edu.duke.ece651.xl404.javaFx.model.RPNStack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NumButtonController {
  RPNStack model;
  public NumButtonController(RPNStack model) {
    this.model = model;
  }
  void pushCurrentNumIfAny() {
    String s = currentNumber.getText().trim();
    if (!s.equals("")) {
      double d = Double.parseDouble(s);
      model.pushNum(d);
    }
    currentNumber.setText("");
  }
  public void onEnter(ActionEvent ae) {
    pushCurrentNumIfAny();
  }
  public void onPlus(ActionEvent ae) {
    pushCurrentNumIfAny();
    model.add();
  }
  public void onMinus(ActionEvent ae) {
    pushCurrentNumIfAny();
    model.subtract();
  }

  public void onTimes(ActionEvent ae) {
    pushCurrentNumIfAny();
    model.times();
  }

  public void onDivde(ActionEvent ae) {
    pushCurrentNumIfAny();
    model.divide();;
  }
  @FXML
  TextField currentNumber;
  @FXML
  public void onNumberButton(ActionEvent ae) {
    Object source = ae.getSource();
    if (source instanceof Button) {
      Button btn = (Button) source;
      currentNumber.setText(currentNumber.getText()+btn.getText());
    }
    else {
      throw new IllegalArgumentException("Invalid source " +
                                         source +
                                         " for ActionEvent");
    }
  }
}
