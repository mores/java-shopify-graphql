package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Tax settings for a customer.
 */
public class TaxSettings {
  /**
   * The customer's tax ID.
   */
  private String taxId;

  public TaxSettings() {
  }

  /**
   * The customer's tax ID.
   */
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  @Override
  public String toString() {
    return "TaxSettings{taxId='" + taxId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxSettings that = (TaxSettings) o;
    return Objects.equals(taxId, that.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer's tax ID.
     */
    private String taxId;

    public TaxSettings build() {
      TaxSettings result = new TaxSettings();
      result.taxId = this.taxId;
      return result;
    }

    /**
     * The customer's tax ID.
     */
    public Builder taxId(String taxId) {
      this.taxId = taxId;
      return this;
    }
  }
}
