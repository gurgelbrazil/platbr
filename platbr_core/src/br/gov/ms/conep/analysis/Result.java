package br.gov.ms.conep.analysis;

import java.util.Collection;

public interface Result {
	public static String COMPLETED_WITH_PENDENCY_ISSUED = "COMPLETED_WITH_PENDENCY_ISSUED";
	public static String COMPLETED_AND_APPROVED = "COMPLETED_AND_APPROVED";
	public static String COMPLETED_AND_REPROVED= "COMPLETED_AND_REPROVED";
	public static String ONGOING = "ONGOING";
	public Collection<Document> getResultDocuments();
	public String getStatus();
}
