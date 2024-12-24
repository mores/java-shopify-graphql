package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerStatistics {
  
  private CustomerPredictedSpendTier predictedSpendTier;

  public CustomerStatistics() {
  }

  
  public CustomerPredictedSpendTier getPredictedSpendTier() {
    return predictedSpendTier;
  }

  public void setPredictedSpendTier(CustomerPredictedSpendTier predictedSpendTier) {
    this.predictedSpendTier = predictedSpendTier;
  }

  @Override
  public String toString() {
    return "CustomerStatistics{predictedSpendTier='" + predictedSpendTier + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerStatistics that = (CustomerStatistics) o;
    return Objects.equals(predictedSpendTier, that.predictedSpendTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictedSpendTier);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerPredictedSpendTier predictedSpendTier;

    public CustomerStatistics build() {
      CustomerStatistics result = new CustomerStatistics();
      result.predictedSpendTier = this.predictedSpendTier;
      return result;
    }

    
    public Builder predictedSpendTier(CustomerPredictedSpendTier predictedSpendTier) {
      this.predictedSpendTier = predictedSpendTier;
      return this;
    }
  }
}
