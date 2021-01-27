package com.farsight.main;

import com.farisht.myinterface.GetData;
import com.farisht.myinterface.ImplentInterface;
import com.farsight.java_test.ArrayTest1;
import com.farsight.java_test.ArrayTest2;
import com.farsight.java_test.ArrayTest3;
import com.farsight.java_test.Basic_Type;
import com.farsight.java_test.MyString;
import com.farsight.module.Hero;
import com.farsight.module.SuperHero;

public class TestMain
{
	public static void main(String[] args)
	{
        //基本数据类型演示
        Basic_Type basic_Type = new Basic_Type();
        basic_Type.getBasicType();
		
        //String类型演示
        //做了4件事  1. 在栈上创建变量myString   2. 在堆上创建一个new MyString对象    3. 调用类的构造方法
        MyString myString = new MyString("shenshelin");
        myString.printMyString();
        
        //Array基本数据类型数组演示
        ArrayTest1 arrayTest1 = new ArrayTest1();
        arrayTest1.printArray();
        
        //Array自定义类类型数组演示
        ArrayTest2 arrayTest2 = new ArrayTest2();
        arrayTest2.printArray();
        
        //二维数组演示
        ArrayTest3 arrayTest3 = new ArrayTest3();
        arrayTest3.printArray();
        
        //自定义类的演示
        Hero hero = new Hero("鸠摩智",45,"男",1.75);
        hero.printAll();
        
        //内部类演示
        Hero.FockHero fockHero = hero.new FockHero("慕容复", "妄想症....");
        fockHero.printALL();
        
        //子类演示
        SuperHero superHero = new SuperHero("扫地神僧",100, "男", 180, "三尺气墙.....");
        superHero.printAll();
        
        ImplentInterface implentInterface = new ImplentInterface();
        GetData getData = new GetData("farsight", "123456", implentInterface);
        getData.getData();
        		
        
	}
}
