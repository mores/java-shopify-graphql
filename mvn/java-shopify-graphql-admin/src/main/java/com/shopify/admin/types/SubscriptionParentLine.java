package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Subscription Parent Line.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionParentLine implements SubscriptionGroupedLine {
  /**
   * The app that bundled this parent line.
   */
  private App bundledBy;

  /**
   * The direct component lines of the bundle parent line.
   */
  private List<SubscriptionLine> components;

  /**
   * List of custom attributes associated to the parent line item.
   */
  private List<Attribute> customAttributes;

  /**
   * The unique ID.
   */
  private String id;

  /**
   * Presentment title of the item associated with the subscription parent line.
   */
  private String presentmentTitle;

  /**
   * The product ID associated with the subscription parent line.
   */
  private String productId;

  /**
   * The quantity of the unit selected for the subscription parent line.
   */
  private int quantity;

  /**
   * The source type of the subscription parent line.
   */
  private String sourceType;

  /**
   * Product title of the item associated with the subscription parent line.
   */
  private String title;

  /**
   * The product variant ID associated with the subscription parent line.
   */
  private String variantId;

  public SubscriptionParentLine() {
  }

  /**
   * The app that bundled this parent line.
   */
  public App getBundledBy() {
    return bundledBy;
  }

  public void setBundledBy(App bundledBy) {
    this.bundledBy = bundledBy;
  }

  /**
   * The direct component lines of the bundle parent line.
   */
  public List<SubscriptionLine> getComponents() {
    return components;
  }

  public void setComponents(List<SubscriptionLine> components) {
    this.components = components;
  }

  /**
   * List of custom attributes associated to the parent line item.
   */
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Presentment title of the item associated with the subscription parent line.
   */
  public String getPresentmentTitle() {
    return presentmentTitle;
  }

  public void setPresentmentTitle(String presentmentTitle) {
    this.presentmentTitle = presentmentTitle;
  }

  /**
   * The product ID associated with the subscription parent line.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The quantity of the unit selected for the subscription parent line.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The source type of the subscription parent line.
   */
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Product title of the item associated with the subscription parent line.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The product variant ID associated with the subscription parent line.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  @Override
  public String toString() {
    return "SubscriptionParentLine{bundledBy='" + bundledBy + "', components='" + components + "', customAttributes='" + customAttributes + "', id='" + id + "', presentmentTitle='" + presentmentTitle + "', productId='" + productId + "', quantity='" + quantity + "', sourceType='" + sourceType + "', title='" + title + "', variantId='" + variantId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionParentLine that = (SubscriptionParentLine) o;
    return Objects.equals(bundledBy, that.bundledBy) &&
        Objects.equals(components, that.components) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(id, that.id) &&
        Objects.equals(presentmentTitle, that.presentmentTitle) &&
        Objects.equals(productId, that.productId) &&
        quantity == that.quantity &&
        Objects.equals(sourceType, that.sourceType) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundledBy, components, customAttributes, id, presentmentTitle, productId, quantity, sourceType, title, variantId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app that bundled this parent line.
     */
    private App bundledBy;

    /**
     * The direct component lines of the bundle parent line.
     */
    private List<SubscriptionLine> components;

    /**
     * List of custom attributes associated to the parent line item.
     */
    private List<Attribute> customAttributes;

    /**
     * The unique ID.
     */
    private String id;

    /**
     * Presentment title of the item associated with the subscription parent line.
     */
    private String presentmentTitle;

    /**
     * The product ID associated with the subscription parent line.
     */
    private String productId;

    /**
     * The quantity of the unit selected for the subscription parent line.
     */
    private int quantity;

    /**
     * The source type of the subscription parent line.
     */
    private String sourceType;

    /**
     * Product title of the item associated with the subscription parent line.
     */
    private String title;

    /**
     * The product variant ID associated with the subscription parent line.
     */
    private String variantId;

    public SubscriptionParentLine build() {
      SubscriptionParentLine result = new SubscriptionParentLine();
      result.bundledBy = this.bundledBy;
      result.components = this.components;
      result.customAttributes = this.customAttributes;
      result.id = this.id;
      result.presentmentTitle = this.presentmentTitle;
      result.productId = this.productId;
      result.quantity = this.quantity;
      result.sourceType = this.sourceType;
      result.title = this.title;
      result.variantId = this.variantId;
      return result;
    }

    /**
     * The app that bundled this parent line.
     */
    public Builder bundledBy(App bundledBy) {
      this.bundledBy = bundledBy;
      return this;
    }

    /**
     * The direct component lines of the bundle parent line.
     */
    public Builder components(List<SubscriptionLine> components) {
      this.components = components;
      return this;
    }

    /**
     * List of custom attributes associated to the parent line item.
     */
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Presentment title of the item associated with the subscription parent line.
     */
    public Builder presentmentTitle(String presentmentTitle) {
      this.presentmentTitle = presentmentTitle;
      return this;
    }

    /**
     * The product ID associated with the subscription parent line.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The quantity of the unit selected for the subscription parent line.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The source type of the subscription parent line.
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Product title of the item associated with the subscription parent line.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The product variant ID associated with the subscription parent line.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }
  }
}
