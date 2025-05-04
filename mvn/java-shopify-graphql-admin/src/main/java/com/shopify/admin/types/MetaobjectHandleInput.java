package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for retrieving a metaobject by handle.
 */
public class MetaobjectHandleInput {
  /**
   * The type of the metaobject. Must match an existing metaobject definition type.
   */
  private String type;

  /**
   * The handle of the metaobject to create or update.
   */
  private String handle;

  public MetaobjectHandleInput() {
  }

  /**
   * The type of the metaobject. Must match an existing metaobject definition type.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The handle of the metaobject to create or update.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "MetaobjectHandleInput{type='" + type + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectHandleInput that = (MetaobjectHandleInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, handle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of the metaobject. Must match an existing metaobject definition type.
     */
    private String type;

    /**
     * The handle of the metaobject to create or update.
     */
    private String handle;

    public MetaobjectHandleInput build() {
      MetaobjectHandleInput result = new MetaobjectHandleInput();
      result.type = this.type;
      result.handle = this.handle;
      return result;
    }

    /**
     * The type of the metaobject. Must match an existing metaobject definition type.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The handle of the metaobject to create or update.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
