package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a product option.
 */
public class OptionCreateInput {
  /**
   * Name of the option.
   */
  private String name;

  /**
   * Position of the option.
   */
  private Integer position;

  /**
   * Values associated with the option.
   */
  private List<OptionValueCreateInput> values;

  /**
   * Specifies the metafield the option is linked to.
   */
  private LinkedMetafieldCreateInput linkedMetafield;

  public OptionCreateInput() {
  }

  /**
   * Name of the option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Position of the option.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * Values associated with the option.
   */
  public List<OptionValueCreateInput> getValues() {
    return values;
  }

  public void setValues(List<OptionValueCreateInput> values) {
    this.values = values;
  }

  /**
   * Specifies the metafield the option is linked to.
   */
  public LinkedMetafieldCreateInput getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafieldCreateInput linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  @Override
  public String toString() {
    return "OptionCreateInput{name='" + name + "', position='" + position + "', values='" + values + "', linkedMetafield='" + linkedMetafield + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionCreateInput that = (OptionCreateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(position, that.position) &&
        Objects.equals(values, that.values) &&
        Objects.equals(linkedMetafield, that.linkedMetafield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, values, linkedMetafield);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Name of the option.
     */
    private String name;

    /**
     * Position of the option.
     */
    private Integer position;

    /**
     * Values associated with the option.
     */
    private List<OptionValueCreateInput> values;

    /**
     * Specifies the metafield the option is linked to.
     */
    private LinkedMetafieldCreateInput linkedMetafield;

    public OptionCreateInput build() {
      OptionCreateInput result = new OptionCreateInput();
      result.name = this.name;
      result.position = this.position;
      result.values = this.values;
      result.linkedMetafield = this.linkedMetafield;
      return result;
    }

    /**
     * Name of the option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Position of the option.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * Values associated with the option.
     */
    public Builder values(List<OptionValueCreateInput> values) {
      this.values = values;
      return this;
    }

    /**
     * Specifies the metafield the option is linked to.
     */
    public Builder linkedMetafield(LinkedMetafieldCreateInput linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }
  }
}
