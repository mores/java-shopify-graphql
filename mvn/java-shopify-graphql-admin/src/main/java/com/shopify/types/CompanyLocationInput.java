package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationInput {
  
  private String name;

  
  private String phone;

  
  private String locale;

  
  private String externalId;

  
  private String note;

  
  private BuyerExperienceConfigurationInput buyerExperienceConfiguration;

  
  private CompanyAddressInput billingAddress;

  
  private CompanyAddressInput shippingAddress;

  
  private Boolean billingSameAsShipping;

  
  private String taxRegistrationId;

  
  private List<TaxExemption> taxExemptions;

  public CompanyLocationInput() {
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

  
  public CompanyAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(CompanyAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public CompanyAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(CompanyAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public Boolean getBillingSameAsShipping() {
    return billingSameAsShipping;
  }

  public void setBillingSameAsShipping(Boolean billingSameAsShipping) {
    this.billingSameAsShipping = billingSameAsShipping;
  }

  
  public String getTaxRegistrationId() {
    return taxRegistrationId;
  }

  public void setTaxRegistrationId(String taxRegistrationId) {
    this.taxRegistrationId = taxRegistrationId;
  }

  
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  @Override
  public String toString() {
    return "CompanyLocationInput{name='" + name + "', phone='" + phone + "', locale='" + locale + "', externalId='" + externalId + "', note='" + note + "', buyerExperienceConfiguration='" + buyerExperienceConfiguration + "', billingAddress='" + billingAddress + "', shippingAddress='" + shippingAddress + "', billingSameAsShipping='" + billingSameAsShipping + "', taxRegistrationId='" + taxRegistrationId + "', taxExemptions='" + taxExemptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationInput that = (CompanyLocationInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(note, that.note) &&
        Objects.equals(buyerExperienceConfiguration, that.buyerExperienceConfiguration) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(billingSameAsShipping, that.billingSameAsShipping) &&
        Objects.equals(taxRegistrationId, that.taxRegistrationId) &&
        Objects.equals(taxExemptions, that.taxExemptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, locale, externalId, note, buyerExperienceConfiguration, billingAddress, shippingAddress, billingSameAsShipping, taxRegistrationId, taxExemptions);
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

    
    private CompanyAddressInput billingAddress;

    
    private CompanyAddressInput shippingAddress;

    
    private Boolean billingSameAsShipping;

    
    private String taxRegistrationId;

    
    private List<TaxExemption> taxExemptions;

    public CompanyLocationInput build() {
      CompanyLocationInput result = new CompanyLocationInput();
      result.name = this.name;
      result.phone = this.phone;
      result.locale = this.locale;
      result.externalId = this.externalId;
      result.note = this.note;
      result.buyerExperienceConfiguration = this.buyerExperienceConfiguration;
      result.billingAddress = this.billingAddress;
      result.shippingAddress = this.shippingAddress;
      result.billingSameAsShipping = this.billingSameAsShipping;
      result.taxRegistrationId = this.taxRegistrationId;
      result.taxExemptions = this.taxExemptions;
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

    
    public Builder billingAddress(CompanyAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder shippingAddress(CompanyAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder billingSameAsShipping(Boolean billingSameAsShipping) {
      this.billingSameAsShipping = billingSameAsShipping;
      return this;
    }

    
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
      return this;
    }

    
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }
  }
}
