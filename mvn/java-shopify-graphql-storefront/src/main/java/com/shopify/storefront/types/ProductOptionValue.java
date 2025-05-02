package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The product option value names. For example, "Red", "Blue", and "Green" for a "Color" option.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOptionValue implements com.shopify.storefront.types.Node {
  /**
   * The product variant that combines this option value with the
   * lowest-position option values for all other options.
   *   
   * This field will always return a variant, provided a variant including this option value exists.
   */
  private ProductVariant firstSelectableVariant;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the product option value.
   */
  private String name;

  /**
   * The swatch of the product option value.
   */
  private ProductOptionValueSwatch swatch;

  public ProductOptionValue() {
  }

  /**
   * The product variant that combines this option value with the
   * lowest-position option values for all other options.
   *   
   * This field will always return a variant, provided a variant including this option value exists.
   */
  public ProductVariant getFirstSelectableVariant() {
    return firstSelectableVariant;
  }

  public void setFirstSelectableVariant(ProductVariant firstSelectableVariant) {
    this.firstSelectableVariant = firstSelectableVariant;
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
   * The name of the product option value.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The swatch of the product option value.
   */
  public ProductOptionValueSwatch getSwatch() {
    return swatch;
  }

  public void setSwatch(ProductOptionValueSwatch swatch) {
    this.swatch = swatch;
  }

  @Override
  public String toString() {
    return "ProductOptionValue{firstSelectableVariant='" + firstSelectableVariant + "', id='" + id + "', name='" + name + "', swatch='" + swatch + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionValue that = (ProductOptionValue) o;
    return Objects.equals(firstSelectableVariant, that.firstSelectableVariant) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(swatch, that.swatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSelectableVariant, id, name, swatch);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product variant that combines this option value with the
     * lowest-position option values for all other options.
     *   
     * This field will always return a variant, provided a variant including this option value exists.
     */
    private ProductVariant firstSelectableVariant;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the product option value.
     */
    private String name;

    /**
     * The swatch of the product option value.
     */
    private ProductOptionValueSwatch swatch;

    public ProductOptionValue build() {
      ProductOptionValue result = new ProductOptionValue();
      result.firstSelectableVariant = this.firstSelectableVariant;
      result.id = this.id;
      result.name = this.name;
      result.swatch = this.swatch;
      return result;
    }

    /**
     * The product variant that combines this option value with the
     * lowest-position option values for all other options.
     *   
     * This field will always return a variant, provided a variant including this option value exists.
     */
    public Builder firstSelectableVariant(ProductVariant firstSelectableVariant) {
      this.firstSelectableVariant = firstSelectableVariant;
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
     * The name of the product option value.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The swatch of the product option value.
     */
    public Builder swatch(ProductOptionValueSwatch swatch) {
      this.swatch = swatch;
      return this;
    }
  }
}
