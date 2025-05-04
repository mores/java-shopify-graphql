package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents the tax settings for a company location.
 */
public class CompanyLocationTaxSettings {
  /**
   * Whether the location is exempt from taxes.
   */
  private boolean taxExempt;

  /**
   * The list of tax exemptions applied to the location.
   */
  private List<TaxExemption> taxExemptions;

  /**
   * The tax registration ID for the company location.
   */
  private String taxRegistrationId;

  public CompanyLocationTaxSettings() {
  }

  /**
   * Whether the location is exempt from taxes.
   */
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * The list of tax exemptions applied to the location.
   */
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  /**
   * The tax registration ID for the company location.
   */
  public String getTaxRegistrationId() {
    return taxRegistrationId;
  }

  public void setTaxRegistrationId(String taxRegistrationId) {
    this.taxRegistrationId = taxRegistrationId;
  }

  @Override
  public String toString() {
    return "CompanyLocationTaxSettings{taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "', taxRegistrationId='" + taxRegistrationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationTaxSettings that = (CompanyLocationTaxSettings) o;
    return taxExempt == that.taxExempt &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(taxRegistrationId, that.taxRegistrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxExempt, taxExemptions, taxRegistrationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the location is exempt from taxes.
     */
    private boolean taxExempt;

    /**
     * The list of tax exemptions applied to the location.
     */
    private List<TaxExemption> taxExemptions;

    /**
     * The tax registration ID for the company location.
     */
    private String taxRegistrationId;

    public CompanyLocationTaxSettings build() {
      CompanyLocationTaxSettings result = new CompanyLocationTaxSettings();
      result.taxExempt = this.taxExempt;
      result.taxExemptions = this.taxExemptions;
      result.taxRegistrationId = this.taxRegistrationId;
      return result;
    }

    /**
     * Whether the location is exempt from taxes.
     */
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * The list of tax exemptions applied to the location.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    /**
     * The tax registration ID for the company location.
     */
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
      return this;
    }
  }
}
