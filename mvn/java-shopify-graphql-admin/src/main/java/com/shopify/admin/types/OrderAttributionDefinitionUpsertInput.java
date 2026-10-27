package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for upserting an order attribution definition.
 */
public class OrderAttributionDefinitionUpsertInput {
  /**
   * A unique identifier for the definition, scoped to the calling app on a single
   * shop. Case insensitive. Used to match an existing definition when upserting.
   */
  private String handle;

  /**
   * A human-readable name for the definition, displayed in Shopify Admin and on order details.
   */
  private String displayName;

  /**
   * Sanitized SVG content used as the icon for orders attributed to this
   * definition. Must conform to the platform's SVG sanitization rules and a 0 0 20
   * 20 viewbox. Omit this field to leave the existing icon unchanged on update, or
   * pass `null` to clear it.
   */
  private String icon;

  public OrderAttributionDefinitionUpsertInput() {
  }

  /**
   * A unique identifier for the definition, scoped to the calling app on a single
   * shop. Case insensitive. Used to match an existing definition when upserting.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * Sanitized SVG content used as the icon for orders attributed to this
   * definition. Must conform to the platform's SVG sanitization rules and a 0 0 20
   * 20 viewbox. Omit this field to leave the existing icon unchanged on update, or
   * pass `null` to clear it.
   */
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  @Override
  public String toString() {
    return "OrderAttributionDefinitionUpsertInput{handle='" + handle + "', displayName='" + displayName + "', icon='" + icon + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAttributionDefinitionUpsertInput that = (OrderAttributionDefinitionUpsertInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(icon, that.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, displayName, icon);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique identifier for the definition, scoped to the calling app on a single
     * shop. Case insensitive. Used to match an existing definition when upserting.
     */
    private String handle;

    /**
     * A human-readable name for the definition, displayed in Shopify Admin and on order details.
     */
    private String displayName;

    /**
     * Sanitized SVG content used as the icon for orders attributed to this
     * definition. Must conform to the platform's SVG sanitization rules and a 0 0 20
     * 20 viewbox. Omit this field to leave the existing icon unchanged on update, or
     * pass `null` to clear it.
     */
    private String icon;

    public OrderAttributionDefinitionUpsertInput build() {
      OrderAttributionDefinitionUpsertInput result = new OrderAttributionDefinitionUpsertInput();
      result.handle = this.handle;
      result.displayName = this.displayName;
      result.icon = this.icon;
      return result;
    }

    /**
     * A unique identifier for the definition, scoped to the calling app on a single
     * shop. Case insensitive. Used to match an existing definition when upserting.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * A human-readable name for the definition, displayed in Shopify Admin and on order details.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Sanitized SVG content used as the icon for orders attributed to this
     * definition. Must conform to the platform's SVG sanitization rules and a 0 0 20
     * 20 viewbox. Omit this field to leave the existing icon unchanged on update, or
     * pass `null` to clear it.
     */
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }
  }
}
