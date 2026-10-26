package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines the rules and selections for excluding products from a collection.
 */
public class CollectionSourceExclusion {
  /**
   * The conditions that determine which products are excluded from the collection.
   */
  private List<CollectionSourceExclusionCondition> conditions;

  /**
   * Specifies whether products must match any or all non-collection exclusion conditions. Collection exclusion
   * conditions are always applied independently with ANY semantics, so this field returns ANY for
   * collection-only exclusions and null when collection and non-collection exclusion conditions are mixed.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The products that have been manually selected for exclusion from the collection.
   */
  private CollectionExclusionProductSelectionConnection selections;

  public CollectionSourceExclusion() {
  }

  /**
   * The conditions that determine which products are excluded from the collection.
   */
  public List<CollectionSourceExclusionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<CollectionSourceExclusionCondition> conditions) {
    this.conditions = conditions;
  }

  /**
   * Specifies whether products must match any or all non-collection exclusion conditions. Collection exclusion
   * conditions are always applied independently with ANY semantics, so this field returns ANY for
   * collection-only exclusions and null when collection and non-collection exclusion conditions are mixed.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The products that have been manually selected for exclusion from the collection.
   */
  public CollectionExclusionProductSelectionConnection getSelections() {
    return selections;
  }

  public void setSelections(CollectionExclusionProductSelectionConnection selections) {
    this.selections = selections;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusion{conditions='" + conditions + "', matchType='" + matchType + "', selections='" + selections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusion that = (CollectionSourceExclusion) o;
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
     * The conditions that determine which products are excluded from the collection.
     */
    private List<CollectionSourceExclusionCondition> conditions;

    /**
     * Specifies whether products must match any or all non-collection exclusion conditions. Collection exclusion
     * conditions are always applied independently with ANY semantics, so this field returns ANY for
     * collection-only exclusions and null when collection and non-collection exclusion conditions are mixed.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The products that have been manually selected for exclusion from the collection.
     */
    private CollectionExclusionProductSelectionConnection selections;

    public CollectionSourceExclusion build() {
      CollectionSourceExclusion result = new CollectionSourceExclusion();
      result.conditions = this.conditions;
      result.matchType = this.matchType;
      result.selections = this.selections;
      return result;
    }

    /**
     * The conditions that determine which products are excluded from the collection.
     */
    public Builder conditions(List<CollectionSourceExclusionCondition> conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Specifies whether products must match any or all non-collection exclusion conditions. Collection exclusion
     * conditions are always applied independently with ANY semantics, so this field returns ANY for
     * collection-only exclusions and null when collection and non-collection exclusion conditions are mixed.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The products that have been manually selected for exclusion from the collection.
     */
    public Builder selections(CollectionExclusionProductSelectionConnection selections) {
      this.selections = selections;
      return this;
    }
  }
}
