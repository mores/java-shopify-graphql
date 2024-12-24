package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodShippingOptionInput {
  
  private String title;

  
  private String presentmentTitle;

  
  private String description;

  
  private String code;

  
  private String carrierServiceId;

  public SubscriptionDeliveryMethodShippingOptionInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShippingOptionInput{title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', carrierServiceId='" + carrierServiceId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShippingOptionInput that = (SubscriptionDeliveryMethodShippingOptionInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(carrierServiceId, that.carrierServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, presentmentTitle, description, code, carrierServiceId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private String presentmentTitle;

    
    private String description;

    
    private String code;

    
    private String carrierServiceId;

    public SubscriptionDeliveryMethodShippingOptionInput build() {
      SubscriptionDeliveryMethodShippingOptionInput result = new SubscriptionDeliveryMethodShippingOptionInput();
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.carrierServiceId = this.carrierServiceId;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
      return this;
    }
  }
}
