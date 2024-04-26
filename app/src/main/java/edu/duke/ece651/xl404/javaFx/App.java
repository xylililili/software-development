/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.duke.ece651.xl404.javaFx;

import java.io.IOException;
import java.net.URL;

//public class App {
//  public String getGreeting() {
//      return "Hello World!";
//  }

//  public static void main(String[] args) {
///      System.out.println(new App().getGreeting());
// }
//}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class App extends Application {
  @Override
  public void start(Stage stage) throws IOException{
   URL xmlResource = getClass().getResource("/ui/calc-monolithic.xml");
   URL cssResource = getClass().getResource("/ui/calcbuttons.css");
   GridPane gp = FXMLLoader.load(xmlResource);
   Scene scene = new Scene(gp, 640, 480);
   scene.getStylesheets().add(cssResource.toString());
   stage.setScene(scene);
   stage.show();
  }
}
