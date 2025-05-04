package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a purchasing company, which is a combination of company, company contact, and company location.
 */
public class PurchasingCompanyInput {
  /**
   * ID of the company.
   */
  private String companyId;

  /**
   * ID of the company contact.
   */
  private String companyContactId;

  /**
   * ID of the company location.
   */
  private String companyLocationId;

  public PurchasingCompanyInput() {
  }

  /**
   * ID of the company.
   */
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  /**
   * ID of the company contact.
   */
  public String getCompanyContactId() {
    return companyContactId;
  }

  public void setCompanyContactId(String companyContactId) {
    this.companyContactId = companyContactId;
  }

  /**
   * ID of the company location.
   */
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  @Override
  public String toString() {
    return "PurchasingCompanyInput{companyId='" + companyId + "', companyContactId='" + companyContactId + "', companyLocationId='" + companyLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchasingCompanyInput that = (PurchasingCompanyInput) o;
    return Objects.equals(companyId, that.companyId) &&
        Objects.equals(companyContactId, that.companyContactId) &&
        Objects.equals(companyLocationId, that.companyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyContactId, companyLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the company.
     */
    private String companyId;

    /**
     * ID of the company contact.
     */
    private String companyContactId;

    /**
     * ID of the company location.
     */
    private String companyLocationId;

    public PurchasingCompanyInput build() {
      PurchasingCompanyInput result = new PurchasingCompanyInput();
      result.companyId = this.companyId;
      result.companyContactId = this.companyContactId;
      result.companyLocationId = this.companyLocationId;
      return result;
    }

    /**
     * ID of the company.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      return this;
    }

    /**
     * ID of the company contact.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      return this;
    }

    /**
     * ID of the company location.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }
  }
}
