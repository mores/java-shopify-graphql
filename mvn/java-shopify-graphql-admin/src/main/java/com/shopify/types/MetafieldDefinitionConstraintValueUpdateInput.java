package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The inputs fields for modifying a metafield definition's constraint subtype values.
 * Exactly one option is required.
 */
public class MetafieldDefinitionConstraintValueUpdateInput {
  /**
   * The constraint subtype value to create.
   */
  private String create;

  /**
   * The constraint subtype value to delete.
   */
  private String delete;

  public MetafieldDefinitionConstraintValueUpdateInput() {
  }

  /**
   * The constraint subtype value to create.
   */
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  /**
   * The constraint subtype value to delete.
   */
  public String getDelete() {
    return delete;
  }

  public void setDelete(String delete) {
    this.delete = delete;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintValueUpdateInput{create='" + create + "', delete='" + delete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintValueUpdateInput that = (MetafieldDefinitionConstraintValueUpdateInput) o;
    return Objects.equals(create, that.create) &&
        Objects.equals(delete, that.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, delete);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The constraint subtype value to create.
     */
    private String create;

    /**
     * The constraint subtype value to delete.
     */
    private String delete;

    public MetafieldDefinitionConstraintValueUpdateInput build() {
      MetafieldDefinitionConstraintValueUpdateInput result = new MetafieldDefinitionConstraintValueUpdateInput();
      result.create = this.create;
      result.delete = this.delete;
      return result;
    }

    /**
     * The constraint subtype value to create.
     */
    public Builder create(String create) {
      this.create = create;
      return this;
    }

    /**
     * The constraint subtype value to delete.
     */
    public Builder delete(String delete) {
      this.delete = delete;
      return this;
    }
  }
}
