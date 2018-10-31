/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.uzh.ifi.imrg.wi2.projectTemplate.service;

import java.util.Map;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *
 * @author lmuh
 */
@Named("Createinvoice")
public class Createinvoice implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {
        Map<String, Object> camVariables = de.getVariables();
            System.out.println("Rechnung erstellt");


    }
}