package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class VaultCreditCard implements PaymentInstrument {
  
  private CustomerCreditCardBillingAddress billingAddress;

  
  private String brand;

  
  private boolean expired;

  
  private int expiryMonth;

  
  private int expiryYear;

  
  private String lastDigits;

  
  private String name;

  public VaultCreditCard() {
  }

  
  public CustomerCreditCardBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerCreditCardBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  public boolean getExpired() {
    return expired;
  }

  public void setExpired(boolean expired) {
    this.expired = expired;
  }

  
  public int getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(int expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  
  public int getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(int expiryYear) {
    this.expiryYear = expiryYear;
  }

  
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  
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
    
    private CustomerCreditCardBillingAddress billingAddress;

    
    private String brand;

    
    private boolean expired;

    
    private int expiryMonth;

    
    private int expiryYear;

    
    private String lastDigits;

    
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

    
    public Builder billingAddress(CustomerCreditCardBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    
    public Builder expired(boolean expired) {
      this.expired = expired;
      return this;
    }

    
    public Builder expiryMonth(int expiryMonth) {
      this.expiryMonth = expiryMonth;
      return this;
    }

    
    public Builder expiryYear(int expiryYear) {
      this.expiryYear = expiryYear;
      return this;
    }

    
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
