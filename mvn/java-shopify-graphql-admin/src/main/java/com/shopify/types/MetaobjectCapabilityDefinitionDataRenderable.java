package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDefinitionDataRenderable {
  
  private String metaDescriptionKey;

  
  private String metaTitleKey;

  public MetaobjectCapabilityDefinitionDataRenderable() {
  }

  
  public String getMetaDescriptionKey() {
    return metaDescriptionKey;
  }

  public void setMetaDescriptionKey(String metaDescriptionKey) {
    this.metaDescriptionKey = metaDescriptionKey;
  }

  
  public String getMetaTitleKey() {
    return metaTitleKey;
  }

  public void setMetaTitleKey(String metaTitleKey) {
    this.metaTitleKey = metaTitleKey;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataRenderable{metaDescriptionKey='" + metaDescriptionKey + "', metaTitleKey='" + metaTitleKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataRenderable that = (MetaobjectCapabilityDefinitionDataRenderable) o;
    return Objects.equals(metaDescriptionKey, that.metaDescriptionKey) &&
        Objects.equals(metaTitleKey, that.metaTitleKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaDescriptionKey, metaTitleKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String metaDescriptionKey;

    
    private String metaTitleKey;

    public MetaobjectCapabilityDefinitionDataRenderable build() {
      MetaobjectCapabilityDefinitionDataRenderable result = new MetaobjectCapabilityDefinitionDataRenderable();
      result.metaDescriptionKey = this.metaDescriptionKey;
      result.metaTitleKey = this.metaTitleKey;
      return result;
    }

    
    public Builder metaDescriptionKey(String metaDescriptionKey) {
      this.metaDescriptionKey = metaDescriptionKey;
      return this;
    }

    
    public Builder metaTitleKey(String metaTitleKey) {
      this.metaTitleKey = metaTitleKey;
      return this;
    }
  }
}
