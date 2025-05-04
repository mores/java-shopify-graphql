package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating or updating a product option value.
 */
public class OptionValueSetInput {
  /**
   * Specifies the product option value.
   */
  private String id;

  /**
   * Value associated with an option.
   */
  private String name;

  public OptionValueSetInput() {
  }

  /**
   * Specifies the product option value.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Value associated with an option.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "OptionValueSetInput{id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionValueSetInput that = (OptionValueSetInput) o;
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
     * Specifies the product option value.
     */
    private String id;

    /**
     * Value associated with an option.
     */
    private String name;

    public OptionValueSetInput build() {
      OptionValueSetInput result = new OptionValueSetInput();
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * Specifies the product option value.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Value associated with an option.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
