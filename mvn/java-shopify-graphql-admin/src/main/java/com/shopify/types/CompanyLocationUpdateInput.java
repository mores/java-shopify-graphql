package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyLocationUpdateInput {
  
  private String name;

  
  private String phone;

  
  private String locale;

  
  private String externalId;

  
  private String note;

  
  private BuyerExperienceConfigurationInput buyerExperienceConfiguration;

  public CompanyLocationUpdateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public BuyerExperienceConfigurationInput getBuyerExperienceConfiguration() {
    return buyerExperienceConfiguration;
  }

  public void setBuyerExperienceConfiguration(
      BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
    this.buyerExperienceConfiguration = buyerExperienceConfiguration;
  }

  @Override
  public String toString() {
    return "CompanyLocationUpdateInput{name='" + name + "', phone='" + phone + "', locale='" + locale + "', externalId='" + externalId + "', note='" + note + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationUpdateInput that = (CompanyLocationUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(buyerExperienceConfiguration, that.buyerExperienceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, locale, externalId, note, buyerExperienceConfiguration);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String phone;

    
    private String locale;

    
    private String externalId;

    
    private String note;

    
    private BuyerExperienceConfigurationInput buyerExperienceConfiguration;

    public CompanyLocationUpdateInput build() {
      CompanyLocationUpdateInput result = new CompanyLocationUpdateInput();
      result.name = this.name;
      result.phone = this.phone;
      result.locale = this.locale;
      result.externalId = this.externalId;
      result.note = this.note;
      result.buyerExperienceConfiguration = this.buyerExperienceConfiguration;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder buyerExperienceConfiguration(
        BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
      this.buyerExperienceConfiguration = buyerExperienceConfiguration;
      return this;
    }
  }
}
