package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetaobjectDefinitionCreatePayload {
  
  private MetaobjectDefinition metaobjectDefinition;

  
  private List<MetaobjectUserError> userErrors;

  public MetaobjectDefinitionCreatePayload() {
  }

  
  public MetaobjectDefinition getMetaobjectDefinition() {
    return metaobjectDefinition;
  }

  public void setMetaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
    this.metaobjectDefinition = metaobjectDefinition;
  }

  
  public List<MetaobjectUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetaobjectUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetaobjectDefinitionCreatePayload{metaobjectDefinition='" + metaobjectDefinition + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectDefinitionCreatePayload that = (MetaobjectDefinitionCreatePayload) o;
    return Objects.equals(metaobjectDefinition, that.metaobjectDefinition) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaobjectDefinition, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectDefinition metaobjectDefinition;

    
    private List<MetaobjectUserError> userErrors;

    public MetaobjectDefinitionCreatePayload build() {
      MetaobjectDefinitionCreatePayload result = new MetaobjectDefinitionCreatePayload();
      result.metaobjectDefinition = this.metaobjectDefinition;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder metaobjectDefinition(MetaobjectDefinition metaobjectDefinition) {
      this.metaobjectDefinition = metaobjectDefinition;
      return this;
    }

    
    public Builder userErrors(List<MetaobjectUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
