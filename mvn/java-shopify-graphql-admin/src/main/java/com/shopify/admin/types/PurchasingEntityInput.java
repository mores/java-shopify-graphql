package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a purchasing entity. Can either be a customer or a purchasing company.
 */
public class PurchasingEntityInput {
  /**
   * Represents a customer. Null if there's a purchasing company.
   */
  private String customerId;

  /**
   * Represents a purchasing company. Null if there's a customer.
   */
  private PurchasingCompanyInput purchasingCompany;

  public PurchasingEntityInput() {
  }

  /**
   * Represents a customer. Null if there's a purchasing company.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * Represents a purchasing company. Null if there's a customer.
   */
  public PurchasingCompanyInput getPurchasingCompany() {
    return purchasingCompany;
  }

  public void setPurchasingCompany(PurchasingCompanyInput purchasingCompany) {
    this.purchasingCompany = purchasingCompany;
  }

  @Override
  public String toString() {
    return "PurchasingEntityInput{customerId='" + customerId + "', purchasingCompany='" + purchasingCompany + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchasingEntityInput that = (PurchasingEntityInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(purchasingCompany, that.purchasingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, purchasingCompany);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Represents a customer. Null if there's a purchasing company.
     */
    private String customerId;

    /**
     * Represents a purchasing company. Null if there's a customer.
     */
    private PurchasingCompanyInput purchasingCompany;

    public PurchasingEntityInput build() {
      PurchasingEntityInput result = new PurchasingEntityInput();
      result.customerId = this.customerId;
      result.purchasingCompany = this.purchasingCompany;
      return result;
    }

    /**
     * Represents a customer. Null if there's a purchasing company.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * Represents a purchasing company. Null if there's a customer.
     */
    public Builder purchasingCompany(PurchasingCompanyInput purchasingCompany) {
      this.purchasingCompany = purchasingCompany;
      return this;
    }
  }
}
