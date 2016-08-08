package br.gov.ms.conep.user;

import java.util.Date;
import java.util.Map;

import br.gov.ms.conep.institution.Institution;
import br.gov.ms.conep.localization.Address;
import br.gov.ms.conep.localization.Localizable;
import br.gov.ms.conep.localization.PhoneNumber;

public interface User extends Localizable{

	ID getIdentification();

	String getName();

	void setName(String name);

	String getSocialName();

	void setSocialName(String socialName);

	Map<String, Address> getAddresses();

	void addAddress(Address address, String addressDescription);

	Map<String, PhoneNumber> getPhoneNumbers();

	void addPhoneNumber(String phoneDescription, PhoneNumber phoneNumber);

	void setPhoneNumbers(Map<String, PhoneNumber> phoneNumbers);

	void addInstitutions(Institution institution, String associationType);

	Map<String, Institution> getInstitutions();

	ID getID();

	void setID(ID id);

	void setBirthCountry(String birthCountry);

	String getBirthCountry();

	void setBirthCity(String city);

	String getBirthCity();

	Date getBirthDate();

	void setBirthDate(Date date);

	Long getUserID();

	String getFirstName();

	void setIdentification(ID identification);

	void setUserId(Long userId);

	Long getUserId();

	void setFirstName(String firstName);

	void setLastName(String lastName);

	void setUserID(Long userId);

	String getLastName();

}
