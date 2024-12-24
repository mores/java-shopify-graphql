package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDefinitionDataOnlineStoreInput {
  
  private String urlHandle;

  
  private Boolean createRedirects = false;

  public MetaobjectCapabilityDefinitionDataOnlineStoreInput() {
  }

  
  public String getUrlHandle() {
    return urlHandle;
  }

  public void setUrlHandle(String urlHandle) {
    this.urlHandle = urlHandle;
  }

  
  public Boolean getCreateRedirects() {
    return createRedirects;
  }

  public void setCreateRedirects(Boolean createRedirects) {
    this.createRedirects = createRedirects;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataOnlineStoreInput{urlHandle='" + urlHandle + "', createRedirects='" + createRedirects + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataOnlineStoreInput that = (MetaobjectCapabilityDefinitionDataOnlineStoreInput) o;
    return Objects.equals(urlHandle, that.urlHandle) &&
        Objects.equals(createRedirects, that.createRedirects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlHandle, createRedirects);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String urlHandle;

    
    private Boolean createRedirects = false;

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput build() {
      MetaobjectCapabilityDefinitionDataOnlineStoreInput result = new MetaobjectCapabilityDefinitionDataOnlineStoreInput();
      result.urlHandle = this.urlHandle;
      result.createRedirects = this.createRedirects;
      return result;
    }

    
    public Builder urlHandle(String urlHandle) {
      this.urlHandle = urlHandle;
      return this;
    }

    
    public Builder createRedirects(Boolean createRedirects) {
      this.createRedirects = createRedirects;
      return this;
    }
  }
}
