package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a product variant to create or update.
 */
public class ProductVariantSetInput {
  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  private String id;

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  private List<VariantOptionValueInput> optionValues;

  /**
   * The price of the variant.
   */
  private String price;

  /**
   * The compare-at price of the variant.
   */
  private String compareAtPrice;

  /**
   * The SKU for the variant. Case-sensitive string.
   */
  private String sku;

  /**
   * The value of the barcode associated with the product.
   */
  private String barcode;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private Integer position;

  /**
   * The file to associate with the variant.
   *   
   * Complexity cost: 0.6 per variant file.
   *   
   * Any file specified here must also be specified in the `files` input for the product.
   */
  private FileSetInput file;

  /**
   * Additional customizable information about the product variant.
   *   
   * Complexity cost: 0.4 per variant metafield.
   */
  private List<MetafieldInput> metafields;

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  private Boolean requiresComponents;

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
   */
  private ProductVariantInventoryPolicy inventoryPolicy;

  /**
   * The inventory quantities at each location where the variant is stocked.
   * If you're updating an existing variant, then you can only update the
   * quantities at locations where the variant is already stocked.
   *   
   * The total number of inventory quantities across all variants in the mutation can't exceed 50000.
   */
  private List<ProductSetInventoryInput> inventoryQuantities;

  /**
   * The inventory item associated with the variant, used for unit cost.
   */
  private InventoryItemInput inventoryItem;

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
   * Whether or not unit price should be shown for this product variant.
   */
  private Boolean showUnitPrice;

  public ProductVariantSetInput() {
  }

  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * The compare-at price of the variant.
   */
  public String getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(String compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  /**
   * The SKU for the variant. Case-sensitive string.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The value of the barcode associated with the product.
   */
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * The file to associate with the variant.
   *   
   * Complexity cost: 0.6 per variant file.
   *   
   * Any file specified here must also be specified in the `files` input for the product.
   */
  public FileSetInput getFile() {
    return file;
  }

  public void setFile(FileSetInput file) {
    this.file = file;
  }

  /**
   * Additional customizable information about the product variant.
   *   
   * Complexity cost: 0.4 per variant metafield.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  public Boolean getRequiresComponents() {
    return requiresComponents;
  }

  public void setRequiresComponents(Boolean requiresComponents) {
    this.requiresComponents = requiresComponents;
  }

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
   */
  public ProductVariantInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  /**
   * The inventory quantities at each location where the variant is stocked.
   * If you're updating an existing variant, then you can only update the
   * quantities at locations where the variant is already stocked.
   *   
   * The total number of inventory quantities across all variants in the mutation can't exceed 50000.
   */
  public List<ProductSetInventoryInput> getInventoryQuantities() {
    return inventoryQuantities;
  }

  public void setInventoryQuantities(List<ProductSetInventoryInput> inventoryQuantities) {
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
   * Whether or not unit price should be shown for this product variant.
   */
  public Boolean getShowUnitPrice() {
    return showUnitPrice;
  }

  public void setShowUnitPrice(Boolean showUnitPrice) {
    this.showUnitPrice = showUnitPrice;
  }

  @Override
  public String toString() {
    return "ProductVariantSetInput{id='" + id + "', optionValues='" + optionValues + "', price='" + price + "', compareAtPrice='" + compareAtPrice + "', sku='" + sku + "', barcode='" + barcode + "', position='" + position + "', file='" + file + "', metafields='" + metafields + "', requiresComponents='" + requiresComponents + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', inventoryItem='" + inventoryItem + "', taxable='" + taxable + "', taxCode='" + taxCode + "', unitPriceMeasurement='" + unitPriceMeasurement + "', showUnitPrice='" + showUnitPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantSetInput that = (ProductVariantSetInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(price, that.price) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(position, that.position) &&
        Objects.equals(file, that.file) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(requiresComponents, that.requiresComponents) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode) &&
        Objects.equals(unitPriceMeasurement, that.unitPriceMeasurement) &&
        Objects.equals(showUnitPrice, that.showUnitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, optionValues, price, compareAtPrice, sku, barcode, position, file, metafields, requiresComponents, inventoryPolicy, inventoryQuantities, inventoryItem, taxable, taxCode, unitPriceMeasurement, showUnitPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    private String id;

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    private List<VariantOptionValueInput> optionValues;

    /**
     * The price of the variant.
     */
    private String price;

    /**
     * The compare-at price of the variant.
     */
    private String compareAtPrice;

    /**
     * The SKU for the variant. Case-sensitive string.
     */
    private String sku;

    /**
     * The value of the barcode associated with the product.
     */
    private String barcode;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private Integer position;

    /**
     * The file to associate with the variant.
     *   
     * Complexity cost: 0.6 per variant file.
     *   
     * Any file specified here must also be specified in the `files` input for the product.
     */
    private FileSetInput file;

    /**
     * Additional customizable information about the product variant.
     *   
     * Complexity cost: 0.4 per variant metafield.
     */
    private List<MetafieldInput> metafields;

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    private Boolean requiresComponents;

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
     */
    private ProductVariantInventoryPolicy inventoryPolicy;

    /**
     * The inventory quantities at each location where the variant is stocked.
     * If you're updating an existing variant, then you can only update the
     * quantities at locations where the variant is already stocked.
     *   
     * The total number of inventory quantities across all variants in the mutation can't exceed 50000.
     */
    private List<ProductSetInventoryInput> inventoryQuantities;

    /**
     * The inventory item associated with the variant, used for unit cost.
     */
    private InventoryItemInput inventoryItem;

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
     * Whether or not unit price should be shown for this product variant.
     */
    private Boolean showUnitPrice;

    public ProductVariantSetInput build() {
      ProductVariantSetInput result = new ProductVariantSetInput();
      result.id = this.id;
      result.optionValues = this.optionValues;
      result.price = this.price;
      result.compareAtPrice = this.compareAtPrice;
      result.sku = this.sku;
      result.barcode = this.barcode;
      result.position = this.position;
      result.file = this.file;
      result.metafields = this.metafields;
      result.requiresComponents = this.requiresComponents;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.inventoryItem = this.inventoryItem;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      result.unitPriceMeasurement = this.unitPriceMeasurement;
      result.showUnitPrice = this.showUnitPrice;
      return result;
    }

    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    public Builder id(String id) {
      this.id = id;
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
     * The compare-at price of the variant.
     */
    public Builder compareAtPrice(String compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    /**
     * The SKU for the variant. Case-sensitive string.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * The value of the barcode associated with the product.
     */
    public Builder barcode(String barcode) {
      this.barcode = barcode;
      return this;
    }

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * The file to associate with the variant.
     *   
     * Complexity cost: 0.6 per variant file.
     *   
     * Any file specified here must also be specified in the `files` input for the product.
     */
    public Builder file(FileSetInput file) {
      this.file = file;
      return this;
    }

    /**
     * Additional customizable information about the product variant.
     *   
     * Complexity cost: 0.4 per variant metafield.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    public Builder requiresComponents(Boolean requiresComponents) {
      this.requiresComponents = requiresComponents;
      return this;
    }

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
     */
    public Builder inventoryPolicy(ProductVariantInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    /**
     * The inventory quantities at each location where the variant is stocked.
     * If you're updating an existing variant, then you can only update the
     * quantities at locations where the variant is already stocked.
     *   
     * The total number of inventory quantities across all variants in the mutation can't exceed 50000.
     */
    public Builder inventoryQuantities(List<ProductSetInventoryInput> inventoryQuantities) {
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
     * Whether or not unit price should be shown for this product variant.
     */
    public Builder showUnitPrice(Boolean showUnitPrice) {
      this.showUnitPrice = showUnitPrice;
      return this;
    }
  }
}
