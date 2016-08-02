package br.gov.ms.conep.institution;

import br.gov.ms.conep.localization.Localization;

public interface Institution extends Localization{
	public Institution getSubordinatedInstitution();
	public Institution getParent();
	public void  addSubordinatedInstitution(Institution institution) throws InstitutionCantHaveSubordinatedException;
}
