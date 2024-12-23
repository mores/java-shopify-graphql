package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for metaobject capabilities.
 */
public class MetaobjectCapabilityDataInput {
  /**
   * Publishable capability input.
   */
  private MetaobjectCapabilityDataPublishableInput publishable;

  /**
   * Online Store capability input.
   */
  private MetaobjectCapabilityDataOnlineStoreInput onlineStore;

  public MetaobjectCapabilityDataInput() {
  }

  /**
   * Publishable capability input.
   */
  public MetaobjectCapabilityDataPublishableInput getPublishable() {
    return publishable;
  }

  public void setPublishable(MetaobjectCapabilityDataPublishableInput publishable) {
    this.publishable = publishable;
  }

  /**
   * Online Store capability input.
   */
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
    /**
     * Publishable capability input.
     */
    private MetaobjectCapabilityDataPublishableInput publishable;

    /**
     * Online Store capability input.
     */
    private MetaobjectCapabilityDataOnlineStoreInput onlineStore;

    public MetaobjectCapabilityDataInput build() {
      MetaobjectCapabilityDataInput result = new MetaobjectCapabilityDataInput();
      result.publishable = this.publishable;
      result.onlineStore = this.onlineStore;
      return result;
    }

    /**
     * Publishable capability input.
     */
    public Builder publishable(MetaobjectCapabilityDataPublishableInput publishable) {
      this.publishable = publishable;
      return this;
    }

    /**
     * Online Store capability input.
     */
    public Builder onlineStore(MetaobjectCapabilityDataOnlineStoreInput onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }
  }
}
