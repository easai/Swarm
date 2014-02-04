// Dot.java  -- Class Dot represents a dot.

// Copyright (c) 2014 easai

// Author: easai 
// Created: Tue Feb  4 07:32:01 2014
// Keywords: 

// This file is not part of GNU Emacs.

// Dot.java is free software; you can redistribute it and/or modify
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


public class Dot
{
    double x;
    double y;
    
    Dot()
    {
	init();
    }
    public void init()
    {
	this.x=Math.random();
	this.y=Math.random();
    }
    public void move()
    {
	this.x+=Math.random()*.1;
	this.y+=Math.random()*.1;
    }
}

// Dot.java ends here
