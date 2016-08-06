package br.gov.ms.conep.institution;

import java.awt.SystemColor;

public class CEPCantHaveSubordinatedInstitutions extends InstitutionCantHaveSubordinatedException {
	
	private static String property = System.getProperty("#TEXT1");
	
	public CEPCantHaveSubordinatedInstitutions() {
		super(property);
	}
}
