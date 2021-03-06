/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author kemery
 */
public class TextPanel extends JPanel {
    
    private JTextArea textArea;
    
    public TextPanel() {
        
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
        
        textArea = new JTextArea();
        
        setLayout(new BorderLayout());
        
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    
    
    public void appendText(String text)
    {
        textArea.append(text);
    }
    
}
