package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDataOnlineStoreInput {
  
  private String templateSuffix;

  public MetaobjectCapabilityDataOnlineStoreInput() {
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDataOnlineStoreInput{templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDataOnlineStoreInput that = (MetaobjectCapabilityDataOnlineStoreInput) o;
    return Objects.equals(templateSuffix, that.templateSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String templateSuffix;

    public MetaobjectCapabilityDataOnlineStoreInput build() {
      MetaobjectCapabilityDataOnlineStoreInput result = new MetaobjectCapabilityDataOnlineStoreInput();
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }
  }
}
