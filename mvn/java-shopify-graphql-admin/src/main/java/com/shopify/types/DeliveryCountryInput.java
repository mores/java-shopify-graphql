package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryCountryInput {
  
  private CountryCode code;

  
  private Boolean restOfWorld;

  
  private List<DeliveryProvinceInput> provinces;

  
  private Boolean includeAllProvinces;

  public DeliveryCountryInput() {
  }

  
  public CountryCode getCode() {
    return code;
  }

  public void setCode(CountryCode code) {
    this.code = code;
  }

  
  public Boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(Boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  
  public List<DeliveryProvinceInput> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<DeliveryProvinceInput> provinces) {
    this.provinces = provinces;
  }

  
  public Boolean getIncludeAllProvinces() {
    return includeAllProvinces;
  }

  public void setIncludeAllProvinces(Boolean includeAllProvinces) {
    this.includeAllProvinces = includeAllProvinces;
  }

  @Override
  public String toString() {
    return "DeliveryCountryInput{code='" + code + "', restOfWorld='" + restOfWorld + "', provinces='" + provinces + "', includeAllProvinces='" + includeAllProvinces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryInput that = (DeliveryCountryInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(restOfWorld, that.restOfWorld) &&
        Objects.equals(provinces, that.provinces) &&
        Objects.equals(includeAllProvinces, that.includeAllProvinces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, restOfWorld, provinces, includeAllProvinces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode code;

    
    private Boolean restOfWorld;

    
    private List<DeliveryProvinceInput> provinces;

    
    private Boolean includeAllProvinces;

    public DeliveryCountryInput build() {
      DeliveryCountryInput result = new DeliveryCountryInput();
      result.code = this.code;
      result.restOfWorld = this.restOfWorld;
      result.provinces = this.provinces;
      result.includeAllProvinces = this.includeAllProvinces;
      return result;
    }

    
    public Builder code(CountryCode code) {
      this.code = code;
      return this;
    }

    
    public Builder restOfWorld(Boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }

    
    public Builder provinces(List<DeliveryProvinceInput> provinces) {
      this.provinces = provinces;
      return this;
    }

    
    public Builder includeAllProvinces(Boolean includeAllProvinces) {
      this.includeAllProvinces = includeAllProvinces;
      return this;
    }
  }
}
