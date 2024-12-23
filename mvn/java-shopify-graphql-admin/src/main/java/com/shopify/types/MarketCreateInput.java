package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create a market.
 */
public class MarketCreateInput {
  /**
   * The name of the market. Not shown to customers.
   */
  private String name;

  /**
   * A unique identifier for the market. For example `"ca"`.
   * If the handle isn't provided, then the handle is auto-generated based on the country or name.
   */
  private String handle;

  /**
   * Whether the market is enabled to receive visitors and sales. If a
   * value isn't provided, then the market is enabled by default if all
   * included regions have shipping rates, and disabled if any regions don't
   * have shipping rates.
   *   
   * **Note**: Regions in inactive markets can't be selected on the
   * storefront or in checkout.
   */
  private Boolean enabled;

  /**
   * The regions to be included in the market. Each region can only be included in one market at
   * a time.
   */
  private List<MarketRegionCreateInput> regions;

  public MarketCreateInput() {
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
   * If the handle isn't provided, then the handle is auto-generated based on the country or name.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the market is enabled to receive visitors and sales. If a
   * value isn't provided, then the market is enabled by default if all
   * included regions have shipping rates, and disabled if any regions don't
   * have shipping rates.
   *   
   * **Note**: Regions in inactive markets can't be selected on the
   * storefront or in checkout.
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The regions to be included in the market. Each region can only be included in one market at
   * a time.
   */
  public List<MarketRegionCreateInput> getRegions() {
    return regions;
  }

  public void setRegions(List<MarketRegionCreateInput> regions) {
    this.regions = regions;
  }

  @Override
  public String toString() {
    return "MarketCreateInput{name='" + name + "', handle='" + handle + "', enabled='" + enabled + "', regions='" + regions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCreateInput that = (MarketCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(enabled, that.enabled) &&
        Objects.equals(regions, that.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, handle, enabled, regions);
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
     * If the handle isn't provided, then the handle is auto-generated based on the country or name.
     */
    private String handle;

    /**
     * Whether the market is enabled to receive visitors and sales. If a
     * value isn't provided, then the market is enabled by default if all
     * included regions have shipping rates, and disabled if any regions don't
     * have shipping rates.
     *   
     * **Note**: Regions in inactive markets can't be selected on the
     * storefront or in checkout.
     */
    private Boolean enabled;

    /**
     * The regions to be included in the market. Each region can only be included in one market at
     * a time.
     */
    private List<MarketRegionCreateInput> regions;

    public MarketCreateInput build() {
      MarketCreateInput result = new MarketCreateInput();
      result.name = this.name;
      result.handle = this.handle;
      result.enabled = this.enabled;
      result.regions = this.regions;
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
     * If the handle isn't provided, then the handle is auto-generated based on the country or name.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the market is enabled to receive visitors and sales. If a
     * value isn't provided, then the market is enabled by default if all
     * included regions have shipping rates, and disabled if any regions don't
     * have shipping rates.
     *   
     * **Note**: Regions in inactive markets can't be selected on the
     * storefront or in checkout.
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The regions to be included in the market. Each region can only be included in one market at
     * a time.
     */
    public Builder regions(List<MarketRegionCreateInput> regions) {
      this.regions = regions;
      return this;
    }
  }
}
