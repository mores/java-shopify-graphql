package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the selling plan for a line item.
 */
public class LineItemSellingPlan {
  /**
   * The name of the selling plan for display purposes.
   */
  private String name;

  /**
   * The ID of the selling plan associated with the line item.
   */
  private String sellingPlanId;

  public LineItemSellingPlan() {
  }

  /**
   * The name of the selling plan for display purposes.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ID of the selling plan associated with the line item.
   */
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  @Override
  public String toString() {
    return "LineItemSellingPlan{name='" + name + "', sellingPlanId='" + sellingPlanId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineItemSellingPlan that = (LineItemSellingPlan) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(sellingPlanId, that.sellingPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sellingPlanId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the selling plan for display purposes.
     */
    private String name;

    /**
     * The ID of the selling plan associated with the line item.
     */
    private String sellingPlanId;

    public LineItemSellingPlan build() {
      LineItemSellingPlan result = new LineItemSellingPlan();
      result.name = this.name;
      result.sellingPlanId = this.sellingPlanId;
      return result;
    }

    /**
     * The name of the selling plan for display purposes.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The ID of the selling plan associated with the line item.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }
  }
}
