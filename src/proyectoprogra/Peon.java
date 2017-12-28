/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import javax.swing.ImageIcon;

/**
 *
 * @author Dash
 */
public class Peon extends Pieza {

    public Peon(int posx, int posy, int x, int y, int bando) {
        super(bando, posx, posy, x, y);
        if (bando == BLANCAS) {
            this.setIcon(new ImageIcon("src/Images/peon2.png"));
        } else {
            this.setIcon(new ImageIcon("src/Images/peon.png"));
        }
    }

    @Override
    boolean validarMovimiento(int newx, int newy) {
        if (bando == BLANCAS) {
            if (x == newx && y != newy) {
                System.out.println("X " +  x + " Y " + y + "NewX " + newx + "NewY " +newy );
                return true;
            }
        } else {
            if (x == newx) {
                return true;
            }
        }
        return false;
    }

}
