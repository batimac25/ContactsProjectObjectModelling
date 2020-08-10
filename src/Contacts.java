import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.contact.Address;
import com.contact.Contact;
import com.contact.Name;

public class Contacts {
	
	public static void main(String args[]) {
		
		Set<Contact> c = new HashSet();
		
		//Contact1
		
		
		Name n = new Name();
		n.setNamePrefix("Mr");
		n.setFirstName("Anto");
		
		Address a = new Address();
		a.setZipCode(607002);
		a.setState("Tamil Nadu");
		
		Contact contact1 = new Contact();
		contact1.setName(n);
		contact1.setAddress(a);
		contact1.setNotes("sagfdg");
		
		System.out.println("Name="+contact1.getName().getNamePrefix());
		System.out.println("Notes =" + contact1.getNotes());
		
		//Contact2 
        Contact contact2 = new Contact();
		
		Name n1 = new Name();
		n1.setNamePrefix("Mr");
		n1.setFirstName("Arvind");
		
		Address a1 = new Address();
		a1.setZipCode(600012);
		a1.setState("Chennai");
		
		contact2.setName(n1);
		contact2.setAddress(a1);
		
	}

}
