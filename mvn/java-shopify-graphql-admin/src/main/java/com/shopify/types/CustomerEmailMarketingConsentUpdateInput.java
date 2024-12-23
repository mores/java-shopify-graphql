package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the email consent information to update for a given customer ID.
 */
public class CustomerEmailMarketingConsentUpdateInput {
  /**
   * The ID of the customer for which to update the email marketing consent
   * information. The customer must have a unique email address associated to the
   * record. If not, add the email address using the `customerUpdate` mutation first.
   */
  private String customerId;

  /**
   * The marketing consent information when the customer consented to receiving marketing material by email.
   */
  private CustomerEmailMarketingConsentInput emailMarketingConsent;

  public CustomerEmailMarketingConsentUpdateInput() {
  }

  /**
   * The ID of the customer for which to update the email marketing consent
   * information. The customer must have a unique email address associated to the
   * record. If not, add the email address using the `customerUpdate` mutation first.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The marketing consent information when the customer consented to receiving marketing material by email.
   */
  public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  @Override
  public String toString() {
    return "CustomerEmailMarketingConsentUpdateInput{customerId='" + customerId + "', emailMarketingConsent='" + emailMarketingConsent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailMarketingConsentUpdateInput that = (CustomerEmailMarketingConsentUpdateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(emailMarketingConsent, that.emailMarketingConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, emailMarketingConsent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer for which to update the email marketing consent
     * information. The customer must have a unique email address associated to the
     * record. If not, add the email address using the `customerUpdate` mutation first.
     */
    private String customerId;

    /**
     * The marketing consent information when the customer consented to receiving marketing material by email.
     */
    private CustomerEmailMarketingConsentInput emailMarketingConsent;

    public CustomerEmailMarketingConsentUpdateInput build() {
      CustomerEmailMarketingConsentUpdateInput result = new CustomerEmailMarketingConsentUpdateInput();
      result.customerId = this.customerId;
      result.emailMarketingConsent = this.emailMarketingConsent;
      return result;
    }

    /**
     * The ID of the customer for which to update the email marketing consent
     * information. The customer must have a unique email address associated to the
     * record. If not, add the email address using the `customerUpdate` mutation first.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The marketing consent information when the customer consented to receiving marketing material by email.
     */
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }
  }
}
