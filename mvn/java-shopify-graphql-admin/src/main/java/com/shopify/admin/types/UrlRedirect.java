package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The URL redirect for the online store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class UrlRedirect implements com.shopify.admin.types.Node {
  /**
   * The ID of the URL redirect.
   */
  private String id;

  /**
   * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
   */
  private String path;

  /**
   * The target location where the user will be redirected to.
   */
  private String target;

  public UrlRedirect() {
  }

  /**
   * The ID of the URL redirect.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
   */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  /**
   * The target location where the user will be redirected to.
   */
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "UrlRedirect{id='" + id + "', path='" + path + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UrlRedirect that = (UrlRedirect) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(path, that.path) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the URL redirect.
     */
    private String id;

    /**
     * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
     */
    private String path;

    /**
     * The target location where the user will be redirected to.
     */
    private String target;

    public UrlRedirect build() {
      UrlRedirect result = new UrlRedirect();
      result.id = this.id;
      result.path = this.path;
      result.target = this.target;
      return result;
    }

    /**
     * The ID of the URL redirect.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The old path to be redirected from. When the user visits this path, they will be redirected to the target location.
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * The target location where the user will be redirected to.
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }
}
