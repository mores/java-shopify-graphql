package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The available delivery options for a draft order.
 */
public class DraftOrderAvailableDeliveryOptions {
  /**
   * The available local delivery rates for the draft order. Requires a customer
   * with a valid shipping address and at least one line item.
   */
  private List<DraftOrderShippingRate> availableLocalDeliveryRates;

  /**
   * The available local pickup options for the draft order. Requires at least one line item.
   */
  private List<PickupInStoreLocation> availableLocalPickupOptions;

  /**
   * The available shipping rates for the draft order. Requires a customer with a
   * valid shipping address and at least one line item.
   */
  private List<DraftOrderShippingRate> availableShippingRates;

  /**
   * Returns information about pagination of local pickup options.
   */
  private PageInfo pageInfo;

  public DraftOrderAvailableDeliveryOptions() {
  }

  /**
   * The available local delivery rates for the draft order. Requires a customer
   * with a valid shipping address and at least one line item.
   */
  public List<DraftOrderShippingRate> getAvailableLocalDeliveryRates() {
    return availableLocalDeliveryRates;
  }

  public void setAvailableLocalDeliveryRates(
      List<DraftOrderShippingRate> availableLocalDeliveryRates) {
    this.availableLocalDeliveryRates = availableLocalDeliveryRates;
  }

  /**
   * The available local pickup options for the draft order. Requires at least one line item.
   */
  public List<PickupInStoreLocation> getAvailableLocalPickupOptions() {
    return availableLocalPickupOptions;
  }

  public void setAvailableLocalPickupOptions(
      List<PickupInStoreLocation> availableLocalPickupOptions) {
    this.availableLocalPickupOptions = availableLocalPickupOptions;
  }

  /**
   * The available shipping rates for the draft order. Requires a customer with a
   * valid shipping address and at least one line item.
   */
  public List<DraftOrderShippingRate> getAvailableShippingRates() {
    return availableShippingRates;
  }

  public void setAvailableShippingRates(List<DraftOrderShippingRate> availableShippingRates) {
    this.availableShippingRates = availableShippingRates;
  }

  /**
   * Returns information about pagination of local pickup options.
   */
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public String toString() {
    return "DraftOrderAvailableDeliveryOptions{availableLocalDeliveryRates='" + availableLocalDeliveryRates + "', availableLocalPickupOptions='" + availableLocalPickupOptions + "', availableShippingRates='" + availableShippingRates + "', pageInfo='" + pageInfo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAvailableDeliveryOptions that = (DraftOrderAvailableDeliveryOptions) o;
    return Objects.equals(availableLocalDeliveryRates, that.availableLocalDeliveryRates) &&
        Objects.equals(availableLocalPickupOptions, that.availableLocalPickupOptions) &&
        Objects.equals(availableShippingRates, that.availableShippingRates) &&
        Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableLocalDeliveryRates, availableLocalPickupOptions, availableShippingRates, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The available local delivery rates for the draft order. Requires a customer
     * with a valid shipping address and at least one line item.
     */
    private List<DraftOrderShippingRate> availableLocalDeliveryRates;

    /**
     * The available local pickup options for the draft order. Requires at least one line item.
     */
    private List<PickupInStoreLocation> availableLocalPickupOptions;

    /**
     * The available shipping rates for the draft order. Requires a customer with a
     * valid shipping address and at least one line item.
     */
    private List<DraftOrderShippingRate> availableShippingRates;

    /**
     * Returns information about pagination of local pickup options.
     */
    private PageInfo pageInfo;

    public DraftOrderAvailableDeliveryOptions build() {
      DraftOrderAvailableDeliveryOptions result = new DraftOrderAvailableDeliveryOptions();
      result.availableLocalDeliveryRates = this.availableLocalDeliveryRates;
      result.availableLocalPickupOptions = this.availableLocalPickupOptions;
      result.availableShippingRates = this.availableShippingRates;
      result.pageInfo = this.pageInfo;
      return result;
    }

    /**
     * The available local delivery rates for the draft order. Requires a customer
     * with a valid shipping address and at least one line item.
     */
    public Builder availableLocalDeliveryRates(
        List<DraftOrderShippingRate> availableLocalDeliveryRates) {
      this.availableLocalDeliveryRates = availableLocalDeliveryRates;
      return this;
    }

    /**
     * The available local pickup options for the draft order. Requires at least one line item.
     */
    public Builder availableLocalPickupOptions(
        List<PickupInStoreLocation> availableLocalPickupOptions) {
      this.availableLocalPickupOptions = availableLocalPickupOptions;
      return this;
    }

    /**
     * The available shipping rates for the draft order. Requires a customer with a
     * valid shipping address and at least one line item.
     */
    public Builder availableShippingRates(List<DraftOrderShippingRate> availableShippingRates) {
      this.availableShippingRates = availableShippingRates;
      return this;
    }

    /**
     * Returns information about pagination of local pickup options.
     */
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
