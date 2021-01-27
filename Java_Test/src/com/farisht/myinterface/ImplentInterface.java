package com.farisht.myinterface;

public class ImplentInterface implements MyInterface
{
	@Override
	public boolean login(String name, String passwd)
	{
		if("farsight".equals(name) && "123456".equals(passwd))
			return true;
		return false;
	}
}
