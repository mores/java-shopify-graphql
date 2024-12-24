package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CartTransformDeletePayload {
  
  private String deletedId;

  
  private List<CartTransformDeleteUserError> userErrors;

  public CartTransformDeletePayload() {
  }

  
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  
  public List<CartTransformDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CartTransformDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartTransformDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformDeletePayload that = (CartTransformDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedId;

    
    private List<CartTransformDeleteUserError> userErrors;

    public CartTransformDeletePayload build() {
      CartTransformDeletePayload result = new CartTransformDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    
    public Builder userErrors(List<CartTransformDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
