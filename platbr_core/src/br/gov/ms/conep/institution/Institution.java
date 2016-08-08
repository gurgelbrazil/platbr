package br.gov.ms.conep.institution;

import br.gov.ms.conep.localization.Localizable;

public interface Institution extends Localizable{
	public Institution getSubordinatedInstitution();
	public Institution getParent();
	public void  addSubordinatedInstitution(Institution institution) throws InstitutionCannotHaveSubordinatesException;
}
