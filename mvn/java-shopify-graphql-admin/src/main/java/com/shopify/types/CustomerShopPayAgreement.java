package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerShopPayAgreement implements CustomerPaymentInstrument {
  
  private CustomerCreditCardBillingAddress billingAddress;

  
  private boolean expiresSoon;

  
  private int expiryMonth;

  
  private int expiryYear;

  
  private boolean inactive;

  
  private boolean isRevocable;

  
  private String lastDigits;

  
  private String maskedNumber;

  
  private String name;

  public CustomerShopPayAgreement() {
  }

  
  public CustomerCreditCardBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerCreditCardBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
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

  
  public boolean getInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
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
    
    private CustomerCreditCardBillingAddress billingAddress;

    
    private boolean expiresSoon;

    
    private int expiryMonth;

    
    private int expiryYear;

    
    private boolean inactive;

    
    private boolean isRevocable;

    
    private String lastDigits;

    
    private String maskedNumber;

    
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

    
    public Builder billingAddress(CustomerCreditCardBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
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

    
    public Builder inactive(boolean inactive) {
      this.inactive = inactive;
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
  }
}
