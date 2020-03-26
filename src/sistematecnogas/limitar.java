/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematecnogas;

import java.security.KeyStore;
import javax.management.BadAttributeValueExpException;
import javax.swing.JComboBox;
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
    private int min;
    
    
 

    public limitar(JTextField editor, int max,int min) {
        this.editor = editor;
        this.max = max;
        this.min=min;
       
        
    }

    limitar(JComboBox<String> idcategoria, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public void insertString(int arg0,String arg1,AttributeSet arg2)throws BadLocationException {
        if (editor.getText().length()+arg1.length()>this.max ||editor.getText().length()+arg1.length()>this.min) {
            
                return;
            
        }
        super.insertString(arg0, arg1, arg2);
        
    }
    
}
