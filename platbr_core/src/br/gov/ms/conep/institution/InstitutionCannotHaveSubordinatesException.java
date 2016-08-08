package br.gov.ms.conep.institution;

public class InstitutionCannotHaveSubordinatesException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7784122343126985474L;
	protected String reason = null; 
	
	public InstitutionCannotHaveSubordinatesException(String reason){
		this.reason = reason;
	}
	
	public String getReason(){
		return reason;
	}
	
	public String toString(){
		return reason;
	}
}
