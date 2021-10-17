package com.intellij;

import org.w3c.dom.Text;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {

        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;}

    public void clear() {
            text = "";}
}
