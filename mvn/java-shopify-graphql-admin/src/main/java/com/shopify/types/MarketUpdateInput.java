package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a market.
 */
public class MarketUpdateInput {
  /**
   * The name of the market. Not shown to customers.
   */
  private String name;

  /**
   * A unique identifier for the market. For example `"ca"`.
   */
  private String handle;

  /**
   * Whether the market is enabled to receive visitors and sales. **Note**: Regions in
   * inactive markets cannot be selected on the storefront or in checkout.
   */
  private Boolean enabled;

  public MarketUpdateInput() {
  }

  /**
   * The name of the market. Not shown to customers.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A unique identifier for the market. For example `"ca"`.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the market is enabled to receive visitors and sales. **Note**: Regions in
   * inactive markets cannot be selected on the storefront or in checkout.
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketUpdateInput{name='" + name + "', handle='" + handle + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketUpdateInput that = (MarketUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the market. Not shown to customers.
     */
    private String name;

    /**
     * A unique identifier for the market. For example `"ca"`.
     */
    private String handle;

    /**
     * Whether the market is enabled to receive visitors and sales. **Note**: Regions in
     * inactive markets cannot be selected on the storefront or in checkout.
     */
    private Boolean enabled;

    public MarketUpdateInput build() {
      MarketUpdateInput result = new MarketUpdateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * The name of the market. Not shown to customers.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A unique identifier for the market. For example `"ca"`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the market is enabled to receive visitors and sales. **Note**: Regions in
     * inactive markets cannot be selected on the storefront or in checkout.
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}
