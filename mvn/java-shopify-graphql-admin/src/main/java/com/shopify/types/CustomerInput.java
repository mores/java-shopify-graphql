package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerInput {
  
  private List<MailingAddressInput> addresses;

  
  private String email;

  
  private String firstName;

  
  private String id;

  
  private String lastName;

  
  private String locale;

  
  private List<MetafieldInput> metafields;

  
  private String note;

  
  private String phone;

  
  private List<String> tags;

  
  private CustomerEmailMarketingConsentInput emailMarketingConsent;

  
  private CustomerSmsMarketingConsentInput smsMarketingConsent;

  
  private Boolean taxExempt;

  
  private List<TaxExemption> taxExemptions;

  public CustomerInput() {
  }

  
  public List<MailingAddressInput> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<MailingAddressInput> addresses) {
    this.addresses = addresses;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  
  public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  @Override
  public String toString() {
    return "CustomerInput{addresses='" + addresses + "', email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', locale='" + locale + "', metafields='" + metafields + "', note='" + note + "', phone='" + phone + "', tags='" + tags + "', emailMarketingConsent='" + emailMarketingConsent + "', smsMarketingConsent='" + smsMarketingConsent + "', taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerInput that = (CustomerInput) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(note, that.note) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(emailMarketingConsent, that.emailMarketingConsent) &&
        Objects.equals(smsMarketingConsent, that.smsMarketingConsent) &&
        Objects.equals(taxExempt, that.taxExempt) &&
        Objects.equals(taxExemptions, that.taxExemptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, email, firstName, id, lastName, locale, metafields, note, phone, tags, emailMarketingConsent, smsMarketingConsent, taxExempt, taxExemptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<MailingAddressInput> addresses;

    
    private String email;

    
    private String firstName;

    
    private String id;

    
    private String lastName;

    
    private String locale;

    
    private List<MetafieldInput> metafields;

    
    private String note;

    
    private String phone;

    
    private List<String> tags;

    
    private CustomerEmailMarketingConsentInput emailMarketingConsent;

    
    private CustomerSmsMarketingConsentInput smsMarketingConsent;

    
    private Boolean taxExempt;

    
    private List<TaxExemption> taxExemptions;

    public CustomerInput build() {
      CustomerInput result = new CustomerInput();
      result.addresses = this.addresses;
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.locale = this.locale;
      result.metafields = this.metafields;
      result.note = this.note;
      result.phone = this.phone;
      result.tags = this.tags;
      result.emailMarketingConsent = this.emailMarketingConsent;
      result.smsMarketingConsent = this.smsMarketingConsent;
      result.taxExempt = this.taxExempt;
      result.taxExemptions = this.taxExemptions;
      return result;
    }

    
    public Builder addresses(List<MailingAddressInput> addresses) {
      this.addresses = addresses;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }

    
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }

    
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }
  }
}
