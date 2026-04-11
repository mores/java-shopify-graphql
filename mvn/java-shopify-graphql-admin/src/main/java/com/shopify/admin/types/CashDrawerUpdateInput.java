package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a cash drawer.
 */
public class CashDrawerUpdateInput {
  /**
   * The new name for the cash drawer.
   */
  private String name;

  public CashDrawerUpdateInput() {
  }

  /**
   * The new name for the cash drawer.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CashDrawerUpdateInput{name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawerUpdateInput that = (CashDrawerUpdateInput) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new name for the cash drawer.
     */
    private String name;

    public CashDrawerUpdateInput build() {
      CashDrawerUpdateInput result = new CashDrawerUpdateInput();
      result.name = this.name;
      return result;
    }

    /**
     * The new name for the cash drawer.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
