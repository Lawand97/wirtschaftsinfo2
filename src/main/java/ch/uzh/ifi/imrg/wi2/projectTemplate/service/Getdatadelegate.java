package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import java.util.Map;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("Getdata")
public class Getdatadelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {
        Map<String, Object> camVariables = de.getVariables();
            System.out.println("Kontaktdaten holen");


    }
}
