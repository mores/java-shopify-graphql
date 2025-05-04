package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Card payment details related to a transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CardPaymentDetails implements PaymentDetails, com.shopify.admin.types.BasePaymentDetails {
  /**
   * The response code from the address verification system (AVS). The code is always a single letter.
   */
  private String avsResultCode;

  /**
   * The issuer identification number (IIN), formerly known as bank identification
   * number (BIN) of the customer's credit card. This is made up of the first few
   * digits of the credit card number.
   */
  private String bin;

  /**
   * The name of the company that issued the customer's credit card.
   */
  private String company;

  /**
   * The response code from the credit card company indicating whether the customer
   * entered the card security code, or card verification value, correctly. The
   * code is a single letter or empty string.
   */
  private String cvvResultCode;

  /**
   * The month in which the used credit card expires.
   */
  private Integer expirationMonth;

  /**
   * The year in which the used credit card expires.
   */
  private Integer expirationYear;

  /**
   * The holder of the credit card.
   */
  private String name;

  /**
   * The customer's credit card number, with most of the leading digits redacted.
   */
  private String number;

  /**
   * The name of payment method used by the buyer.
   */
  private String paymentMethodName;

  /**
   * Digital wallet used for the payment.
   */
  private DigitalWallet wallet;

  public CardPaymentDetails() {
  }

  /**
   * The response code from the address verification system (AVS). The code is always a single letter.
   */
  public String getAvsResultCode() {
    return avsResultCode;
  }

  public void setAvsResultCode(String avsResultCode) {
    this.avsResultCode = avsResultCode;
  }

  /**
   * The issuer identification number (IIN), formerly known as bank identification
   * number (BIN) of the customer's credit card. This is made up of the first few
   * digits of the credit card number.
   */
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  /**
   * The name of the company that issued the customer's credit card.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The response code from the credit card company indicating whether the customer
   * entered the card security code, or card verification value, correctly. The
   * code is a single letter or empty string.
   */
  public String getCvvResultCode() {
    return cvvResultCode;
  }

  public void setCvvResultCode(String cvvResultCode) {
    this.cvvResultCode = cvvResultCode;
  }

  /**
   * The month in which the used credit card expires.
   */
  public Integer getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  /**
   * The year in which the used credit card expires.
   */
  public Integer getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(Integer expirationYear) {
    this.expirationYear = expirationYear;
  }

  /**
   * The holder of the credit card.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The customer's credit card number, with most of the leading digits redacted.
   */
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * The name of payment method used by the buyer.
   */
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  /**
   * Digital wallet used for the payment.
   */
  public DigitalWallet getWallet() {
    return wallet;
  }

  public void setWallet(DigitalWallet wallet) {
    this.wallet = wallet;
  }

  @Override
  public String toString() {
    return "CardPaymentDetails{avsResultCode='" + avsResultCode + "', bin='" + bin + "', company='" + company + "', cvvResultCode='" + cvvResultCode + "', expirationMonth='" + expirationMonth + "', expirationYear='" + expirationYear + "', name='" + name + "', number='" + number + "', paymentMethodName='" + paymentMethodName + "', wallet='" + wallet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CardPaymentDetails that = (CardPaymentDetails) o;
    return Objects.equals(avsResultCode, that.avsResultCode) &&
        Objects.equals(bin, that.bin) &&
        Objects.equals(company, that.company) &&
        Objects.equals(cvvResultCode, that.cvvResultCode) &&
        Objects.equals(expirationMonth, that.expirationMonth) &&
        Objects.equals(expirationYear, that.expirationYear) &&
        Objects.equals(name, that.name) &&
        Objects.equals(number, that.number) &&
        Objects.equals(paymentMethodName, that.paymentMethodName) &&
        Objects.equals(wallet, that.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avsResultCode, bin, company, cvvResultCode, expirationMonth, expirationYear, name, number, paymentMethodName, wallet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The response code from the address verification system (AVS). The code is always a single letter.
     */
    private String avsResultCode;

    /**
     * The issuer identification number (IIN), formerly known as bank identification
     * number (BIN) of the customer's credit card. This is made up of the first few
     * digits of the credit card number.
     */
    private String bin;

    /**
     * The name of the company that issued the customer's credit card.
     */
    private String company;

    /**
     * The response code from the credit card company indicating whether the customer
     * entered the card security code, or card verification value, correctly. The
     * code is a single letter or empty string.
     */
    private String cvvResultCode;

    /**
     * The month in which the used credit card expires.
     */
    private Integer expirationMonth;

    /**
     * The year in which the used credit card expires.
     */
    private Integer expirationYear;

    /**
     * The holder of the credit card.
     */
    private String name;

    /**
     * The customer's credit card number, with most of the leading digits redacted.
     */
    private String number;

    /**
     * The name of payment method used by the buyer.
     */
    private String paymentMethodName;

    /**
     * Digital wallet used for the payment.
     */
    private DigitalWallet wallet;

    public CardPaymentDetails build() {
      CardPaymentDetails result = new CardPaymentDetails();
      result.avsResultCode = this.avsResultCode;
      result.bin = this.bin;
      result.company = this.company;
      result.cvvResultCode = this.cvvResultCode;
      result.expirationMonth = this.expirationMonth;
      result.expirationYear = this.expirationYear;
      result.name = this.name;
      result.number = this.number;
      result.paymentMethodName = this.paymentMethodName;
      result.wallet = this.wallet;
      return result;
    }

    /**
     * The response code from the address verification system (AVS). The code is always a single letter.
     */
    public Builder avsResultCode(String avsResultCode) {
      this.avsResultCode = avsResultCode;
      return this;
    }

    /**
     * The issuer identification number (IIN), formerly known as bank identification
     * number (BIN) of the customer's credit card. This is made up of the first few
     * digits of the credit card number.
     */
    public Builder bin(String bin) {
      this.bin = bin;
      return this;
    }

    /**
     * The name of the company that issued the customer's credit card.
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The response code from the credit card company indicating whether the customer
     * entered the card security code, or card verification value, correctly. The
     * code is a single letter or empty string.
     */
    public Builder cvvResultCode(String cvvResultCode) {
      this.cvvResultCode = cvvResultCode;
      return this;
    }

    /**
     * The month in which the used credit card expires.
     */
    public Builder expirationMonth(Integer expirationMonth) {
      this.expirationMonth = expirationMonth;
      return this;
    }

    /**
     * The year in which the used credit card expires.
     */
    public Builder expirationYear(Integer expirationYear) {
      this.expirationYear = expirationYear;
      return this;
    }

    /**
     * The holder of the credit card.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The customer's credit card number, with most of the leading digits redacted.
     */
    public Builder number(String number) {
      this.number = number;
      return this;
    }

    /**
     * The name of payment method used by the buyer.
     */
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }

    /**
     * Digital wallet used for the payment.
     */
    public Builder wallet(DigitalWallet wallet) {
      this.wallet = wallet;
      return this;
    }
  }
}
