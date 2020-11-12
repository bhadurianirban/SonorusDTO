    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sonorus.core.dto;

import java.util.Map;
import org.hedwig.cms.dto.CMSDTO;


/**
 *
 * @author dgrfiv
 */
public class SonorusDTO extends CMSDTO{
    
    
    private Map<String, Object> speechEmoTermInstance;
    private Map<String, Object> speechDataSeriesTermInstance;
    private Map<String, Object> mfdfaTermInstance;
    private String wavFilePath;
    private String dataSeriesSlug;


    public String getWavFilePath() {
        return wavFilePath;
    }

    public void setWavFilePath(String wavFilePath) {
        this.wavFilePath = wavFilePath;
    }

   


    public Map<String, Object> getSpeechEmoTermInstance() {
        return speechEmoTermInstance;
    }

    public void setSpeechEmoTermInstance(Map<String, Object> speechEmoTermInstance) {
        this.speechEmoTermInstance = speechEmoTermInstance;
    }

    public String getDataSeriesSlug() {
        return dataSeriesSlug;
    }

    public void setDataSeriesSlug(String dataSeriesSlug) {
        this.dataSeriesSlug = dataSeriesSlug;
    }

    public Map<String, Object> getSpeechDataSeriesTermInstance() {
        return speechDataSeriesTermInstance;
    }

    public void setSpeechDataSeriesTermInstance(Map<String, Object> speechDataSeriesTermInstance) {
        this.speechDataSeriesTermInstance = speechDataSeriesTermInstance;
    }

    public Map<String, Object> getMfdfaTermInstance() {
        return mfdfaTermInstance;
    }

    public void setMfdfaTermInstance(Map<String, Object> mfdfaTermInstance) {
        this.mfdfaTermInstance = mfdfaTermInstance;
    }
    
}
