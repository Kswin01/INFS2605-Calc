/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package au.edu.unsw.infs2605.starterkit;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author krishnanwinter
 */
public class calController {
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;
    @FXML
    private TextField output;
    
    @FXML
    public void add() {
        String first = input1.getText();
        String second = input2.getText();
        
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);
        
        output.setText(Double.toString(one+two));
    }
    
    @FXML
    public void multiply() {
        String first = input1.getText();
        String second = input2.getText();
        
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);
        
        output.setText(Double.toString(one*two));
        
    } 
    
    @FXML
    public void subtract() {
        String first = input1.getText();
        String second = input2.getText();
        
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);
        
        output.setText(Double.toString(one-two));
    }
    
    @FXML
    public void divide() {
        String first = input1.getText();
        String second = input2.getText();
        
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);
        
        output.setText(Double.toString(one/two));
        
    }
   
}
