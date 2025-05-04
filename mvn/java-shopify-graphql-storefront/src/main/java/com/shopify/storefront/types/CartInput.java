package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create a cart.
 */
public class CartInput {
  /**
   * An array of key-value pairs that contains additional information about the cart.
   *   
   * The input must not contain more than `250` values.
   */
  private List<AttributeInput> attributes;

  /**
   * A list of merchandise lines to add to the cart.
   *   
   * The input must not contain more than `250` values.
   */
  private List<CartLineInput> lines;

  /**
   * The case-insensitive discount codes that the customer added at checkout.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> discountCodes;

  /**
   * The case-insensitive gift card codes.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> giftCardCodes;

  /**
   * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
   */
  private String note;

  /**
   * The customer associated with the cart. Used to determine [international pricing]
   * (https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   * Buyer identity should match the customer's shipping address.
   */
  private CartBuyerIdentityInput buyerIdentity;

  /**
   * The delivery-related fields for the cart.
   */
  private CartDeliveryInput delivery;

  /**
   * The metafields to associate with this cart.
   *   
   * The input must not contain more than `250` values.
   */
  private List<CartInputMetafieldInput> metafields;

  public CartInput() {
  }

  /**
   * An array of key-value pairs that contains additional information about the cart.
   *   
   * The input must not contain more than `250` values.
   */
  public List<AttributeInput> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeInput> attributes) {
    this.attributes = attributes;
  }

  /**
   * A list of merchandise lines to add to the cart.
   *   
   * The input must not contain more than `250` values.
   */
  public List<CartLineInput> getLines() {
    return lines;
  }

  public void setLines(List<CartLineInput> lines) {
    this.lines = lines;
  }

  /**
   * The case-insensitive discount codes that the customer added at checkout.
   *   
   * The input must not contain more than `250` values.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The case-insensitive gift card codes.
   *   
   * The input must not contain more than `250` values.
   */
  public List<String> getGiftCardCodes() {
    return giftCardCodes;
  }

  public void setGiftCardCodes(List<String> giftCardCodes) {
    this.giftCardCodes = giftCardCodes;
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
   * The customer associated with the cart. Used to determine [international pricing]
   * (https://shopify.dev/custom-storefronts/internationalization/international-pricing).
   * Buyer identity should match the customer's shipping address.
   */
  public CartBuyerIdentityInput getBuyerIdentity() {
    return buyerIdentity;
  }

  public void setBuyerIdentity(CartBuyerIdentityInput buyerIdentity) {
    this.buyerIdentity = buyerIdentity;
  }

  /**
   * The delivery-related fields for the cart.
   */
  public CartDeliveryInput getDelivery() {
    return delivery;
  }

  public void setDelivery(CartDeliveryInput delivery) {
    this.delivery = delivery;
  }

  /**
   * The metafields to associate with this cart.
   *   
   * The input must not contain more than `250` values.
   */
  public List<CartInputMetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<CartInputMetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "CartInput{attributes='" + attributes + "', lines='" + lines + "', discountCodes='" + discountCodes + "', giftCardCodes='" + giftCardCodes + "', note='" + note + "', buyerIdentity='" + buyerIdentity + "', delivery='" + delivery + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartInput that = (CartInput) o;
    return Objects.equals(attributes, that.attributes) &&
        Objects.equals(lines, that.lines) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(giftCardCodes, that.giftCardCodes) &&
        Objects.equals(note, that.note) &&
        Objects.equals(buyerIdentity, that.buyerIdentity) &&
        Objects.equals(delivery, that.delivery) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, lines, discountCodes, giftCardCodes, note, buyerIdentity, delivery, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An array of key-value pairs that contains additional information about the cart.
     *   
     * The input must not contain more than `250` values.
     */
    private List<AttributeInput> attributes;

    /**
     * A list of merchandise lines to add to the cart.
     *   
     * The input must not contain more than `250` values.
     */
    private List<CartLineInput> lines;

    /**
     * The case-insensitive discount codes that the customer added at checkout.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> discountCodes;

    /**
     * The case-insensitive gift card codes.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> giftCardCodes;

    /**
     * A note that's associated with the cart. For example, the note can be a personalized message to the buyer.
     */
    private String note;

    /**
     * The customer associated with the cart. Used to determine [international pricing]
     * (https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     * Buyer identity should match the customer's shipping address.
     */
    private CartBuyerIdentityInput buyerIdentity;

    /**
     * The delivery-related fields for the cart.
     */
    private CartDeliveryInput delivery;

    /**
     * The metafields to associate with this cart.
     *   
     * The input must not contain more than `250` values.
     */
    private List<CartInputMetafieldInput> metafields;

    public CartInput build() {
      CartInput result = new CartInput();
      result.attributes = this.attributes;
      result.lines = this.lines;
      result.discountCodes = this.discountCodes;
      result.giftCardCodes = this.giftCardCodes;
      result.note = this.note;
      result.buyerIdentity = this.buyerIdentity;
      result.delivery = this.delivery;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * An array of key-value pairs that contains additional information about the cart.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder attributes(List<AttributeInput> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * A list of merchandise lines to add to the cart.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder lines(List<CartLineInput> lines) {
      this.lines = lines;
      return this;
    }

    /**
     * The case-insensitive discount codes that the customer added at checkout.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The case-insensitive gift card codes.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder giftCardCodes(List<String> giftCardCodes) {
      this.giftCardCodes = giftCardCodes;
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
     * The customer associated with the cart. Used to determine [international pricing]
     * (https://shopify.dev/custom-storefronts/internationalization/international-pricing).
     * Buyer identity should match the customer's shipping address.
     */
    public Builder buyerIdentity(CartBuyerIdentityInput buyerIdentity) {
      this.buyerIdentity = buyerIdentity;
      return this;
    }

    /**
     * The delivery-related fields for the cart.
     */
    public Builder delivery(CartDeliveryInput delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * The metafields to associate with this cart.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder metafields(List<CartInputMetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
