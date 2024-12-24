package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DelegateAccessTokenDestroyPayload {
  
  private Shop shop;

  
  private Boolean status;

  
  private List<DelegateAccessTokenDestroyUserError> userErrors;

  public DelegateAccessTokenDestroyPayload() {
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  public List<DelegateAccessTokenDestroyUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DelegateAccessTokenDestroyUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DelegateAccessTokenDestroyPayload{shop='" + shop + "', status='" + status + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateAccessTokenDestroyPayload that = (DelegateAccessTokenDestroyPayload) o;
    return Objects.equals(shop, that.shop) &&
        Objects.equals(status, that.status) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shop, status, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Shop shop;

    
    private Boolean status;

    
    private List<DelegateAccessTokenDestroyUserError> userErrors;

    public DelegateAccessTokenDestroyPayload build() {
      DelegateAccessTokenDestroyPayload result = new DelegateAccessTokenDestroyPayload();
      result.shop = this.shop;
      result.status = this.status;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder status(Boolean status) {
      this.status = status;
      return this;
    }

    
    public Builder userErrors(List<DelegateAccessTokenDestroyUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
