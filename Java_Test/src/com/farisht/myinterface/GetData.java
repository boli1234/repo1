package com.farisht.myinterface;

public class GetData
{
	public MyInterface myInterface = null;
	public String name = null;
	public String passwd = null;
	
	public GetData(String name, String passwd, MyInterface myInterface)
	{
		this.name = name;
		this.passwd = passwd;
		this.myInterface = myInterface;
	}
	
    public void getData()
    {
	   if(myInterface.login(name, passwd))
	   {
		   System.out.println("开始获取服务器数据.......");
	   }
    }
}
