package br.gov.ms.conep.process;

import br.gov.ms.conep.institution.Institution;
import br.gov.ms.conep.protocol.Protocol;
import br.gov.ms.conep.user.User;

public interface Process {
	public SubProcess getSubProcesses();
	public Protocol getProtocol();
	public void addProtocol(Protocol protocol);
	public long getID();
	public User getResponsible();
	public Institution getProponentIntitution();
}
