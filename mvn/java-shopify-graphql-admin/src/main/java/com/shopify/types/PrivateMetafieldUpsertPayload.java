package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PrivateMetafieldUpsertPayload {
  
  private PrivateMetafield privateMetafield;

  
  private List<UserError> userErrors;

  public PrivateMetafieldUpsertPayload() {
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldUpsertPayload{privateMetafield='" + privateMetafield + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldUpsertPayload that = (PrivateMetafieldUpsertPayload) o;
    return Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateMetafield, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PrivateMetafield privateMetafield;

    
    private List<UserError> userErrors;

    public PrivateMetafieldUpsertPayload build() {
      PrivateMetafieldUpsertPayload result = new PrivateMetafieldUpsertPayload();
      result.privateMetafield = this.privateMetafield;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
