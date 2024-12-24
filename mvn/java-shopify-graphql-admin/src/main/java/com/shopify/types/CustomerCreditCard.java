package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerCreditCard implements CustomerPaymentInstrument {
  
  private CustomerCreditCardBillingAddress billingAddress;

  
  private String brand;

  
  private boolean expiresSoon;

  
  private int expiryMonth;

  
  private int expiryYear;

  
  private String firstDigits;

  
  private boolean isRevocable;

  
  private String lastDigits;

  
  private String maskedNumber;

  
  private String name;

  
  private String source;

  
  private String virtualLastDigits;

  public CustomerCreditCard() {
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

  
  public boolean getExpiresSoon() {
    return expiresSoon;
  }

  public void setExpiresSoon(boolean expiresSoon) {
    this.expiresSoon = expiresSoon;
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

  
  public String getFirstDigits() {
    return firstDigits;
  }

  public void setFirstDigits(String firstDigits) {
    this.firstDigits = firstDigits;
  }

  
  public boolean getIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  
  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
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
    
    private CustomerCreditCardBillingAddress billingAddress;

    
    private String brand;

    
    private boolean expiresSoon;

    
    private int expiryMonth;

    
    private int expiryYear;

    
    private String firstDigits;

    
    private boolean isRevocable;

    
    private String lastDigits;

    
    private String maskedNumber;

    
    private String name;

    
    private String source;

    
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

    
    public Builder billingAddress(CustomerCreditCardBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    
    public Builder expiresSoon(boolean expiresSoon) {
      this.expiresSoon = expiresSoon;
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

    
    public Builder firstDigits(String firstDigits) {
      this.firstDigits = firstDigits;
      return this;
    }

    
    public Builder isRevocable(boolean isRevocable) {
      this.isRevocable = isRevocable;
      return this;
    }

    
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
      return this;
    }

    
    public Builder maskedNumber(String maskedNumber) {
      this.maskedNumber = maskedNumber;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder virtualLastDigits(String virtualLastDigits) {
      this.virtualLastDigits = virtualLastDigits;
      return this;
    }
  }
}
