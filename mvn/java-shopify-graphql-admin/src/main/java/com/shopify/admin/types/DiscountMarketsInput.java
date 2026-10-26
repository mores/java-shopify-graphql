package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the markets where the discount is available.
 */
public class DiscountMarketsInput {
  /**
   * The list of market IDs to add.
   */
  private List<String> add;

  /**
   * The list of market IDs to remove.
   */
  private List<String> remove;

  public DiscountMarketsInput() {
  }

  /**
   * The list of market IDs to add.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * The list of market IDs to remove.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountMarketsInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMarketsInput that = (DiscountMarketsInput) o;
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
     * The list of market IDs to add.
     */
    private List<String> add;

    /**
     * The list of market IDs to remove.
     */
    private List<String> remove;

    public DiscountMarketsInput build() {
      DiscountMarketsInput result = new DiscountMarketsInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * The list of market IDs to add.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * The list of market IDs to remove.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
