package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Online Store capability data for the metaobject definition.
 */
public class MetaobjectCapabilityDefinitionDataOnlineStore {
  /**
   * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
   */
  private boolean canCreateRedirects;

  /**
   * The URL handle for accessing pages of this metaobject type in the Online Store.
   */
  private String urlHandle;

  public MetaobjectCapabilityDefinitionDataOnlineStore() {
  }

  /**
   * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
   */
  public boolean getCanCreateRedirects() {
    return canCreateRedirects;
  }

  public void setCanCreateRedirects(boolean canCreateRedirects) {
    this.canCreateRedirects = canCreateRedirects;
  }

  /**
   * The URL handle for accessing pages of this metaobject type in the Online Store.
   */
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
    /**
     * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
     */
    private boolean canCreateRedirects;

    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    private String urlHandle;

    public MetaobjectCapabilityDefinitionDataOnlineStore build() {
      MetaobjectCapabilityDefinitionDataOnlineStore result = new MetaobjectCapabilityDefinitionDataOnlineStore();
      result.canCreateRedirects = this.canCreateRedirects;
      result.urlHandle = this.urlHandle;
      return result;
    }

    /**
     * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
     */
    public Builder canCreateRedirects(boolean canCreateRedirects) {
      this.canCreateRedirects = canCreateRedirects;
      return this;
    }

    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    public Builder urlHandle(String urlHandle) {
      this.urlHandle = urlHandle;
      return this;
    }
  }
}
