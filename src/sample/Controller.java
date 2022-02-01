package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField InputNumbersOfSymbols;

    @FXML
    private Button OKButton;
    @FXML
    private Button CancelButton;

    @FXML
    private CheckBox Numbers;

    @FXML
    private CheckBox UpperLetter;

    @FXML
    private CheckBox LowerLetter;

    @FXML
    private CheckBox SpecialSymbols;

    @FXML
    private TextArea OutputPassword;

    @FXML
    public void buttonOKClicked(){
        try {
            PasswordMaker maker = new PasswordMaker(Integer.parseInt(   InputNumbersOfSymbols.getText()),
                                                                        Numbers.isSelected(),
                                                                        UpperLetter.isSelected(),
                                                                        LowerLetter.isSelected(),
                                                                        SpecialSymbols.isSelected());
            OutputPassword.setText( maker.shuffleSymbols(maker.formPassword()) + '\n' +
                                    maker.shuffleSymbols(maker.formPassword()) + '\n' +
                                    maker.shuffleSymbols(maker.formPassword()) + '\n' +
                                    maker.shuffleSymbols(maker.formPassword()) + '\n' +
                                    maker.shuffleSymbols(maker.formPassword()));

            } catch(NumberFormatException e) {
            OutputPassword.setText("Invalid input. Please input numbers. Thanks");
            } catch (IllegalArgumentException e) {
            OutputPassword.setText("Invalid input. Please choose any tokens. Thanks");
        }
    }

    @FXML
    public void closeApp(){
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void clearTextField(){
        OutputPassword.setText("");
    }
}
