package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryCountryCodesOrRestOfWorld {
  
  private List<CountryCode> countryCodes;

  
  private boolean restOfWorld;

  public DeliveryCountryCodesOrRestOfWorld() {
  }

  
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  
  public boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  @Override
  public String toString() {
    return "DeliveryCountryCodesOrRestOfWorld{countryCodes='" + countryCodes + "', restOfWorld='" + restOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryCodesOrRestOfWorld that = (DeliveryCountryCodesOrRestOfWorld) o;
    return Objects.equals(countryCodes, that.countryCodes) &&
        restOfWorld == that.restOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, restOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CountryCode> countryCodes;

    
    private boolean restOfWorld;

    public DeliveryCountryCodesOrRestOfWorld build() {
      DeliveryCountryCodesOrRestOfWorld result = new DeliveryCountryCodesOrRestOfWorld();
      result.countryCodes = this.countryCodes;
      result.restOfWorld = this.restOfWorld;
      return result;
    }

    
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    
    public Builder restOfWorld(boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }
  }
}
