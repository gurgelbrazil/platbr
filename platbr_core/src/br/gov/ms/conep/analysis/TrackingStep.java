package br.gov.ms.conep.analysis;

import java.util.Date;

import br.gov.ms.conep.localization.Localizable;
import br.gov.ms.conep.user.User;

public interface TrackingStep {
	public Date getDate();
	public void setDate(Date date);
	public User getUser();
	public void setUser(User user);
	public Localizable getFrom();
	public Localizable getTo();
	public void setFrom(Localizable localization);
	public void setTo(Localizable localization);	
	public String getStepName();
	public void setSetName(String stepName);
}
