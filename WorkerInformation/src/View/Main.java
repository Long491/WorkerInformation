/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Manager;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Add worker.", "Increase salary for worker.", "Decrease for worker.", "Show adjusted salary worker information."};
        Manager w = new Manager("====== WORKER MANAGEMENT =======", mChon,"Exit.");
        w.run();
        }
}