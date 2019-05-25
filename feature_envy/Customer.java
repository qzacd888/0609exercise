package com.directi.training.codesmells.featureenvy;

public class Customer
{
    private String _name;
    private Address _currentAddress;

    public Customer(String name, Address address)
    {
        _name = name;
        _currentAddress = address;
    }
	
	public string getAddress(Address address){
		string address = _currentAddress.getAddressLine1() + "\n" + _currentAddress.getAddressLine2() + "\n" +
            _currentAddress.getCity() + ", " + _currentAddress.getState() + "\n" +
            _currentAddress.getPostalCode();
	}

    public void printAddress(String address)
    {
        System.out.println(address);
    }

    //other methods related to customer class.....

}
