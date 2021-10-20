package com.intellij;

public class UIControl {
    boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
////        this.isEnabled = isEnabled;
////        System.out.println("UIControl");
//    }

    public void render () {

    }

    public void enabled(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
