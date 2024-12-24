package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class VaultPaypalBillingAgreement implements PaymentInstrument {
  
  private boolean inactive;

  
  private String name;

  
  private String paypalAccountEmail;

  public VaultPaypalBillingAgreement() {
  }

  
  public boolean getInactive() {
    return inactive;
  }

  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getPaypalAccountEmail() {
    return paypalAccountEmail;
  }

  public void setPaypalAccountEmail(String paypalAccountEmail) {
    this.paypalAccountEmail = paypalAccountEmail;
  }

  @Override
  public String toString() {
    return "VaultPaypalBillingAgreement{inactive='" + inactive + "', name='" + name + "', paypalAccountEmail='" + paypalAccountEmail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VaultPaypalBillingAgreement that = (VaultPaypalBillingAgreement) o;
    return inactive == that.inactive &&
        Objects.equals(name, that.name) &&
        Objects.equals(paypalAccountEmail, that.paypalAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inactive, name, paypalAccountEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean inactive;

    
    private String name;

    
    private String paypalAccountEmail;

    public VaultPaypalBillingAgreement build() {
      VaultPaypalBillingAgreement result = new VaultPaypalBillingAgreement();
      result.inactive = this.inactive;
      result.name = this.name;
      result.paypalAccountEmail = this.paypalAccountEmail;
      return result;
    }

    
    public Builder inactive(boolean inactive) {
      this.inactive = inactive;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder paypalAccountEmail(String paypalAccountEmail) {
      this.paypalAccountEmail = paypalAccountEmail;
      return this;
    }
  }
}
