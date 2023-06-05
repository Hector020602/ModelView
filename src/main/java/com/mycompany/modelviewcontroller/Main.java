/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelviewcontroller;

/**
 *
 * @author alu10571073
 */
public class Main {

    public static void main(String args[]) {
        Model m = new Model();
        View v = new View();
        new Controller(v,m);
    }
}

