package br.gov.ms.conep.process;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class ResearchProcessService
 */
@Stateful
@LocalBean
public class ResearchProcessService implements ResearchProcessServiceRemote, ResearchProcessServiceLocal {

    /**
     * Default constructor. 
     */
    public ResearchProcessService() {
        // TODO Auto-generated constructor stub
    }

}
