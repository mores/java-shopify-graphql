package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A customer's computed statistics.
 */
public class CustomerStatistics {
  /**
   * The predicted spend tier of a customer with a shop.
   */
  private CustomerPredictedSpendTier predictedSpendTier;

  public CustomerStatistics() {
  }

  /**
   * The predicted spend tier of a customer with a shop.
   */
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
    /**
     * The predicted spend tier of a customer with a shop.
     */
    private CustomerPredictedSpendTier predictedSpendTier;

    public CustomerStatistics build() {
      CustomerStatistics result = new CustomerStatistics();
      result.predictedSpendTier = this.predictedSpendTier;
      return result;
    }

    /**
     * The predicted spend tier of a customer with a shop.
     */
    public Builder predictedSpendTier(CustomerPredictedSpendTier predictedSpendTier) {
      this.predictedSpendTier = predictedSpendTier;
      return this;
    }
  }
}
