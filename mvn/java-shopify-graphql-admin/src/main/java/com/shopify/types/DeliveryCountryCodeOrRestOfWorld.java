package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryCountryCodeOrRestOfWorld {
  
  private CountryCode countryCode;

  
  private boolean restOfWorld;

  public DeliveryCountryCodeOrRestOfWorld() {
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  
  public boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  @Override
  public String toString() {
    return "DeliveryCountryCodeOrRestOfWorld{countryCode='" + countryCode + "', restOfWorld='" + restOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryCodeOrRestOfWorld that = (DeliveryCountryCodeOrRestOfWorld) o;
    return Objects.equals(countryCode, that.countryCode) &&
        restOfWorld == that.restOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, restOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode countryCode;

    
    private boolean restOfWorld;

    public DeliveryCountryCodeOrRestOfWorld build() {
      DeliveryCountryCodeOrRestOfWorld result = new DeliveryCountryCodeOrRestOfWorld();
      result.countryCode = this.countryCode;
      result.restOfWorld = this.restOfWorld;
      return result;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder restOfWorld(boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }
  }
}
