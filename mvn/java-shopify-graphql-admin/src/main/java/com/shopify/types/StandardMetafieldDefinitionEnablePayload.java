package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class StandardMetafieldDefinitionEnablePayload {
  
  private MetafieldDefinition createdDefinition;

  
  private List<StandardMetafieldDefinitionEnableUserError> userErrors;

  public StandardMetafieldDefinitionEnablePayload() {
  }

  
  public MetafieldDefinition getCreatedDefinition() {
    return createdDefinition;
  }

  public void setCreatedDefinition(MetafieldDefinition createdDefinition) {
    this.createdDefinition = createdDefinition;
  }

  
  public List<StandardMetafieldDefinitionEnableUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<StandardMetafieldDefinitionEnableUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StandardMetafieldDefinitionEnablePayload{createdDefinition='" + createdDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetafieldDefinitionEnablePayload that = (StandardMetafieldDefinitionEnablePayload) o;
    return Objects.equals(createdDefinition, that.createdDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldDefinition createdDefinition;

    
    private List<StandardMetafieldDefinitionEnableUserError> userErrors;

    public StandardMetafieldDefinitionEnablePayload build() {
      StandardMetafieldDefinitionEnablePayload result = new StandardMetafieldDefinitionEnablePayload();
      result.createdDefinition = this.createdDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder createdDefinition(MetafieldDefinition createdDefinition) {
      this.createdDefinition = createdDefinition;
      return this;
    }

    
    public Builder userErrors(List<StandardMetafieldDefinitionEnableUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
