package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A specific value for a [`ProductOption`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption),
 * such as "Red" or "Blue" for a "Color" option. Each value can be assigned to [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects to create different versions of a
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
 *
 * The value tracks whether any variants currently use it through the [`hasVariants`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue#field-hasVariants)
 * field. Values can include visual representations through swatches that display
 * colors or images. When linked to a [`Metafield`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metafield), the [`linkedMetafieldValue`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue#field-linkedMetafieldValue)
 * provides additional structured data for the option value.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOptionValue implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * Whether the product option value has any linked variants.
   */
  private boolean hasVariants;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The value of the linked metafield.
   */
  private String linkedMetafieldValue;

  /**
   * The name of the product option value.
   */
  private String name;

  /**
   * The swatch associated with the product option value.
   */
  private ProductOptionValueSwatch swatch;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public ProductOptionValue() {
  }

  /**
   * Whether the product option value has any linked variants.
   */
  public boolean getHasVariants() {
    return hasVariants;
  }

  public void setHasVariants(boolean hasVariants) {
    this.hasVariants = hasVariants;
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
   * The value of the linked metafield.
   */
  public String getLinkedMetafieldValue() {
    return linkedMetafieldValue;
  }

  public void setLinkedMetafieldValue(String linkedMetafieldValue) {
    this.linkedMetafieldValue = linkedMetafieldValue;
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
   * The swatch associated with the product option value.
   */
  public ProductOptionValueSwatch getSwatch() {
    return swatch;
  }

  public void setSwatch(ProductOptionValueSwatch swatch) {
    this.swatch = swatch;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "ProductOptionValue{hasVariants='" + hasVariants + "', id='" + id + "', linkedMetafieldValue='" + linkedMetafieldValue + "', name='" + name + "', swatch='" + swatch + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionValue that = (ProductOptionValue) o;
    return hasVariants == that.hasVariants &&
        Objects.equals(id, that.id) &&
        Objects.equals(linkedMetafieldValue, that.linkedMetafieldValue) &&
        Objects.equals(name, that.name) &&
        Objects.equals(swatch, that.swatch) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasVariants, id, linkedMetafieldValue, name, swatch, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the product option value has any linked variants.
     */
    private boolean hasVariants;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The value of the linked metafield.
     */
    private String linkedMetafieldValue;

    /**
     * The name of the product option value.
     */
    private String name;

    /**
     * The swatch associated with the product option value.
     */
    private ProductOptionValueSwatch swatch;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public ProductOptionValue build() {
      ProductOptionValue result = new ProductOptionValue();
      result.hasVariants = this.hasVariants;
      result.id = this.id;
      result.linkedMetafieldValue = this.linkedMetafieldValue;
      result.name = this.name;
      result.swatch = this.swatch;
      result.translations = this.translations;
      return result;
    }

    /**
     * Whether the product option value has any linked variants.
     */
    public Builder hasVariants(boolean hasVariants) {
      this.hasVariants = hasVariants;
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
     * The value of the linked metafield.
     */
    public Builder linkedMetafieldValue(String linkedMetafieldValue) {
      this.linkedMetafieldValue = linkedMetafieldValue;
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
     * The swatch associated with the product option value.
     */
    public Builder swatch(ProductOptionValueSwatch swatch) {
      this.swatch = swatch;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
