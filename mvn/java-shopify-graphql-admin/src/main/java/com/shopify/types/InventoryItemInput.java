package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryItemInput {
  
  private String sku;

  
  private String cost;

  
  private Boolean tracked;

  
  private CountryCode countryCodeOfOrigin;

  
  private String harmonizedSystemCode;

  
  private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

  
  private String provinceCodeOfOrigin;

  
  private InventoryItemMeasurementInput measurement;

  private Boolean requiresShipping;

  public InventoryItemInput() {
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  
  public Boolean getTracked() {
    return tracked;
  }

  public void setTracked(Boolean tracked) {
    this.tracked = tracked;
  }

  
  public CountryCode getCountryCodeOfOrigin() {
    return countryCodeOfOrigin;
  }

  public void setCountryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
    this.countryCodeOfOrigin = countryCodeOfOrigin;
  }

  
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  
  public List<CountryHarmonizedSystemCodeInput> getCountryHarmonizedSystemCodes() {
    return countryHarmonizedSystemCodes;
  }

  public void setCountryHarmonizedSystemCodes(
      List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
    this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
  }

  
  public String getProvinceCodeOfOrigin() {
    return provinceCodeOfOrigin;
  }

  public void setProvinceCodeOfOrigin(String provinceCodeOfOrigin) {
    this.provinceCodeOfOrigin = provinceCodeOfOrigin;
  }

  
  public InventoryItemMeasurementInput getMeasurement() {
    return measurement;
  }

  public void setMeasurement(InventoryItemMeasurementInput measurement) {
    this.measurement = measurement;
  }

  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  @Override
  public String toString() {
    return "InventoryItemInput{sku='" + sku + "', cost='" + cost + "', tracked='" + tracked + "', countryCodeOfOrigin='" + countryCodeOfOrigin + "', harmonizedSystemCode='" + harmonizedSystemCode + "', countryHarmonizedSystemCodes='" + countryHarmonizedSystemCodes + "', provinceCodeOfOrigin='" + provinceCodeOfOrigin + "', measurement='" + measurement + "', requiresShipping='" + requiresShipping + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemInput that = (InventoryItemInput) o;
    return Objects.equals(sku, that.sku) &&
        Objects.equals(cost, that.cost) &&
        Objects.equals(tracked, that.tracked) &&
        Objects.equals(countryCodeOfOrigin, that.countryCodeOfOrigin) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(countryHarmonizedSystemCodes, that.countryHarmonizedSystemCodes) &&
        Objects.equals(provinceCodeOfOrigin, that.provinceCodeOfOrigin) &&
        Objects.equals(measurement, that.measurement) &&
        Objects.equals(requiresShipping, that.requiresShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, cost, tracked, countryCodeOfOrigin, harmonizedSystemCode, countryHarmonizedSystemCodes, provinceCodeOfOrigin, measurement, requiresShipping);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String sku;

    
    private String cost;

    
    private Boolean tracked;

    
    private CountryCode countryCodeOfOrigin;

    
    private String harmonizedSystemCode;

    
    private List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes;

    
    private String provinceCodeOfOrigin;

    
    private InventoryItemMeasurementInput measurement;

    private Boolean requiresShipping;

    public InventoryItemInput build() {
      InventoryItemInput result = new InventoryItemInput();
      result.sku = this.sku;
      result.cost = this.cost;
      result.tracked = this.tracked;
      result.countryCodeOfOrigin = this.countryCodeOfOrigin;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.countryHarmonizedSystemCodes = this.countryHarmonizedSystemCodes;
      result.provinceCodeOfOrigin = this.provinceCodeOfOrigin;
      result.measurement = this.measurement;
      result.requiresShipping = this.requiresShipping;
      return result;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder cost(String cost) {
      this.cost = cost;
      return this;
    }

    
    public Builder tracked(Boolean tracked) {
      this.tracked = tracked;
      return this;
    }

    
    public Builder countryCodeOfOrigin(CountryCode countryCodeOfOrigin) {
      this.countryCodeOfOrigin = countryCodeOfOrigin;
      return this;
    }

    
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    
    public Builder countryHarmonizedSystemCodes(
        List<CountryHarmonizedSystemCodeInput> countryHarmonizedSystemCodes) {
      this.countryHarmonizedSystemCodes = countryHarmonizedSystemCodes;
      return this;
    }

    
    public Builder provinceCodeOfOrigin(String provinceCodeOfOrigin) {
      this.provinceCodeOfOrigin = provinceCodeOfOrigin;
      return this;
    }

    
    public Builder measurement(InventoryItemMeasurementInput measurement) {
      this.measurement = measurement;
      return this;
    }

    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }
  }
}
