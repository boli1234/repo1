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
        //��������������ʾ
        Basic_Type basic_Type = new Basic_Type();
        basic_Type.getBasicType();
		
        //String������ʾ
        //����4����  1. ��ջ�ϴ�������myString   2. �ڶ��ϴ���һ��new MyString����    3. ������Ĺ��췽��
        MyString myString = new MyString("shenshelin");
        myString.printMyString();
        
        //Array������������������ʾ
        ArrayTest1 arrayTest1 = new ArrayTest1();
        arrayTest1.printArray();
        
        //Array�Զ���������������ʾ
        ArrayTest2 arrayTest2 = new ArrayTest2();
        arrayTest2.printArray();
        
        //��ά������ʾ
        ArrayTest3 arrayTest3 = new ArrayTest3();
        arrayTest3.printArray();
        
        //�Զ��������ʾ
        Hero hero = new Hero("�Ħ��",45,"��",1.75);
        hero.printAll();
        
        //�ڲ�����ʾ
        Hero.FockHero fockHero = hero.new FockHero("Ľ�ݸ�", "����֢....");
        fockHero.printALL();
        
        //������ʾ
        SuperHero superHero = new SuperHero("ɨ����ɮ",100, "��", 180, "������ǽ.....");
        superHero.printAll();
        
        ImplentInterface implentInterface = new ImplentInterface();
        GetData getData = new GetData("farsight", "123456", implentInterface);
        getData.getData();
        		
        
	}
}
