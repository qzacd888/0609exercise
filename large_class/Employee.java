package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;

    public setOfficeExtensionNumber(String officeExtensionNumber)
    {     
        _officeExtensionNumber = officeExtensionNumber;
    }
	public setOfficeNumber(String officeNumber){
		_officeNumber = officeNumber;
	}
	public setOfficeAreaCode(String officeAreaCode){
		_officeAreaCode = officeAreaCode;
	}
	public setName(String name){
		_name = name;
	}
	

    public String getTelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }

    public String getName()
    {
        return _name;
    }
}