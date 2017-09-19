/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsnsoftware.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author JSN
 */
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.jsnsoftware.rest.CondominioFacadeREST.class);
        resources.add(com.jsnsoftware.rest.EnderecoFacadeREST.class);
        resources.add(com.jsnsoftware.rest.ProfissionalFacadeREST.class);
        resources.add(com.jsnsoftware.rest.TarefaCondominioFacadeREST.class);
        resources.add(com.jsnsoftware.rest.TarefaFacadeREST.class);
    }
    
}
