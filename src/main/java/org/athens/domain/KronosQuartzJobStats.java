package org.athens.domain;

import org.athens.common.ApplicationConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;


public class KronosQuartzJobStats {

    private int total;
    private int saved;
    private int found;
    private int errored;
    private int processed;
    private String status;
    private String runningTime;
    private String timeStarted;
    private BigDecimal kronosIngestId;

    private Map<String, Integer> existsMap = new HashMap<String, Integer>();

    private List<KronosWorkHour> auditDetails = new ArrayList<KronosWorkHour>();


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSaved() {
        return saved;
    }

    public void setSaved(int saved) {
        this.saved = saved;
    }

    public int getFound() {
        return found;
    }

    public void setFound(int found) {
        this.found = found;
    }

    public int getErrored() {
        return errored;
    }

    public void setErrored(int errored) {
        this.errored = errored;
    }

    public int getProcessed() {
        return processed;
    }

    public void setProcessed(int processed) {
        this.processed = processed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
    }

    public BigDecimal getKronosIngestId() {
        return kronosIngestId;
    }

    public void setKronosIngestId(BigDecimal kronosIngestId) {
        this.kronosIngestId = kronosIngestId;
    }

    public Map<String, Integer> getExistsMap() {
        return existsMap;
    }

    public int getExistsMapValue(String key) {
        return existsMap.get(key);
    }

    public void setExistsMapValue(String key, int occurrences) {
        existsMap.put(key, occurrences);
    }


    public List<KronosWorkHour> getAuditDetails() {
        return auditDetails;
    }

    public void addAuditDetails(KronosWorkHour kronosWorkHour) {
        auditDetails.add(kronosWorkHour);
    }


    public boolean jobRunning() {
        if(this.status != null &&
                (this.status.equals(ApplicationConstants.RUNNING_STATUS) ||
                    this.status.equals(ApplicationConstants.STARTED_STATUS))){
            return true;
        }
        return false;
    }

}
