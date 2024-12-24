package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldDefinitionPinPayload {
  
  private MetafieldDefinition pinnedDefinition;

  
  private List<MetafieldDefinitionPinUserError> userErrors;

  public MetafieldDefinitionPinPayload() {
  }

  
  public MetafieldDefinition getPinnedDefinition() {
    return pinnedDefinition;
  }

  public void setPinnedDefinition(MetafieldDefinition pinnedDefinition) {
    this.pinnedDefinition = pinnedDefinition;
  }

  
  public List<MetafieldDefinitionPinUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDefinitionPinUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionPinPayload{pinnedDefinition='" + pinnedDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionPinPayload that = (MetafieldDefinitionPinPayload) o;
    return Objects.equals(pinnedDefinition, that.pinnedDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldDefinition pinnedDefinition;

    
    private List<MetafieldDefinitionPinUserError> userErrors;

    public MetafieldDefinitionPinPayload build() {
      MetafieldDefinitionPinPayload result = new MetafieldDefinitionPinPayload();
      result.pinnedDefinition = this.pinnedDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder pinnedDefinition(MetafieldDefinition pinnedDefinition) {
      this.pinnedDefinition = pinnedDefinition;
      return this;
    }

    
    public Builder userErrors(List<MetafieldDefinitionPinUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
