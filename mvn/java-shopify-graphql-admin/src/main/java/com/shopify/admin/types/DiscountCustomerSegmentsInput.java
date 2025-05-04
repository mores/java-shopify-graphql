package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for which customer segments to add to or remove from the discount.
 */
public class DiscountCustomerSegmentsInput {
  /**
   * A list of customer segments to add to the current list of customer segments.
   */
  private List<String> add;

  /**
   * A list of customer segments to remove from the current list of customer segments.
   */
  private List<String> remove;

  public DiscountCustomerSegmentsInput() {
  }

  /**
   * A list of customer segments to add to the current list of customer segments.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * A list of customer segments to remove from the current list of customer segments.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountCustomerSegmentsInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerSegmentsInput that = (DiscountCustomerSegmentsInput) o;
    return Objects.equals(add, that.add) &&
        Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of customer segments to add to the current list of customer segments.
     */
    private List<String> add;

    /**
     * A list of customer segments to remove from the current list of customer segments.
     */
    private List<String> remove;

    public DiscountCustomerSegmentsInput build() {
      DiscountCustomerSegmentsInput result = new DiscountCustomerSegmentsInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * A list of customer segments to add to the current list of customer segments.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * A list of customer segments to remove from the current list of customer segments.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
