package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a Shop Pay card instrument for customer payment method.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerShopPayAgreement implements CustomerPaymentInstrument {
  /**
   * The billing address of the card.
   */
  private CustomerCreditCardBillingAddress billingAddress;

  /**
   * Whether the card is about to expire.
   */
  private boolean expiresSoon;

  /**
   * The expiry month of the card.
   */
  private int expiryMonth;

  /**
   * The expiry year of the card.
   */
  private int expiryYear;

  /**
   * Whether the Shop Pay billing agreement is inactive.
   */
  private boolean inactive;

  /**
   * The payment method can be revoked if there are no active subscription contracts.
   */
  private boolean isRevocable;

  /**
   * The last 4 digits of the card.
   */
  private String lastDigits;

  /**
   * The masked card number with only the last 4 digits displayed.
   */
  private String maskedNumber;

  /**
   * The name of the card holder.
   */
  private String name;

  public CustomerShopPayAgreement() {
  }

  /**
   * The billing address of the card.
   */
  public CustomerCreditCardBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerCreditCardBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Whether the card is about to expire.
   */
  public boolean getExpiresSoon() {
    return expiresSoon;
  }

  public void setExpiresSoon(boolean expiresSoon) {
    this.expiresSoon = expiresSoon;
  }

  /**
   * The expiry month of the card.
   */
  public int getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(int expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  /**
   * The expiry year of the card.
   */
  public int getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(int expiryYear) {
    this.expiryYear = expiryYear;
  }

  /**
   * Whether the Shop Pay billing agreement is inactive.
   */
  public boolean getInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  /**
   * The payment method can be revoked if there are no active subscription contracts.
   */
  public boolean getIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  /**
   * The last 4 digits of the card.
   */
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  /**
   * The masked card number with only the last 4 digits displayed.
   */
  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  /**
   * The name of the card holder.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CustomerShopPayAgreement{billingAddress='" + billingAddress + "', expiresSoon='" + expiresSoon + "', expiryMonth='" + expiryMonth + "', expiryYear='" + expiryYear + "', inactive='" + inactive + "', isRevocable='" + isRevocable + "', lastDigits='" + lastDigits + "', maskedNumber='" + maskedNumber + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerShopPayAgreement that = (CustomerShopPayAgreement) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        expiresSoon == that.expiresSoon &&
        expiryMonth == that.expiryMonth &&
        expiryYear == that.expiryYear &&
        inactive == that.inactive &&
        isRevocable == that.isRevocable &&
        Objects.equals(lastDigits, that.lastDigits) &&
        Objects.equals(maskedNumber, that.maskedNumber) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, expiresSoon, expiryMonth, expiryYear, inactive, isRevocable, lastDigits, maskedNumber, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The billing address of the card.
     */
    private CustomerCreditCardBillingAddress billingAddress;

    /**
     * Whether the card is about to expire.
     */
    private boolean expiresSoon;

    /**
     * The expiry month of the card.
     */
    private int expiryMonth;

    /**
     * The expiry year of the card.
     */
    private int expiryYear;

    /**
     * Whether the Shop Pay billing agreement is inactive.
     */
    private boolean inactive;

    /**
     * The payment method can be revoked if there are no active subscription contracts.
     */
    private boolean isRevocable;

    /**
     * The last 4 digits of the card.
     */
    private String lastDigits;

    /**
     * The masked card number with only the last 4 digits displayed.
     */
    private String maskedNumber;

    /**
     * The name of the card holder.
     */
    private String name;

    public CustomerShopPayAgreement build() {
      CustomerShopPayAgreement result = new CustomerShopPayAgreement();
      result.billingAddress = this.billingAddress;
      result.expiresSoon = this.expiresSoon;
      result.expiryMonth = this.expiryMonth;
      result.expiryYear = this.expiryYear;
      result.inactive = this.inactive;
      result.isRevocable = this.isRevocable;
      result.lastDigits = this.lastDigits;
      result.maskedNumber = this.maskedNumber;
      result.name = this.name;
      return result;
    }

    /**
     * The billing address of the card.
     */
    public Builder billingAddress(CustomerCreditCardBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * Whether the card is about to expire.
     */
    public Builder expiresSoon(boolean expiresSoon) {
      this.expiresSoon = expiresSoon;
      return this;
    }

    /**
     * The expiry month of the card.
     */
    public Builder expiryMonth(int expiryMonth) {
      this.expiryMonth = expiryMonth;
      return this;
    }

    /**
     * The expiry year of the card.
     */
    public Builder expiryYear(int expiryYear) {
      this.expiryYear = expiryYear;
      return this;
    }

    /**
     * Whether the Shop Pay billing agreement is inactive.
     */
    public Builder inactive(boolean inactive) {
      this.inactive = inactive;
      return this;
    }

    /**
     * The payment method can be revoked if there are no active subscription contracts.
     */
    public Builder isRevocable(boolean isRevocable) {
      this.isRevocable = isRevocable;
      return this;
    }

    /**
     * The last 4 digits of the card.
     */
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
      return this;
    }

    /**
     * The masked card number with only the last 4 digits displayed.
     */
    public Builder maskedNumber(String maskedNumber) {
      this.maskedNumber = maskedNumber;
      return this;
    }

    /**
     * The name of the card holder.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
