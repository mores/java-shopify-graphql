package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A bank account that can receive payouts.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsBankAccount implements com.shopify.types.Node {
  /**
   * The account number of the bank account.
   */
  private String accountNumber;

  /**
   * The last digits of the account number (the rest is redacted).
   */
  private String accountNumberLastDigits;

  /**
   * The name of the bank.
   */
  private String bankName;

  /**
   * The country of the bank.
   */
  private CountryCode country;

  /**
   * The date that the bank account was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The currency of the bank account.
   */
  private CurrencyCode currency;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * All current and previous payouts made between the account and the bank account.
   */
  private ShopifyPaymentsPayoutConnection payouts;

  /**
   * The routing number of the bank account.
   */
  private String routingNumber;

  /**
   * The status of the bank account.
   */
  private ShopifyPaymentsBankAccountStatus status;

  public ShopifyPaymentsBankAccount() {
  }

  /**
   * The account number of the bank account.
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The last digits of the account number (the rest is redacted).
   */
  public String getAccountNumberLastDigits() {
    return accountNumberLastDigits;
  }

  public void setAccountNumberLastDigits(String accountNumberLastDigits) {
    this.accountNumberLastDigits = accountNumberLastDigits;
  }

  /**
   * The name of the bank.
   */
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  /**
   * The country of the bank.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  /**
   * The date that the bank account was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The currency of the bank account.
   */
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * All current and previous payouts made between the account and the bank account.
   */
  public ShopifyPaymentsPayoutConnection getPayouts() {
    return payouts;
  }

  public void setPayouts(ShopifyPaymentsPayoutConnection payouts) {
    this.payouts = payouts;
  }

  /**
   * The routing number of the bank account.
   */
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  /**
   * The status of the bank account.
   */
  public ShopifyPaymentsBankAccountStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsBankAccountStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsBankAccount{accountNumber='" + accountNumber + "', accountNumberLastDigits='" + accountNumberLastDigits + "', bankName='" + bankName + "', country='" + country + "', createdAt='" + createdAt + "', currency='" + currency + "', id='" + id + "', payouts='" + payouts + "', routingNumber='" + routingNumber + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsBankAccount that = (ShopifyPaymentsBankAccount) o;
    return Objects.equals(accountNumber, that.accountNumber) &&
        Objects.equals(accountNumberLastDigits, that.accountNumberLastDigits) &&
        Objects.equals(bankName, that.bankName) &&
        Objects.equals(country, that.country) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(id, that.id) &&
        Objects.equals(payouts, that.payouts) &&
        Objects.equals(routingNumber, that.routingNumber) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountNumberLastDigits, bankName, country, createdAt, currency, id, payouts, routingNumber, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The account number of the bank account.
     */
    private String accountNumber;

    /**
     * The last digits of the account number (the rest is redacted).
     */
    private String accountNumberLastDigits;

    /**
     * The name of the bank.
     */
    private String bankName;

    /**
     * The country of the bank.
     */
    private CountryCode country;

    /**
     * The date that the bank account was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The currency of the bank account.
     */
    private CurrencyCode currency;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * All current and previous payouts made between the account and the bank account.
     */
    private ShopifyPaymentsPayoutConnection payouts;

    /**
     * The routing number of the bank account.
     */
    private String routingNumber;

    /**
     * The status of the bank account.
     */
    private ShopifyPaymentsBankAccountStatus status;

    public ShopifyPaymentsBankAccount build() {
      ShopifyPaymentsBankAccount result = new ShopifyPaymentsBankAccount();
      result.accountNumber = this.accountNumber;
      result.accountNumberLastDigits = this.accountNumberLastDigits;
      result.bankName = this.bankName;
      result.country = this.country;
      result.createdAt = this.createdAt;
      result.currency = this.currency;
      result.id = this.id;
      result.payouts = this.payouts;
      result.routingNumber = this.routingNumber;
      result.status = this.status;
      return result;
    }

    /**
     * The account number of the bank account.
     */
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /**
     * The last digits of the account number (the rest is redacted).
     */
    public Builder accountNumberLastDigits(String accountNumberLastDigits) {
      this.accountNumberLastDigits = accountNumberLastDigits;
      return this;
    }

    /**
     * The name of the bank.
     */
    public Builder bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    /**
     * The country of the bank.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    /**
     * The date that the bank account was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The currency of the bank account.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * All current and previous payouts made between the account and the bank account.
     */
    public Builder payouts(ShopifyPaymentsPayoutConnection payouts) {
      this.payouts = payouts;
      return this;
    }

    /**
     * The routing number of the bank account.
     */
    public Builder routingNumber(String routingNumber) {
      this.routingNumber = routingNumber;
      return this;
    }

    /**
     * The status of the bank account.
     */
    public Builder status(ShopifyPaymentsBankAccountStatus status) {
      this.status = status;
      return this;
    }
  }
}
