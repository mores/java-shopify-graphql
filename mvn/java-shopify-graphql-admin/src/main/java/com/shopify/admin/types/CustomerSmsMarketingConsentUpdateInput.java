package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating SMS marketing consent information for a given customer ID.
 */
public class CustomerSmsMarketingConsentUpdateInput {
  /**
   * The ID of the customer to update the SMS marketing consent information for.
   * The customer must have a unique phone number associated to the record. If not,
   * add the phone number using the `customerUpdate` mutation first.
   */
  private String customerId;

  /**
   * The marketing consent information when the customer consented to receiving marketing material by SMS.
   */
  private CustomerSmsMarketingConsentInput smsMarketingConsent;

  public CustomerSmsMarketingConsentUpdateInput() {
  }

  /**
   * The ID of the customer to update the SMS marketing consent information for.
   * The customer must have a unique phone number associated to the record. If not,
   * add the phone number using the `customerUpdate` mutation first.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The marketing consent information when the customer consented to receiving marketing material by SMS.
   */
  public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentUpdateInput{customerId='" + customerId + "', smsMarketingConsent='" + smsMarketingConsent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentUpdateInput that = (CustomerSmsMarketingConsentUpdateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(smsMarketingConsent, that.smsMarketingConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, smsMarketingConsent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer to update the SMS marketing consent information for.
     * The customer must have a unique phone number associated to the record. If not,
     * add the phone number using the `customerUpdate` mutation first.
     */
    private String customerId;

    /**
     * The marketing consent information when the customer consented to receiving marketing material by SMS.
     */
    private CustomerSmsMarketingConsentInput smsMarketingConsent;

    public CustomerSmsMarketingConsentUpdateInput build() {
      CustomerSmsMarketingConsentUpdateInput result = new CustomerSmsMarketingConsentUpdateInput();
      result.customerId = this.customerId;
      result.smsMarketingConsent = this.smsMarketingConsent;
      return result;
    }

    /**
     * The ID of the customer to update the SMS marketing consent information for.
     * The customer must have a unique phone number associated to the record. If not,
     * add the phone number using the `customerUpdate` mutation first.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The marketing consent information when the customer consented to receiving marketing material by SMS.
     */
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }
  }
}
