package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDefinitionDataRenderableInput {
  
  private String metaTitleKey;

  
  private String metaDescriptionKey;

  public MetaobjectCapabilityDefinitionDataRenderableInput() {
  }

  
  public String getMetaTitleKey() {
    return metaTitleKey;
  }

  public void setMetaTitleKey(String metaTitleKey) {
    this.metaTitleKey = metaTitleKey;
  }

  
  public String getMetaDescriptionKey() {
    return metaDescriptionKey;
  }

  public void setMetaDescriptionKey(String metaDescriptionKey) {
    this.metaDescriptionKey = metaDescriptionKey;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataRenderableInput{metaTitleKey='" + metaTitleKey + "', metaDescriptionKey='" + metaDescriptionKey + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataRenderableInput that = (MetaobjectCapabilityDefinitionDataRenderableInput) o;
    return Objects.equals(metaTitleKey, that.metaTitleKey) &&
        Objects.equals(metaDescriptionKey, that.metaDescriptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaTitleKey, metaDescriptionKey);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String metaTitleKey;

    
    private String metaDescriptionKey;

    public MetaobjectCapabilityDefinitionDataRenderableInput build() {
      MetaobjectCapabilityDefinitionDataRenderableInput result = new MetaobjectCapabilityDefinitionDataRenderableInput();
      result.metaTitleKey = this.metaTitleKey;
      result.metaDescriptionKey = this.metaDescriptionKey;
      return result;
    }

    
    public Builder metaTitleKey(String metaTitleKey) {
      this.metaTitleKey = metaTitleKey;
      return this;
    }

    
    public Builder metaDescriptionKey(String metaDescriptionKey) {
      this.metaDescriptionKey = metaDescriptionKey;
      return this;
    }
  }
}
