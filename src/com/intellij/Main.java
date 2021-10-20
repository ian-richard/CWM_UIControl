package com.intellij;



public class Main {

    public static void main(String[] args) {
       UIControl[] controls = { new TextBox(), new Checkbox()};
       for (var control : controls){
            control.render();
       }

    }


}
