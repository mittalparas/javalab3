package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    public TextArea TextAreaUsername;
    @FXML
    public TextArea TextAreaPhoneNumber;
    @FXML
    public TextArea TextAreaPostalCode;
    @FXML
    public Label OutputLabel;

    public void onsubmitButtonCliked(){
        String textUsername = TextAreaUsername.getText();
        Pattern patternUsername = Pattern.compile("^[A-Z][a-zA-Z]*$");
        Matcher matcherUsername = patternUsername.matcher(textUsername);
        StringBuilder matchesUserName = new StringBuilder();

        String textPhoneNumber = TextAreaPhoneNumber.getText();
        Pattern patternPhoneNumber = Pattern.compile("^(\\d{3} \\d{3} \\d{4}|\\(\\d{3}\\) \\d{3} \\d{4})$");
        Matcher matcherPhoneNumber = patternUsername.matcher(textPhoneNumber);
        StringBuilder matchesPhoneNumber = new StringBuilder();

        String textPostalCode = TextAreaPostalCode.getText();
        Pattern patternPostalCode = Pattern.compile("^[a-zA-Z]\\d[a-zA-Z][ -]\\d[a-zA-Z]\\d$\n");
        Matcher matcherPostalCode = patternUsername.matcher(textPostalCode);
        StringBuilder matchesPostalCode = new StringBuilder();

        while(matcherUsername.find())
        {
            matchesUserName.append(matcherUsername.group()).append("\n");
            matchesPhoneNumber.append(matcherPhoneNumber.group()).append("\n");
            matchesPostalCode.append(matcherPostalCode.group()).append("\n");
        }
        OutputLabel.setText(matchesUserName.toString() + matchesPhoneNumber.toString() + matchesPostalCode.toString());


    }
}
