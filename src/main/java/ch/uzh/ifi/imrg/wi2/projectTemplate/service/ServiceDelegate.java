package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import java.util.Map;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("aServiceDelegate")
public class ServiceDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {
        Map<String, Object> camVariables = de.getVariables();
        for(String k : camVariables.keySet()) {
            System.out.println("camVariables["+k+"] = " + camVariables.get(k));
        }
        
    }
    
}
