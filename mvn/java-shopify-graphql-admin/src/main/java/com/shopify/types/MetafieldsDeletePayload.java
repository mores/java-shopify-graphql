package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldsDeletePayload {
  
  private List<MetafieldIdentifier> deletedMetafields;

  
  private List<UserError> userErrors;

  public MetafieldsDeletePayload() {
  }

  
  public List<MetafieldIdentifier> getDeletedMetafields() {
    return deletedMetafields;
  }

  public void setDeletedMetafields(List<MetafieldIdentifier> deletedMetafields) {
    this.deletedMetafields = deletedMetafields;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldsDeletePayload{deletedMetafields='" + deletedMetafields + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldsDeletePayload that = (MetafieldsDeletePayload) o;
    return Objects.equals(deletedMetafields, that.deletedMetafields) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMetafields, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<MetafieldIdentifier> deletedMetafields;

    
    private List<UserError> userErrors;

    public MetafieldsDeletePayload build() {
      MetafieldsDeletePayload result = new MetafieldsDeletePayload();
      result.deletedMetafields = this.deletedMetafields;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedMetafields(List<MetafieldIdentifier> deletedMetafields) {
      this.deletedMetafields = deletedMetafields;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
