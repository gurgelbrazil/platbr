package br.gov.ms.conep.analysis;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class Document {
	public File getDocument(){
		try {
			return new File(new URI("//path.doc"));
		} catch (URISyntaxException e) {
			return null;
		}
	}
}
