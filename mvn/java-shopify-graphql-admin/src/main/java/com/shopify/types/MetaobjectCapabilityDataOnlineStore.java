package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDataOnlineStore {
  
  private String templateSuffix;

  public MetaobjectCapabilityDataOnlineStore() {
  }

  
  public String getTemplateSuffix() {
    return templateSuffix;
  }

  public void setTemplateSuffix(String templateSuffix) {
    this.templateSuffix = templateSuffix;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDataOnlineStore{templateSuffix='" + templateSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDataOnlineStore that = (MetaobjectCapabilityDataOnlineStore) o;
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

    public MetaobjectCapabilityDataOnlineStore build() {
      MetaobjectCapabilityDataOnlineStore result = new MetaobjectCapabilityDataOnlineStore();
      result.templateSuffix = this.templateSuffix;
      return result;
    }

    
    public Builder templateSuffix(String templateSuffix) {
      this.templateSuffix = templateSuffix;
      return this;
    }
  }
}
