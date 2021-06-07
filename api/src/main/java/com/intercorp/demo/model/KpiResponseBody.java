package com.intercorp.demo.model;

import io.swagger.annotations.ApiModelProperty;

public class KpiResponseBody {
    @ApiModelProperty(value = "customer's age average", example = "28.54")
    private Double average;
    @ApiModelProperty(value = "age average standard deviation", example = "28.54")
    private Double standardDeviation;

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    @Override
    public String toString() {
        return "KpiResponseBody{" +
                "kpi=" + average +
                ", standardDeviation=" + standardDeviation +
                '}';
    }
}
