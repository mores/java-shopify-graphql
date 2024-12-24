package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodShippingOption {
  
  private DeliveryCarrierService carrierService;

  
  private String code;

  
  private String description;

  
  private String presentmentTitle;

  
  private String title;

  public SubscriptionDeliveryMethodShippingOption() {
  }

  
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodShippingOption{carrierService='" + carrierService + "', code='" + code + "', description='" + description + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodShippingOption that = (SubscriptionDeliveryMethodShippingOption) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, code, description, presentmentTitle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryCarrierService carrierService;

    
    private String code;

    
    private String description;

    
    private String presentmentTitle;

    
    private String title;

    public SubscriptionDeliveryMethodShippingOption build() {
      SubscriptionDeliveryMethodShippingOption result = new SubscriptionDeliveryMethodShippingOption();
      result.carrierService = this.carrierService;
      result.code = this.code;
      result.description = this.description;
      result.presentmentTitle = this.presentmentTitle;
      result.title = this.title;
      return result;
    }

    
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
