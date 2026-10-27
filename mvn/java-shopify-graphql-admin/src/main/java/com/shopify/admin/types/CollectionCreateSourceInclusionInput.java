package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating inclusion rules for a collection source.
 */
public class CollectionCreateSourceInclusionInput {
  /**
   * Whether products must match all or any of the conditions.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The conditions that products must match to be included in the collection.
   */
  private List<CollectionSourceInclusionConditionInput> conditions = Collections.emptyList();

  /**
   * The products to explicitly include in the collection.
   */
  private List<CollectionInclusionProductSelectionInput> selections = Collections.emptyList();

  public CollectionCreateSourceInclusionInput() {
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
   * The conditions that products must match to be included in the collection.
   */
  public List<CollectionSourceInclusionConditionInput> getConditions() {
    return conditions;
  }

  public void setConditions(List<CollectionSourceInclusionConditionInput> conditions) {
    this.conditions = conditions;
  }

  /**
   * The products to explicitly include in the collection.
   */
  public List<CollectionInclusionProductSelectionInput> getSelections() {
    return selections;
  }

  public void setSelections(List<CollectionInclusionProductSelectionInput> selections) {
    this.selections = selections;
  }

  @Override
  public String toString() {
    return "CollectionCreateSourceInclusionInput{matchType='" + matchType + "', conditions='" + conditions + "', selections='" + selections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionCreateSourceInclusionInput that = (CollectionCreateSourceInclusionInput) o;
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
     * Whether products must match all or any of the conditions.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The conditions that products must match to be included in the collection.
     */
    private List<CollectionSourceInclusionConditionInput> conditions = Collections.emptyList();

    /**
     * The products to explicitly include in the collection.
     */
    private List<CollectionInclusionProductSelectionInput> selections = Collections.emptyList();

    public CollectionCreateSourceInclusionInput build() {
      CollectionCreateSourceInclusionInput result = new CollectionCreateSourceInclusionInput();
      result.matchType = this.matchType;
      result.conditions = this.conditions;
      result.selections = this.selections;
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
     * The conditions that products must match to be included in the collection.
     */
    public Builder conditions(List<CollectionSourceInclusionConditionInput> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * The products to explicitly include in the collection.
     */
    public Builder selections(List<CollectionInclusionProductSelectionInput> selections) {
      this.selections = selections;
      return this;
    }
  }
}
