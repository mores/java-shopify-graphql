package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Associates an order line item with quantities requiring fulfillment from the respective fulfillment order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrderLineItem implements com.shopify.types.Node {
  /**
   * The financial summary for the Fulfillment Order's Line Items.
   */
  private List<FulfillmentOrderLineItemFinancialSummary> financialSummaries;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated to the line item's variant.
   */
  private Image image;

  /**
   * The ID of the inventory item.
   */
  private String inventoryItemId;

  /**
   * The associated order line item.
   */
  private LineItem lineItem;

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The title of the product.
   */
  private String productTitle;

  /**
   * The number of units remaining to be fulfilled.
   */
  private int remainingQuantity;

  /**
   * Whether physical shipping is required for the variant.
   */
  private boolean requiresShipping;

  /**
   * The variant SKU number.
   */
  private String sku;

  /**
   * The total number of units to be fulfilled.
   */
  private int totalQuantity;

  /**
   * The product variant associated to the fulfillment order line item.
   */
  private ProductVariant variant;

  /**
   * The name of the variant.
   */
  private String variantTitle;

  /**
   * The name of the vendor who made the variant.
   */
  private String vendor;

  /**
   * Warning messages for a fulfillment order line item.
   */
  private List<FulfillmentOrderLineItemWarning> warnings;

  /**
   * The weight of a line item unit.
   */
  private Weight weight;

  public FulfillmentOrderLineItem() {
  }

  /**
   * The financial summary for the Fulfillment Order's Line Items.
   */
  public List<FulfillmentOrderLineItemFinancialSummary> getFinancialSummaries() {
    return financialSummaries;
  }

  public void setFinancialSummaries(
      List<FulfillmentOrderLineItemFinancialSummary> financialSummaries) {
    this.financialSummaries = financialSummaries;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The image associated to the line item's variant.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The ID of the inventory item.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The associated order line item.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The title of the product.
   */
  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  /**
   * The number of units remaining to be fulfilled.
   */
  public int getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(int remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  /**
   * Whether physical shipping is required for the variant.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The variant SKU number.
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * The total number of units to be fulfilled.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  /**
   * The product variant associated to the fulfillment order line item.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  /**
   * The name of the variant.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The name of the vendor who made the variant.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  /**
   * Warning messages for a fulfillment order line item.
   */
  public List<FulfillmentOrderLineItemWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<FulfillmentOrderLineItemWarning> warnings) {
    this.warnings = warnings;
  }

  /**
   * The weight of a line item unit.
   */
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItem{financialSummaries='" + financialSummaries + "', id='" + id + "', image='" + image + "', inventoryItemId='" + inventoryItemId + "', lineItem='" + lineItem + "', originalUnitPriceSet='" + originalUnitPriceSet + "', productTitle='" + productTitle + "', remainingQuantity='" + remainingQuantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', totalQuantity='" + totalQuantity + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "', warnings='" + warnings + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItem that = (FulfillmentOrderLineItem) o;
    return Objects.equals(financialSummaries, that.financialSummaries) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        Objects.equals(productTitle, that.productTitle) &&
        remainingQuantity == that.remainingQuantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        totalQuantity == that.totalQuantity &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor) &&
        Objects.equals(warnings, that.warnings) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialSummaries, id, image, inventoryItemId, lineItem, originalUnitPriceSet, productTitle, remainingQuantity, requiresShipping, sku, totalQuantity, variant, variantTitle, vendor, warnings, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The financial summary for the Fulfillment Order's Line Items.
     */
    private List<FulfillmentOrderLineItemFinancialSummary> financialSummaries;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated to the line item's variant.
     */
    private Image image;

    /**
     * The ID of the inventory item.
     */
    private String inventoryItemId;

    /**
     * The associated order line item.
     */
    private LineItem lineItem;

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The title of the product.
     */
    private String productTitle;

    /**
     * The number of units remaining to be fulfilled.
     */
    private int remainingQuantity;

    /**
     * Whether physical shipping is required for the variant.
     */
    private boolean requiresShipping;

    /**
     * The variant SKU number.
     */
    private String sku;

    /**
     * The total number of units to be fulfilled.
     */
    private int totalQuantity;

    /**
     * The product variant associated to the fulfillment order line item.
     */
    private ProductVariant variant;

    /**
     * The name of the variant.
     */
    private String variantTitle;

    /**
     * The name of the vendor who made the variant.
     */
    private String vendor;

    /**
     * Warning messages for a fulfillment order line item.
     */
    private List<FulfillmentOrderLineItemWarning> warnings;

    /**
     * The weight of a line item unit.
     */
    private Weight weight;

    public FulfillmentOrderLineItem build() {
      FulfillmentOrderLineItem result = new FulfillmentOrderLineItem();
      result.financialSummaries = this.financialSummaries;
      result.id = this.id;
      result.image = this.image;
      result.inventoryItemId = this.inventoryItemId;
      result.lineItem = this.lineItem;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.productTitle = this.productTitle;
      result.remainingQuantity = this.remainingQuantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.totalQuantity = this.totalQuantity;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      result.warnings = this.warnings;
      result.weight = this.weight;
      return result;
    }

    /**
     * The financial summary for the Fulfillment Order's Line Items.
     */
    public Builder financialSummaries(
        List<FulfillmentOrderLineItemFinancialSummary> financialSummaries) {
      this.financialSummaries = financialSummaries;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The image associated to the line item's variant.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The ID of the inventory item.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The associated order line item.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The title of the product.
     */
    public Builder productTitle(String productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    /**
     * The number of units remaining to be fulfilled.
     */
    public Builder remainingQuantity(int remainingQuantity) {
      this.remainingQuantity = remainingQuantity;
      return this;
    }

    /**
     * Whether physical shipping is required for the variant.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The variant SKU number.
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * The total number of units to be fulfilled.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }

    /**
     * The product variant associated to the fulfillment order line item.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    /**
     * The name of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The name of the vendor who made the variant.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    /**
     * Warning messages for a fulfillment order line item.
     */
    public Builder warnings(List<FulfillmentOrderLineItemWarning> warnings) {
      this.warnings = warnings;
      return this;
    }

    /**
     * The weight of a line item unit.
     */
    public Builder weight(Weight weight) {
      this.weight = weight;
      return this;
    }
  }
}
