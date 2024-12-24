package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PublishablePublishToCurrentChannelPayload {
  
  private Publishable publishable;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public PublishablePublishToCurrentChannelPayload() {
  }

  
  public Publishable getPublishable() {
    return publishable;
  }

  public void setPublishable(Publishable publishable) {
    this.publishable = publishable;
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PublishablePublishToCurrentChannelPayload{publishable='" + publishable + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishablePublishToCurrentChannelPayload that = (PublishablePublishToCurrentChannelPayload) o;
    return Objects.equals(publishable, that.publishable) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishable, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Publishable publishable;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public PublishablePublishToCurrentChannelPayload build() {
      PublishablePublishToCurrentChannelPayload result = new PublishablePublishToCurrentChannelPayload();
      result.publishable = this.publishable;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder publishable(Publishable publishable) {
      this.publishable = publishable;
      return this;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
