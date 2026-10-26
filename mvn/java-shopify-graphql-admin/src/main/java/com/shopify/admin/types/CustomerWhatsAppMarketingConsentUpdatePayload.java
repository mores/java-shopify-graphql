package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerWhatsAppMarketingConsentUpdate` mutation.
 */
public class CustomerWhatsAppMarketingConsentUpdatePayload {
  /**
   * The [customer phone number](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPhoneNumber)
   * with the updated WhatsApp marketing consent information.
   */
  private CustomerPhoneNumber customerPhoneNumber;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerMarketingConsentError> userErrors;

  public CustomerWhatsAppMarketingConsentUpdatePayload() {
  }

  /**
   * The [customer phone number](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPhoneNumber)
   * with the updated WhatsApp marketing consent information.
   */
  public CustomerPhoneNumber getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(CustomerPhoneNumber customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerMarketingConsentError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerMarketingConsentError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerWhatsAppMarketingConsentUpdatePayload{customerPhoneNumber='" + customerPhoneNumber + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerWhatsAppMarketingConsentUpdatePayload that = (CustomerWhatsAppMarketingConsentUpdatePayload) o;
    return Objects.equals(customerPhoneNumber, that.customerPhoneNumber) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPhoneNumber, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The [customer phone number](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPhoneNumber)
     * with the updated WhatsApp marketing consent information.
     */
    private CustomerPhoneNumber customerPhoneNumber;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerMarketingConsentError> userErrors;

    public CustomerWhatsAppMarketingConsentUpdatePayload build() {
      CustomerWhatsAppMarketingConsentUpdatePayload result = new CustomerWhatsAppMarketingConsentUpdatePayload();
      result.customerPhoneNumber = this.customerPhoneNumber;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The [customer phone number](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPhoneNumber)
     * with the updated WhatsApp marketing consent information.
     */
    public Builder customerPhoneNumber(CustomerPhoneNumber customerPhoneNumber) {
      this.customerPhoneNumber = customerPhoneNumber;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerMarketingConsentError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
