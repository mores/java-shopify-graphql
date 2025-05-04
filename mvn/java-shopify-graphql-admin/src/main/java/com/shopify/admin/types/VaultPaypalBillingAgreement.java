package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a paypal billing agreement payment instrument.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class VaultPaypalBillingAgreement implements PaymentInstrument {
  /**
   * Whether the paypal billing agreement is inactive.
   */
  private boolean inactive;

  /**
   * The paypal account name.
   */
  private String name;

  /**
   * The paypal account email address.
   */
  private String paypalAccountEmail;

  public VaultPaypalBillingAgreement() {
  }

  /**
   * Whether the paypal billing agreement is inactive.
   */
  public boolean getInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  /**
   * The paypal account name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The paypal account email address.
   */
  public String getPaypalAccountEmail() {
    return paypalAccountEmail;
  }

  public void setPaypalAccountEmail(String paypalAccountEmail) {
    this.paypalAccountEmail = paypalAccountEmail;
  }

  @Override
  public String toString() {
    return "VaultPaypalBillingAgreement{inactive='" + inactive + "', name='" + name + "', paypalAccountEmail='" + paypalAccountEmail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VaultPaypalBillingAgreement that = (VaultPaypalBillingAgreement) o;
    return inactive == that.inactive &&
        Objects.equals(name, that.name) &&
        Objects.equals(paypalAccountEmail, that.paypalAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactive, name, paypalAccountEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the paypal billing agreement is inactive.
     */
    private boolean inactive;

    /**
     * The paypal account name.
     */
    private String name;

    /**
     * The paypal account email address.
     */
    private String paypalAccountEmail;

    public VaultPaypalBillingAgreement build() {
      VaultPaypalBillingAgreement result = new VaultPaypalBillingAgreement();
      result.inactive = this.inactive;
      result.name = this.name;
      result.paypalAccountEmail = this.paypalAccountEmail;
      return result;
    }

    /**
     * Whether the paypal billing agreement is inactive.
     */
    public Builder inactive(boolean inactive) {
      this.inactive = inactive;
      return this;
    }

    /**
     * The paypal account name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The paypal account email address.
     */
    public Builder paypalAccountEmail(String paypalAccountEmail) {
      this.paypalAccountEmail = paypalAccountEmail;
      return this;
    }
  }
}
