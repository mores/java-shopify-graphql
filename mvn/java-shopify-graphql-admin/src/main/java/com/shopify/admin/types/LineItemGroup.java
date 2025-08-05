package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A line item group (bundle) to which a line item belongs to.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItemGroup implements com.shopify.admin.types.Node {
  /**
   * A list of attributes that represent custom features or special requests.
   */
  private List<Attribute> customAttributes;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * ID of the product of the line item group.
   */
  private String productId;

  /**
   * Quantity of the line item group on the order.
   */
  private int quantity;

  /**
   * Title of the line item group.
   */
  private String title;

  /**
   * ID of the variant of the line item group.
   */
  private String variantId;

  /**
   * SKU of the variant of the line item group.
   */
  private String variantSku;

  public LineItemGroup() {
  }

  /**
   * A list of attributes that represent custom features or special requests.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
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
   * ID of the product of the line item group.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Quantity of the line item group on the order.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Title of the line item group.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * ID of the variant of the line item group.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * SKU of the variant of the line item group.
   */
  public String getVariantSku() {
    return variantSku;
  }

  public void setVariantSku(String variantSku) {
    this.variantSku = variantSku;
  }

  @Override
  public String toString() {
    return "LineItemGroup{customAttributes='" + customAttributes + "', id='" + id + "', productId='" + productId + "', quantity='" + quantity + "', title='" + title + "', variantId='" + variantId + "', variantSku='" + variantSku + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItemGroup that = (LineItemGroup) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(id, that.id) &&
        Objects.equals(productId, that.productId) &&
        quantity == that.quantity &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantSku, that.variantSku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, id, productId, quantity, title, variantId, variantSku);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of attributes that represent custom features or special requests.
     */
    private List<Attribute> customAttributes;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * ID of the product of the line item group.
     */
    private String productId;

    /**
     * Quantity of the line item group on the order.
     */
    private int quantity;

    /**
     * Title of the line item group.
     */
    private String title;

    /**
     * ID of the variant of the line item group.
     */
    private String variantId;

    /**
     * SKU of the variant of the line item group.
     */
    private String variantSku;

    public LineItemGroup build() {
      LineItemGroup result = new LineItemGroup();
      result.customAttributes = this.customAttributes;
      result.id = this.id;
      result.productId = this.productId;
      result.quantity = this.quantity;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantSku = this.variantSku;
      return result;
    }

    /**
     * A list of attributes that represent custom features or special requests.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
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
     * ID of the product of the line item group.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Quantity of the line item group on the order.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Title of the line item group.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * ID of the variant of the line item group.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * SKU of the variant of the line item group.
     */
    public Builder variantSku(String variantSku) {
      this.variantSku = variantSku;
      return this;
    }
  }
}
