package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerPaypalBillingAgreement implements CustomerPaymentInstrument {
  
  private CustomerPaymentInstrumentBillingAddress billingAddress;

  
  private boolean inactive;

  
  private boolean isRevocable;

  
  private String paypalAccountEmail;

  public CustomerPaypalBillingAgreement() {
  }

  
  public CustomerPaymentInstrumentBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
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

  
  public String getPaypalAccountEmail() {
    return paypalAccountEmail;
  }

  public void setPaypalAccountEmail(String paypalAccountEmail) {
    this.paypalAccountEmail = paypalAccountEmail;
  }

  @Override
  public String toString() {
    return "CustomerPaypalBillingAgreement{billingAddress='" + billingAddress + "', inactive='" + inactive + "', isRevocable='" + isRevocable + "', paypalAccountEmail='" + paypalAccountEmail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaypalBillingAgreement that = (CustomerPaypalBillingAgreement) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        inactive == that.inactive &&
        isRevocable == that.isRevocable &&
        Objects.equals(paypalAccountEmail, that.paypalAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, inactive, isRevocable, paypalAccountEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerPaymentInstrumentBillingAddress billingAddress;

    
    private boolean inactive;

    
    private boolean isRevocable;

    
    private String paypalAccountEmail;

    public CustomerPaypalBillingAgreement build() {
      CustomerPaypalBillingAgreement result = new CustomerPaypalBillingAgreement();
      result.billingAddress = this.billingAddress;
      result.inactive = this.inactive;
      result.isRevocable = this.isRevocable;
      result.paypalAccountEmail = this.paypalAccountEmail;
      return result;
    }

    
    public Builder billingAddress(CustomerPaymentInstrumentBillingAddress billingAddress) {
      this.billingAddress = billingAddress;
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

    
    public Builder paypalAccountEmail(String paypalAccountEmail) {
      this.paypalAccountEmail = paypalAccountEmail;
      return this;
    }
  }
}
