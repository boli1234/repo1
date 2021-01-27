package com.farsight.java_test;

public class MyString
{
	//成员变量
	public String name1 = "shenshelin";
	public String name2 = null;
	
	//构造方法
	public MyString()
	{
		System.out.print("我是一个无参构造方法.....");
	}
	
	public MyString(String name)
	{
		System.out.print("我是一个有参构造方法.....");
		name2 = name;
	}

	//成员方法
	public void printMyString()
	{
		if (name1 == name2) // 对比地址
		{
			System.out.println("name1=name2");
		}
		if (name1.equals(name2)) // 比较内容
		{
			System.out.println("name1 equal name2");
		}
		System.out.println("substring = " + name1.substring(2));
		System.out.println("indexof = " + name1.indexOf("n"));
	}
}
