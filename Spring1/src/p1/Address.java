package p1;

public class Address 
{
String city;
String street;
String state;
String country;
public Address(String city, String street, String state, String country) {
	super();
	this.city = city;
	this.street = street;
	this.state = state;
	this.country = country;
}
public String toString()
{
	return city+" "+street+" "+state+" "+country;
	}
}
