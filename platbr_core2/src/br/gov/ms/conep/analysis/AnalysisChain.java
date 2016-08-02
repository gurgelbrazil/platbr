package br.gov.ms.conep.analysis;

public interface AnalysisChain extends Analysis {
	public int getType();
	public Analysis getCurrent();
	public Analysis next();
	public void fail();
}
