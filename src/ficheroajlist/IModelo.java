/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroajlist;

import java.util.List;

/**
 *
 * @author admin
 */
public interface IModelo {
    public List <String> leer();
    public String get(int posicion);
    public int size ();
}
