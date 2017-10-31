/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamegittest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Kent Juul
 */
public class MainWindowController implements Initializable
{
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("I SAID GOOD DAY");
        label.setText("Gå nu væk");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
