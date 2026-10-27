package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The attribution details for an order.
 */
public class OrderAttribution {
  /**
   * The display name of the attribution source.
   */
  private String displayName;

  /**
   * An identifier for the attribution source.
   */
  private String handle;

  /**
   * Sanitized SVG content used as the attribution source icon.
   */
  private String icon;

  public OrderAttribution() {
  }

  /**
   * The display name of the attribution source.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * An identifier for the attribution source.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Sanitized SVG content used as the attribution source icon.
   */
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  @Override
  public String toString() {
    return "OrderAttribution{displayName='" + displayName + "', handle='" + handle + "', icon='" + icon + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderAttribution that = (OrderAttribution) o;
    return Objects.equals(displayName, that.displayName) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(icon, that.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, handle, icon);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The display name of the attribution source.
     */
    private String displayName;

    /**
     * An identifier for the attribution source.
     */
    private String handle;

    /**
     * Sanitized SVG content used as the attribution source icon.
     */
    private String icon;

    public OrderAttribution build() {
      OrderAttribution result = new OrderAttribution();
      result.displayName = this.displayName;
      result.handle = this.handle;
      result.icon = this.icon;
      return result;
    }

    /**
     * The display name of the attribution source.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * An identifier for the attribution source.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Sanitized SVG content used as the attribution source icon.
     */
    public Builder icon(String icon) {
      this.icon = icon;
      return this;
    }
  }
}
