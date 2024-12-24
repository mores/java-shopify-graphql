package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SegmentAttributeStatistics {
  
  private double average;

  
  private double sum;

  public SegmentAttributeStatistics() {
  }

  
  public double getAverage() {
    return average;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  
  public double getSum() {
    return sum;
  }

  public void setSum(double sum) {
    this.sum = sum;
  }

  @Override
  public String toString() {
    return "SegmentAttributeStatistics{average='" + average + "', sum='" + sum + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentAttributeStatistics that = (SegmentAttributeStatistics) o;
    return average == that.average &&
        sum == that.sum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, sum);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private double average;

    
    private double sum;

    public SegmentAttributeStatistics build() {
      SegmentAttributeStatistics result = new SegmentAttributeStatistics();
      result.average = this.average;
      result.sum = this.sum;
      return result;
    }

    
    public Builder average(double average) {
      this.average = average;
      return this;
    }

    
    public Builder sum(double sum) {
      this.sum = sum;
      return this;
    }
  }
}
