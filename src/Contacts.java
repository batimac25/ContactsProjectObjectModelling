import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contacts {
	private List<Contact> contact = new ArrayList();

}

class Contact {
	private Name name;
	private PhoneticName pname;
	private Organisation organisation;
	private Phone phone;
	private Email email;
	private IM im;
	private Address address;
	private Notes notes;
	private Website web;
	private Groups groupname;

}

class Name {
	private String namePrefix;
	private String firstName;
	private String middleName;
	private String lastName;
	private String nameSuffix;
	private String nickName;
}

class PhoneticName {
	private String phoneticFirstName;
	private String phoneticMiddleName;
	private String phoneticLastName;
}

class Organisation {
	private String companyName;
	private String Title;
}

class Phone {
	private int number;
	private MobileNoType numberType;
}

class Email {
	private String email;
	private EmailType type;
}

class IM {
	private String im;
	private IMType imtype;

}

class Address {
	private int zipCode;
	private ZipcodeType ziptype;
	private String state;
	private String city;
	private String neighbourhood;
	private String street;
}

class Notes {
	private String notes;
}

class Website {
	private String website;
}

class Events {
	private String eventName;
	private Date date;
}

class Relationship {
	private RelationshipType relationshipname;
}

class Groups {
	private GroupName name;
}

class MobileNoType {
	private String mobile;
	private String work;
	private String home;
	private String main;
	private String workFax;
	private String homeFax;
	private String other;
	private Custom custom;
}

class EmailType {
	private String work;
	private String home;
	private String other;
	private Custom custom;
}

class IMType {
	private String aim;
	private String windowsLive;
	private String yahoo;
	private String skype;
	private String qq;
	private String hangouts;
	private String icq;
	private String jabber;
	private Custom custom;
}

class ZipcodeType {
	private String work;
	private String home;
	private String other;
	private Custom custom;
}

class RelationshipType {
	private String assistant;
	private String brother;
	private String child;
	private String domesticPartner;
	private String father;
	private String friend;
	private String manager;
	private String mother;
	private String parent;
	private String relative;
	private String sister;
	private String spouse;
	private Custom custom;
}

class GroupName {
	private String friends;
	private String family;
	private String coworkers;
	private Custom createNewGroup;
}

class Custom {
	private String customName;
}