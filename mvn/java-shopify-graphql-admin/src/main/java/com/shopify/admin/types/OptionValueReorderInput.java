package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for reordering a product option value.
 */
public class OptionValueReorderInput {
  /**
   * Specifies the product option value by ID.
   */
  private String id;

  /**
   * Specifies the product option value by name.
   */
  private String name;

  public OptionValueReorderInput() {
  }

  /**
   * Specifies the product option value by ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Specifies the product option value by name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "OptionValueReorderInput{id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionValueReorderInput that = (OptionValueReorderInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the product option value by ID.
     */
    private String id;

    /**
     * Specifies the product option value by name.
     */
    private String name;

    public OptionValueReorderInput build() {
      OptionValueReorderInput result = new OptionValueReorderInput();
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * Specifies the product option value by ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Specifies the product option value by name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
