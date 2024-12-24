package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityData {
  
  private MetaobjectCapabilityDataOnlineStore onlineStore;

  
  private MetaobjectCapabilityDataPublishable publishable;

  public MetaobjectCapabilityData() {
  }

  
  public MetaobjectCapabilityDataOnlineStore getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilityDataOnlineStore onlineStore) {
    this.onlineStore = onlineStore;
  }

  
  public MetaobjectCapabilityDataPublishable getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilityDataPublishable publishable) {
    this.publishable = publishable;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityData{onlineStore='" + onlineStore + "', publishable='" + publishable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityData that = (MetaobjectCapabilityData) o;
    return Objects.equals(onlineStore, that.onlineStore) &&
        Objects.equals(publishable, that.publishable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineStore, publishable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectCapabilityDataOnlineStore onlineStore;

    
    private MetaobjectCapabilityDataPublishable publishable;

    public MetaobjectCapabilityData build() {
      MetaobjectCapabilityData result = new MetaobjectCapabilityData();
      result.onlineStore = this.onlineStore;
      result.publishable = this.publishable;
      return result;
    }

    
    public Builder onlineStore(MetaobjectCapabilityDataOnlineStore onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }

    
    public Builder publishable(MetaobjectCapabilityDataPublishable publishable) {
      this.publishable = publishable;
      return this;
    }
  }
}
