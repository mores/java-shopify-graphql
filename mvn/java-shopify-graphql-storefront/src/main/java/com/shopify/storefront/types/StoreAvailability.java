package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Inventory information for a product variant at a physical store location that
 * offers local pickup. Includes stock availability, quantity on hand, and
 * estimated pickup readiness time.
 *
 * Local pickup must be [enabled in the store's shipping settings](https://help.shopify.com/manual/shipping/setting-up-and-managing-your-shipping/local-methods/local-pickup)
 * for this data to be returned. Results can be sorted by proximity to a customer's
 * location using the `near` argument on the [`ProductVariant.storeAvailability`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant#field-ProductVariant.fields.storeAvailability) connection. 
 *
 * Learn more about [supporting local pickup on storefronts](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/products-collections/local-pickup).
 */
public class StoreAvailability {
  /**
   * Whether the product variant is in-stock at this location.
   */
  private boolean available;

  /**
   * The location where this product variant is stocked at.
   */
  private Location location;

  /**
   * Returns the estimated amount of time it takes for pickup to be ready (Example: Usually ready in 24 hours).
   */
  private String pickUpTime;

  /**
   * The quantity of the product variant in-stock at this location.
   */
  private int quantityAvailable;

  public StoreAvailability() {
  }

  /**
   * Whether the product variant is in-stock at this location.
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
   * Returns the estimated amount of time it takes for pickup to be ready (Example: Usually ready in 24 hours).
   */
  public String getPickUpTime() {
    return pickUpTime;
  }

  public void setPickUpTime(String pickUpTime) {
    this.pickUpTime = pickUpTime;
  }

  /**
   * The quantity of the product variant in-stock at this location.
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
     * Whether the product variant is in-stock at this location.
     */
    private boolean available;

    /**
     * The location where this product variant is stocked at.
     */
    private Location location;

    /**
     * Returns the estimated amount of time it takes for pickup to be ready (Example: Usually ready in 24 hours).
     */
    private String pickUpTime;

    /**
     * The quantity of the product variant in-stock at this location.
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
     * Whether the product variant is in-stock at this location.
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
     * Returns the estimated amount of time it takes for pickup to be ready (Example: Usually ready in 24 hours).
     */
    public Builder pickUpTime(String pickUpTime) {
      this.pickUpTime = pickUpTime;
      return this;
    }

    /**
     * The quantity of the product variant in-stock at this location.
     */
    public Builder quantityAvailable(int quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
      return this;
    }
  }
}
