package br.gov.ms.conep.analysis;

import java.util.Collection;

import br.gov.ms.conep.forms.Form;
import br.gov.ms.conep.institution.Institution;

public interface Analysis {
	public Form getDocument();
	public Result getResult();
	public void setIntitution();
	public Institution getInsitution();
	public void setTracking(TrackingStep step);
	public Collection<TrackingStep> getTracking();	
}
