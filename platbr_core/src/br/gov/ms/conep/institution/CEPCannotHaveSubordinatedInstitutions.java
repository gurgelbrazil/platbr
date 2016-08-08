package br.gov.ms.conep.institution;

public class CEPCannotHaveSubordinatedInstitutions extends InstitutionCannotHaveSubordinatesException {
	
	private static String property = System.getProperty("#TEXT1");
	
	public CEPCannotHaveSubordinatedInstitutions() {
		super(property);
	}
}
