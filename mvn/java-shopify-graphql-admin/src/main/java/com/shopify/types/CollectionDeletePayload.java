package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionDeletePayload {
  
  private String deletedCollectionId;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public CollectionDeletePayload() {
  }

  
  public String getDeletedCollectionId() {
    return deletedCollectionId;
  }

  public void setDeletedCollectionId(String deletedCollectionId) {
    this.deletedCollectionId = deletedCollectionId;
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
    return "CollectionDeletePayload{deletedCollectionId='" + deletedCollectionId + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDeletePayload that = (CollectionDeletePayload) o;
    return Objects.equals(deletedCollectionId, that.deletedCollectionId) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCollectionId, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedCollectionId;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public CollectionDeletePayload build() {
      CollectionDeletePayload result = new CollectionDeletePayload();
      result.deletedCollectionId = this.deletedCollectionId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCollectionId(String deletedCollectionId) {
      this.deletedCollectionId = deletedCollectionId;
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
