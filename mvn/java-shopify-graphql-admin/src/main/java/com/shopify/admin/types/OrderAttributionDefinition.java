package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An attribution definition that an app can use to label orders it routes to a shop.
 * Definitions can be supplied declaratively via the `order_attribution_config` extension or created
 * dynamically per-shop via the Admin API.
 * Learn more in the [order attribution guide](https://shopify.dev/docs/apps/build/sales-channels/order-attribution).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderAttributionDefinition implements com.shopify.admin.types.Node {
  /**
   * A human-readable name for the definition, displayed in Shopify Admin and on order details.
   */
  private String displayName;

  /**
   * A unique identifier for the definition, scoped to the calling app on a single
   * shop. Used as the `attribution_handle` value when an app attributes an order
   * to this definition.
   */
  private String handle;

  /**
   * Sanitized SVG content used as the icon for orders attributed to this definition. May be null when no icon is provided.
   */
  private String icon;

  /**
   * A globally-unique ID.
   */
  private String id;

  public OrderAttributionDefinition() {
  }

  /**
   * A human-readable name for the definition, displayed in Shopify Admin and on order details.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A unique identifier for the definition, scoped to the calling app on a single
   * shop. Used as the `attribution_handle` value when an app attributes an order
   * to this definition.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Sanitized SVG content used as the icon for orders attributed to this definition. May be null when no icon is provided.
   */
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderAttributionDefinition{displayName='" + displayName + "', handle='" + handle + "', icon='" + icon + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAttributionDefinition that = (OrderAttributionDefinition) o;
    return Objects.equals(displayName, that.displayName) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, handle, icon, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A human-readable name for the definition, displayed in Shopify Admin and on order details.
     */
    private String displayName;

    /**
     * A unique identifier for the definition, scoped to the calling app on a single
     * shop. Used as the `attribution_handle` value when an app attributes an order
     * to this definition.
     */
    private String handle;

    /**
     * Sanitized SVG content used as the icon for orders attributed to this definition. May be null when no icon is provided.
     */
    private String icon;

    /**
     * A globally-unique ID.
     */
    private String id;

    public OrderAttributionDefinition build() {
      OrderAttributionDefinition result = new OrderAttributionDefinition();
      result.displayName = this.displayName;
      result.handle = this.handle;
      result.icon = this.icon;
      result.id = this.id;
      return result;
    }

    /**
     * A human-readable name for the definition, displayed in Shopify Admin and on order details.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A unique identifier for the definition, scoped to the calling app on a single
     * shop. Used as the `attribution_handle` value when an app attributes an order
     * to this definition.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Sanitized SVG content used as the icon for orders attributed to this definition. May be null when no icon is provided.
     */
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
