package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A cart represents the merchandise that a buyer intends to purchase,
 * and the estimated cost associated with the cart. Learn how to
 * [interact with a cart](https://shopify.dev/custom-storefronts/internationalization/international-pricing)
 * during a customer's session.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Cart implements MetafieldParentResource, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The gift cards that have been applied to the cart.
   */
  private List<AppliedGiftCard> appliedGiftCards;

  /**
   * An attribute associated with the cart.
   */
  private Attribute attribute;

  /**
   * The attributes associated with the cart. Attributes are represented as key-value pairs.
   */
  private List<Attribute> attributes;

  /**
   * Information about the buyer that's interacting with the cart.
   */
  private CartBuyerIdentity buyerIdentity;

  /**
   * The URL of the checkout for the cart.
   */
  private String checkoutUrl;

  /**
   * The estimated costs that the buyer will pay at checkout. The costs are subject
   * to change and changes will be reflected at checkout. The `cost` field uses the
   * `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   */
  private CartCost cost;

  /**
   * The date and time when the cart was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The delivery properties of the cart.
   */
  private CartDelivery delivery;

  /**
   * The delivery groups available for the cart, based on the buyer identity default
   * delivery address preference or the default address of the logged-in customer.
   */
  private CartDeliveryGroupConnection deliveryGroups;

  /**
   * The discounts that have been applied to the entire cart.
   */
  private List<CartDiscountAllocation> discountAllocations;

  /**
   * The case-insensitive discount codes that the customer added at checkout.
   */
  private List<CartDiscountCode> discountCodes;

  /**
   * The estimated costs that the buyer will pay at checkout. The estimated costs
   * are subject to change and changes will be reflected at checkout. The
   * `estimatedCost` field uses the `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   */
  private CartEstimatedCost estimatedCost;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A list of lines containing information about the items the customer intends to purchase.
   */
  private BaseCartLineConnection lines;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
   */
  private String note;

  /**
   * The total number of items in the cart.
   */
  private int totalQuantity;

  /**
   * The date and time when the cart was updated.
   */
  private OffsetDateTime updatedAt;

  public Cart() {
  }

  /**
   * The gift cards that have been applied to the cart.
   */
  public List<AppliedGiftCard> getAppliedGiftCards() {
    return appliedGiftCards;
  }

  public void setAppliedGiftCards(List<AppliedGiftCard> appliedGiftCards) {
    this.appliedGiftCards = appliedGiftCards;
  }

  /**
   * An attribute associated with the cart.
   */
  public Attribute getAttribute() {
    return attribute;
  }

  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  /**
   * The attributes associated with the cart. Attributes are represented as key-value pairs.
   */
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * Information about the buyer that's interacting with the cart.
   */
  public CartBuyerIdentity getBuyerIdentity() {
    return buyerIdentity;
  }

  public void setBuyerIdentity(CartBuyerIdentity buyerIdentity) {
    this.buyerIdentity = buyerIdentity;
  }

  /**
   * The URL of the checkout for the cart.
   */
  public String getCheckoutUrl() {
    return checkoutUrl;
  }

  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  /**
   * The estimated costs that the buyer will pay at checkout. The costs are subject
   * to change and changes will be reflected at checkout. The `cost` field uses the
   * `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   */
  public CartCost getCost() {
    return cost;
  }

  public void setCost(CartCost cost) {
    this.cost = cost;
  }

  /**
   * The date and time when the cart was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The delivery properties of the cart.
   */
  public CartDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(CartDelivery delivery) {
    this.delivery = delivery;
  }

  /**
   * The delivery groups available for the cart, based on the buyer identity default
   * delivery address preference or the default address of the logged-in customer.
   */
  public CartDeliveryGroupConnection getDeliveryGroups() {
    return deliveryGroups;
  }

  public void setDeliveryGroups(CartDeliveryGroupConnection deliveryGroups) {
    this.deliveryGroups = deliveryGroups;
  }

  /**
   * The discounts that have been applied to the entire cart.
   */
  public List<CartDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<CartDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The case-insensitive discount codes that the customer added at checkout.
   */
  public List<CartDiscountCode> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<CartDiscountCode> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The estimated costs that the buyer will pay at checkout. The estimated costs
   * are subject to change and changes will be reflected at checkout. The
   * `estimatedCost` field uses the `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   */
  public CartEstimatedCost getEstimatedCost() {
    return estimatedCost;
  }

  public void setEstimatedCost(CartEstimatedCost estimatedCost) {
    this.estimatedCost = estimatedCost;
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
   * A list of lines containing information about the items the customer intends to purchase.
   */
  public BaseCartLineConnection getLines() {
    return lines;
  }

  public void setLines(BaseCartLineConnection lines) {
    this.lines = lines;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The total number of items in the cart.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  /**
   * The date and time when the cart was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Cart{appliedGiftCards='" + appliedGiftCards + "', attribute='" + attribute + "', attributes='" + attributes + "', buyerIdentity='" + buyerIdentity + "', checkoutUrl='" + checkoutUrl + "', cost='" + cost + "', createdAt='" + createdAt + "', delivery='" + delivery + "', deliveryGroups='" + deliveryGroups + "', discountAllocations='" + discountAllocations + "', discountCodes='" + discountCodes + "', estimatedCost='" + estimatedCost + "', id='" + id + "', lines='" + lines + "', metafield='" + metafield + "', metafields='" + metafields + "', note='" + note + "', totalQuantity='" + totalQuantity + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cart that = (Cart) o;
    return Objects.equals(appliedGiftCards, that.appliedGiftCards) &&
        Objects.equals(attribute, that.attribute) &&
        Objects.equals(attributes, that.attributes) &&
        Objects.equals(buyerIdentity, that.buyerIdentity) &&
        Objects.equals(checkoutUrl, that.checkoutUrl) &&
        Objects.equals(cost, that.cost) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(delivery, that.delivery) &&
        Objects.equals(deliveryGroups, that.deliveryGroups) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(estimatedCost, that.estimatedCost) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(note, that.note) &&
        totalQuantity == that.totalQuantity &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedGiftCards, attribute, attributes, buyerIdentity, checkoutUrl, cost, createdAt, delivery, deliveryGroups, discountAllocations, discountCodes, estimatedCost, id, lines, metafield, metafields, note, totalQuantity, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The gift cards that have been applied to the cart.
     */
    private List<AppliedGiftCard> appliedGiftCards;

    /**
     * An attribute associated with the cart.
     */
    private Attribute attribute;

    /**
     * The attributes associated with the cart. Attributes are represented as key-value pairs.
     */
    private List<Attribute> attributes;

    /**
     * Information about the buyer that's interacting with the cart.
     */
    private CartBuyerIdentity buyerIdentity;

    /**
     * The URL of the checkout for the cart.
     */
    private String checkoutUrl;

    /**
     * The estimated costs that the buyer will pay at checkout. The costs are subject
     * to change and changes will be reflected at checkout. The `cost` field uses the
     * `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     */
    private CartCost cost;

    /**
     * The date and time when the cart was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The delivery properties of the cart.
     */
    private CartDelivery delivery;

    /**
     * The delivery groups available for the cart, based on the buyer identity default
     * delivery address preference or the default address of the logged-in customer.
     */
    private CartDeliveryGroupConnection deliveryGroups;

    /**
     * The discounts that have been applied to the entire cart.
     */
    private List<CartDiscountAllocation> discountAllocations;

    /**
     * The case-insensitive discount codes that the customer added at checkout.
     */
    private List<CartDiscountCode> discountCodes;

    /**
     * The estimated costs that the buyer will pay at checkout. The estimated costs
     * are subject to change and changes will be reflected at checkout. The
     * `estimatedCost` field uses the `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     */
    private CartEstimatedCost estimatedCost;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A list of lines containing information about the items the customer intends to purchase.
     */
    private BaseCartLineConnection lines;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
     */
    private String note;

    /**
     * The total number of items in the cart.
     */
    private int totalQuantity;

    /**
     * The date and time when the cart was updated.
     */
    private OffsetDateTime updatedAt;

    public Cart build() {
      Cart result = new Cart();
      result.appliedGiftCards = this.appliedGiftCards;
      result.attribute = this.attribute;
      result.attributes = this.attributes;
      result.buyerIdentity = this.buyerIdentity;
      result.checkoutUrl = this.checkoutUrl;
      result.cost = this.cost;
      result.createdAt = this.createdAt;
      result.delivery = this.delivery;
      result.deliveryGroups = this.deliveryGroups;
      result.discountAllocations = this.discountAllocations;
      result.discountCodes = this.discountCodes;
      result.estimatedCost = this.estimatedCost;
      result.id = this.id;
      result.lines = this.lines;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.note = this.note;
      result.totalQuantity = this.totalQuantity;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The gift cards that have been applied to the cart.
     */
    public Builder appliedGiftCards(List<AppliedGiftCard> appliedGiftCards) {
      this.appliedGiftCards = appliedGiftCards;
      return this;
    }

    /**
     * An attribute associated with the cart.
     */
    public Builder attribute(Attribute attribute) {
      this.attribute = attribute;
      return this;
    }

    /**
     * The attributes associated with the cart. Attributes are represented as key-value pairs.
     */
    public Builder attributes(List<Attribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Information about the buyer that's interacting with the cart.
     */
    public Builder buyerIdentity(CartBuyerIdentity buyerIdentity) {
      this.buyerIdentity = buyerIdentity;
      return this;
    }

    /**
     * The URL of the checkout for the cart.
     */
    public Builder checkoutUrl(String checkoutUrl) {
      this.checkoutUrl = checkoutUrl;
      return this;
    }

    /**
     * The estimated costs that the buyer will pay at checkout. The costs are subject
     * to change and changes will be reflected at checkout. The `cost` field uses the
     * `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     */
    public Builder cost(CartCost cost) {
      this.cost = cost;
      return this;
    }

    /**
     * The date and time when the cart was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The delivery properties of the cart.
     */
    public Builder delivery(CartDelivery delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * The delivery groups available for the cart, based on the buyer identity default
     * delivery address preference or the default address of the logged-in customer.
     */
    public Builder deliveryGroups(CartDeliveryGroupConnection deliveryGroups) {
      this.deliveryGroups = deliveryGroups;
      return this;
    }

    /**
     * The discounts that have been applied to the entire cart.
     */
    public Builder discountAllocations(List<CartDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The case-insensitive discount codes that the customer added at checkout.
     */
    public Builder discountCodes(List<CartDiscountCode> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The estimated costs that the buyer will pay at checkout. The estimated costs
     * are subject to change and changes will be reflected at checkout. The
     * `estimatedCost` field uses the `buyerIdentity` field to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     */
    public Builder estimatedCost(CartEstimatedCost estimatedCost) {
      this.estimatedCost = estimatedCost;
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
     * A list of lines containing information about the items the customer intends to purchase.
     */
    public Builder lines(BaseCartLineConnection lines) {
      this.lines = lines;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The total number of items in the cart.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }

    /**
     * The date and time when the cart was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
