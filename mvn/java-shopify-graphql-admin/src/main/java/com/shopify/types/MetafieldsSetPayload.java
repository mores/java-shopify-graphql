package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldsSetPayload {
  
  private List<Metafield> metafields;

  
  private List<MetafieldsSetUserError> userErrors;

  public MetafieldsSetPayload() {
  }

  
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  
  public List<MetafieldsSetUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldsSetUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldsSetPayload{metafields='" + metafields + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldsSetPayload that = (MetafieldsSetPayload) o;
    return Objects.equals(metafields, that.metafields) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metafields, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<Metafield> metafields;

    
    private List<MetafieldsSetUserError> userErrors;

    public MetafieldsSetPayload build() {
      MetafieldsSetPayload result = new MetafieldsSetPayload();
      result.metafields = this.metafields;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder userErrors(List<MetafieldsSetUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
