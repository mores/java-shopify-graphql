package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a card instrument for customer payment method.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerCreditCard implements CustomerPaymentInstrument {
  /**
   * The billing address of the card.
   */
  private CustomerCreditCardBillingAddress billingAddress;

  /**
   * The brand of the card.
   */
  private String brand;

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
   * The card's BIN number.
   */
  private String firstDigits;

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

  /**
   * The source of the card if coming from a wallet such as Apple Pay.
   */
  private String source;

  /**
   * The last 4 digits of the Device Account Number.
   */
  private String virtualLastDigits;

  public CustomerCreditCard() {
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
   * The brand of the card.
   */
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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
   * The card's BIN number.
   */
  public String getFirstDigits() {
    return firstDigits;
  }

  public void setFirstDigits(String firstDigits) {
    this.firstDigits = firstDigits;
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

  /**
   * The source of the card if coming from a wallet such as Apple Pay.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The last 4 digits of the Device Account Number.
   */
  public String getVirtualLastDigits() {
    return virtualLastDigits;
  }

  public void setVirtualLastDigits(String virtualLastDigits) {
    this.virtualLastDigits = virtualLastDigits;
  }

  @Override
  public String toString() {
    return "CustomerCreditCard{billingAddress='" + billingAddress + "', brand='" + brand + "', expiresSoon='" + expiresSoon + "', expiryMonth='" + expiryMonth + "', expiryYear='" + expiryYear + "', firstDigits='" + firstDigits + "', isRevocable='" + isRevocable + "', lastDigits='" + lastDigits + "', maskedNumber='" + maskedNumber + "', name='" + name + "', source='" + source + "', virtualLastDigits='" + virtualLastDigits + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerCreditCard that = (CustomerCreditCard) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(brand, that.brand) &&
        expiresSoon == that.expiresSoon &&
        expiryMonth == that.expiryMonth &&
        expiryYear == that.expiryYear &&
        Objects.equals(firstDigits, that.firstDigits) &&
        isRevocable == that.isRevocable &&
        Objects.equals(lastDigits, that.lastDigits) &&
        Objects.equals(maskedNumber, that.maskedNumber) &&
        Objects.equals(name, that.name) &&
        Objects.equals(source, that.source) &&
        Objects.equals(virtualLastDigits, that.virtualLastDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, brand, expiresSoon, expiryMonth, expiryYear, firstDigits, isRevocable, lastDigits, maskedNumber, name, source, virtualLastDigits);
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
     * The brand of the card.
     */
    private String brand;

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
     * The card's BIN number.
     */
    private String firstDigits;

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

    /**
     * The source of the card if coming from a wallet such as Apple Pay.
     */
    private String source;

    /**
     * The last 4 digits of the Device Account Number.
     */
    private String virtualLastDigits;

    public CustomerCreditCard build() {
      CustomerCreditCard result = new CustomerCreditCard();
      result.billingAddress = this.billingAddress;
      result.brand = this.brand;
      result.expiresSoon = this.expiresSoon;
      result.expiryMonth = this.expiryMonth;
      result.expiryYear = this.expiryYear;
      result.firstDigits = this.firstDigits;
      result.isRevocable = this.isRevocable;
      result.lastDigits = this.lastDigits;
      result.maskedNumber = this.maskedNumber;
      result.name = this.name;
      result.source = this.source;
      result.virtualLastDigits = this.virtualLastDigits;
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
     * The brand of the card.
     */
    public Builder brand(String brand) {
      this.brand = brand;
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
     * The card's BIN number.
     */
    public Builder firstDigits(String firstDigits) {
      this.firstDigits = firstDigits;
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

    /**
     * The source of the card if coming from a wallet such as Apple Pay.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * The last 4 digits of the Device Account Number.
     */
    public Builder virtualLastDigits(String virtualLastDigits) {
      this.virtualLastDigits = virtualLastDigits;
      return this;
    }
  }
}
