package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a credit card payment instrument.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class VaultCreditCard implements PaymentInstrument {
  /**
   * The billing address of the card.
   */
  private CustomerCreditCardBillingAddress billingAddress;

  /**
   * The brand for the card.
   */
  private String brand;

  /**
   * Whether the card has been expired.
   */
  private boolean expired;

  /**
   * The expiry month of the card.
   */
  private int expiryMonth;

  /**
   * The expiry year of the card.
   */
  private int expiryYear;

  /**
   * The last four digits for the card.
   */
  private String lastDigits;

  /**
   * The name of the card holder.
   */
  private String name;

  public VaultCreditCard() {
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
   * The brand for the card.
   */
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Whether the card has been expired.
   */
  public boolean getExpired() {
    return expired;
  }

  public void setExpired(boolean expired) {
    this.expired = expired;
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
   * The last four digits for the card.
   */
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
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
    return "VaultCreditCard{billingAddress='" + billingAddress + "', brand='" + brand + "', expired='" + expired + "', expiryMonth='" + expiryMonth + "', expiryYear='" + expiryYear + "', lastDigits='" + lastDigits + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VaultCreditCard that = (VaultCreditCard) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(brand, that.brand) &&
        expired == that.expired &&
        expiryMonth == that.expiryMonth &&
        expiryYear == that.expiryYear &&
        Objects.equals(lastDigits, that.lastDigits) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, brand, expired, expiryMonth, expiryYear, lastDigits, name);
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
     * The brand for the card.
     */
    private String brand;

    /**
     * Whether the card has been expired.
     */
    private boolean expired;

    /**
     * The expiry month of the card.
     */
    private int expiryMonth;

    /**
     * The expiry year of the card.
     */
    private int expiryYear;

    /**
     * The last four digits for the card.
     */
    private String lastDigits;

    /**
     * The name of the card holder.
     */
    private String name;

    public VaultCreditCard build() {
      VaultCreditCard result = new VaultCreditCard();
      result.billingAddress = this.billingAddress;
      result.brand = this.brand;
      result.expired = this.expired;
      result.expiryMonth = this.expiryMonth;
      result.expiryYear = this.expiryYear;
      result.lastDigits = this.lastDigits;
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
     * The brand for the card.
     */
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    /**
     * Whether the card has been expired.
     */
    public Builder expired(boolean expired) {
      this.expired = expired;
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
     * The last four digits for the card.
     */
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
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
