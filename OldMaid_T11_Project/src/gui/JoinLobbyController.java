package gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import game.Main;


import java.net.URL;
import java.util.ResourceBundle;

public class JoinLobbyController implements Initializable {

    @FXML
    public Button joinBackButton;
    @FXML
    TableColumn nameCol;
    Main m= new Main();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public void backToServerMenu(ActionEvent event)throws Exception{
        m.changeScene("../src.gui/ServerMenu.fxml");
    }
}
