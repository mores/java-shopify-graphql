package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update a customer's WhatsApp marketing consent information.
 */
public class CustomerWhatsAppMarketingConsentUpdateInput {
  /**
   * The ID of the [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
   * to update the WhatsApp marketing consent information for. The customer must
   * have a unique phone number associated with their record. If not, then add the
   * phone number using the [`customerUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerUpdate)
   * mutation first.
   */
  private String customerId;

  /**
   * The marketing consent information when the customer consented to receiving marketing material by WhatsApp.
   */
  private CustomerMarketingConsentInput whatsAppMarketingConsent;

  public CustomerWhatsAppMarketingConsentUpdateInput() {
  }

  /**
   * The ID of the [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
   * to update the WhatsApp marketing consent information for. The customer must
   * have a unique phone number associated with their record. If not, then add the
   * phone number using the [`customerUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerUpdate)
   * mutation first.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The marketing consent information when the customer consented to receiving marketing material by WhatsApp.
   */
  public CustomerMarketingConsentInput getWhatsAppMarketingConsent() {
    return whatsAppMarketingConsent;
  }

  public void setWhatsAppMarketingConsent(CustomerMarketingConsentInput whatsAppMarketingConsent) {
    this.whatsAppMarketingConsent = whatsAppMarketingConsent;
  }

  @Override
  public String toString() {
    return "CustomerWhatsAppMarketingConsentUpdateInput{customerId='" + customerId + "', whatsAppMarketingConsent='" + whatsAppMarketingConsent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerWhatsAppMarketingConsentUpdateInput that = (CustomerWhatsAppMarketingConsentUpdateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(whatsAppMarketingConsent, that.whatsAppMarketingConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, whatsAppMarketingConsent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
     * to update the WhatsApp marketing consent information for. The customer must
     * have a unique phone number associated with their record. If not, then add the
     * phone number using the [`customerUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerUpdate)
     * mutation first.
     */
    private String customerId;

    /**
     * The marketing consent information when the customer consented to receiving marketing material by WhatsApp.
     */
    private CustomerMarketingConsentInput whatsAppMarketingConsent;

    public CustomerWhatsAppMarketingConsentUpdateInput build() {
      CustomerWhatsAppMarketingConsentUpdateInput result = new CustomerWhatsAppMarketingConsentUpdateInput();
      result.customerId = this.customerId;
      result.whatsAppMarketingConsent = this.whatsAppMarketingConsent;
      return result;
    }

    /**
     * The ID of the [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
     * to update the WhatsApp marketing consent information for. The customer must
     * have a unique phone number associated with their record. If not, then add the
     * phone number using the [`customerUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerUpdate)
     * mutation first.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The marketing consent information when the customer consented to receiving marketing material by WhatsApp.
     */
    public Builder whatsAppMarketingConsent(
        CustomerMarketingConsentInput whatsAppMarketingConsent) {
      this.whatsAppMarketingConsent = whatsAppMarketingConsent;
      return this;
    }
  }
}
