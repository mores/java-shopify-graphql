package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for company attributes when creating or updating a company.
 */
public class CompanyInput {
  /**
   * The name of the company.
   */
  private String name;

  /**
   * A note about the company.
   */
  private String note;

  /**
   * A unique externally-supplied ID for the company.
   */
  private String externalId;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at
   *           which the company became the customer.
   */
  private OffsetDateTime customerSince;

  public CompanyInput() {
  }

  /**
   * The name of the company.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A note about the company.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * A unique externally-supplied ID for the company.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at
   *           which the company became the customer.
   */
  public OffsetDateTime getCustomerSince() {
    return customerSince;
  }

  public void setCustomerSince(OffsetDateTime customerSince) {
    this.customerSince = customerSince;
  }

  @Override
  public String toString() {
    return "CompanyInput{name='" + name + "', note='" + note + "', externalId='" + externalId + "', customerSince='" + customerSince + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyInput that = (CompanyInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(customerSince, that.customerSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, note, externalId, customerSince);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the company.
     */
    private String name;

    /**
     * A note about the company.
     */
    private String note;

    /**
     * A unique externally-supplied ID for the company.
     */
    private String externalId;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at
     *           which the company became the customer.
     */
    private OffsetDateTime customerSince;

    public CompanyInput build() {
      CompanyInput result = new CompanyInput();
      result.name = this.name;
      result.note = this.note;
      result.externalId = this.externalId;
      result.customerSince = this.customerSince;
      return result;
    }

    /**
     * The name of the company.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A note about the company.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * A unique externally-supplied ID for the company.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at
     *           which the company became the customer.
     */
    public Builder customerSince(OffsetDateTime customerSince) {
      this.customerSince = customerSince;
      return this;
    }
  }
}
