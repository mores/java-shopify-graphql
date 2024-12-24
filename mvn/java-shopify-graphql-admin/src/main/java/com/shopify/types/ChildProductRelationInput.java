package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ChildProductRelationInput {
  
  private String childProductId;

  
  private List<SelectedVariantOptionInput> selectedParentOptionValues;

  public ChildProductRelationInput() {
  }

  
  public String getChildProductId() {
    return childProductId;
  }

  public void setChildProductId(String childProductId) {
    this.childProductId = childProductId;
  }

  
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
    
    private String childProductId;

    
    private List<SelectedVariantOptionInput> selectedParentOptionValues;

    public ChildProductRelationInput build() {
      ChildProductRelationInput result = new ChildProductRelationInput();
      result.childProductId = this.childProductId;
      result.selectedParentOptionValues = this.selectedParentOptionValues;
      return result;
    }

    
    public Builder childProductId(String childProductId) {
      this.childProductId = childProductId;
      return this;
    }

    
    public Builder selectedParentOptionValues(
        List<SelectedVariantOptionInput> selectedParentOptionValues) {
      this.selectedParentOptionValues = selectedParentOptionValues;
      return this;
    }
  }
}
