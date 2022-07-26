package com.efxUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.functions.Player;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class CardFace {
	public static int getWhoseTurn() {
		return whoseTurn;
	}

	public static void setWhoseTurn(int whoseTurn) {
		CardFace.whoseTurn = whoseTurn;
	}

	protected Color aceColor1 = Color.rgb(58, 107, 53, 1);// Deep Green
	private static Color aceColor2 = Color.rgb(227, 180, 72, 1);// Gold
	private static Color aceColor3 = Color.rgb(203, 209, 143, 1);// Light Green
	@SuppressWarnings("unused")
	private Color aceColor4 = Color.rgb(231, 232, 209, 1);// Gray
	private String patternFill = ".\\Files\\pattern2.jpg";
	private String crossPattern = ".\\Files\\crossPattern1.jpg";
	private static String fontName = "Comic Sans MS";
	private double multiplyFactor = 0.35;
	private String recordName[] = { "Matches", "Highest Score", "Runs", "Hundreds", "Fifties", "Catches", "Wickets",
			"Five Wickets" };
	private static int whoseTurn = 2;

	public Group displayMainCard(int x, int y, Object[] records) throws Throwable {
		Group cardGroup = new Group();
		Rectangle outline = getCardOutline(x, y, 1);

		Text text1 = setAceTextCF(x + 10, y + 27, records[1].toString());
		text1.setFont(Font.font(fontName, 17));

		int h = 0;
		int g = 2;
		ArrayList<Line> arl = new ArrayList<Line>();
		ArrayList<Text> art1 = new ArrayList<Text>();
		ArrayList<Text> art2 = new ArrayList<Text>();

		for (int i = (y + 35); i <= (y + 200); i = i + 20) {
			Line l = new Line(x + 5, i, x + 147, i);
			l.setStroke(aceColor2);
			arl.add(l);

			if (h < recordName.length) {
				Text text2 = setAceTextCF(x + 10, i + 13, recordName[h].toString());
				text2.setFont(Font.font(fontName, 12));
				text2.setFill(aceColor3);
				h = h + 1;
				art1.add(text2);
			}

			if (g < records.length) {
				Text text3 = setAceTextCF(x + 100, i + 13, records[g].toString());
				text3.setFont(Font.font(fontName, 12));
				text3.setFill(aceColor3);
				g = g + 1;
				art2.add(text3);
			}
		}
		Line l1 = new Line(x + 90, y + 35, x + 90, y + 195);
		l1.setStroke(aceColor2);
		arl.add(l1);

		cardGroup.getChildren().addAll(outline, text1);
		cardGroup.getChildren().addAll(arl);
		cardGroup.getChildren().addAll(art1);
		cardGroup.getChildren().addAll(art2);
		return cardGroup;
	}

	public Group displayMainSmallCard(int x, int y, Object[] records) throws Throwable {
		Group mainCard = new Group();
		Rectangle outline = getCardOutline(x, y, multiplyFactor);

		Text text1 = new Text();
		text1.setX(x + 20);
		text1.setY(y + 40);
		text1.setText(records[0].toString());
		text1.setFont(Font.font(fontName, 17));
		text1.setFill(aceColor2);

		mainCard.getChildren().addAll(outline, text1);

		return mainCard;
	}

	public Group displayHiddenCard() throws Throwable {
		Group hiddenCard = new Group();
		double multiplyFactorBig = 1;
		Rectangle outline = getCardOutline(100, 100, multiplyFactorBig);
		FileInputStream input = new FileInputStream(this.patternFill);
		Image image = new Image(input);
		ImagePattern image_pattern = new ImagePattern(image);
		outline.setFill(image_pattern);
		hiddenCard.getChildren().addAll(outline);

		return hiddenCard;
	}

	public Group displayHiddenSmallCard() throws Throwable {
		Group hiddenCard = new Group();

		Rectangle outline = getCardOutline(100, 100, multiplyFactor);
		FileInputStream input = new FileInputStream(this.patternFill);
		Image image = new Image(input);
		ImagePattern image_pattern = new ImagePattern(image);
		outline.setFill(image_pattern);
		hiddenCard.getChildren().addAll(outline);

		return hiddenCard;
	}

	public Rectangle getCardOutline(int x, int y, double mf) throws Throwable {
		Rectangle rect = new Rectangle(x, y, 150 * mf, 200 * mf);
		rect.setFill(aceColor1);
		rect.setStroke(aceColor2);
		rect.setArcHeight(5);
		rect.setArcWidth(5);
		rect.setStrokeWidth(8 * mf);

		return rect;
	}

	public Group displayScoreBoard(int x, int y, Player pl1, Player pl2) throws Throwable {
		Group scoreBoard = new Group();
		double multiplyFactorBig = 0.75;
		Rectangle outline = getCardOutline(x, y, multiplyFactorBig);
		outline.setFill(aceColor3);

		Text score = setAceTextCF(x + 5, y + 20, "Total Score");
		score.setUnderline(true);
		Text score1, score2;

		score1 = setAceTextCF(x + 5, y + 80, pl1.getName() + " : " + pl1.getScore());
		score2 = setAceTextCF(x + 5, y + 60, pl2.getName() + " : " + pl2.getScore());
		
		score1.setTextAlignment(TextAlignment.RIGHT);
		score2.setTextAlignment(TextAlignment.RIGHT);

		score.setFill(aceColor1);
		score1.setFill(aceColor1);
		score2.setFill(aceColor1);

		scoreBoard.getChildren().addAll(outline, score, score2, score1);

		return scoreBoard;
	}

	public Group setPointer() throws FileNotFoundException {
		Group pointer = new Group();

		FileInputStream input = new FileInputStream(".\\Files\\pointer1.png");
		Image image = new Image(input);
		// ImagePattern image_pattern = new ImagePattern(image);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setX(20);
		imageView.setY(20);
		imageView.setFitWidth(50);
		imageView.setPreserveRatio(true);

		pointer.getChildren().addAll(imageView);
		return pointer;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ComboBox setSelectionCombo() {
		ComboBox comboBox = new ComboBox<Object>();
		comboBox.setBackground(new Background(new BackgroundFill(aceColor2, CornerRadii.EMPTY, Insets.EMPTY)));
		for (int z = 0; z < recordName.length; z++) {
			comboBox.getItems().add(recordName[z]);
		}
		return comboBox;
	}

	public Text setAceTextCF(int x, int y, String text) {
		Text text1 = new Text();
		text1.setX(x);
		text1.setY(y);
		text1.setText(text);
		text1.setFont(Font.font(fontName, 15));
		text1.setFill(aceColor2);
		return text1;
	}

	public void setTheme(int theme) {
		if (theme == 1) {
			aceColor1 = Color.rgb(58, 107, 53, 1);// Deep Green
			aceColor2 = Color.rgb(227, 180, 72, 1);// Gold
			aceColor3 = Color.rgb(203, 209, 143, 1);// Light Green
			aceColor4 = Color.rgb(231, 232, 209, 1);// Gray
			this.patternFill = ".\\Files\\pattern2.jpg";
			fontName = "Comic Sans MS";
			crossPattern = ".\\Files\\crossPattern1.jpg";

		} else if (theme == 2) {
			aceColor1 = Color.rgb(207, 184, 69, 1);// Golden
			aceColor2 = Color.rgb(255, 255, 255, 1);// White
			aceColor3 = Color.rgb(20, 20, 20, 1);// Dark Grey/black
			aceColor4 = Color.rgb(127, 195, 192, 1);// SkyBlue
			// fontName = "Century Gothic";
			this.patternFill = ".\\Files\\pattern3.png";
			crossPattern = ".\\Files\\crossPattern2.jpg";
		}
	}

	public Group displayMainCrossedCard() throws Throwable {
		Group hiddenCard = new Group();

		Rectangle outline = getCardOutline(100, 100, multiplyFactor);
		FileInputStream input = new FileInputStream(this.crossPattern);
		Image image = new Image(input);
		ImagePattern image_pattern = new ImagePattern(image);
		outline.setFill(image_pattern);
		hiddenCard.getChildren().addAll(outline);

		return hiddenCard;
	}

}
