package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an exclusion condition based on collections.
 */
public class CollectionSourceExclusionConditionCollectionInput {
  /**
   * The collection IDs whose products are excluded.
   */
  private List<String> values;

  public CollectionSourceExclusionConditionCollectionInput() {
  }

  /**
   * The collection IDs whose products are excluded.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionCollectionInput{values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionCollectionInput that = (CollectionSourceExclusionConditionCollectionInput) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The collection IDs whose products are excluded.
     */
    private List<String> values;

    public CollectionSourceExclusionConditionCollectionInput build() {
      CollectionSourceExclusionConditionCollectionInput result = new CollectionSourceExclusionConditionCollectionInput();
      result.values = this.values;
      return result;
    }

    /**
     * The collection IDs whose products are excluded.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
