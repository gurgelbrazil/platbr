package br.gov.ms.conep.institution;

import java.util.Collection;

public abstract class CEP implements Institution{
	
	public abstract Collection<Institution> getManagedInstitutions();
	public abstract void addManagedInstitution(Institution institution);
	public abstract void addManagedInstitutions(Collection<Institution> institutions);
	public abstract void removeManagedInstitution(Institution  institution);
	public abstract CEP  getCepAcreditado(); 
	
	public Institution getSubordinatedInstitution(){
		return null;
	}

	@Override
	public void addSubordinatedInstitution(Institution institution) throws InstitutionCantHaveSubordinatedException {
		throw new CEPCantHaveSubordinatedInstitutions();
	}	
}
