package com.farsight.module;

public class Hero
{
	// ��ͨ�����
	{
		System.out.println("���Ǵ����.............");
	}

	// ��̬����� --- �������ض�̬��
	static
	{
		System.out.println("���Ǿ�̬�����.............");
	} 

	// ��Ա����
    protected String name;
	private int age;
	private String sex;
	private double height;

	// �޲������췽��---ÿ����һ�����󶼻����
	public Hero()
	{
		System.out.println("�޲ι��췽��.............");
	}

	// �вι��췽��---ÿ����һ�����󶼻����
	public Hero(String name, int age, String sex, double height)
	{
		System.out.println("�вι��췽��.............");
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}

	// ��Ա����
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

	// ��ͨ��Ա�������Է��ʾ�̬��Ա����
	public int getStaticVar1()
	{
		return a;
	}

	// ��̬��Ա����(�����)
	public static int a;

	// ��̬��Ա����,���ܷ��ʷǾ�̬�ĳ�Ա����
	public static void getStaticVar2()
	{
		System.out.println(a);
	}

	// �ڲ���
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
