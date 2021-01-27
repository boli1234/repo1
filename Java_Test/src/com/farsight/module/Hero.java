package com.farsight.module;

public class Hero
{
	// 普通代码块
	{
		System.out.println("我是代码块.............");
	}

	// 静态代码块 --- 用来加载动态库
	static
	{
		System.out.println("我是静态代码块.............");
	} 

	// 成员变量
    protected String name;
	private int age;
	private String sex;
	private double height;

	// 无参数构造方法---每创建一个对象都会调用
	public Hero()
	{
		System.out.println("无参构造方法.............");
	}

	// 有参构造方法---每创建一个对象都会调用
	public Hero(String name, int age, String sex, double height)
	{
		System.out.println("有参构造方法.............");
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}

	// 成员函数
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public void printAll()
	{
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("sex=" + sex);
		System.out.println("height=" + height);
	}

	// 普通成员方法可以访问静态成员变量
	public int getStaticVar1()
	{
		return a;
	}

	// 静态成员变量(类变量)
	public static int a;

	// 静态成员方法,不能访问非静态的成员变量
	public static void getStaticVar2()
	{
		System.out.println(a);
	}

	// 内部类
	public class FockHero
	{
		public String name = null;
		public String sepcialFarv = null;

		public FockHero(String name, String sepcialFarv)
		{
			this.name = name;
			this.sepcialFarv = sepcialFarv;
		}

		public void printALL()
		{
			System.out.println("this.sepcialFarv" + sepcialFarv);
			System.out.println("this.name=" + name);
			System.out.println("Hero.name=" + Hero.this.name);
		}
	}

	public int getSum(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public short getSum(short a, short b)
	{
		return (short) (a + b);
	}
}
