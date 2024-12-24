package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionUnpublishPayload {
  
  private Collection collection;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public CollectionUnpublishPayload() {
  }

  
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
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
    return "CollectionUnpublishPayload{collection='" + collection + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUnpublishPayload that = (CollectionUnpublishPayload) o;
    return Objects.equals(collection, that.collection) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Collection collection;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public CollectionUnpublishPayload build() {
      CollectionUnpublishPayload result = new CollectionUnpublishPayload();
      result.collection = this.collection;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder collection(Collection collection) {
      this.collection = collection;
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
