package com.farsight.java_test;

public class MyString
{
	//��Ա����
	public String name1 = "shenshelin";
	public String name2 = null;
	
	//���췽��
	public MyString()
	{
		System.out.print("����һ���޲ι��췽��.....");
	}
	
	public MyString(String name)
	{
		System.out.print("����һ���вι��췽��.....");
		name2 = name;
	}

	//��Ա����
	public void printMyString()
	{
		if (name1 == name2) // �Աȵ�ַ
		{
			System.out.println("name1=name2");
		}
		if (name1.equals(name2)) // �Ƚ�����
		{
			System.out.println("name1 equal name2");
		}
		System.out.println("substring = " + name1.substring(2));
		System.out.println("indexof = " + name1.indexOf("n"));
	}
}
