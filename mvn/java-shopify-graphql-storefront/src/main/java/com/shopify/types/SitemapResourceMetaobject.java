package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A SitemapResourceMetaobject represents a metaobject with
 * [the `renderable` capability](https://shopify.dev/docs/apps/build/custom-data/metaobjects/use-metaobject-capabilities#render-metaobjects-as-web-pages).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SitemapResourceMetaobject implements com.shopify.types.SitemapResourceInterface {
  /**
   * Resource's handle.
   */
  private String handle;

  /**
   * The URL handle for accessing pages of this metaobject type in the Online Store.
   */
  private String onlineStoreUrlHandle;

  /**
   * The type of the metaobject. Defines the namespace of its associated metafields.
   */
  private String type;

  /**
   * The date and time when the resource was updated.
   */
  private OffsetDateTime updatedAt;

  public SitemapResourceMetaobject() {
  }

  /**
   * Resource's handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The URL handle for accessing pages of this metaobject type in the Online Store.
   */
  public String getOnlineStoreUrlHandle() {
    return onlineStoreUrlHandle;
  }

  public void setOnlineStoreUrlHandle(String onlineStoreUrlHandle) {
    this.onlineStoreUrlHandle = onlineStoreUrlHandle;
  }

  /**
   * The type of the metaobject. Defines the namespace of its associated metafields.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The date and time when the resource was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SitemapResourceMetaobject{handle='" + handle + "', onlineStoreUrlHandle='" + onlineStoreUrlHandle + "', type='" + type + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SitemapResourceMetaobject that = (SitemapResourceMetaobject) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(onlineStoreUrlHandle, that.onlineStoreUrlHandle) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, onlineStoreUrlHandle, type, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Resource's handle.
     */
    private String handle;

    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    private String onlineStoreUrlHandle;

    /**
     * The type of the metaobject. Defines the namespace of its associated metafields.
     */
    private String type;

    /**
     * The date and time when the resource was updated.
     */
    private OffsetDateTime updatedAt;

    public SitemapResourceMetaobject build() {
      SitemapResourceMetaobject result = new SitemapResourceMetaobject();
      result.handle = this.handle;
      result.onlineStoreUrlHandle = this.onlineStoreUrlHandle;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Resource's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The URL handle for accessing pages of this metaobject type in the Online Store.
     */
    public Builder onlineStoreUrlHandle(String onlineStoreUrlHandle) {
      this.onlineStoreUrlHandle = onlineStoreUrlHandle;
      return this;
    }

    /**
     * The type of the metaobject. Defines the namespace of its associated metafields.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time when the resource was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
