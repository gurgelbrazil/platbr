package br.gov.ms.conep.institution;

public class InstitutionCantHaveSubordinatedException extends Exception {
	protected String reason = null; 
	
	public InstitutionCantHaveSubordinatedException(String reason){
		this.reason = reason;
	}
	
	public String getReason(){
		return reason;
	}
	
	public String toString(){
		return reason;
	}
}
