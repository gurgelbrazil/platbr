package br.gov.ms.conep.analysis;

import java.util.Date;

import br.gov.ms.conep.localization.Localization;
import br.gov.ms.conep.user.User;

public interface TrackingStep {
	public Date getDate();
	public void setDate(Date date);
	public User getUser();
	public void setUser(User user);
	public Localization getFrom();
	public Localization getTo();
	public void setFrom(Localization localization);
	public void setTo(Localization localization);	
	public String getStepName();
	public void setSetName(String stepName);
}
