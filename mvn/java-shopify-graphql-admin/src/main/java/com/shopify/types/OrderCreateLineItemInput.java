package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a line item to create for an order.
 */
public class OrderCreateLineItemInput {
  /**
   * The handle of a fulfillment service that stocks the product variant belonging to a line item.
   *   
   *               This is a third-party fulfillment service in the following scenarios:
   *   
   *               **Scenario 1**
   *               - The product variant is stocked by a single fulfillment service.
   *               - The
   * [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService) is
   * a third-party fulfillment service. Third-party fulfillment services don't have
   * a handle with the value `manual`.
   *   
   *               **Scenario 2**
   *               - Multiple fulfillment services stock the product variant.
   *               - The last time that the line item was unfulfilled, it was
   * awaiting fulfillment by a third-party fulfillment service. Third-party
   * fulfillment services don't have a handle with the value `manual`.
   *   
   *               If none of the above conditions are met, then the fulfillment service has the `manual` handle.
   */
  private String fulfillmentService;

  /**
   * Whether the item is a gift card. If true, then the item is not taxed or considered for shipping charges.
   */
  private Boolean giftCard = false;

  /**
   * The price of the item before discounts have been applied in the shop currency.
   */
  private MoneyBagInput priceSet;

  /**
   * The ID of the product that the line item belongs to. Can be `null` if the
   * original product associated with the order is deleted at a later date.
   */
  private String productId;

  /**
   * An array of custom information for the item that has been added to the cart.
   * Often used to provide product customization options.
   */
  private List<OrderCreateLineItemPropertyInput> properties;

  /**
   * The number of items that were purchased.
   */
  private int quantity;

  /**
   * Whether the item requires shipping.
   */
  private Boolean requiresShipping = false;

  /**
   * The item's SKU (stock keeping unit).
   */
  private String sku;

  /**
   * A list of tax line objects, each of which details a tax applied to the item.
   */
  private List<OrderCreateTaxLineInput> taxLines;

  /**
   * Whether the item was taxable.
   */
  private Boolean taxable = true;

  /**
   * The title of the product.
   */
  private String title;

  /**
   * The ID of the product variant. If both `productId` and `variantId` are
   * provided, then the product ID that corresponds to the `variantId` is used.
   */
  private String variantId;

  /**
   * The title of the product variant.
   */
  private String variantTitle;

  /**
   * The name of the item's supplier.
   */
  private String vendor;

  public OrderCreateLineItemInput() {
  }

  /**
   * The handle of a fulfillment service that stocks the product variant belonging to a line item.
   *   
   *               This is a third-party fulfillment service in the following scenarios:
   *   
   *               **Scenario 1**
   *               - The product variant is stocked by a single fulfillment service.
   *               - The
   * [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService) is
   * a third-party fulfillment service. Third-party fulfillment services don't have
   * a handle with the value `manual`.
   *   
   *               **Scenario 2**
   *               - Multiple fulfillment services stock the product variant.
   *               - The last time that the line item was unfulfilled, it was
   * awaiting fulfillment by a third-party fulfillment service. Third-party
   * fulfillment services don't have a handle with the value `manual`.
   *   
   *               If none of the above conditions are met, then the fulfillment service has the `manual` handle.
   */
  public String getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(String fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  /**
   * Whether the item is a gift card. If true, then the item is not taxed or considered for shipping charges.
   */
  public Boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(Boolean giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * The price of the item before discounts have been applied in the shop currency.
   */
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  /**
   * The ID of the product that the line item belongs to. Can be `null` if the
   * original product associated with the order is deleted at a later date.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * An array of custom information for the item that has been added to the cart.
   * Often used to provide product customization options.
   */
  public List<OrderCreateLineItemPropertyInput> getProperties() {
    return properties;
  }

  public void setProperties(List<OrderCreateLineItemPropertyInput> properties) {
    this.properties = properties;
  }

  /**
   * The number of items that were purchased.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Whether the item requires shipping.
   */
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * The item's SKU (stock keeping unit).
   */
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * A list of tax line objects, each of which details a tax applied to the item.
   */
  public List<OrderCreateTaxLineInput> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether the item was taxable.
   */
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  /**
   * The title of the product.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The ID of the product variant. If both `productId` and `variantId` are
   * provided, then the product ID that corresponds to the `variantId` is used.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The title of the product variant.
   */
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  /**
   * The name of the item's supplier.
   */
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public String toString() {
    return "OrderCreateLineItemInput{fulfillmentService='" + fulfillmentService + "', giftCard='" + giftCard + "', priceSet='" + priceSet + "', productId='" + productId + "', properties='" + properties + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateLineItemInput that = (OrderCreateLineItemInput) o;
    return Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(productId, that.productId) &&
        Objects.equals(properties, that.properties) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentService, giftCard, priceSet, productId, properties, quantity, requiresShipping, sku, taxLines, taxable, title, variantId, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The handle of a fulfillment service that stocks the product variant belonging to a line item.
     *   
     *               This is a third-party fulfillment service in the following scenarios:
     *   
     *               **Scenario 1**
     *               - The product variant is stocked by a single fulfillment service.
     *               - The
     * [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService) is
     * a third-party fulfillment service. Third-party fulfillment services don't have
     * a handle with the value `manual`.
     *   
     *               **Scenario 2**
     *               - Multiple fulfillment services stock the product variant.
     *               - The last time that the line item was unfulfilled, it was
     * awaiting fulfillment by a third-party fulfillment service. Third-party
     * fulfillment services don't have a handle with the value `manual`.
     *   
     *               If none of the above conditions are met, then the fulfillment service has the `manual` handle.
     */
    private String fulfillmentService;

    /**
     * Whether the item is a gift card. If true, then the item is not taxed or considered for shipping charges.
     */
    private Boolean giftCard = false;

    /**
     * The price of the item before discounts have been applied in the shop currency.
     */
    private MoneyBagInput priceSet;

    /**
     * The ID of the product that the line item belongs to. Can be `null` if the
     * original product associated with the order is deleted at a later date.
     */
    private String productId;

    /**
     * An array of custom information for the item that has been added to the cart.
     * Often used to provide product customization options.
     */
    private List<OrderCreateLineItemPropertyInput> properties;

    /**
     * The number of items that were purchased.
     */
    private int quantity;

    /**
     * Whether the item requires shipping.
     */
    private Boolean requiresShipping = false;

    /**
     * The item's SKU (stock keeping unit).
     */
    private String sku;

    /**
     * A list of tax line objects, each of which details a tax applied to the item.
     */
    private List<OrderCreateTaxLineInput> taxLines;

    /**
     * Whether the item was taxable.
     */
    private Boolean taxable = true;

    /**
     * The title of the product.
     */
    private String title;

    /**
     * The ID of the product variant. If both `productId` and `variantId` are
     * provided, then the product ID that corresponds to the `variantId` is used.
     */
    private String variantId;

    /**
     * The title of the product variant.
     */
    private String variantTitle;

    /**
     * The name of the item's supplier.
     */
    private String vendor;

    public OrderCreateLineItemInput build() {
      OrderCreateLineItemInput result = new OrderCreateLineItemInput();
      result.fulfillmentService = this.fulfillmentService;
      result.giftCard = this.giftCard;
      result.priceSet = this.priceSet;
      result.productId = this.productId;
      result.properties = this.properties;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    /**
     * The handle of a fulfillment service that stocks the product variant belonging to a line item.
     *   
     *               This is a third-party fulfillment service in the following scenarios:
     *   
     *               **Scenario 1**
     *               - The product variant is stocked by a single fulfillment service.
     *               - The
     * [FulfillmentService](/api/admin-graphql/latest/objects/FulfillmentService) is
     * a third-party fulfillment service. Third-party fulfillment services don't have
     * a handle with the value `manual`.
     *   
     *               **Scenario 2**
     *               - Multiple fulfillment services stock the product variant.
     *               - The last time that the line item was unfulfilled, it was
     * awaiting fulfillment by a third-party fulfillment service. Third-party
     * fulfillment services don't have a handle with the value `manual`.
     *   
     *               If none of the above conditions are met, then the fulfillment service has the `manual` handle.
     */
    public Builder fulfillmentService(String fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    /**
     * Whether the item is a gift card. If true, then the item is not taxed or considered for shipping charges.
     */
    public Builder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The price of the item before discounts have been applied in the shop currency.
     */
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    /**
     * The ID of the product that the line item belongs to. Can be `null` if the
     * original product associated with the order is deleted at a later date.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * An array of custom information for the item that has been added to the cart.
     * Often used to provide product customization options.
     */
    public Builder properties(List<OrderCreateLineItemPropertyInput> properties) {
      this.properties = properties;
      return this;
    }

    /**
     * The number of items that were purchased.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Whether the item requires shipping.
     */
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * The item's SKU (stock keeping unit).
     */
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    /**
     * A list of tax line objects, each of which details a tax applied to the item.
     */
    public Builder taxLines(List<OrderCreateTaxLineInput> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether the item was taxable.
     */
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    /**
     * The title of the product.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The ID of the product variant. If both `productId` and `variantId` are
     * provided, then the product ID that corresponds to the `variantId` is used.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The title of the product variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    /**
     * The name of the item's supplier.
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
