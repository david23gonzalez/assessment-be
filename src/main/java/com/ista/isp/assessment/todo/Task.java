/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.isp.assessment.todo;

/**
 *
 * @author david
 */
public class Task {
    
    private Boolean check;
    private String text;
    private String style;

    public Task(Boolean check, String text, String style) {
        this.check = check;
        this.text = text;
        this.style = style;
    }   
    

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    
    
    
}
