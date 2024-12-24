package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderInput {
  
  private String id;

  
  private String email;

  
  private String note;

  
  private List<String> tags;

  
  private MailingAddressInput shippingAddress;

  
  private List<AttributeInput> customAttributes;

  
  private List<MetafieldInput> metafields;

  
  private String poNumber;

  public OrderInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  @Override
  public String toString() {
    return "OrderInput{id='" + id + "', email='" + email + "', note='" + note + "', tags='" + tags + "', shippingAddress='" + shippingAddress + "', customAttributes='" + customAttributes + "', metafields='" + metafields + "', poNumber='" + poNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderInput that = (OrderInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(email, that.email) &&
        Objects.equals(note, that.note) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(poNumber, that.poNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, note, tags, shippingAddress, customAttributes, metafields, poNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String email;

    
    private String note;

    
    private List<String> tags;

    
    private MailingAddressInput shippingAddress;

    
    private List<AttributeInput> customAttributes;

    
    private List<MetafieldInput> metafields;

    
    private String poNumber;

    public OrderInput build() {
      OrderInput result = new OrderInput();
      result.id = this.id;
      result.email = this.email;
      result.note = this.note;
      result.tags = this.tags;
      result.shippingAddress = this.shippingAddress;
      result.customAttributes = this.customAttributes;
      result.metafields = this.metafields;
      result.poNumber = this.poNumber;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }
  }
}
