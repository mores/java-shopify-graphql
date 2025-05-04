package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for line items that the discount refers to.
 */
public class SubscriptionManualDiscountLinesInput {
  /**
   * The ID of the lines to add to the subscription discount.
   */
  private List<String> add;

  /**
   * The ID of the lines to remove from the subscription discount.
   */
  private List<String> remove;

  public SubscriptionManualDiscountLinesInput() {
  }

  /**
   * The ID of the lines to add to the subscription discount.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * The ID of the lines to remove from the subscription discount.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountLinesInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountLinesInput that = (SubscriptionManualDiscountLinesInput) o;
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
     * The ID of the lines to add to the subscription discount.
     */
    private List<String> add;

    /**
     * The ID of the lines to remove from the subscription discount.
     */
    private List<String> remove;

    public SubscriptionManualDiscountLinesInput build() {
      SubscriptionManualDiscountLinesInput result = new SubscriptionManualDiscountLinesInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * The ID of the lines to add to the subscription discount.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * The ID of the lines to remove from the subscription discount.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
