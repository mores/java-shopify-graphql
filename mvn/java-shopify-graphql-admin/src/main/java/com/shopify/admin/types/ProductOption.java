package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The product property names. For example, "Size", "Color", and "Material".
 * Variants are selected based on permutations of these options.
 * The limit for each product property name is 255 characters.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductOption implements com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The metafield identifier linked to this option.
   */
  private LinkedMetafield linkedMetafield;

  /**
   * The product option’s name.
   */
  private String name;

  /**
   * Similar to values, option_values returns all the corresponding option value
   * objects to the product option, including values not assigned to any variants.
   */
  private List<ProductOptionValue> optionValues;

  /**
   * The product option's position.
   */
  private int position;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The corresponding value to the product option name.
   */
  private List<String> values;

  public ProductOption() {
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
   * The metafield identifier linked to this option.
   */
  public LinkedMetafield getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafield linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  /**
   * The product option’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Similar to values, option_values returns all the corresponding option value
   * objects to the product option, including values not assigned to any variants.
   */
  public List<ProductOptionValue> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(List<ProductOptionValue> optionValues) {
    this.optionValues = optionValues;
  }

  /**
   * The product option's position.
   */
  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
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

  /**
   * The corresponding value to the product option name.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductOption{id='" + id + "', linkedMetafield='" + linkedMetafield + "', name='" + name + "', optionValues='" + optionValues + "', position='" + position + "', translations='" + translations + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOption that = (ProductOption) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(linkedMetafield, that.linkedMetafield) &&
        Objects.equals(name, that.name) &&
        Objects.equals(optionValues, that.optionValues) &&
        position == that.position &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedMetafield, name, optionValues, position, translations, values);
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
     * The metafield identifier linked to this option.
     */
    private LinkedMetafield linkedMetafield;

    /**
     * The product option’s name.
     */
    private String name;

    /**
     * Similar to values, option_values returns all the corresponding option value
     * objects to the product option, including values not assigned to any variants.
     */
    private List<ProductOptionValue> optionValues;

    /**
     * The product option's position.
     */
    private int position;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The corresponding value to the product option name.
     */
    private List<String> values;

    public ProductOption build() {
      ProductOption result = new ProductOption();
      result.id = this.id;
      result.linkedMetafield = this.linkedMetafield;
      result.name = this.name;
      result.optionValues = this.optionValues;
      result.position = this.position;
      result.translations = this.translations;
      result.values = this.values;
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
     * The metafield identifier linked to this option.
     */
    public Builder linkedMetafield(LinkedMetafield linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }

    /**
     * The product option’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Similar to values, option_values returns all the corresponding option value
     * objects to the product option, including values not assigned to any variants.
     */
    public Builder optionValues(List<ProductOptionValue> optionValues) {
      this.optionValues = optionValues;
      return this;
    }

    /**
     * The product option's position.
     */
    public Builder position(int position) {
      this.position = position;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The corresponding value to the product option name.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
