/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelviewcontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alu10571073
 */
public class Controller implements ActionListener {
	private Model model;
	private View view;
	
	private int result=0;

	public Controller(View v, Model m) {
		model = m;
		view = v;
		view.setActionListener(this);
		//actionListenerMeth(this);// add action listener to the Button
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			// retrieve the input from View
			String a = view.getValue1();
			String b = view.getValue2();

			// call add method
			result = model.add(a, b);

			// display result in View(UI)
			updateView();
			
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
	public void updateView() {
		view.setResult("" + result);
	}


}
