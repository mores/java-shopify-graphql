package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionShippingOption implements SubscriptionDeliveryOption {
  
  private DeliveryCarrierService carrierService;

  
  private String code;

  
  private String description;

  
  private Boolean phoneRequired;

  
  private String presentmentTitle;

  
  private MoneyV2 price;

  
  private String title;

  public SubscriptionShippingOption() {
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

  
  public Boolean getPhoneRequired() {
    return phoneRequired;
  }

  public void setPhoneRequired(Boolean phoneRequired) {
    this.phoneRequired = phoneRequired;
  }

  
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SubscriptionShippingOption{carrierService='" + carrierService + "', code='" + code + "', description='" + description + "', phoneRequired='" + phoneRequired + "', presentmentTitle='" + presentmentTitle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionShippingOption that = (SubscriptionShippingOption) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(phoneRequired, that.phoneRequired) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, code, description, phoneRequired, presentmentTitle, price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryCarrierService carrierService;

    
    private String code;

    
    private String description;

    
    private Boolean phoneRequired;

    
    private String presentmentTitle;

    
    private MoneyV2 price;

    
    private String title;

    public SubscriptionShippingOption build() {
      SubscriptionShippingOption result = new SubscriptionShippingOption();
      result.carrierService = this.carrierService;
      result.code = this.code;
      result.description = this.description;
      result.phoneRequired = this.phoneRequired;
      result.presentmentTitle = this.presentmentTitle;
      result.price = this.price;
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

    
    public Builder phoneRequired(Boolean phoneRequired) {
      this.phoneRequired = phoneRequired;
      return this;
    }

    
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
