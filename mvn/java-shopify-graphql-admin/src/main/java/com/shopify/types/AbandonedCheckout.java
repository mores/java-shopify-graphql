package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A checkout that was abandoned by the customer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AbandonedCheckout implements com.shopify.types.Navigable, com.shopify.types.Node {
  /**
   * The URL for the buyer to recover their checkout.
   */
  private String abandonedCheckoutUrl;

  /**
   * The billing address provided by the buyer.
   * Null if the user did not provide a billing address.
   */
  private MailingAddress billingAddress;

  /**
   * The date and time when the buyer completed the checkout.
   * Null if the checkout has not been completed.
   */
  private OffsetDateTime completedAt;

  /**
   * The date and time when the checkout was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A list of extra information that has been added to the checkout.
   */
  private List<Attribute> customAttributes;

  /**
   * The customer who created this checkout.
   * May be null if the checkout was created from a draft order or via an app.
   */
  private Customer customer;

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  private String defaultCursor;

  /**
   * The discount codes entered by the buyer at checkout.
   */
  private List<String> discountCodes;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of the line items in this checkout.
   */
  private AbandonedCheckoutLineItemConnection lineItems;

  /**
   * The number of products in the checkout.
   */
  private int lineItemsQuantity;

  /**
   * Unique merchant-facing identifier for the checkout.
   */
  private String name;

  /**
   * A merchant-facing note added to the checkout. Not visible to the buyer.
   */
  private String note;

  /**
   * The shipping address to where the line items will be shipped.
   * Null if the user did not provide a shipping address.
   */
  private MailingAddress shippingAddress;

  /**
   * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * Individual taxes charged on the checkout.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether taxes are included in line item and shipping line prices.
   */
  private boolean taxesIncluded;

  /**
   * The total amount of discounts to be applied.
   */
  private MoneyBag totalDiscountSet;

  /**
   * The total duties applied to the checkout.
   */
  private MoneyBag totalDutiesSet;

  /**
   * The sum of the prices of all line items in the checkout.
   */
  private MoneyBag totalLineItemsPriceSet;

  /**
   * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
   */
  private MoneyBag totalPriceSet;

  /**
   * The total tax applied to the checkout.
   */
  private MoneyBag totalTaxSet;

  /**
   * The date and time when the checkout was most recently updated.
   */
  private OffsetDateTime updatedAt;

  public AbandonedCheckout() {
  }

  /**
   * The URL for the buyer to recover their checkout.
   */
  public String getAbandonedCheckoutUrl() {
    return abandonedCheckoutUrl;
  }

  public void setAbandonedCheckoutUrl(String abandonedCheckoutUrl) {
    this.abandonedCheckoutUrl = abandonedCheckoutUrl;
  }

  /**
   * The billing address provided by the buyer.
   * Null if the user did not provide a billing address.
   */
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The date and time when the buyer completed the checkout.
   * Null if the checkout has not been completed.
   */
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The date and time when the checkout was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A list of extra information that has been added to the checkout.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer who created this checkout.
   * May be null if the checkout was created from a draft order or via an app.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
   * returns the single next record, sorted ascending by ID.
   */
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  /**
   * The discount codes entered by the buyer at checkout.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
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
   * A list of the line items in this checkout.
   */
  public AbandonedCheckoutLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(AbandonedCheckoutLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The number of products in the checkout.
   */
  public int getLineItemsQuantity() {
    return lineItemsQuantity;
  }

  public void setLineItemsQuantity(int lineItemsQuantity) {
    this.lineItemsQuantity = lineItemsQuantity;
  }

  /**
   * Unique merchant-facing identifier for the checkout.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A merchant-facing note added to the checkout. Not visible to the buyer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The shipping address to where the line items will be shipped.
   * Null if the user did not provide a shipping address.
   */
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * Individual taxes charged on the checkout.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether taxes are included in line item and shipping line prices.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  /**
   * The total amount of discounts to be applied.
   */
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
  }

  /**
   * The total duties applied to the checkout.
   */
  public MoneyBag getTotalDutiesSet() {
    return totalDutiesSet;
  }

  public void setTotalDutiesSet(MoneyBag totalDutiesSet) {
    this.totalDutiesSet = totalDutiesSet;
  }

  /**
   * The sum of the prices of all line items in the checkout.
   */
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  /**
   * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The total tax applied to the checkout.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * The date and time when the checkout was most recently updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "AbandonedCheckout{abandonedCheckoutUrl='" + abandonedCheckoutUrl + "', billingAddress='" + billingAddress + "', completedAt='" + completedAt + "', createdAt='" + createdAt + "', customAttributes='" + customAttributes + "', customer='" + customer + "', defaultCursor='" + defaultCursor + "', discountCodes='" + discountCodes + "', id='" + id + "', lineItems='" + lineItems + "', lineItemsQuantity='" + lineItemsQuantity + "', name='" + name + "', note='" + note + "', shippingAddress='" + shippingAddress + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountSet='" + totalDiscountSet + "', totalDutiesSet='" + totalDutiesSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPriceSet='" + totalPriceSet + "', totalTaxSet='" + totalTaxSet + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckout that = (AbandonedCheckout) o;
    return Objects.equals(abandonedCheckoutUrl, that.abandonedCheckoutUrl) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        lineItemsQuantity == that.lineItemsQuantity &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxesIncluded == that.taxesIncluded &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(totalDutiesSet, that.totalDutiesSet) &&
        Objects.equals(totalLineItemsPriceSet, that.totalLineItemsPriceSet) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedCheckoutUrl, billingAddress, completedAt, createdAt, customAttributes, customer, defaultCursor, discountCodes, id, lineItems, lineItemsQuantity, name, note, shippingAddress, subtotalPriceSet, taxLines, taxesIncluded, totalDiscountSet, totalDutiesSet, totalLineItemsPriceSet, totalPriceSet, totalTaxSet, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL for the buyer to recover their checkout.
     */
    private String abandonedCheckoutUrl;

    /**
     * The billing address provided by the buyer.
     * Null if the user did not provide a billing address.
     */
    private MailingAddress billingAddress;

    /**
     * The date and time when the buyer completed the checkout.
     * Null if the checkout has not been completed.
     */
    private OffsetDateTime completedAt;

    /**
     * The date and time when the checkout was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A list of extra information that has been added to the checkout.
     */
    private List<Attribute> customAttributes;

    /**
     * The customer who created this checkout.
     * May be null if the checkout was created from a draft order or via an app.
     */
    private Customer customer;

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    private String defaultCursor;

    /**
     * The discount codes entered by the buyer at checkout.
     */
    private List<String> discountCodes;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of the line items in this checkout.
     */
    private AbandonedCheckoutLineItemConnection lineItems;

    /**
     * The number of products in the checkout.
     */
    private int lineItemsQuantity;

    /**
     * Unique merchant-facing identifier for the checkout.
     */
    private String name;

    /**
     * A merchant-facing note added to the checkout. Not visible to the buyer.
     */
    private String note;

    /**
     * The shipping address to where the line items will be shipped.
     * Null if the user did not provide a shipping address.
     */
    private MailingAddress shippingAddress;

    /**
     * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * Individual taxes charged on the checkout.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether taxes are included in line item and shipping line prices.
     */
    private boolean taxesIncluded;

    /**
     * The total amount of discounts to be applied.
     */
    private MoneyBag totalDiscountSet;

    /**
     * The total duties applied to the checkout.
     */
    private MoneyBag totalDutiesSet;

    /**
     * The sum of the prices of all line items in the checkout.
     */
    private MoneyBag totalLineItemsPriceSet;

    /**
     * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
     */
    private MoneyBag totalPriceSet;

    /**
     * The total tax applied to the checkout.
     */
    private MoneyBag totalTaxSet;

    /**
     * The date and time when the checkout was most recently updated.
     */
    private OffsetDateTime updatedAt;

    public AbandonedCheckout build() {
      AbandonedCheckout result = new AbandonedCheckout();
      result.abandonedCheckoutUrl = this.abandonedCheckoutUrl;
      result.billingAddress = this.billingAddress;
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.defaultCursor = this.defaultCursor;
      result.discountCodes = this.discountCodes;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.lineItemsQuantity = this.lineItemsQuantity;
      result.name = this.name;
      result.note = this.note;
      result.shippingAddress = this.shippingAddress;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.taxesIncluded = this.taxesIncluded;
      result.totalDiscountSet = this.totalDiscountSet;
      result.totalDutiesSet = this.totalDutiesSet;
      result.totalLineItemsPriceSet = this.totalLineItemsPriceSet;
      result.totalPriceSet = this.totalPriceSet;
      result.totalTaxSet = this.totalTaxSet;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The URL for the buyer to recover their checkout.
     */
    public Builder abandonedCheckoutUrl(String abandonedCheckoutUrl) {
      this.abandonedCheckoutUrl = abandonedCheckoutUrl;
      return this;
    }

    /**
     * The billing address provided by the buyer.
     * Null if the user did not provide a billing address.
     */
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The date and time when the buyer completed the checkout.
     * Null if the checkout has not been completed.
     */
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    /**
     * The date and time when the checkout was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A list of extra information that has been added to the checkout.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer who created this checkout.
     * May be null if the checkout was created from a draft order or via an app.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that
     * returns the single next record, sorted ascending by ID.
     */
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    /**
     * The discount codes entered by the buyer at checkout.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
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
     * A list of the line items in this checkout.
     */
    public Builder lineItems(AbandonedCheckoutLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The number of products in the checkout.
     */
    public Builder lineItemsQuantity(int lineItemsQuantity) {
      this.lineItemsQuantity = lineItemsQuantity;
      return this;
    }

    /**
     * Unique merchant-facing identifier for the checkout.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A merchant-facing note added to the checkout. Not visible to the buyer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The shipping address to where the line items will be shipped.
     * Null if the user did not provide a shipping address.
     */
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * Individual taxes charged on the checkout.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether taxes are included in line item and shipping line prices.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    /**
     * The total amount of discounts to be applied.
     */
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
      return this;
    }

    /**
     * The total duties applied to the checkout.
     */
    public Builder totalDutiesSet(MoneyBag totalDutiesSet) {
      this.totalDutiesSet = totalDutiesSet;
      return this;
    }

    /**
     * The sum of the prices of all line items in the checkout.
     */
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    /**
     * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The total tax applied to the checkout.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * The date and time when the checkout was most recently updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
