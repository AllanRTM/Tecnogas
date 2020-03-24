/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.security.KeyStore;
import javax.management.BadAttributeValueExpException;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author radioshack
 */
public class limitar extends PlainDocument{
    private JTextField editor;
    private int max;
 

    public limitar(JTextField editor, int max) {
        this.editor = editor;
        this.max = max;
        
    }

    
    public void insertString(int arg0,String arg1,AttributeSet arg2)throws BadLocationException {
        if (editor.getText().length()+arg1.length()>this.max) {
            
     return;
        }super.insertString(arg0, arg1, arg2);
        
   

    }
}
