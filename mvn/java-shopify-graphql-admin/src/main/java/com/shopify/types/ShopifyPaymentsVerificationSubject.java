package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsVerificationSubject {
  
  private String familyName;

  
  private String givenName;

  public ShopifyPaymentsVerificationSubject() {
  }

  
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsVerificationSubject{familyName='" + familyName + "', givenName='" + givenName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsVerificationSubject that = (ShopifyPaymentsVerificationSubject) o;
    return Objects.equals(familyName, that.familyName) &&
        Objects.equals(givenName, that.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String familyName;

    
    private String givenName;

    public ShopifyPaymentsVerificationSubject build() {
      ShopifyPaymentsVerificationSubject result = new ShopifyPaymentsVerificationSubject();
      result.familyName = this.familyName;
      result.givenName = this.givenName;
      return result;
    }

    
    public Builder familyName(String familyName) {
      this.familyName = familyName;
      return this;
    }

    
    public Builder givenName(String givenName) {
      this.givenName = givenName;
      return this;
    }
  }
}
