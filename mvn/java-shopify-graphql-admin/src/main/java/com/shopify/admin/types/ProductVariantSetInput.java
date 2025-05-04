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
   * Whether a product variant requires components. The default value is `false`.
   * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
   * from channels that don't support bundles.
   */
  private Boolean requiresComponents;

  /**
   * The value of the barcode associated with the product.
   */
  private String barcode;

  /**
   * The compare-at price of the variant.
   */
  private String compareAtPrice;

  /**
   * Specifies the product variant to update or create a new variant if absent.
   */
  private String id;

  /**
   * The file to associate with the variant.
   * Any file specified here must also be specified in the `files` input for the product.
   */
  private FileSetInput file;

  /**
   * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
   */
  private ProductVariantInventoryPolicy inventoryPolicy;

  /**
   * The inventory quantities at each location where the variant is stocked.
   * If you're updating an existing variant, then you can only update the
   * quantities at locations where the variant is already stocked.
   */
  private List<ProductSetInventoryInput> inventoryQuantities;

  /**
   * The inventory item associated with the variant, used for unit cost.
   */
  private InventoryItemInput inventoryItem;

  /**
   * Additional customizable information about the product variant.
   */
  private List<MetafieldInput> metafields;

  /**
   * The custom properties that a shop owner uses to define product variants.
   */
  private List<VariantOptionValueInput> optionValues;

  /**
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  private Integer position;

  /**
   * The price of the variant.
   */
  private String price;

  /**
   * The SKU for the variant. Case-sensitive string.
   */
  private String sku;

  /**
   * Whether the variant is taxable.
   */
  private Boolean taxable;

  /**
   * The tax code associated with the variant.
   */
  private String taxCode;

  public ProductVariantSetInput() {
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
   * The value of the barcode associated with the product.
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
   * Specifies the product variant to update or create a new variant if absent.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The file to associate with the variant.
   * Any file specified here must also be specified in the `files` input for the product.
   */
  public FileSetInput getFile() {
    return file;
  }

  public void setFile(FileSetInput file) {
    this.file = file;
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
   * Additional customizable information about the product variant.
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
   * The order of the product variant in the list of product variants. The first position in the list is 1.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
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
   * The SKU for the variant. Case-sensitive string.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
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

  @Override
  public String toString() {
    return "ProductVariantSetInput{requiresComponents='" + requiresComponents + "', barcode='" + barcode + "', compareAtPrice='" + compareAtPrice + "', id='" + id + "', file='" + file + "', inventoryPolicy='" + inventoryPolicy + "', inventoryQuantities='" + inventoryQuantities + "', inventoryItem='" + inventoryItem + "', metafields='" + metafields + "', optionValues='" + optionValues + "', position='" + position + "', price='" + price + "', sku='" + sku + "', taxable='" + taxable + "', taxCode='" + taxCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantSetInput that = (ProductVariantSetInput) o;
    return Objects.equals(requiresComponents, that.requiresComponents) &&
        Objects.equals(barcode, that.barcode) &&
        Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(file, that.file) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(inventoryQuantities, that.inventoryQuantities) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(optionValues, that.optionValues) &&
        Objects.equals(position, that.position) &&
        Objects.equals(price, that.price) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(taxCode, that.taxCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresComponents, barcode, compareAtPrice, id, file, inventoryPolicy, inventoryQuantities, inventoryItem, metafields, optionValues, position, price, sku, taxable, taxCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether a product variant requires components. The default value is `false`.
     * If `true`, then the product variant can only be purchased as a parent bundle with components and it will be omitted
     * from channels that don't support bundles.
     */
    private Boolean requiresComponents;

    /**
     * The value of the barcode associated with the product.
     */
    private String barcode;

    /**
     * The compare-at price of the variant.
     */
    private String compareAtPrice;

    /**
     * Specifies the product variant to update or create a new variant if absent.
     */
    private String id;

    /**
     * The file to associate with the variant.
     * Any file specified here must also be specified in the `files` input for the product.
     */
    private FileSetInput file;

    /**
     * Whether customers are allowed to place an order for the product variant when it's out of stock. Defaults to `DENY`.
     */
    private ProductVariantInventoryPolicy inventoryPolicy;

    /**
     * The inventory quantities at each location where the variant is stocked.
     * If you're updating an existing variant, then you can only update the
     * quantities at locations where the variant is already stocked.
     */
    private List<ProductSetInventoryInput> inventoryQuantities;

    /**
     * The inventory item associated with the variant, used for unit cost.
     */
    private InventoryItemInput inventoryItem;

    /**
     * Additional customizable information about the product variant.
     */
    private List<MetafieldInput> metafields;

    /**
     * The custom properties that a shop owner uses to define product variants.
     */
    private List<VariantOptionValueInput> optionValues;

    /**
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    private Integer position;

    /**
     * The price of the variant.
     */
    private String price;

    /**
     * The SKU for the variant. Case-sensitive string.
     */
    private String sku;

    /**
     * Whether the variant is taxable.
     */
    private Boolean taxable;

    /**
     * The tax code associated with the variant.
     */
    private String taxCode;

    public ProductVariantSetInput build() {
      ProductVariantSetInput result = new ProductVariantSetInput();
      result.requiresComponents = this.requiresComponents;
      result.barcode = this.barcode;
      result.compareAtPrice = this.compareAtPrice;
      result.id = this.id;
      result.file = this.file;
      result.inventoryPolicy = this.inventoryPolicy;
      result.inventoryQuantities = this.inventoryQuantities;
      result.inventoryItem = this.inventoryItem;
      result.metafields = this.metafields;
      result.optionValues = this.optionValues;
      result.position = this.position;
      result.price = this.price;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.taxCode = this.taxCode;
      return result;
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
     * The value of the barcode associated with the product.
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
     * Specifies the product variant to update or create a new variant if absent.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The file to associate with the variant.
     * Any file specified here must also be specified in the `files` input for the product.
     */
    public Builder file(FileSetInput file) {
      this.file = file;
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
     * Additional customizable information about the product variant.
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
     * The order of the product variant in the list of product variants. The first position in the list is 1.
     */
    public Builder position(Integer position) {
      this.position = position;
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
     * The SKU for the variant. Case-sensitive string.
     */
    public Builder sku(String sku) {
      this.sku = sku;
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
  }
}
