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
    
    private double one;
    private double two;
   
    
    @FXML
    public void add() {
        this.getInput();
        
        output.setText(Double.toString(this.one+this.two));
    }
    
    @FXML
    public void multiply() {
        this.getInput();
        
        output.setText(Double.toString(this.one*this.two));
    } 
    
    @FXML
    public void subtract() {
        this.getInput();
        
        output.setText(Double.toString(this.one-this.two));
    }
    
    @FXML
    public void divide() {
        this.getInput();
        
        output.setText(Double.toString(this.one/this.two));
        
    }
    
    private void getInput() {
        String first = input1.getText();
        String second = input2.getText();
        
        this.one = Double.parseDouble(first);
        this.two = Double.parseDouble(second);
    }
   
}
