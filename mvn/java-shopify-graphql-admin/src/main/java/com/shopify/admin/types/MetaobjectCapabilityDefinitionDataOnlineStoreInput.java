package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields of the Online Store capability.
 */
public class MetaobjectCapabilityDefinitionDataOnlineStoreInput {
  /**
   * The URL handle for accessing pages of this metaobject type in the Online Store.
   */
  private String urlHandle;

  /**
   * Whether to redirect published metaobjects automatically when the URL handle changes.
   */
  private Boolean createRedirects = false;

  public MetaobjectCapabilityDefinitionDataOnlineStoreInput() {
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

  /**
   * Whether to redirect published metaobjects automatically when the URL handle changes.
   */
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
    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    private String urlHandle;

    /**
     * Whether to redirect published metaobjects automatically when the URL handle changes.
     */
    private Boolean createRedirects = false;

    public MetaobjectCapabilityDefinitionDataOnlineStoreInput build() {
      MetaobjectCapabilityDefinitionDataOnlineStoreInput result = new MetaobjectCapabilityDefinitionDataOnlineStoreInput();
      result.urlHandle = this.urlHandle;
      result.createRedirects = this.createRedirects;
      return result;
    }

    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    public Builder urlHandle(String urlHandle) {
      this.urlHandle = urlHandle;
      return this;
    }

    /**
     * Whether to redirect published metaobjects automatically when the URL handle changes.
     */
    public Builder createRedirects(Boolean createRedirects) {
      this.createRedirects = createRedirects;
      return this;
    }
  }
}
