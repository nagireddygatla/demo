package com.cox.interview.model;

import java.util.List;

public class Dataset {
    String datasetId;
    List<Dealer> dealerSet;
    List<Vehicle> vehicleSet;

    public Dataset() {
    }

    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public List<Dealer> getDealerSet() {
        return dealerSet;
    }

    public void setDealerSet(List<Dealer> dealerSet) {
        this.dealerSet = dealerSet;
    }

    public List<Vehicle> getVehicleSet() {
        return vehicleSet;
    }

    public void setVehicleSet(List<Vehicle> vehicleSet) {
        this.vehicleSet = vehicleSet;
    }
}
