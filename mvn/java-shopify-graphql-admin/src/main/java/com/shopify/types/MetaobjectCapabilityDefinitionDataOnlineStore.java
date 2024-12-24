package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDefinitionDataOnlineStore {
  
  private boolean canCreateRedirects;

  
  private String urlHandle;

  public MetaobjectCapabilityDefinitionDataOnlineStore() {
  }

  
  public boolean getCanCreateRedirects() {
    return canCreateRedirects;
  }

  public void setCanCreateRedirects(boolean canCreateRedirects) {
    this.canCreateRedirects = canCreateRedirects;
  }

  
  public String getUrlHandle() {
    return urlHandle;
  }

  public void setUrlHandle(String urlHandle) {
    this.urlHandle = urlHandle;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDefinitionDataOnlineStore{canCreateRedirects='" + canCreateRedirects + "', urlHandle='" + urlHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDefinitionDataOnlineStore that = (MetaobjectCapabilityDefinitionDataOnlineStore) o;
    return canCreateRedirects == that.canCreateRedirects &&
        Objects.equals(urlHandle, that.urlHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCreateRedirects, urlHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean canCreateRedirects;

    
    private String urlHandle;

    public MetaobjectCapabilityDefinitionDataOnlineStore build() {
      MetaobjectCapabilityDefinitionDataOnlineStore result = new MetaobjectCapabilityDefinitionDataOnlineStore();
      result.canCreateRedirects = this.canCreateRedirects;
      result.urlHandle = this.urlHandle;
      return result;
    }

    
    public Builder canCreateRedirects(boolean canCreateRedirects) {
      this.canCreateRedirects = canCreateRedirects;
      return this;
    }

    
    public Builder urlHandle(String urlHandle) {
      this.urlHandle = urlHandle;
      return this;
    }
  }
}
