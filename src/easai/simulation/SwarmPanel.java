package easai.simulation;
// SwarmPanel.java  -- Class SwarmPanel draws the swarm of dots.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:34:00 2014
// Keywords: 

// Commentary:
//
//
//

// Code:

import java.awt.*;
import javax.swing.*;

public class SwarmPanel extends JPanel implements Runnable {
	int nDots = 10;
	int maxX = 500;
	int maxY = 500;
	Dot[] dotList = new Dot[nDots];
	Thread thread;

	SwarmPanel() {
		for (int i = 0; i < nDots; i++) {
			dotList[i] = new Dot();
		}
		thread = new Thread(this);
		thread.start();
	}

	public void paint(Graphics g) {
		int width = getWidth();
		int height = getWidth();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.gray);
		for (int i = 0; i < nDots; i++) {
			Dot dot = dotList[i];
			g.fillRect((int) (dot.x * maxX), (int) (dot.y * maxY), 10, 10);
		}
	}

	public void run() {
		Thread current = Thread.currentThread();
		while (current == thread) {
			for (int i = 0; i < nDots; i++) {
				Dot dot = dotList[i];
				dot.move();
			}
			repaint();
			try {
				thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

// SwarmPanel.java ends here
