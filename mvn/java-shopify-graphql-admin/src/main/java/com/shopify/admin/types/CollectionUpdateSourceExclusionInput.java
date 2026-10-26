package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating exclusion rules for a collection source.
 */
public class CollectionUpdateSourceExclusionInput {
  /**
   * Whether products must match all or any of the conditions to be excluded.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The exclusion conditions to create for the source.
   */
  private List<CollectionSourceExclusionConditionInput> conditionsToCreate;

  /**
   * The IDs of the exclusion conditions to delete from the source.
   */
  private List<String> conditionsToDelete;

  /**
   * The exclusion conditions to update for the source.
   */
  private List<CollectionUpdateSourceExclusionConditionInput> conditionsToUpdate;

  /**
   * The product selections to add to the source.
   */
  private List<CollectionExclusionProductSelectionInput> selectionsToAdd;

  /**
   * The product selections to remove from the source.
   */
  private List<CollectionExclusionProductSelectionInput> selectionsToRemove;

  public CollectionUpdateSourceExclusionInput() {
  }

  /**
   * Whether products must match all or any of the conditions to be excluded.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The exclusion conditions to create for the source.
   */
  public List<CollectionSourceExclusionConditionInput> getConditionsToCreate() {
    return conditionsToCreate;
  }

  public void setConditionsToCreate(
      List<CollectionSourceExclusionConditionInput> conditionsToCreate) {
    this.conditionsToCreate = conditionsToCreate;
  }

  /**
   * The IDs of the exclusion conditions to delete from the source.
   */
  public List<String> getConditionsToDelete() {
    return conditionsToDelete;
  }

  public void setConditionsToDelete(List<String> conditionsToDelete) {
    this.conditionsToDelete = conditionsToDelete;
  }

  /**
   * The exclusion conditions to update for the source.
   */
  public List<CollectionUpdateSourceExclusionConditionInput> getConditionsToUpdate() {
    return conditionsToUpdate;
  }

  public void setConditionsToUpdate(
      List<CollectionUpdateSourceExclusionConditionInput> conditionsToUpdate) {
    this.conditionsToUpdate = conditionsToUpdate;
  }

  /**
   * The product selections to add to the source.
   */
  public List<CollectionExclusionProductSelectionInput> getSelectionsToAdd() {
    return selectionsToAdd;
  }

  public void setSelectionsToAdd(List<CollectionExclusionProductSelectionInput> selectionsToAdd) {
    this.selectionsToAdd = selectionsToAdd;
  }

  /**
   * The product selections to remove from the source.
   */
  public List<CollectionExclusionProductSelectionInput> getSelectionsToRemove() {
    return selectionsToRemove;
  }

  public void setSelectionsToRemove(
      List<CollectionExclusionProductSelectionInput> selectionsToRemove) {
    this.selectionsToRemove = selectionsToRemove;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSourceExclusionInput{matchType='" + matchType + "', conditionsToCreate='" + conditionsToCreate + "', conditionsToDelete='" + conditionsToDelete + "', conditionsToUpdate='" + conditionsToUpdate + "', selectionsToAdd='" + selectionsToAdd + "', selectionsToRemove='" + selectionsToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSourceExclusionInput that = (CollectionUpdateSourceExclusionInput) o;
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
     * Whether products must match all or any of the conditions to be excluded.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The exclusion conditions to create for the source.
     */
    private List<CollectionSourceExclusionConditionInput> conditionsToCreate;

    /**
     * The IDs of the exclusion conditions to delete from the source.
     */
    private List<String> conditionsToDelete;

    /**
     * The exclusion conditions to update for the source.
     */
    private List<CollectionUpdateSourceExclusionConditionInput> conditionsToUpdate;

    /**
     * The product selections to add to the source.
     */
    private List<CollectionExclusionProductSelectionInput> selectionsToAdd;

    /**
     * The product selections to remove from the source.
     */
    private List<CollectionExclusionProductSelectionInput> selectionsToRemove;

    public CollectionUpdateSourceExclusionInput build() {
      CollectionUpdateSourceExclusionInput result = new CollectionUpdateSourceExclusionInput();
      result.matchType = this.matchType;
      result.conditionsToCreate = this.conditionsToCreate;
      result.conditionsToDelete = this.conditionsToDelete;
      result.conditionsToUpdate = this.conditionsToUpdate;
      result.selectionsToAdd = this.selectionsToAdd;
      result.selectionsToRemove = this.selectionsToRemove;
      return result;
    }

    /**
     * Whether products must match all or any of the conditions to be excluded.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The exclusion conditions to create for the source.
     */
    public Builder conditionsToCreate(
        List<CollectionSourceExclusionConditionInput> conditionsToCreate) {
      this.conditionsToCreate = conditionsToCreate;
      return this;
    }

    /**
     * The IDs of the exclusion conditions to delete from the source.
     */
    public Builder conditionsToDelete(List<String> conditionsToDelete) {
      this.conditionsToDelete = conditionsToDelete;
      return this;
    }

    /**
     * The exclusion conditions to update for the source.
     */
    public Builder conditionsToUpdate(
        List<CollectionUpdateSourceExclusionConditionInput> conditionsToUpdate) {
      this.conditionsToUpdate = conditionsToUpdate;
      return this;
    }

    /**
     * The product selections to add to the source.
     */
    public Builder selectionsToAdd(List<CollectionExclusionProductSelectionInput> selectionsToAdd) {
      this.selectionsToAdd = selectionsToAdd;
      return this;
    }

    /**
     * The product selections to remove from the source.
     */
    public Builder selectionsToRemove(
        List<CollectionExclusionProductSelectionInput> selectionsToRemove) {
      this.selectionsToRemove = selectionsToRemove;
      return this;
    }
  }
}
