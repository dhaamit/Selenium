package com.ui.ThreadArt;

import java.awt.Point;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ThreadArt extends Application 
{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Color bkColor = Color.rgb(20, 20, 20, 1);
		BorderPane border = new BorderPane();
		GridPane gridPane = null;
		try {
			gridPane = addGridPane();
			gridPane.autosize();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		border.setCenter(gridPane);

		Scene scene = new Scene(border, 800, 800, bkColor);
		primaryStage.setTitle("Ace Record Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private GridPane addGridPane()  {
		ArrayList<Line> listOfPoints = new ArrayList<Line>();
		GridPane grid = new GridPane();
		Line p = new Line();
		p.setStroke(Color.BLUEVIOLET);
		
		for (double x=0; x<100; x++)
		{
			double y = x*(x+1);
			p.setStartX(x);
			p.setStartY(100);
			p.setEndX(100);
			p.setEndY(100+x);
			listOfPoints.add(p);
		}
		
		grid.getChildren().addAll(listOfPoints);	
		return grid;
	}
	
	public static void main(String[] args) throws Throwable {
		launch(args);
	}
	
	
}
