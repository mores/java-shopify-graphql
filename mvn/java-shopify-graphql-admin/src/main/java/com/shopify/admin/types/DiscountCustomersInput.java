package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for which customers to add to or remove from the discount.
 */
public class DiscountCustomersInput {
  /**
   * A list of customers to add to the current list of customers who can use the discount.
   */
  private List<String> add;

  /**
   * A list of customers to remove from the current list of customers who can use the discount.
   */
  private List<String> remove;

  public DiscountCustomersInput() {
  }

  /**
   * A list of customers to add to the current list of customers who can use the discount.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * A list of customers to remove from the current list of customers who can use the discount.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountCustomersInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomersInput that = (DiscountCustomersInput) o;
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
     * A list of customers to add to the current list of customers who can use the discount.
     */
    private List<String> add;

    /**
     * A list of customers to remove from the current list of customers who can use the discount.
     */
    private List<String> remove;

    public DiscountCustomersInput build() {
      DiscountCustomersInput result = new DiscountCustomersInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * A list of customers to add to the current list of customers who can use the discount.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * A list of customers to remove from the current list of customers who can use the discount.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
