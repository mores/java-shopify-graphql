package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for collections attached to a discount.
 */
public class DiscountCollectionsInput {
  /**
   * Specifies list of collection ids to add.
   */
  private List<String> add;

  /**
   * Specifies list of collection ids to remove.
   */
  private List<String> remove;

  public DiscountCollectionsInput() {
  }

  /**
   * Specifies list of collection ids to add.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * Specifies list of collection ids to remove.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "DiscountCollectionsInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCollectionsInput that = (DiscountCollectionsInput) o;
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
     * Specifies list of collection ids to add.
     */
    private List<String> add;

    /**
     * Specifies list of collection ids to remove.
     */
    private List<String> remove;

    public DiscountCollectionsInput build() {
      DiscountCollectionsInput result = new DiscountCollectionsInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * Specifies list of collection ids to add.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * Specifies list of collection ids to remove.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
