package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides the capabilities of a metaobject.
 */
public class MetaobjectCapabilityData {
  /**
   * The Online Store capability for this metaobject.
   */
  private MetaobjectCapabilityDataOnlineStore onlineStore;

  /**
   * The publishable capability for this metaobject.
   */
  private MetaobjectCapabilityDataPublishable publishable;

  public MetaobjectCapabilityData() {
  }

  /**
   * The Online Store capability for this metaobject.
   */
  public MetaobjectCapabilityDataOnlineStore getOnlineStore() {
    return onlineStore;
  }

  public void setOnlineStore(MetaobjectCapabilityDataOnlineStore onlineStore) {
    this.onlineStore = onlineStore;
  }

  /**
   * The publishable capability for this metaobject.
   */
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
    /**
     * The Online Store capability for this metaobject.
     */
    private MetaobjectCapabilityDataOnlineStore onlineStore;

    /**
     * The publishable capability for this metaobject.
     */
    private MetaobjectCapabilityDataPublishable publishable;

    public MetaobjectCapabilityData build() {
      MetaobjectCapabilityData result = new MetaobjectCapabilityData();
      result.onlineStore = this.onlineStore;
      result.publishable = this.publishable;
      return result;
    }

    /**
     * The Online Store capability for this metaobject.
     */
    public Builder onlineStore(MetaobjectCapabilityDataOnlineStore onlineStore) {
      this.onlineStore = onlineStore;
      return this;
    }

    /**
     * The publishable capability for this metaobject.
     */
    public Builder publishable(MetaobjectCapabilityDataPublishable publishable) {
      this.publishable = publishable;
      return this;
    }
  }
}
