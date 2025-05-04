package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Details about an individual quantity name.
 */
public class InventoryQuantityName {
  /**
   * List of quantity names that this quantity name belongs to.
   */
  private List<String> belongsTo;

  /**
   * List of quantity names that comprise this quantity name.
   */
  private List<String> comprises;

  /**
   * The display name for quantity names translated into applicable language.
   */
  private String displayName;

  /**
   * Whether the quantity name has been used by the merchant.
   */
  private boolean isInUse;

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
   * the inventory quantity. Used by
   * [inventory queries and mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-mutations).
   */
  private String name;

  public InventoryQuantityName() {
  }

  /**
   * List of quantity names that this quantity name belongs to.
   */
  public List<String> getBelongsTo() {
    return belongsTo;
  }

  public void setBelongsTo(List<String> belongsTo) {
    this.belongsTo = belongsTo;
  }

  /**
   * List of quantity names that comprise this quantity name.
   */
  public List<String> getComprises() {
    return comprises;
  }

  public void setComprises(List<String> comprises) {
    this.comprises = comprises;
  }

  /**
   * The display name for quantity names translated into applicable language.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Whether the quantity name has been used by the merchant.
   */
  public boolean getIsInUse() {
    return isInUse;
  }

  public void setIsInUse(boolean isInUse) {
    this.isInUse = isInUse;
  }

  /**
   * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
   * the inventory quantity. Used by
   * [inventory queries and mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-mutations).
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "InventoryQuantityName{belongsTo='" + belongsTo + "', comprises='" + comprises + "', displayName='" + displayName + "', isInUse='" + isInUse + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantityName that = (InventoryQuantityName) o;
    return Objects.equals(belongsTo, that.belongsTo) &&
        Objects.equals(comprises, that.comprises) &&
        Objects.equals(displayName, that.displayName) &&
        isInUse == that.isInUse &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongsTo, comprises, displayName, isInUse, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of quantity names that this quantity name belongs to.
     */
    private List<String> belongsTo;

    /**
     * List of quantity names that comprise this quantity name.
     */
    private List<String> comprises;

    /**
     * The display name for quantity names translated into applicable language.
     */
    private String displayName;

    /**
     * Whether the quantity name has been used by the merchant.
     */
    private boolean isInUse;

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
     * the inventory quantity. Used by
     * [inventory queries and mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-mutations).
     */
    private String name;

    public InventoryQuantityName build() {
      InventoryQuantityName result = new InventoryQuantityName();
      result.belongsTo = this.belongsTo;
      result.comprises = this.comprises;
      result.displayName = this.displayName;
      result.isInUse = this.isInUse;
      result.name = this.name;
      return result;
    }

    /**
     * List of quantity names that this quantity name belongs to.
     */
    public Builder belongsTo(List<String> belongsTo) {
      this.belongsTo = belongsTo;
      return this;
    }

    /**
     * List of quantity names that comprise this quantity name.
     */
    public Builder comprises(List<String> comprises) {
      this.comprises = comprises;
      return this;
    }

    /**
     * The display name for quantity names translated into applicable language.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Whether the quantity name has been used by the merchant.
     */
    public Builder isInUse(boolean isInUse) {
      this.isInUse = isInUse;
      return this;
    }

    /**
     * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
     * the inventory quantity. Used by
     * [inventory queries and mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-mutations).
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
