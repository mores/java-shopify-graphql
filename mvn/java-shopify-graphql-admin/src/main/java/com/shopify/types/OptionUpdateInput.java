package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a product option.
 */
public class OptionUpdateInput {
  /**
   * Specifies the product option to update.
   */
  private String id;

  /**
   * Name of the option.
   */
  private String name;

  /**
   * Position of the option.
   */
  private Integer position;

  /**
   * Specifies the metafield the option is linked to.
   */
  private LinkedMetafieldUpdateInput linkedMetafield;

  public OptionUpdateInput() {
  }

  /**
   * Specifies the product option to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * Specifies the metafield the option is linked to.
   */
  public LinkedMetafieldUpdateInput getLinkedMetafield() {
    return linkedMetafield;
  }

  public void setLinkedMetafield(LinkedMetafieldUpdateInput linkedMetafield) {
    this.linkedMetafield = linkedMetafield;
  }

  @Override
  public String toString() {
    return "OptionUpdateInput{id='" + id + "', name='" + name + "', position='" + position + "', linkedMetafield='" + linkedMetafield + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionUpdateInput that = (OptionUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(position, that.position) &&
        Objects.equals(linkedMetafield, that.linkedMetafield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, linkedMetafield);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product option to update.
     */
    private String id;

    /**
     * Name of the option.
     */
    private String name;

    /**
     * Position of the option.
     */
    private Integer position;

    /**
     * Specifies the metafield the option is linked to.
     */
    private LinkedMetafieldUpdateInput linkedMetafield;

    public OptionUpdateInput build() {
      OptionUpdateInput result = new OptionUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.position = this.position;
      result.linkedMetafield = this.linkedMetafield;
      return result;
    }

    /**
     * Specifies the product option to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
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
     * Specifies the metafield the option is linked to.
     */
    public Builder linkedMetafield(LinkedMetafieldUpdateInput linkedMetafield) {
      this.linkedMetafield = linkedMetafield;
      return this;
    }
  }
}
