package br.gov.ms.conep.localization;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AddressBean
 *
 */
@Entity
@Table(name = "TB_ADDRESS")
public class AddressBean implements Serializable, Address {
	
	@Id //signifies the primary key
    @Column(name = "CO_SEQ_ADDRESS", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)		
	private Long addressID;

    @Column(name = "DS_RUA", nullable = false, length = 100)
	private String 	street;	
	@Column(name = "DS_NUMERO", nullable = false, length = 100)
	private String 	number;
	@Column(name = "DS_COMPLEMENTAR", nullable = false, length = 100)	
	private String 	complementaryInformation;	
	@Column(name = "DS_AREA", nullable = false, length = 100)
	private String 	area;
	
	//Needs to change to an Object called CITY and map to the table (TB_MUNICIPIO)
	@Column(name = "CO_CIDADE", nullable = false, length = 100)	
	private String 	city;
	
	//Needs to change to an Object called CITY and map to the table (TB_UF)
	@Column(name = "CO_CIDADE", nullable = false, length = 100)
	private String 	state;
	
	//Needs to change to an Object called CITY and map to the table (TB_UF)
	@Column(name = "CO_PAIS", nullable = false, length = 100)
	private String 	country;
	
	//1 - Residencia; 2 - Comercial
	@Column(name = "CO_TIPO_DE_ENDERECO", nullable = false, length = 100)	
	private Integer addressType;	
		
	@Column(name = "ST_ENDERECO_PRINCIPAL", nullable = false, length = 100)
	private Boolean isMainAddress;
	
	
	private static final long serialVersionUID = 1L;

	public AddressBean() {
		super();
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public String getComplementaryInformation() {
		return complementaryInformation;
	}

	@Override
	public String getArea() {
		return area;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public Boolean getMainAddress() {
		return isMainAddress;
	}

	@Override
	public Boolean isMainAddress() {
		return isMainAddress;
	}	
	
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	@Override
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void setComplementaryInformation(String complementaryInformation) {
		this.complementaryInformation = complementaryInformation;
	}

	@Override
	public void setArea(String area) {
		this.complementaryInformation = area;
	}

	@Override
	public void setCity(String city) {
		this.complementaryInformation = area;	
	}

	@Override
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;		
	}

	@Override
	public void setMainAddress(Boolean isMainAddress) {
		this.isMainAddress = isMainAddress;		
	}

	@Override
	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}
}
