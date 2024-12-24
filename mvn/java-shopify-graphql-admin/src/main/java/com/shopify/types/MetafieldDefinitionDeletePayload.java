package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldDefinitionDeletePayload {
  
  private String deletedDefinitionId;

  
  private List<MetafieldDefinitionDeleteUserError> userErrors;

  public MetafieldDefinitionDeletePayload() {
  }

  
  public String getDeletedDefinitionId() {
    return deletedDefinitionId;
  }

  public void setDeletedDefinitionId(String deletedDefinitionId) {
    this.deletedDefinitionId = deletedDefinitionId;
  }

  
  public List<MetafieldDefinitionDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionDeletePayload{deletedDefinitionId='" + deletedDefinitionId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionDeletePayload that = (MetafieldDefinitionDeletePayload) o;
    return Objects.equals(deletedDefinitionId, that.deletedDefinitionId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDefinitionId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedDefinitionId;

    
    private List<MetafieldDefinitionDeleteUserError> userErrors;

    public MetafieldDefinitionDeletePayload build() {
      MetafieldDefinitionDeletePayload result = new MetafieldDefinitionDeletePayload();
      result.deletedDefinitionId = this.deletedDefinitionId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedDefinitionId(String deletedDefinitionId) {
      this.deletedDefinitionId = deletedDefinitionId;
      return this;
    }

    
    public Builder userErrors(List<MetafieldDefinitionDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
