package com.shopify.admin.types;

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

  /**
   * The RFM (Recency, Frequency, Monetary) group of the customer.
   */
  private CustomerRfmGroup rfmGroup;

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

  /**
   * The RFM (Recency, Frequency, Monetary) group of the customer.
   */
  public CustomerRfmGroup getRfmGroup() {
    return rfmGroup;
  }

  public void setRfmGroup(CustomerRfmGroup rfmGroup) {
    this.rfmGroup = rfmGroup;
  }

  @Override
  public String toString() {
    return "CustomerStatistics{predictedSpendTier='" + predictedSpendTier + "', rfmGroup='" + rfmGroup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerStatistics that = (CustomerStatistics) o;
    return Objects.equals(predictedSpendTier, that.predictedSpendTier) &&
        Objects.equals(rfmGroup, that.rfmGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictedSpendTier, rfmGroup);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The predicted spend tier of a customer with a shop.
     */
    private CustomerPredictedSpendTier predictedSpendTier;

    /**
     * The RFM (Recency, Frequency, Monetary) group of the customer.
     */
    private CustomerRfmGroup rfmGroup;

    public CustomerStatistics build() {
      CustomerStatistics result = new CustomerStatistics();
      result.predictedSpendTier = this.predictedSpendTier;
      result.rfmGroup = this.rfmGroup;
      return result;
    }

    /**
     * The predicted spend tier of a customer with a shop.
     */
    public Builder predictedSpendTier(CustomerPredictedSpendTier predictedSpendTier) {
      this.predictedSpendTier = predictedSpendTier;
      return this;
    }

    /**
     * The RFM (Recency, Frequency, Monetary) group of the customer.
     */
    public Builder rfmGroup(CustomerRfmGroup rfmGroup) {
      this.rfmGroup = rfmGroup;
      return this;
    }
  }
}
