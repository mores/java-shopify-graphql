package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the options and values of the combined listing.
 */
public class OptionAndValueInput {
  /**
   * The name of the Product's Option.
   */
  private String name;

  /**
   * The ordered values of the Product's Option.
   */
  private List<String> values;

  /**
   * The ID of the option to update. If not present, the option will be created.
   */
  private String optionId;

  /**
   * The linked metafield for the product's option.
   */
  private LinkedMetafieldInput linkedMetafield;

  public OptionAndValueInput() {
  }

  /**
   * The name of the Product's Option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ordered values of the Product's Option.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   * The ID of the option to update. If not present, the option will be created.
   */
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  /**
   * The linked metafield for the product's option.
   */
  public LinkedMetafieldInput getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafieldInput linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  @Override
  public String toString() {
    return "OptionAndValueInput{name='" + name + "', values='" + values + "', optionId='" + optionId + "', linkedMetafield='" + linkedMetafield + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionAndValueInput that = (OptionAndValueInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(values, that.values) &&
        Objects.equals(optionId, that.optionId) &&
        Objects.equals(linkedMetafield, that.linkedMetafield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, optionId, linkedMetafield);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the Product's Option.
     */
    private String name;

    /**
     * The ordered values of the Product's Option.
     */
    private List<String> values;

    /**
     * The ID of the option to update. If not present, the option will be created.
     */
    private String optionId;

    /**
     * The linked metafield for the product's option.
     */
    private LinkedMetafieldInput linkedMetafield;

    public OptionAndValueInput build() {
      OptionAndValueInput result = new OptionAndValueInput();
      result.name = this.name;
      result.values = this.values;
      result.optionId = this.optionId;
      result.linkedMetafield = this.linkedMetafield;
      return result;
    }

    /**
     * The name of the Product's Option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The ordered values of the Product's Option.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }

    /**
     * The ID of the option to update. If not present, the option will be created.
     */
    public Builder optionId(String optionId) {
      this.optionId = optionId;
      return this;
    }

    /**
     * The linked metafield for the product's option.
     */
    public Builder linkedMetafield(LinkedMetafieldInput linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }
  }
}
