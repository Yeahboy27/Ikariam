package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import sample.model.TownHallModel.*;

import java.awt.*;

public class TownHall {
    @FXML private GridPane gridPane;
    @FXML private TextField numberofUnit;
    @FXML private Label typeUnit;
    @FXML public ChoiceBox townHallLevelBox;
    @FXML public  ChoiceBox wallLevelBox;
    @FXML public ChoiceBox typeBox;
    @FXML public Button saveButton;
    public void setUpValue() {
        setTownHallLevel(40);
    }

    public void setTownHallLevel(int level) {
        for(int i = 0; i < level; i++) {
            townHallLevelBox.getItems().add("" + i);
        }
    }

    public  void setWallLevel(int level) {
        for(int i = 0; i < level; i++) {
            wallLevelBox.getItems().add("" + i);
        }
    }

    public void setTypeUnit(TypeTown type) {
        typeBox.getItems().add(TypeTown.myTown);
        typeBox.getItems().add(TypeTown.allianceTowns);
        typeBox.getItems().add(TypeTown.garrisonTowns);
        typeBox.getItems().add(TypeTown.playerTowns);
    }

    @FXML protected void saveAction(ActionEvent event) {
        townHallLevelBox.setDisable(true);
        wallLevelBox.setDisable(true);
        typeBox.setDisable(true);
        saveButton.setDisable(true);
        saveButton.setVisible(false);
        System.out.print("Save Action");
    }

    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }
}



