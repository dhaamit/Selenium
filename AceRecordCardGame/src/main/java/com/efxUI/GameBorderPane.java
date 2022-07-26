//https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm#CHDGHCDG
//
package com.efxUI;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.functions.PlayGame;
import com.functions.Player;
import com.logger.Log4J;
import com.sun.media.jfxmedia.locator.Locator;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaBuilder;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameBorderPane extends Application {
	private Color aceColor1 = Color.rgb(58, 107, 53, 1);// Deep Green
	private Color aceColor2 = Color.rgb(227, 180, 72, 1);// Gold
	private Color aceColor3 = Color.rgb(203, 209, 143, 1);// Light Green
	private Color aceColor4 = Color.rgb(231, 232, 209, 1);// Gray
	private static String fontName = "Comic Sans MS";
	@SuppressWarnings("unused")
	private String patternFill = ".\\Files\\pattern2.jpg";
	private static int noOfPlayers = 2;
	private static String playerName = "Amit";
	private static String playerName2 = "Player2";
	private static Player pl1;
	private static Player pl2;
	private static int roundNo = 1;
	private static int theme = 2;
	private static int whoseTurn = 2;
	Button playButton = null;
	Button okButton = null;
	Button nextButton = null;
	private static Logger log = LogManager.getLogger(Log4J.class.getName());
	int selectedCard1 = roundNo - 1;
	int selectedCard2 = roundNo - 1;
	private String choice;
	private ArrayList<Group> mainSmallCardList;
	private HBox hbox1;
	private BorderPane border;
	private Set<Integer> crossedCardIndex;
//	int i = 0;

	@SuppressWarnings("unchecked")
	public void start(Stage primaryStage) throws Exception {
		PlayGame pg = null;
		Player pl11 = new Player();
		Player pl12 = new Player();
		pl1 = pl11;
		pl2 = pl12;

		pl1.setName(playerName);
		pl2.setName(playerName2);
		pl1.setScore(0);
		pl2.setScore(0);

		setTheme(theme);
		try {
			pg = new PlayGame(noOfPlayers);
			pg.allocateCards(pl1, pl2);

			log.info("No of Player = " + pg.noOfPlayers + "; Total Cards = " + pg.totalCards
					+ "; Total Cards per player = " + pg.cardsPerPlayer + "; Total Cards per player = "
					+ pg.cardsPerPlayer + "; Total In Game Cards = " + pg.totalInGameCards);

			log.info("Cards Distribution : player1 " + pl1.getCards());
			log.info("Cards Distribution : player2 " + pl2.getCards());
			choice = pg.autoplayChoiceDecider(pl2, selectedCard2);
			pl2.setChoice(choice);
			// pg.playRound(selectedCard1, selectedCard2, pl1, pl2, whoseTurn, null);

		} catch (Throwable e2) {
			log.debug(e2);
		}

		CardFace cf = new CardFace();
		cf.setTheme(theme);
		ArrayList<Object> records = new ArrayList<Object>();
		ArrayList<Group> hiddenSmallCardList = new ArrayList<Group>();
		mainSmallCardList = new ArrayList<Group>();
		ArrayList<Group> hiddenSmallCardList2 = new ArrayList<Group>();
		ArrayList<Group> hiddenSmallCardList3 = new ArrayList<Group>();

		Object rec[] = records.toArray();
		Group hiddenCard = null;
		Group mainSmallCard = null;
		Group hiddenSmallCard = null;

		try {
			hiddenCard = cf.displayHiddenCard();
			playButton = setPlayButton();
			okButton = setOkButton();
			nextButton = setNextButton();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}

		int cardSize = pl1.getCards().size();
		for (int i = 0; i < cardSize; i++) {
			records = (ArrayList<Object>) pl1.getCards().get(i);
			rec = records.toArray();
			try {
				hiddenSmallCard = cf.displayHiddenSmallCard();
				mainSmallCard = cf.displayMainSmallCard(0, 0, rec);
				hiddenSmallCardList.add(hiddenSmallCard);
				mainSmallCardList.add(mainSmallCard);
				hiddenSmallCardList2.add(hiddenSmallCard);
				hiddenSmallCardList3.add(hiddenSmallCard);

			} catch (Throwable e) {
				e.printStackTrace();
			}

		}
		
		
		border = new BorderPane();
	
		
		//Video play
		 StackPane root = new StackPane();
	        File actualFile = new File(".\\Files\\opening.mov");
	        File emptyfile = new File(".\\Files\\blank.mp4");
	        Media media = new Media(emptyfile.toURI().toString());
	        copyData(media, actualFile);
	        MediaPlayer mediaPlayer = null;
	        try {
	            mediaPlayer = new MediaPlayer(media);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        mediaPlayer.setAutoPlay(true);
	        MediaView mediaView = new MediaView(mediaPlayer);
	        
	    //Video Ends
	        
	        
		HBox hbox = addHBox(hiddenSmallCardList);
		border.getChildren().add(mediaView);
		border.setTop(hbox);
		//root.getChildren().add(mediaView);
		
		Node gridPane = null;
		try {
			gridPane = addGridPane(cf, hiddenCard, pg);
			gridPane.autosize();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}

		border.setCenter(gridPane);

		//Scene scene = new Scene(root, 800, 800, aceColor4);
		Scene scene = new Scene(border, 800, 800, aceColor4);
		primaryStage.setMaximized(true);
		primaryStage.setTitle("Ace Record Cards");
		primaryStage.setScene(scene);
		// primaryStage.getIcons().add(new Image(".\\Files\\AceIcon.jpg"));
		primaryStage.show();

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Node addGridPane(CardFace cf, Group hiddenCard, PlayGame pg) throws Throwable {
		GridPane grid = new GridPane();

		ArrayList<Object> records = new ArrayList<Object>();
		ArrayList<Object> records2 = new ArrayList<Object>();
		ArrayList<Group> mainCardsPl1 = new ArrayList<Group>();
		ArrayList<Group> mainCardsPl2 = new ArrayList<Group>();
		crossedCardIndex = new HashSet<Integer>();
		Object rec[];
		Group mainCard;

		hbox1 = addHBox(mainSmallCardList);
		border.setBottom(hbox1);

		ComboBox choiceComboBox = cf.setSelectionCombo();
		int cardCount = pl1.getCards().size();


		class CardHandle implements EventHandler<MouseEvent> {
			private int x;

			public CardHandle(int x) {
				this.x = x;
			}

			public void handle(MouseEvent e) {
				System.out.println(String.format("You clicked on card located at %d", x));
				System.out.println(crossedCardIndex);
				mainCardsPl1.get(selectedCard1).setVisible(false);
				grid.getChildren().remove(mainCardsPl1.get(selectedCard1));

				selectedCard1 = x;
				mainCardsPl1.get(selectedCard1).setVisible(true);
				grid.add(mainCardsPl1.get(selectedCard1), 2, 3);
				MakeSound mk2 = new MakeSound();
				mk2.playSound(".\\Files\\Card1.wav");

			}

		}
		
		for (int i = 0; i < cardCount; i++) {
			records = (ArrayList<Object>) pl1.getCards().get(i);
			rec = records.toArray();
			mainCard = cf.displayMainCard(0, 0, rec);
			mainCardsPl1.add(mainCard);
			mainCardsPl1.get(i).setVisible(false);
			records2 = (ArrayList<Object>) pl2.getCards().get(i);
			rec = records2.toArray();
			mainCard = cf.displayMainCard(0, 0, rec);
			mainCardsPl2.add(mainCard);
			mainCardsPl2.get(i).setVisible(false);
			CardHandle eventHandler1 = new CardHandle(i);
			mainSmallCardList.get(i).addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler1);
		}

		mainCardsPl1.get(selectedCard1).setVisible(true);
		grid.add(mainCardsPl1.get(selectedCard1), 2, 3);

		mainCardsPl2.get(selectedCard2).setVisible(false);
		grid.add(mainCardsPl2.get(selectedCard2), 2, 1);

		grid.setBackground(new Background(new BackgroundFill(aceColor4, CornerRadii.EMPTY, Insets.EMPTY)));
		grid.setStyle("-fx-background-color: " + aceColor4 + ";");
		grid.setHgap(10);
		grid.setVgap(2);
		grid.setPadding(new Insets(0, 5, 0, 5));// top right bottom left
		grid.setAlignment(Pos.CENTER);

		Group setPointer1 = cf.setPointer();
		Group setPointer2 = cf.setPointer();
		
		grid.add(setPointer1, 1, 3);
		grid.add(setPointer2, 1, 1);

		Text player1Name = setAceText(playerName);
		grid.add(player1Name, 2, 4);
		Text player2Name = setAceText(playerName2);
		grid.add(player2Name, 2, 0);

		grid.add(hiddenCard, 2, 1);

		Group scoreBoard = cf.displayScoreBoard(0, 0, pl1, pl2);
		scoreBoard.setDisable(false);
		scoreBoard.setVisible(true);
		grid.add(scoreBoard, 5, 1);

		Text choiceLabel = setAceText("Your Pick : ");
		Text choiceLabel2 = setAceText(pl2.getName() + "'s Pick : ");
		Text choiceLabel3 = setAceText(pl2.getChoice());
		
		grid.add(choiceLabel, 3, 3);
		grid.add(choiceLabel2, 3, 1);
		grid.add(choiceLabel3, 4, 1);

		Text roundText = setAceText("Round Number : " + roundNo);
		roundText.setFill(aceColor2);
		grid.add(roundText, 2, 2);

		Text thisRoundScore1 = setAceText("Round Score");
		grid.add(thisRoundScore1, 0, 2);

		Text thisRoundScore2 = setAceText(String.valueOf(0));
		thisRoundScore2.setTextAlignment(TextAlignment.CENTER);
		grid.add(thisRoundScore2, 0, 3);

		Text thisRoundScore3 = setAceText(String.valueOf(0));
		thisRoundScore2.setTextAlignment(TextAlignment.CENTER);
		grid.add(thisRoundScore3, 0, 1);

		//Animation
		FadeTransition fade=new FadeTransition();
		fade.setDuration(Duration.millis(5000));
		fade.setFromValue(10);
		fade.setFromValue(0.1);
		fade.setAutoReverse(false);
		fade.setNode(setPointer1);
		fade.setNode(setPointer2);
		//Animation Ends
		
		if (whoseTurn == 1) {
			choiceComboBox.setDisable(false);
			choiceLabel.setVisible(true);
			choiceLabel2.setVisible(false);
		//	fade.play();
			setPointer1.setVisible(false);
			setPointer2.setVisible(true);
		} else {
			choiceComboBox.setDisable(true);
			choiceLabel.setVisible(false);
			choiceLabel2.setVisible(true);
		//	fade.play();
			setPointer1.setVisible(false);
			setPointer2.setVisible(true);
		}

		grid.add(choiceComboBox, 4, 3);
		playButton.setDisable(false);
		grid.add(playButton, 4, 4);

		okButton.setDisable(true);
		okButton.setVisible(false);
		grid.add(okButton, 3, 4);
		
		nextButton.setVisible(false);
		nextButton.setDisable(true);
		grid.add(nextButton, 3, 4);

		okButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				MakeSound mk = new MakeSound();
				mk.playSound(".\\Files\\Ok.wav");

				okButton.setDisable(true);
				okButton.setVisible(false);
				nextButton.setDisable(false);
				nextButton.setVisible(true);

				thisRoundScore2.setText(String.valueOf(pl1.getThisRoundScore()));
				thisRoundScore3.setText(String.valueOf(pl2.getThisRoundScore()));

				scoreBoard.setDisable(true);
				scoreBoard.setVisible(false);

				Group scoreBoard2;
				Group mainCrossedCard = null;

				try {
					scoreBoard2 = cf.displayScoreBoard(0, 0, pl1, pl2);
					scoreBoard2.setDisable(false);
					scoreBoard2.setVisible(true);
					grid.add(scoreBoard2, 5, 1);

					mainCrossedCard = cf.displayMainCrossedCard();

				} catch (Throwable e) {
					e.printStackTrace();
				}

				hiddenCard.setDisable(true);
				hiddenCard.setVisible(false);

				mainCardsPl2.get(selectedCard2).setDisable(false);
				mainCardsPl2.get(selectedCard2).setVisible(true);

				crossedCardIndex.add(selectedCard1);
				mainSmallCardList.set(selectedCard1, mainCrossedCard);
				hbox1.getChildren().removeAll();

				hbox1 = addHBox(mainSmallCardList);
				border.setBottom(hbox1);

				if (whoseTurn == 1) {
					choiceLabel.setVisible(true);
					choiceLabel2.setVisible(false);
					choiceLabel3.setVisible(false);

				} else {
					choiceLabel.setVisible(false);
					choiceLabel2.setVisible(true);
				}

				
				
				MakeSound mk2 = new MakeSound();
				mk2.playSound(".\\Files\\Card.wav");
				
				if (roundNo >= cardCount) {
					roundText.setText("Game Over !!");
					choiceComboBox.setDisable(true);
					playButton.setDisable(true);
					okButton.setDisable(true);
					nextButton.setDisable(false);
				}
				
				if (pl1.getThisRoundScore()>=pl2.getThisRoundScore())
				{
					MakeSound mk3 = new MakeSound();
					mk3.playSound(".\\Files\\RoundWin.wav");
				}
				else
				{
					MakeSound mk3 = new MakeSound();
					mk3.playSound(".\\Files\\RoundLost.wav");
				}

				log.info("Whose Turn? : " + whoseTurn);
			}
		});

		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// get the unused card for player1.
				for (int k = 0; k < cardCount; k++) {

					if (crossedCardIndex.contains(k)) {
						continue;
					} else {
						selectedCard1 = k;
						break;
					}
				}

				if (roundNo >= cardCount) {
					if (pl1.getScore() > pl2.getScore()) {
						roundText.setText("Game Over !! - You Won !!");
						MakeSound mk1 = new MakeSound();
						mk1.playSound(".\\Files\\Win.wav");
					} else {
						roundText.setText("Game Over !! - You Lost!");
						MakeSound mk1 = new MakeSound();
						mk1.playSound(".\\Files\\Lose.wav");
					}
					nextButton.setDisable(true);
					return;
				}
				MakeSound mk = new MakeSound();
				mk.playSound(".\\Files\\Next.wav");
				nextButton.setDisable(true);
				nextButton.setVisible(true);
				playButton.setDisable(false);
				roundNo = roundNo + 1;
				thisRoundScore2.setText(String.valueOf(0));
				thisRoundScore3.setText(String.valueOf(0));
				roundText.setText("Round Number : " + roundNo);

				hiddenCard.setDisable(false);
				hiddenCard.setVisible(true);

				mainCardsPl1.get(selectedCard1).setVisible(false);
				mainCardsPl2.get(selectedCard2).setVisible(false);

				// selectedCard1 = selectedCard1 + 1;
				selectedCard2 = selectedCard2 + 1;

				mainCardsPl1.get(selectedCard1).setVisible(true);
				mainCardsPl2.get(selectedCard2).setVisible(false);
				grid.add(mainCardsPl1.get(selectedCard1), 2, 3);
				grid.add(mainCardsPl2.get(selectedCard2), 2, 1);
				choiceLabel3.setVisible(false);

				if (whoseTurn == 1) {
					choiceComboBox.setDisable(true);
					choiceLabel.setVisible(true);
					choiceLabel2.setVisible(false);
					choice = pg.autoplayChoiceDecider(pl2, selectedCard2);
					pl2.setChoice(choice);
					choiceLabel3.setText(pl2.getChoice());
					choiceLabel3.setVisible(true);
					//fade.play();
					setPointer1.setVisible(false);
					setPointer2.setVisible(true);
					
					whoseTurn = 2;
				} else {
					choiceComboBox.setDisable(false);
					choiceLabel.setVisible(true);
					choiceLabel2.setVisible(false);
					choiceLabel3.setVisible(false);
					//fade.play();
					setPointer2.setVisible(false);
					setPointer1.setVisible(true);
					whoseTurn = 1;
				}

				log.info("Whose Turn? : " + whoseTurn);
			}
		});

		playButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				MakeSound mk = new MakeSound();
				mk.playSound(".\\Files\\Play.wav");
				playButton.setDisable(true);
				nextButton.setVisible(false);
				okButton.setDisable(false);
				okButton.setVisible(true);
				choiceComboBox.setDisable(true);
				if (whoseTurn == 1) {
//					choiceComboBox.setDisable(false);
					choiceLabel.setVisible(true);
					choiceLabel2.setVisible(false);
					choiceLabel3.setVisible(true);

					String v = (String) choiceComboBox.getValue();
					pl1.setChoice(v);
					pl2.setChoice(v);
					choiceLabel3.setVisible(false);

					if (roundNo <= cardCount) {
						try {
							choiceLabel3.setText(pl2.getChoice());
							pg.playRound(selectedCard1, selectedCard2, pl1, pl2, whoseTurn, pl1.getChoice());
							choiceLabel3.setText(pl2.getChoice());
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						roundText.setText("Game Over !!");
						choiceComboBox.setDisable(true);
						playButton.setDisable(true);
						okButton.setDisable(true);
						nextButton.setDisable(true);
					}
				} else {
					choiceComboBox.setDisable(true);
					choiceLabel.setVisible(false);
					choiceLabel2.setVisible(true);
					if (roundNo <= cardCount) {
						try {
							choiceLabel3.setText(pl2.getChoice());
							pg.playRound(selectedCard1, selectedCard2, pl1, pl2, whoseTurn, pl1.getChoice());
							choiceLabel3.setText(pl2.getChoice());
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							log.debug(e);
						}
					} else {
						roundText.setText("Game Over !!");
						choiceComboBox.setDisable(true);
						playButton.setDisable(true);
						okButton.setDisable(true);
					}
				}
				log.info("Whose Turn? : " + whoseTurn);
			}
		});

		choiceComboBox.setOnAction((event) -> {
			MakeSound mk2 = new MakeSound();
			mk2.playSound(".\\Files\\Select.wav");
		});



		return grid;
	}

	public Button setPlayButton() {
		Button button = new Button();
		button.setText("Play");
		Font font = Font.font(fontName, 15);
		button.setFont(font);
		button.setBackground(new Background(new BackgroundFill(aceColor1, CornerRadii.EMPTY, Insets.EMPTY)));
		button.setTextFill(aceColor2);

		return button;
	}

	public Button setOkButton() {
		Button button = new Button();
		button.setText("Ok");
		Font font = Font.font(fontName, 15);
		button.setFont(font);
		button.setBackground(new Background(new BackgroundFill(aceColor1, CornerRadii.EMPTY, Insets.EMPTY)));
		button.setTextFill(aceColor2);

		return button;
	}

	public Button setNextButton() {
		Button button = new Button();
		button.setText("Next");
		Font font = Font.font(fontName, 15);
		button.setFont(font);
		button.setBackground(new Background(new BackgroundFill(aceColor1, CornerRadii.EMPTY, Insets.EMPTY)));
		button.setTextFill(aceColor2);

		return button;
	}

	private HBox addHBox(ArrayList<Group> hiddenSmallCardList) {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		hbox.setBackground(new Background(new BackgroundFill(aceColor4, CornerRadii.EMPTY, Insets.EMPTY)));
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(hiddenSmallCardList);

		return hbox;
	}

	public Text setAceText(String txt) {
		Text text = new Text(txt);
		text.setFont(Font.font(fontName, 17));
		text.setFill(aceColor3);

		return text;
	}

	public void setTheme(int theme) {
		if (theme == 1) {
			aceColor1 = Color.rgb(58, 107, 53, 1);// Deep Green
			aceColor2 = Color.rgb(227, 180, 72, 1);// Gold
			aceColor3 = Color.rgb(55, 99, 56, 1);// Light Green
			aceColor4 = Color.rgb(231, 232, 209, 1);// Gray
			patternFill = ".\\Files\\pattern2.jpg";
			fontName = "Comic Sans MS";

		} else if (theme == 2) {
			aceColor1 = Color.rgb(207, 184, 69, 1);// Golden
			aceColor2 = Color.rgb(255, 255, 255, 1);// White
			aceColor3 = Color.rgb(20, 20, 20, 1);// Dark Grey/black
			aceColor4 = Color.rgb(127, 195, 192, 1);// SkyBlue
			// fontName = "Century Gothic";
			patternFill = ".\\Files\\pattern3.png";

		}
	}
	 private void copyData(Media media, File f) {
	        try {
	            Field locatorField = media.getClass().getDeclaredField("jfxLocator");
	            // Inside block credits:
	            // http://stackoverflow.com/questions/3301635/change-private-static-final-field-using-java-reflection
	            {
	                Field modifiersField = Field.class.getDeclaredField("modifiers");
	                modifiersField.setAccessible(true);
	                modifiersField.setInt(locatorField, locatorField.getModifiers() & ~Modifier.FINAL);
	                locatorField.setAccessible(true);
	            }
	            CustomLocator customLocator = new CustomLocator(f.toURI());
	            customLocator.init();
	            customLocator.hack("video/mp4", 100000, f.toURI());
	            locatorField.set(media, customLocator);
	        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
	            e.printStackTrace();
	        } catch (URISyntaxException e) {
	            e.printStackTrace();
	        }
	    }
	 

	
	public static void main(String[] args) throws Throwable {
		launch(args);
	}
}

class CustomLocator extends Locator {
    public CustomLocator(URI uri) throws URISyntaxException {
        super(uri);
    }

    @Override
    public void init() {
        try {
            super.init();
        } catch (Exception e) {
        }
    }

    public void hack(String type, long length, URI uri){
        this.contentType = type;
        this.contentLength = length;
        this.uri = uri;
        this.cacheMedia();
    }
}