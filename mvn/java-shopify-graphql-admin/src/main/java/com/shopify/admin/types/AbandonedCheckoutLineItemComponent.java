package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The list of line item components that belong to a line item.
 */
public class AbandonedCheckoutLineItemComponent {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The variant image associated with the line item component.
   * NULL if the variant associated doesn't have an image.
   */
  private Image image;

  /**
   * The quantity of the line item component.
   */
  private int quantity;

  /**
   * Title of the line item component.
   */
  private String title;

  /**
   * The name of the variant.
   */
  private String variantTitle;

  public AbandonedCheckoutLineItemComponent() {
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
   * The variant image associated with the line item component.
   * NULL if the variant associated doesn't have an image.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The quantity of the line item component.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Title of the line item component.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  @Override
  public String toString() {
    return "AbandonedCheckoutLineItemComponent{id='" + id + "', image='" + image + "', quantity='" + quantity + "', title='" + title + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckoutLineItemComponent that = (AbandonedCheckoutLineItemComponent) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        quantity == that.quantity &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, image, quantity, title, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The variant image associated with the line item component.
     * NULL if the variant associated doesn't have an image.
     */
    private Image image;

    /**
     * The quantity of the line item component.
     */
    private int quantity;

    /**
     * Title of the line item component.
     */
    private String title;

    /**
     * The name of the variant.
     */
    private String variantTitle;

    public AbandonedCheckoutLineItemComponent build() {
      AbandonedCheckoutLineItemComponent result = new AbandonedCheckoutLineItemComponent();
      result.id = this.id;
      result.image = this.image;
      result.quantity = this.quantity;
      result.title = this.title;
      result.variantTitle = this.variantTitle;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The variant image associated with the line item component.
     * NULL if the variant associated doesn't have an image.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The quantity of the line item component.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Title of the line item component.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The name of the variant.
     */
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
