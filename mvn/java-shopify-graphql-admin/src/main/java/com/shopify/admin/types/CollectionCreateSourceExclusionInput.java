package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating exclusion rules for a collection source.
 */
public class CollectionCreateSourceExclusionInput {
  /**
   * Whether products must match all or any of the conditions to be excluded.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The conditions that products must match to be excluded from the collection.
   */
  private List<CollectionSourceExclusionConditionInput> conditions = Collections.emptyList();

  /**
   * The products to explicitly exclude from the collection.
   */
  private List<CollectionExclusionProductSelectionInput> selections = Collections.emptyList();

  public CollectionCreateSourceExclusionInput() {
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
   * The conditions that products must match to be excluded from the collection.
   */
  public List<CollectionSourceExclusionConditionInput> getConditions() {
    return conditions;
  }

  public void setConditions(List<CollectionSourceExclusionConditionInput> conditions) {
    this.conditions = conditions;
  }

  /**
   * The products to explicitly exclude from the collection.
   */
  public List<CollectionExclusionProductSelectionInput> getSelections() {
    return selections;
  }

  public void setSelections(List<CollectionExclusionProductSelectionInput> selections) {
    this.selections = selections;
  }

  @Override
  public String toString() {
    return "CollectionCreateSourceExclusionInput{matchType='" + matchType + "', conditions='" + conditions + "', selections='" + selections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateSourceExclusionInput that = (CollectionCreateSourceExclusionInput) o;
    return Objects.equals(matchType, that.matchType) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(selections, that.selections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, conditions, selections);
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
     * The conditions that products must match to be excluded from the collection.
     */
    private List<CollectionSourceExclusionConditionInput> conditions = Collections.emptyList();

    /**
     * The products to explicitly exclude from the collection.
     */
    private List<CollectionExclusionProductSelectionInput> selections = Collections.emptyList();

    public CollectionCreateSourceExclusionInput build() {
      CollectionCreateSourceExclusionInput result = new CollectionCreateSourceExclusionInput();
      result.matchType = this.matchType;
      result.conditions = this.conditions;
      result.selections = this.selections;
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
     * The conditions that products must match to be excluded from the collection.
     */
    public Builder conditions(List<CollectionSourceExclusionConditionInput> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * The products to explicitly exclude from the collection.
     */
    public Builder selections(List<CollectionExclusionProductSelectionInput> selections) {
      this.selections = selections;
      return this;
    }
  }
}
