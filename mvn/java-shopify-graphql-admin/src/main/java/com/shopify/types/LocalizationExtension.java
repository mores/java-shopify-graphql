package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class LocalizationExtension {
  
  private CountryCode countryCode;

  
  private LocalizationExtensionKey key;

  
  private LocalizationExtensionPurpose purpose;

  
  private String title;

  
  private String value;

  public LocalizationExtension() {
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  
  public LocalizationExtensionKey getKey() {
    return key;
  }

  public void setKey(LocalizationExtensionKey key) {
    this.key = key;
  }

  
  public LocalizationExtensionPurpose getPurpose() {
    return purpose;
  }

  public void setPurpose(LocalizationExtensionPurpose purpose) {
    this.purpose = purpose;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "LocalizationExtension{countryCode='" + countryCode + "', key='" + key + "', purpose='" + purpose + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalizationExtension that = (LocalizationExtension) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(key, that.key) &&
        Objects.equals(purpose, that.purpose) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, key, purpose, title, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode countryCode;

    
    private LocalizationExtensionKey key;

    
    private LocalizationExtensionPurpose purpose;

    
    private String title;

    
    private String value;

    public LocalizationExtension build() {
      LocalizationExtension result = new LocalizationExtension();
      result.countryCode = this.countryCode;
      result.key = this.key;
      result.purpose = this.purpose;
      result.title = this.title;
      result.value = this.value;
      return result;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder key(LocalizationExtensionKey key) {
      this.key = key;
      return this;
    }

    
    public Builder purpose(LocalizationExtensionPurpose purpose) {
      this.purpose = purpose;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
