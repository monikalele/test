package com.moni.sample;

public class calculator {
service s;

public int add(int i,int j)
{
	return s.calc(i,j);
}

public calculator(service s) {
	super();
	this.s = s;
}

}
