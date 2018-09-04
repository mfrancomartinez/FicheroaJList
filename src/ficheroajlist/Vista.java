/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroajlist;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Vista extends VistaAbstracta{
    
    JFrame marco;
    JPanel panel;
    JList lista;
    DefaultListModel listmodel;
    
    public Vista(){
    
        marco = new JFrame();
        marco.setSize (500,500);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel = (JPanel) marco.getContentPane();
        listmodel = new DefaultListModel();
        lista = new JList();
        panel.add(lista);
        lista.setBounds(50,50, 300, 300);
    
}
    

    @Override
    public void visualizar() {
        for (int i = 0; i<modelo.size(); i++){
            listmodel.add(i, modelo.get(i));
        }
        lista.setModel(listmodel);
    }
    
}
