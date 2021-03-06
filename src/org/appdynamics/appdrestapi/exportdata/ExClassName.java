/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 * <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
 * 
 */
public class ExClassName {
    private String filterType;
    private String filterValue;
    
    public ExClassName(){}

    @XmlElement(name=AppExportS.FILTER_TYPE)
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @XmlElement(name=AppExportS.FILTER_VALUE)
    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.CLASS_NAME);
        bud.append(AppExportS.L3_1).append(AppExportS.FILTER_TYPE).append(AppExportS.VE).append(filterType);
        bud.append(AppExportS.L3_1).append(AppExportS.FILTER_VALUE).append(AppExportS.VE).append(filterValue);
        return bud.toString();
    }
}
