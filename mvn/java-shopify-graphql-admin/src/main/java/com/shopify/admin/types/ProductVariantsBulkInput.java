package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a product variant to create as part of a variant bulk mutation.
 */
public class ProductVariantsBulkInput {
  /**
   * The value of the barcode associated with the product variant.
   */
  private String barcode;

  /**
   * The compare-at price of the variant.
   */
  private String compareAtPrice;

  /**
   * Specifies the product variant to update or delete.
   */
  private String id;

  /**
   * The URL of the media to associate with the variant.
   */
  private List<String> mediaSrc;

  /**
   * Whether customers are allowed to place an order for the variant when it's out of stock. Defaults to `DENY`.
   */
  private ProductVariantInventoryPolicy inventoryPolicy;

  /**
   * The inventory quantities at each location where the variant is stocked. The number of elements
   * in the array of inventory quantities can't exceed the amount specified for the plan.
   * Supported as input with the `productVariantsBulkCreate` mutation only.
   */
  private List<InventoryLevelInput> inventoryQuantities;

  /**
   * The inventory item associated with the variant, used for unit cost.
   */
  private InventoryItemInput inventoryItem;

  /**
   * The ID of the media that's associated with the variant.
   */
  private String mediaId;

  /**
   * The additional customizable information about the product variant.
   */
  private List<MetafieldInput> metafields;

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  private List<VariantOptionValueInput> optionValues;

  /**
   * The price of the variant.
   */
  private String price;

  /**
   * Whether the variant is taxable.
   */
  private Boolean taxable;

  /**
   * The tax code associated with the variant.
   */
  private String taxCode;

  /**
   * The unit price measurement for the product variant.
   */
  private UnitPriceMeasurementInput unitPriceMeasurement;

  /**
   * Whether the unit price should be shown for this product variant.
   */
  private Boolean showUnitPrice;

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be
   * omitted from channels that don't support bundles.
   */
  private Boolean requiresComponents;

  public ProductVariantsBulkInput() {
  }

  /**
   * The value of the barcode associated with the product variant.
   */
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * The compare-at price of the variant.
   */
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * Specifies the product variant to update or delete.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URL of the media to associate with the variant.
   */
  public List<String> getMediaSrc() {
    return mediaSrc;
  }

  public void setMediaSrc(List<String> mediaSrc) {
    this.mediaSrc = mediaSrc;
  }

  /**
   * Whether customers are allowed to place an order for the variant when it's out of stock. Defaults to `DENY`.
   */
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  /**
   * The inventory quantities at each location where the variant is stocked. The number of elements
   * in the array of inventory quantities can't exceed the amount specified for the plan.
   * Supported as input with the `productVariantsBulkCreate` mutation only.
   */
  public List<InventoryLevelInput> getInventoryQuantities() {
    return inventoryQuantities;
  }

  public void setInventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
    this.inventoryQuantities = inventoryQuantities;
  }

  /**
   * The inventory item associated with the variant, used for unit cost.
   */
  public InventoryItemInput getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItemInput inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * The ID of the media that's associated with the variant.
   */
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * The additional customizable information about the product variant.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  public List<VariantOptionValueInput> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<VariantOptionValueInput> optionValues) {
    this.optionValues = optionValues;
  }

  /**
   * The price of the variant.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Whether the variant is taxable.
   */
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The tax code associated with the variant.
   */
  public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * The unit price measurement for the product variant.
   */
  public UnitPriceMeasurementInput getUnitPriceMeasurement() {
    return unitPriceMeasurement;
  }

  public void setUnitPriceMeasurement(UnitPriceMeasurementInput unitPriceMeasurement) {
    this.unitPriceMeasurement = unitPriceMeasurement;
  }

  /**
   * Whether the unit price should be shown for this product variant.
   */
  public Boolean getShowUnitPrice() {
    return showUnitPrice;
  }

  public void setShowUnitPrice(Boolean showUnitPrice) {
    this.showUnitPrice = showUnitPrice;
  }

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be
   * omitted from channels that don't support bundles.
   */
  public Boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(Boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkInput{barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', id='" + id + "', mediaSrc='" + mediaSrc + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', inventoryItem='" + inventoryItem + "', mediaId='" + mediaId + "', metafields='" + metafields + "', optionValues='" + optionValues + "', price='" + price + "', taxable='" + taxable + "', taxCode='" + taxCode + "', unitPriceMeasurement='" + unitPriceMeasurement + "', showUnitPrice='" + showUnitPrice + "', requiresComponents='" + requiresComponents + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkInput that = (ProductVariantsBulkInput) o;
    return Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaSrc, that.mediaSrc) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(mediaId, that.mediaId) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(price, that.price) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode) &&
        Objects.equals(unitPriceMeasurement, that.unitPriceMeasurement) &&
        Objects.equals(showUnitPrice, that.showUnitPrice) &&
        Objects.equals(requiresComponents, that.requiresComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, compareAtPrice, id, mediaSrc, inventoryPolicy, inventoryQuantities, inventoryItem, mediaId, metafields, optionValues, price, taxable, taxCode, unitPriceMeasurement, showUnitPrice, requiresComponents);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the barcode associated with the product variant.
     */
    private String barcode;

    /**
     * The compare-at price of the variant.
     */
    private String compareAtPrice;

    /**
     * Specifies the product variant to update or delete.
     */
    private String id;

    /**
     * The URL of the media to associate with the variant.
     */
    private List<String> mediaSrc;

    /**
     * Whether customers are allowed to place an order for the variant when it's out of stock. Defaults to `DENY`.
     */
    private ProductVariantInventoryPolicy inventoryPolicy;

    /**
     * The inventory quantities at each location where the variant is stocked. The number of elements
     * in the array of inventory quantities can't exceed the amount specified for the plan.
     * Supported as input with the `productVariantsBulkCreate` mutation only.
     */
    private List<InventoryLevelInput> inventoryQuantities;

    /**
     * The inventory item associated with the variant, used for unit cost.
     */
    private InventoryItemInput inventoryItem;

    /**
     * The ID of the media that's associated with the variant.
     */
    private String mediaId;

    /**
     * The additional customizable information about the product variant.
     */
    private List<MetafieldInput> metafields;

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    private List<VariantOptionValueInput> optionValues;

    /**
     * The price of the variant.
     */
    private String price;

    /**
     * Whether the variant is taxable.
     */
    private Boolean taxable;

    /**
     * The tax code associated with the variant.
     */
    private String taxCode;

    /**
     * The unit price measurement for the product variant.
     */
    private UnitPriceMeasurementInput unitPriceMeasurement;

    /**
     * Whether the unit price should be shown for this product variant.
     */
    private Boolean showUnitPrice;

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be
     * omitted from channels that don't support bundles.
     */
    private Boolean requiresComponents;

    public ProductVariantsBulkInput build() {
      ProductVariantsBulkInput result = new ProductVariantsBulkInput();
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.id = this.id;
      result.mediaSrc = this.mediaSrc;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.inventoryItem = this.inventoryItem;
      result.mediaId = this.mediaId;
      result.metafields = this.metafields;
      result.optionValues = this.optionValues;
      result.price = this.price;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      result.unitPriceMeasurement = this.unitPriceMeasurement;
      result.showUnitPrice = this.showUnitPrice;
      result.requiresComponents = this.requiresComponents;
      return result;
    }

    /**
     * The value of the barcode associated with the product variant.
     */
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    /**
     * The compare-at price of the variant.
     */
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * Specifies the product variant to update or delete.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The URL of the media to associate with the variant.
     */
    public Builder mediaSrc(List<String> mediaSrc) {
      this.mediaSrc = mediaSrc;
      return this;
    }

    /**
     * Whether customers are allowed to place an order for the variant when it's out of stock. Defaults to `DENY`.
     */
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    /**
     * The inventory quantities at each location where the variant is stocked. The number of elements
     * in the array of inventory quantities can't exceed the amount specified for the plan.
     * Supported as input with the `productVariantsBulkCreate` mutation only.
     */
    public Builder inventoryQuantities(List<InventoryLevelInput> inventoryQuantities) {
      this.inventoryQuantities = inventoryQuantities;
      return this;
    }

    /**
     * The inventory item associated with the variant, used for unit cost.
     */
    public Builder inventoryItem(InventoryItemInput inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * The ID of the media that's associated with the variant.
     */
    public Builder mediaId(String mediaId) {
      this.mediaId = mediaId;
      return this;
    }

    /**
     * The additional customizable information about the product variant.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    public Builder optionValues(List<VariantOptionValueInput> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    /**
     * The price of the variant.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * Whether the variant is taxable.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The tax code associated with the variant.
     */
    public Builder taxCode(String taxCode) {
      this.taxCode = taxCode;
      return this;
    }

    /**
     * The unit price measurement for the product variant.
     */
    public Builder unitPriceMeasurement(UnitPriceMeasurementInput unitPriceMeasurement) {
      this.unitPriceMeasurement = unitPriceMeasurement;
      return this;
    }

    /**
     * Whether the unit price should be shown for this product variant.
     */
    public Builder showUnitPrice(Boolean showUnitPrice) {
      this.showUnitPrice = showUnitPrice;
      return this;
    }

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be
     * omitted from channels that don't support bundles.
     */
    public Builder requiresComponents(Boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }
  }
}
