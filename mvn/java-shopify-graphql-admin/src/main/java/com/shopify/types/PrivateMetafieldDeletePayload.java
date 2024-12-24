package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PrivateMetafieldDeletePayload {
  
  private String deletedPrivateMetafieldId;

  
  private List<UserError> userErrors;

  public PrivateMetafieldDeletePayload() {
  }

  
  public String getDeletedPrivateMetafieldId() {
    return deletedPrivateMetafieldId;
  }

  public void setDeletedPrivateMetafieldId(String deletedPrivateMetafieldId) {
    this.deletedPrivateMetafieldId = deletedPrivateMetafieldId;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldDeletePayload{deletedPrivateMetafieldId='" + deletedPrivateMetafieldId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldDeletePayload that = (PrivateMetafieldDeletePayload) o;
    return Objects.equals(deletedPrivateMetafieldId, that.deletedPrivateMetafieldId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPrivateMetafieldId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedPrivateMetafieldId;

    
    private List<UserError> userErrors;

    public PrivateMetafieldDeletePayload build() {
      PrivateMetafieldDeletePayload result = new PrivateMetafieldDeletePayload();
      result.deletedPrivateMetafieldId = this.deletedPrivateMetafieldId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedPrivateMetafieldId(String deletedPrivateMetafieldId) {
      this.deletedPrivateMetafieldId = deletedPrivateMetafieldId;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
