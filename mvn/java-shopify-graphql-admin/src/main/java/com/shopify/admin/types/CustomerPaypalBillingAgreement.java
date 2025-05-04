package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a PayPal instrument for customer payment method.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerPaypalBillingAgreement implements CustomerPaymentInstrument {
  /**
   * The billing address of this payment method.
   */
  private CustomerPaymentInstrumentBillingAddress billingAddress;

  /**
   * Whether the PayPal billing agreement is inactive.
   */
  private boolean inactive;

  /**
   * Whether the payment method can be revoked.The payment method can be revoked if there are no active subscription contracts.
   */
  private boolean isRevocable;

  /**
   * The customers's PayPal account email address.
   */
  private String paypalAccountEmail;

  public CustomerPaypalBillingAgreement() {
  }

  /**
   * The billing address of this payment method.
   */
  public CustomerPaymentInstrumentBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Whether the PayPal billing agreement is inactive.
   */
  public boolean getInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  /**
   * Whether the payment method can be revoked.The payment method can be revoked if there are no active subscription contracts.
   */
  public boolean getIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  /**
   * The customers's PayPal account email address.
   */
  public String getPaypalAccountEmail() {
    return paypalAccountEmail;
  }

  public void setPaypalAccountEmail(String paypalAccountEmail) {
    this.paypalAccountEmail = paypalAccountEmail;
  }

  @Override
  public String toString() {
    return "CustomerPaypalBillingAgreement{billingAddress='" + billingAddress + "', inactive='" + inactive + "', isRevocable='" + isRevocable + "', paypalAccountEmail='" + paypalAccountEmail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaypalBillingAgreement that = (CustomerPaypalBillingAgreement) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        inactive == that.inactive &&
        isRevocable == that.isRevocable &&
        Objects.equals(paypalAccountEmail, that.paypalAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, inactive, isRevocable, paypalAccountEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The billing address of this payment method.
     */
    private CustomerPaymentInstrumentBillingAddress billingAddress;

    /**
     * Whether the PayPal billing agreement is inactive.
     */
    private boolean inactive;

    /**
     * Whether the payment method can be revoked.The payment method can be revoked if there are no active subscription contracts.
     */
    private boolean isRevocable;

    /**
     * The customers's PayPal account email address.
     */
    private String paypalAccountEmail;

    public CustomerPaypalBillingAgreement build() {
      CustomerPaypalBillingAgreement result = new CustomerPaypalBillingAgreement();
      result.billingAddress = this.billingAddress;
      result.inactive = this.inactive;
      result.isRevocable = this.isRevocable;
      result.paypalAccountEmail = this.paypalAccountEmail;
      return result;
    }

    /**
     * The billing address of this payment method.
     */
    public Builder billingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * Whether the PayPal billing agreement is inactive.
     */
    public Builder inactive(boolean inactive) {
      this.inactive = inactive;
      return this;
    }

    /**
     * Whether the payment method can be revoked.The payment method can be revoked if there are no active subscription contracts.
     */
    public Builder isRevocable(boolean isRevocable) {
      this.isRevocable = isRevocable;
      return this;
    }

    /**
     * The customers's PayPal account email address.
     */
    public Builder paypalAccountEmail(String paypalAccountEmail) {
      this.paypalAccountEmail = paypalAccountEmail;
      return this;
    }
  }
}
