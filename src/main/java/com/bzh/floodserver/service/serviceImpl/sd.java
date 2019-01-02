package com.bzh.floodserver.service.serviceImpl;/**
 * @author 毕泽浩
 * @Description:
 * @time 2019/1/2 9:24
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class sd extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Circle circ = new Circle(40, 40, 30);
		Group root = new Group(circ);
		Scene scene = new Scene(root, 400, 300);

		stage.setTitle("My JavaFX Application");
		stage.setScene(scene);
		stage.show();
	}
}
