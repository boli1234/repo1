package com.farsight.java_test;

import com.farsight.module.Hero;

public class ArrayTest2
{
    public Hero array[] = null;
    
    public ArrayTest2()
    {
    	array = new Hero[3];
    	
        Hero hero1 = new Hero();
        hero1.setName("Ïô·å");
        hero1.setAge(32);
        hero1.setSex("ÄÐ");
        hero1.setHeight(1.80);
        array[0]=hero1;
        
        Hero hero2 = new Hero();
        hero2.setName("ÐéÖñ");
        hero2.setAge(24);
        hero2.setSex("ÄÐ");
        hero2.setHeight(1.78);
        array[1]=hero2;
        
        Hero hero3 = new Hero();
        hero3.setName("¶ÎÓþ");
        hero3.setAge(20);
        hero3.setSex("ÄÐ");
        hero3.setHeight(1.75);
        array[2]=hero3;
    }
    
	public void printArray()
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("array[" + i + "].name" + array[i].getName());
			System.out.println("array[" + i + "].sex" + array[i].getSex());
			System.out.println("array[" + i + "].age" + array[i].getAge());
			System.out.println("array[" + i + "].height" + array[i].getHeight());
		}
	}
}
