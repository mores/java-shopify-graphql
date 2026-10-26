package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines the rules and selections for including products in a collection.
 */
public class CollectionSourceInclusion {
  /**
   * The conditions that determine which products are included in the collection.
   */
  private List<CollectionSourceInclusionCondition> conditions;

  /**
   * Specifies whether products must match any or all conditions. Only relevant when conditions are present.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The products that have been manually selected for inclusion in the collection.
   */
  private CollectionInclusionProductSelectionConnection selections;

  public CollectionSourceInclusion() {
  }

  /**
   * The conditions that determine which products are included in the collection.
   */
  public List<CollectionSourceInclusionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<CollectionSourceInclusionCondition> conditions) {
    this.conditions = conditions;
  }

  /**
   * Specifies whether products must match any or all conditions. Only relevant when conditions are present.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The products that have been manually selected for inclusion in the collection.
   */
  public CollectionInclusionProductSelectionConnection getSelections() {
    return selections;
  }

  public void setSelections(CollectionInclusionProductSelectionConnection selections) {
    this.selections = selections;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusion{conditions='" + conditions + "', matchType='" + matchType + "', selections='" + selections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusion that = (CollectionSourceInclusion) o;
    return Objects.equals(conditions, that.conditions) &&
        Objects.equals(matchType, that.matchType) &&
        Objects.equals(selections, that.selections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, matchType, selections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The conditions that determine which products are included in the collection.
     */
    private List<CollectionSourceInclusionCondition> conditions;

    /**
     * Specifies whether products must match any or all conditions. Only relevant when conditions are present.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The products that have been manually selected for inclusion in the collection.
     */
    private CollectionInclusionProductSelectionConnection selections;

    public CollectionSourceInclusion build() {
      CollectionSourceInclusion result = new CollectionSourceInclusion();
      result.conditions = this.conditions;
      result.matchType = this.matchType;
      result.selections = this.selections;
      return result;
    }

    /**
     * The conditions that determine which products are included in the collection.
     */
    public Builder conditions(List<CollectionSourceInclusionCondition> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Specifies whether products must match any or all conditions. Only relevant when conditions are present.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The products that have been manually selected for inclusion in the collection.
     */
    public Builder selections(CollectionInclusionProductSelectionConnection selections) {
      this.selections = selections;
      return this;
    }
  }
}
