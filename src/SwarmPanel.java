// SwarmPanel.java  -- Class SwarmPanel draws the swarm of dots.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:34:00 2014
// Keywords: 

// This file is not part of GNU Emacs.

// SwarmPanel.java is free software; you can redistribute it and/or modify
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

public class SwarmPanel extends JPanel implements Runnable
{
    int nDots=10;
    int maxX=500;
    int maxY=500;
    Dot [] dotList=new Dot[nDots];
    Thread thread;

    SwarmPanel()
    {
	for(int i=0;i<nDots;i++)
	    {
		dotList[i]=new Dot();
	    }
	thread=new Thread(this);
	thread.start();
    }
    
    public void paint(Graphics g)
    {
	int width=getWidth();
	int height=getWidth();
	g.setColor(Color.white);
	g.fillRect(0,0,width,height);
	g.setColor(Color.gray);
	for(int i=0;i<nDots;i++)
	    {		
		Dot dot=dotList[i];
		g.fillRect((int)(dot.x*maxX),(int)(dot.y*maxY),10,10);
	    }
    }
    
    public void run()
    {
	Thread current=Thread.currentThread();
	while(current==thread)
	    {
		for(int i=0;i<nDots;i++)
		    {
			Dot dot=dotList[i];
			dot.move();
		    }
		repaint();
		try
		    {
			thread.sleep(100);
		    }
		catch(Exception e)
		    {
			e.printStackTrace();
		    }
	    }
    }
}

// SwarmPanel.java ends here
