package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


public class GiftCardUpdateInput {
  
  private String note;

  
  private LocalDate expiresOn;

  
  private String customerId;

  
  private GiftCardRecipientInput recipientAttributes;

  
  private String templateSuffix;

  public GiftCardUpdateInput() {
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public LocalDate getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(LocalDate expiresOn) {
    this.expiresOn = expiresOn;
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
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
    return "GiftCardUpdateInput{note='" + note + "', expiresOn='" + expiresOn + "', customerId='" + customerId + "', recipientAttributes='" + recipientAttributes + "', templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardUpdateInput that = (GiftCardUpdateInput) o;
    return Objects.equals(note, that.note) &&
        Objects.equals(expiresOn, that.expiresOn) &&
        Objects.equals(customerId, that.customerId) &&
        Objects.equals(recipientAttributes, that.recipientAttributes) &&
        Objects.equals(templateSuffix, that.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, expiresOn, customerId, recipientAttributes, templateSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String note;

    
    private LocalDate expiresOn;

    
    private String customerId;

    
    private GiftCardRecipientInput recipientAttributes;

    
    private String templateSuffix;

    public GiftCardUpdateInput build() {
      GiftCardUpdateInput result = new GiftCardUpdateInput();
      result.note = this.note;
      result.expiresOn = this.expiresOn;
      result.customerId = this.customerId;
      result.recipientAttributes = this.recipientAttributes;
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder expiresOn(LocalDate expiresOn) {
      this.expiresOn = expiresOn;
      return this;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
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
