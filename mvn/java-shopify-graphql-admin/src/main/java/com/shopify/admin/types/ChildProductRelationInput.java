package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for adding products to the Combined Listing.
 */
public class ChildProductRelationInput {
  /**
   * The ID of the child product.
   */
  private String childProductId;

  /**
   * The parent option values.
   */
  private List<SelectedVariantOptionInput> selectedParentOptionValues;

  public ChildProductRelationInput() {
  }

  /**
   * The ID of the child product.
   */
  public String getChildProductId() {
    return childProductId;
  }

  public void setChildProductId(String childProductId) {
    this.childProductId = childProductId;
  }

  /**
   * The parent option values.
   */
  public List<SelectedVariantOptionInput> getSelectedParentOptionValues() {
    return selectedParentOptionValues;
  }

  public void setSelectedParentOptionValues(
      List<SelectedVariantOptionInput> selectedParentOptionValues) {
    this.selectedParentOptionValues = selectedParentOptionValues;
  }

  @Override
  public String toString() {
    return "ChildProductRelationInput{childProductId='" + childProductId + "', selectedParentOptionValues='" + selectedParentOptionValues + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChildProductRelationInput that = (ChildProductRelationInput) o;
    return Objects.equals(childProductId, that.childProductId) &&
        Objects.equals(selectedParentOptionValues, that.selectedParentOptionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childProductId, selectedParentOptionValues);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the child product.
     */
    private String childProductId;

    /**
     * The parent option values.
     */
    private List<SelectedVariantOptionInput> selectedParentOptionValues;

    public ChildProductRelationInput build() {
      ChildProductRelationInput result = new ChildProductRelationInput();
      result.childProductId = this.childProductId;
      result.selectedParentOptionValues = this.selectedParentOptionValues;
      return result;
    }

    /**
     * The ID of the child product.
     */
    public Builder childProductId(String childProductId) {
      this.childProductId = childProductId;
      return this;
    }

    /**
     * The parent option values.
     */
    public Builder selectedParentOptionValues(
        List<SelectedVariantOptionInput> selectedParentOptionValues) {
      this.selectedParentOptionValues = selectedParentOptionValues;
      return this;
    }
  }
}
