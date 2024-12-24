package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopAlert {
  
  private ShopAlertAction action;

  
  private String description;

  public ShopAlert() {
  }

  
  public ShopAlertAction getAction() {
    return action;
  }

  public void setAction(ShopAlertAction action) {
    this.action = action;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "ShopAlert{action='" + action + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopAlert that = (ShopAlert) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopAlertAction action;

    
    private String description;

    public ShopAlert build() {
      ShopAlert result = new ShopAlert();
      result.action = this.action;
      result.description = this.description;
      return result;
    }

    
    public Builder action(ShopAlertAction action) {
      this.action = action;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
