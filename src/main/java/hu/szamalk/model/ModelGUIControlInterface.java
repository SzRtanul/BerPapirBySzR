/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hu.szamalk.model;

/**
 *
 * @author Roland
 */
public interface ModelGUIControlInterface {
    void doUpdate();
    boolean doKuld(int nevHely);
    void doUpdateOneElement(int where);
    boolean isKuldheto(int nevHely);
}
