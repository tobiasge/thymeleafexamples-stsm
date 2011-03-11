/*
 * =============================================================================
 * 
 *   Copyright (c) 2011, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package thymeleafexamples.sts.business.entities;

import java.util.Calendar;
import java.util.Map;

public class Seedbed {

    private Integer id = null;
    private Calendar datePlanted = null;
    private Boolean covered = null;
    private Type type = null;
    private Feature[] features = null;
    
    private Map<Integer,Row> rows = null;
    
    
    public Seedbed() {
        super();
    }


    public Integer getId() {
        return this.id;
    }


    public void setId(final Integer id) {
        this.id = id;
    }


    public Calendar getDatePlanted() {
        return this.datePlanted;
    }


    public void setDatePlanted(final Calendar datePlanted) {
        this.datePlanted = datePlanted;
    }


    public Boolean getCovered() {
        return this.covered;
    }


    public void setCovered(final Boolean covered) {
        this.covered = covered;
    }


    public Type getType() {
        return this.type;
    }


    public void setType(final Type type) {
        this.type = type;
    }


    public Feature[] getFeatures() {
        return this.features;
    }


    public void setFeatures(final Feature[] features) {
        this.features = features;
    }


    public Map<Integer, Row> getRows() {
        return this.rows;
    }


    public void setRows(final Map<Integer, Row> rows) {
        this.rows = rows;
    }
    
    
}