// Swarm.java  -- Class Swarm defines JFrame derivative for Swarm.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:33:33 2014
// Keywords: 

// This file is not part of GNU Emacs.

// Swarm.java is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.

// This software is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program; see the file COPYING.  If not, write to the
// Free Software Foundation, Inc., 59 Temple Place - Suite 330,
// Boston, MA 02111-1307, USA.

// Commentary:
//
//
//

// Code:


import java.awt.*;
import javax.swing.*;

public class Swarm extends JFrame
{
    SwarmPanel panel;

    Swarm()
    {
	panel=new SwarmPanel();
	getContentPane().add(panel);
	setTitle("Swarm");
	setSize(500,500);
	setVisible(true);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public static void main(String args[])
    {
	Swarm swarm=new Swarm();
    }    
}

// Swarm.java ends here
