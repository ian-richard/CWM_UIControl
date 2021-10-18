package com.intellij;



public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);

    }

    private static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("Hello ");
        }


        System.out.println(control);
    }
}
