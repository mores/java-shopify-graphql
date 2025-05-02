package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to retrieve a metaobject by handle.
 */
public class MetaobjectHandleInput {
  /**
   * The handle of the metaobject.
   */
  private String handle;

  /**
   * The type of the metaobject.
   */
  private String type;

  public MetaobjectHandleInput() {
  }

  /**
   * The handle of the metaobject.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The type of the metaobject.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetaobjectHandleInput{handle='" + handle + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectHandleInput that = (MetaobjectHandleInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The handle of the metaobject.
     */
    private String handle;

    /**
     * The type of the metaobject.
     */
    private String type;

    public MetaobjectHandleInput build() {
      MetaobjectHandleInput result = new MetaobjectHandleInput();
      result.handle = this.handle;
      result.type = this.type;
      return result;
    }

    /**
     * The handle of the metaobject.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The type of the metaobject.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
