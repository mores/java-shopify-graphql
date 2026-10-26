package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating inclusion rules for a collection source.
 */
public class CollectionUpdateSourceInclusionInput {
  /**
   * Whether products must match all or any of the conditions.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The conditions to create for the source.
   */
  private List<CollectionSourceInclusionConditionInput> conditionsToCreate;

  /**
   * The IDs of the conditions to delete from the source.
   */
  private List<String> conditionsToDelete;

  /**
   * The conditions to update for the source.
   */
  private List<CollectionUpdateSourceInclusionConditionInput> conditionsToUpdate;

  /**
   * The product selections to add to the source.
   */
  private List<CollectionInclusionProductSelectionInput> selectionsToAdd;

  /**
   * The product selections to remove from the source. For sources that target
   * variants, omitting variant IDs will remove all for the product.
   */
  private List<CollectionInclusionProductSelectionInput> selectionsToRemove;

  public CollectionUpdateSourceInclusionInput() {
  }

  /**
   * Whether products must match all or any of the conditions.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The conditions to create for the source.
   */
  public List<CollectionSourceInclusionConditionInput> getConditionsToCreate() {
    return conditionsToCreate;
  }

  public void setConditionsToCreate(
      List<CollectionSourceInclusionConditionInput> conditionsToCreate) {
    this.conditionsToCreate = conditionsToCreate;
  }

  /**
   * The IDs of the conditions to delete from the source.
   */
  public List<String> getConditionsToDelete() {
    return conditionsToDelete;
  }

  public void setConditionsToDelete(List<String> conditionsToDelete) {
    this.conditionsToDelete = conditionsToDelete;
  }

  /**
   * The conditions to update for the source.
   */
  public List<CollectionUpdateSourceInclusionConditionInput> getConditionsToUpdate() {
    return conditionsToUpdate;
  }

  public void setConditionsToUpdate(
      List<CollectionUpdateSourceInclusionConditionInput> conditionsToUpdate) {
    this.conditionsToUpdate = conditionsToUpdate;
  }

  /**
   * The product selections to add to the source.
   */
  public List<CollectionInclusionProductSelectionInput> getSelectionsToAdd() {
    return selectionsToAdd;
  }

  public void setSelectionsToAdd(List<CollectionInclusionProductSelectionInput> selectionsToAdd) {
    this.selectionsToAdd = selectionsToAdd;
  }

  /**
   * The product selections to remove from the source. For sources that target
   * variants, omitting variant IDs will remove all for the product.
   */
  public List<CollectionInclusionProductSelectionInput> getSelectionsToRemove() {
    return selectionsToRemove;
  }

  public void setSelectionsToRemove(
      List<CollectionInclusionProductSelectionInput> selectionsToRemove) {
    this.selectionsToRemove = selectionsToRemove;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSourceInclusionInput{matchType='" + matchType + "', conditionsToCreate='" + conditionsToCreate + "', conditionsToDelete='" + conditionsToDelete + "', conditionsToUpdate='" + conditionsToUpdate + "', selectionsToAdd='" + selectionsToAdd + "', selectionsToRemove='" + selectionsToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSourceInclusionInput that = (CollectionUpdateSourceInclusionInput) o;
    return Objects.equals(matchType, that.matchType) &&
        Objects.equals(conditionsToCreate, that.conditionsToCreate) &&
        Objects.equals(conditionsToDelete, that.conditionsToDelete) &&
        Objects.equals(conditionsToUpdate, that.conditionsToUpdate) &&
        Objects.equals(selectionsToAdd, that.selectionsToAdd) &&
        Objects.equals(selectionsToRemove, that.selectionsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, conditionsToCreate, conditionsToDelete, conditionsToUpdate, selectionsToAdd, selectionsToRemove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether products must match all or any of the conditions.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The conditions to create for the source.
     */
    private List<CollectionSourceInclusionConditionInput> conditionsToCreate;

    /**
     * The IDs of the conditions to delete from the source.
     */
    private List<String> conditionsToDelete;

    /**
     * The conditions to update for the source.
     */
    private List<CollectionUpdateSourceInclusionConditionInput> conditionsToUpdate;

    /**
     * The product selections to add to the source.
     */
    private List<CollectionInclusionProductSelectionInput> selectionsToAdd;

    /**
     * The product selections to remove from the source. For sources that target
     * variants, omitting variant IDs will remove all for the product.
     */
    private List<CollectionInclusionProductSelectionInput> selectionsToRemove;

    public CollectionUpdateSourceInclusionInput build() {
      CollectionUpdateSourceInclusionInput result = new CollectionUpdateSourceInclusionInput();
      result.matchType = this.matchType;
      result.conditionsToCreate = this.conditionsToCreate;
      result.conditionsToDelete = this.conditionsToDelete;
      result.conditionsToUpdate = this.conditionsToUpdate;
      result.selectionsToAdd = this.selectionsToAdd;
      result.selectionsToRemove = this.selectionsToRemove;
      return result;
    }

    /**
     * Whether products must match all or any of the conditions.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The conditions to create for the source.
     */
    public Builder conditionsToCreate(
        List<CollectionSourceInclusionConditionInput> conditionsToCreate) {
      this.conditionsToCreate = conditionsToCreate;
      return this;
    }

    /**
     * The IDs of the conditions to delete from the source.
     */
    public Builder conditionsToDelete(List<String> conditionsToDelete) {
      this.conditionsToDelete = conditionsToDelete;
      return this;
    }

    /**
     * The conditions to update for the source.
     */
    public Builder conditionsToUpdate(
        List<CollectionUpdateSourceInclusionConditionInput> conditionsToUpdate) {
      this.conditionsToUpdate = conditionsToUpdate;
      return this;
    }

    /**
     * The product selections to add to the source.
     */
    public Builder selectionsToAdd(List<CollectionInclusionProductSelectionInput> selectionsToAdd) {
      this.selectionsToAdd = selectionsToAdd;
      return this;
    }

    /**
     * The product selections to remove from the source. For sources that target
     * variants, omitting variant IDs will remove all for the product.
     */
    public Builder selectionsToRemove(
        List<CollectionInclusionProductSelectionInput> selectionsToRemove) {
      this.selectionsToRemove = selectionsToRemove;
      return this;
    }
  }
}
