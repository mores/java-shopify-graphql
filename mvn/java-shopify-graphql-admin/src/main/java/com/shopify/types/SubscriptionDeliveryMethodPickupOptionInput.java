package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodPickupOptionInput {
  
  private String title;

  
  private String presentmentTitle;

  
  private String description;

  
  private String code;

  
  private String locationId;

  public SubscriptionDeliveryMethodPickupOptionInput() {
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

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodPickupOptionInput{title='" + title + "', presentmentTitle='" + presentmentTitle + "', description='" + description + "', code='" + code + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodPickupOptionInput that = (SubscriptionDeliveryMethodPickupOptionInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(code, that.code) &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, presentmentTitle, description, code, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private String presentmentTitle;

    
    private String description;

    
    private String code;

    
    private String locationId;

    public SubscriptionDeliveryMethodPickupOptionInput build() {
      SubscriptionDeliveryMethodPickupOptionInput result = new SubscriptionDeliveryMethodPickupOptionInput();
      result.title = this.title;
      result.presentmentTitle = this.presentmentTitle;
      result.description = this.description;
      result.code = this.code;
      result.locationId = this.locationId;
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

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
