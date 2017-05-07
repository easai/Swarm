package easai.simulation;
// Dot.java  -- Class Dot represents a dot.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:32:01 2014
// Keywords: 

// Commentary:
//
//
//

// Code:

public class Dot {
	double x;
	double y;

	Dot() {
		init();
	}

	public void init() {
		this.x = Math.random();
		this.y = Math.random();
	}

	public void move() {
		this.x += Math.random() * .1;
		this.y += Math.random() * .1;
	}
}

// Dot.java ends here
