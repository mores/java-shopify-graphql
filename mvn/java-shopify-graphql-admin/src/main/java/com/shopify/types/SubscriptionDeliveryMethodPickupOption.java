package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDeliveryMethodPickupOption {
  
  private String code;

  
  private String description;

  
  private Location location;

  
  private String presentmentTitle;

  
  private String title;

  public SubscriptionDeliveryMethodPickupOption() {
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
    return "SubscriptionDeliveryMethodPickupOption{code='" + code + "', description='" + description + "', location='" + location + "', presentmentTitle='" + presentmentTitle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodPickupOption that = (SubscriptionDeliveryMethodPickupOption) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(description, that.description) &&
        Objects.equals(location, that.location) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, location, presentmentTitle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String code;

    
    private String description;

    
    private Location location;

    
    private String presentmentTitle;

    
    private String title;

    public SubscriptionDeliveryMethodPickupOption build() {
      SubscriptionDeliveryMethodPickupOption result = new SubscriptionDeliveryMethodPickupOption();
      result.code = this.code;
      result.description = this.description;
      result.location = this.location;
      result.presentmentTitle = this.presentmentTitle;
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
