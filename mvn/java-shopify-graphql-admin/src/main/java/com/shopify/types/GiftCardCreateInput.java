package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


public class GiftCardCreateInput {
  
  private String initialValue;

  
  private String code;

  
  private String customerId;

  
  private LocalDate expiresOn;

  
  private String note;

  
  private GiftCardRecipientInput recipientAttributes;

  
  private String templateSuffix;

  public GiftCardCreateInput() {
  }

  
  public String getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public GiftCardRecipientInput getRecipientAttributes() {
    return recipientAttributes;
  }

  public void setRecipientAttributes(GiftCardRecipientInput recipientAttributes) {
    this.recipientAttributes = recipientAttributes;
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public String toString() {
    return "GiftCardCreateInput{initialValue='" + initialValue + "', code='" + code + "', customerId='" + customerId + "', expiresOn='" + expiresOn + "', note='" + note + "', recipientAttributes='" + recipientAttributes + "', templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardCreateInput that = (GiftCardCreateInput) o;
    return Objects.equals(initialValue, that.initialValue) &&
        Objects.equals(code, that.code) &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(expiresOn, that.expiresOn) &&
        Objects.equals(note, that.note) &&
        Objects.equals(recipientAttributes, that.recipientAttributes) &&
        Objects.equals(templateSuffix, that.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialValue, code, customerId, expiresOn, note, recipientAttributes, templateSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String initialValue;

    
    private String code;

    
    private String customerId;

    
    private LocalDate expiresOn;

    
    private String note;

    
    private GiftCardRecipientInput recipientAttributes;

    
    private String templateSuffix;

    public GiftCardCreateInput build() {
      GiftCardCreateInput result = new GiftCardCreateInput();
      result.initialValue = this.initialValue;
      result.code = this.code;
      result.customerId = this.customerId;
      result.expiresOn = this.expiresOn;
      result.note = this.note;
      result.recipientAttributes = this.recipientAttributes;
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    
    public Builder initialValue(String initialValue) {
      this.initialValue = initialValue;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder recipientAttributes(GiftCardRecipientInput recipientAttributes) {
      this.recipientAttributes = recipientAttributes;
      return this;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }
  }
}
