package com.farsight.module;

public class SuperHero extends Hero
{
    public String superKong = null;
    
    public SuperHero(String name,int age, String sex, double height, String superKong)
    {
    	setName(name);
    	setAge(age);
    	setSex(sex);
    	setHeight(height);
    	this.superKong = superKong;
    }
    
    public void printAll()
    {
    	System.out.println("name="+name);
    	System.out.println("superKong="+superKong);
    }
}
