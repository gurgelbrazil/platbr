package br.gov.ms.conep.user;

import br.gov.ms.conep.institution.Institution;
import br.gov.ms.conep.localization.Address;
import br.gov.ms.conep.localization.AddressBean;
import br.gov.ms.conep.localization.PhoneNumber;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserBean
 *
 */

@Entity
@Table(name="TB_USER")
@SequenceGenerator(name="CO_SEQ_USER", sequenceName="CO_SEQ_USER", allocationSize=1, initialValue=0)
public class UserBean implements Serializable, User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 287845875813117084L;
		
	@Id //signifies the primary key
    @Column(name = "CO_SEQ_USER", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)	
	private Long   userId;

	@Column(name = "CO_NAME", nullable = false, length = 200)
	private String name;
	
	@Column(name = "CO_PRIMEIRO_NOME", nullable = false,length = 100)
	private String firstName;
	
	@Column(name = "CO_ULTIMO_NOME", nullable = false,length = 100)
	private String lastName;
	
	@Column(name = "CO_SOCIAL_NAME", nullable = false,length = 200)
	private String socialName;
	
	@Column(name = "CO_BIRTH_COUNTRY", nullable = false,length = 50)
	private String birthCountry;
	
	@Column(name = "CO_BIRTH_CITY", nullable = false,length = 50)
	private String birthCity;
	
	@Column(name = "CO_BIRTH_DATE")
	private String birthDate;
		
	private ID identification; 	
		
	@OneToMany(targetEntity=AddressBean.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Map<String, Address> 	 addresses;
	
	private Map<String, PhoneNumber> phoneNumbers;
	private Map<String, Institution> institutions;

	@Override
	public String getPlaceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public String getSocialName() {
		return socialName;
	}

	@Override
	public void setSocialName(String socialName) {
		this.socialName = socialName;
		
	}

	@Override
	public Map<String, Address> getAddresses() {
		return addresses;
	}

	@Override
	public void addAddress(Address address, String addressDescription) {
		this.addresses.put(addressDescription, address);
	}

	@Override
	public Map<String, PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	@Override
	public void addPhoneNumber(String phoneDescription, PhoneNumber phoneNumber) {
		this.phoneNumbers.put(phoneDescription, phoneNumber);		
	}
	
	@Override
	public void setPhoneNumbers(Map<String, PhoneNumber> phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public void addInstitutions(Institution institution, String associationType) {
		this.institutions.put(associationType, institution);
	}

	@Override
	public Map<String, Institution> getInstitutions() {

		return null;
	}

	@Override
	public ID getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setID(ID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBirthCountry(String birthCountry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBirthCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBirthCity(String city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBirthCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getBirthDate() {
		return null;
	}

	@Override
	public void setBirthDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getUserID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserID(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
   
	@Override
	public Long getUserId() {
		return userId;
	}

	@Override	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override	
	public ID getIdentification() {
		return identification;
	}
	
	@Override	
	public void setIdentification(ID identification) {
		this.identification = identification;
	}		
}
