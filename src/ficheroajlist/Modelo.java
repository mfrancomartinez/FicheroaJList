/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroajlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Modelo extends ModeloAbstracto{
    
    private List<String> data;

    @Override
    public List <String> leer() {
        data = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(new File("file.txt"));
            InputStreamReader isr = new InputStreamReader(fis, "UTF8");
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();

            while (line != null) {
                data.add(line);
                line = br.readLine();
            }

            br.close();
        } catch (IOException ioe) {
        }
        
       vista.visualizar();
        return data;
    }

    @Override
    public String get(int posicion) {
        return data.get(posicion);
    }

    @Override
    public int size() {
        return data.size();
    }
   
}
