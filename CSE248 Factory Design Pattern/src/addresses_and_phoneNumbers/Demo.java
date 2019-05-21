    
package addresses_and_phoneNumbers;

public class Demo {

	public static void main(String[] args) {
		USAddressFactory usAddressFactory = new USAddressFactory();
		Address usAddress = usAddressFactory.createAddress();
		Phone usPhone = usAddressFactory.createPhoneNumber();
		usAddress.setStreet("1 Main Street");
		usAddress.setCity("Selden");
		usAddress.setRegion("NY");
		usAddress.setPostalCode("11784");
		String address = usAddress.getFullAddress();
		System.out.println(address);
	}

}