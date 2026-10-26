package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Inventory information for a product variant at a physical store location.
 * Includes stock availability, quantity on hand, and estimated pickup readiness
 * time. When the location offers local pickup, availability also includes
 * inventory that can be moved to it through a store transfer route, so a variant
 * can be available for pickup with no on-hand stock at the location.
 *
 * Local pickup is [configured in the store's shipping settings](https://help.shopify.com/manual/shipping/setting-up-and-managing-your-shipping/local-methods/local-pickup),
 * and a returned location isn't guaranteed to offer it. Results can be sorted by
 * proximity to a customer's location using the `near` argument on the [`ProductVariant.storeAvailability`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant#field-ProductVariant.fields.storeAvailability) connection. 
 *
 * Learn more about [supporting local pickup on storefronts](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/products-collections/local-pickup).
 */
public class StoreAvailability {
  /**
   * Whether the product variant is available at this location. This is `true` when
   * the variant is in stock here, can be supplied through a store transfer from
   * another location when this location offers local pickup, or is sold with
   * untracked or oversellable inventory (its inventory isn't tracked, or its
   * inventory policy allows continuing to sell when out of stock). As a result,
   * `available` can be `true` even when `quantityAvailable` is `0` or less. It
   * doesn't mean the location offers local pickup.
   */
  private boolean available;

  /**
   * The location where this product variant is stocked at.
   */
  private Location location;

  /**
   * Returns the estimated amount of time it takes for pickup to be ready (Example:
   * Usually ready in 24 hours). When the variant is out of stock at this location
   * and supplied through a store transfer, this reflects the estimated transfer
   * transit time when available, otherwise it falls back to the location's
   * standard pickup processing time.
   */
  private String pickUpTime;

  /**
   * The quantity of the product variant physically in stock at this location. This
   * counts on-hand inventory only and excludes inventory available through a store
   * transfer, so it can be `0` while `available` is `true`.
   */
  private int quantityAvailable;

  public StoreAvailability() {
  }

  /**
   * Whether the product variant is available at this location. This is `true` when
   * the variant is in stock here, can be supplied through a store transfer from
   * another location when this location offers local pickup, or is sold with
   * untracked or oversellable inventory (its inventory isn't tracked, or its
   * inventory policy allows continuing to sell when out of stock). As a result,
   * `available` can be `true` even when `quantityAvailable` is `0` or less. It
   * doesn't mean the location offers local pickup.
   */
  public boolean getAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  /**
   * The location where this product variant is stocked at.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Returns the estimated amount of time it takes for pickup to be ready (Example:
   * Usually ready in 24 hours). When the variant is out of stock at this location
   * and supplied through a store transfer, this reflects the estimated transfer
   * transit time when available, otherwise it falls back to the location's
   * standard pickup processing time.
   */
  public String getPickUpTime() {
    return pickUpTime;
  }

  public void setPickUpTime(String pickUpTime) {
    this.pickUpTime = pickUpTime;
  }

  /**
   * The quantity of the product variant physically in stock at this location. This
   * counts on-hand inventory only and excludes inventory available through a store
   * transfer, so it can be `0` while `available` is `true`.
   */
  public int getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(int quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }

  @Override
  public String toString() {
    return "StoreAvailability{available='" + available + "', location='" + location + "', pickUpTime='" + pickUpTime + "', quantityAvailable='" + quantityAvailable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreAvailability that = (StoreAvailability) o;
    return available == that.available &&
        Objects.equals(location, that.location) &&
        Objects.equals(pickUpTime, that.pickUpTime) &&
        quantityAvailable == that.quantityAvailable;
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, location, pickUpTime, quantityAvailable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the product variant is available at this location. This is `true` when
     * the variant is in stock here, can be supplied through a store transfer from
     * another location when this location offers local pickup, or is sold with
     * untracked or oversellable inventory (its inventory isn't tracked, or its
     * inventory policy allows continuing to sell when out of stock). As a result,
     * `available` can be `true` even when `quantityAvailable` is `0` or less. It
     * doesn't mean the location offers local pickup.
     */
    private boolean available;

    /**
     * The location where this product variant is stocked at.
     */
    private Location location;

    /**
     * Returns the estimated amount of time it takes for pickup to be ready (Example:
     * Usually ready in 24 hours). When the variant is out of stock at this location
     * and supplied through a store transfer, this reflects the estimated transfer
     * transit time when available, otherwise it falls back to the location's
     * standard pickup processing time.
     */
    private String pickUpTime;

    /**
     * The quantity of the product variant physically in stock at this location. This
     * counts on-hand inventory only and excludes inventory available through a store
     * transfer, so it can be `0` while `available` is `true`.
     */
    private int quantityAvailable;

    public StoreAvailability build() {
      StoreAvailability result = new StoreAvailability();
      result.available = this.available;
      result.location = this.location;
      result.pickUpTime = this.pickUpTime;
      result.quantityAvailable = this.quantityAvailable;
      return result;
    }

    /**
     * Whether the product variant is available at this location. This is `true` when
     * the variant is in stock here, can be supplied through a store transfer from
     * another location when this location offers local pickup, or is sold with
     * untracked or oversellable inventory (its inventory isn't tracked, or its
     * inventory policy allows continuing to sell when out of stock). As a result,
     * `available` can be `true` even when `quantityAvailable` is `0` or less. It
     * doesn't mean the location offers local pickup.
     */
    public Builder available(boolean available) {
      this.available = available;
      return this;
    }

    /**
     * The location where this product variant is stocked at.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Returns the estimated amount of time it takes for pickup to be ready (Example:
     * Usually ready in 24 hours). When the variant is out of stock at this location
     * and supplied through a store transfer, this reflects the estimated transfer
     * transit time when available, otherwise it falls back to the location's
     * standard pickup processing time.
     */
    public Builder pickUpTime(String pickUpTime) {
      this.pickUpTime = pickUpTime;
      return this;
    }

    /**
     * The quantity of the product variant physically in stock at this location. This
     * counts on-hand inventory only and excludes inventory available through a store
     * transfer, so it can be `0` while `available` is `true`.
     */
    public Builder quantityAvailable(int quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
      return this;
    }
  }
}
