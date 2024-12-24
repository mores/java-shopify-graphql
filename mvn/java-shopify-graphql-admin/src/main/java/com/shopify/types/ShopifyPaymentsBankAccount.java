package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsBankAccount implements com.shopify.types.Node {
  
  private String accountNumber;

  
  private String accountNumberLastDigits;

  
  private String bankName;

  
  private CountryCode country;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currency;

  
  private String id;

  
  private ShopifyPaymentsPayoutConnection payouts;

  
  private String routingNumber;

  
  private ShopifyPaymentsBankAccountStatus status;

  public ShopifyPaymentsBankAccount() {
  }

  
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  public String getAccountNumberLastDigits() {
    return accountNumberLastDigits;
  }

  public void setAccountNumberLastDigits(String accountNumberLastDigits) {
    this.accountNumberLastDigits = accountNumberLastDigits;
  }

  
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ShopifyPaymentsPayoutConnection getPayouts() {
    return payouts;
  }

  public void setPayouts(ShopifyPaymentsPayoutConnection payouts) {
    this.payouts = payouts;
  }

  
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  
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
    
    private String accountNumber;

    
    private String accountNumberLastDigits;

    
    private String bankName;

    
    private CountryCode country;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currency;

    
    private String id;

    
    private ShopifyPaymentsPayoutConnection payouts;

    
    private String routingNumber;

    
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

    
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    
    public Builder accountNumberLastDigits(String accountNumberLastDigits) {
      this.accountNumberLastDigits = accountNumberLastDigits;
      return this;
    }

    
    public Builder bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder payouts(ShopifyPaymentsPayoutConnection payouts) {
      this.payouts = payouts;
      return this;
    }

    
    public Builder routingNumber(String routingNumber) {
      this.routingNumber = routingNumber;
      return this;
    }

    
    public Builder status(ShopifyPaymentsBankAccountStatus status) {
      this.status = status;
      return this;
    }
  }
}
