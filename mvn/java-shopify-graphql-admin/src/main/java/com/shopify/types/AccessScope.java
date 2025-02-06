package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The permission required to access a Shopify Admin API or Storefront API resource
 * for a shop. Merchants grant access scopes that are requested by applications.
 */
public class AccessScope {
  /**
   * A description of the actions that the access scope allows an app to perform.
   */
  private String description;

  /**
   * A readable string that represents the access scope. The string usually follows
   * the format `{action}_{resource}`. `{action}` is `read` or `write`, and
   * `{resource}` is the resource that the action can be performed on. `{action}`
   * and `{resource}` are separated by an underscore. For example, `read_orders` or
   * `write_products`.
   */
  private String handle;

  public AccessScope() {
  }

  /**
   * A description of the actions that the access scope allows an app to perform.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A readable string that represents the access scope. The string usually follows
   * the format `{action}_{resource}`. `{action}` is `read` or `write`, and
   * `{resource}` is the resource that the action can be performed on. `{action}`
   * and `{resource}` are separated by an underscore. For example, `read_orders` or
   * `write_products`.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "AccessScope{description='" + description + "', handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessScope that = (AccessScope) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, handle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A description of the actions that the access scope allows an app to perform.
     */
    private String description;

    /**
     * A readable string that represents the access scope. The string usually follows
     * the format `{action}_{resource}`. `{action}` is `read` or `write`, and
     * `{resource}` is the resource that the action can be performed on. `{action}`
     * and `{resource}` are separated by an underscore. For example, `read_orders` or
     * `write_products`.
     */
    private String handle;

    public AccessScope build() {
      AccessScope result = new AccessScope();
      result.description = this.description;
      result.handle = this.handle;
      return result;
    }

    /**
     * A description of the actions that the access scope allows an app to perform.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A readable string that represents the access scope. The string usually follows
     * the format `{action}_{resource}`. `{action}` is `read` or `write`, and
     * `{resource}` is the resource that the action can be performed on. `{action}`
     * and `{resource}` are separated by an underscore. For example, `read_orders` or
     * `write_products`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
