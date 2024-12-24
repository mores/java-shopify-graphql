package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectCapabilityDataInput {
  
  private MetaobjectCapabilityDataPublishableInput publishable;

  
  private MetaobjectCapabilityDataOnlineStoreInput onlineStore;

  public MetaobjectCapabilityDataInput() {
  }

  
  public MetaobjectCapabilityDataPublishableInput getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilityDataPublishableInput publishable) {
    this.publishable = publishable;
  }

  
  public MetaobjectCapabilityDataOnlineStoreInput getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilityDataOnlineStoreInput onlineStore) {
    this.onlineStore = onlineStore;
  }

  @Override
  public String toString() {
    return "MetaobjectCapabilityDataInput{publishable='" + publishable + "', onlineStore='" + onlineStore + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectCapabilityDataInput that = (MetaobjectCapabilityDataInput) o;
    return Objects.equals(publishable, that.publishable) &&
        Objects.equals(onlineStore, that.onlineStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishable, onlineStore);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetaobjectCapabilityDataPublishableInput publishable;

    
    private MetaobjectCapabilityDataOnlineStoreInput onlineStore;

    public MetaobjectCapabilityDataInput build() {
      MetaobjectCapabilityDataInput result = new MetaobjectCapabilityDataInput();
      result.publishable = this.publishable;
      result.onlineStore = this.onlineStore;
      return result;
    }

    
    public Builder publishable(MetaobjectCapabilityDataPublishableInput publishable) {
      this.publishable = publishable;
      return this;
    }

    
    public Builder onlineStore(MetaobjectCapabilityDataOnlineStoreInput onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }
  }
}
