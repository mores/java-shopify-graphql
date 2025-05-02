package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An option provided by a Selling Plan.
 */
public class SellingPlanOption {
  /**
   * The name of the option (ie "Delivery every").
   */
  private String name;

  /**
   * The value of the option (ie "Month").
   */
  private String value;

  public SellingPlanOption() {
  }

  /**
   * The name of the option (ie "Delivery every").
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The value of the option (ie "Month").
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "SellingPlanOption{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanOption that = (SellingPlanOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the option (ie "Delivery every").
     */
    private String name;

    /**
     * The value of the option (ie "Month").
     */
    private String value;

    public SellingPlanOption build() {
      SellingPlanOption result = new SellingPlanOption();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The name of the option (ie "Delivery every").
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The value of the option (ie "Month").
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
