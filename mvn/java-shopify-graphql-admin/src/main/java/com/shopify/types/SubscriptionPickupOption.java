package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionPickupOption implements SubscriptionDeliveryOption {
  
  private String code;

  
  private String description;

  
  private Location location;

  
  private boolean phoneRequired;

  
  private String pickupTime;

  
  private String presentmentTitle;

  
  private MoneyV2 price;

  
  private String title;

  public SubscriptionPickupOption() {
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

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public boolean getPhoneRequired() {
    return phoneRequired;
  }

  public void setPhoneRequired(boolean phoneRequired) {
    this.phoneRequired = phoneRequired;
  }

  
  public String getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(String pickupTime) {
    this.pickupTime = pickupTime;
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
    return "SubscriptionPickupOption{code='" + code + "', description='" + description + "', location='" + location + "', phoneRequired='" + phoneRequired + "', pickupTime='" + pickupTime + "', presentmentTitle='" + presentmentTitle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionPickupOption that = (SubscriptionPickupOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(location, that.location) &&
        phoneRequired == that.phoneRequired &&
        Objects.equals(pickupTime, that.pickupTime) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, location, phoneRequired, pickupTime, presentmentTitle, price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private String description;

    
    private Location location;

    
    private boolean phoneRequired;

    
    private String pickupTime;

    
    private String presentmentTitle;

    
    private MoneyV2 price;

    
    private String title;

    public SubscriptionPickupOption build() {
      SubscriptionPickupOption result = new SubscriptionPickupOption();
      result.code = this.code;
      result.description = this.description;
      result.location = this.location;
      result.phoneRequired = this.phoneRequired;
      result.pickupTime = this.pickupTime;
      result.presentmentTitle = this.presentmentTitle;
      result.price = this.price;
      result.title = this.title;
      return result;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder phoneRequired(boolean phoneRequired) {
      this.phoneRequired = phoneRequired;
      return this;
    }

    
    public Builder pickupTime(String pickupTime) {
      this.pickupTime = pickupTime;
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
