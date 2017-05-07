package easai.simulation;
// Swarm.java  -- Class Swarm defines JFrame derivative for Swarm.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:33:33 2014
// Keywords: 

// Commentary:
//
//
//

// Code:

import java.awt.*;
import javax.swing.*;

public class Swarm extends JFrame {
	SwarmPanel panel;

	Swarm() {
		panel = new SwarmPanel();
		getContentPane().add(panel);
		setTitle("Swarm");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String args[]) {
		Swarm swarm = new Swarm();
	}
}

// Swarm.java ends here
