package br.gov.ms.conep.localization;

public interface Address {

	public String getStreet();

	public String getNumber();

	public String getComplementaryInformation();

	public String getArea();

	public String getCity();

	public String getState();

	public String getCountry();

	public Boolean getMainAddress();

	public Boolean isMainAddress();

	public Integer getAddressType();

	public void setStreet(String street);

	public void setNumber(String number);

	public void setComplementaryInformation(String complementaryInformation);

	public void setArea(String area);

	public void setCity(String city);

	public void setState(String state);

	public void setCountry(String country);

	public void setMainAddress(Boolean isMainAddress);

	public void setAddressType(Integer addressType);

}
