package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on product tags for excluding products from a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceExclusionConditionProductTag implements com.shopify.admin.types.CollectionSourceExclusionCondition {
  /**
   * The unique identifier for this exclusion condition.
   */
  private String id;

  /**
   * Determines how many values a metafield must match against in order to satisfy
   * this condition. Will be either at least one given value, or all of the given values.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relationship between the product tag and the condition values.
   */
  private CollectionSourceExclusionConditionProductTagRelation relation;

  /**
   * The tag values to match against.
   */
  private List<String> values;

  public CollectionSourceExclusionConditionProductTag() {
  }

  /**
   * The unique identifier for this exclusion condition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Determines how many values a metafield must match against in order to satisfy
   * this condition. Will be either at least one given value, or all of the given values.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The relationship between the product tag and the condition values.
   */
  public CollectionSourceExclusionConditionProductTagRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductTagRelation relation) {
    this.relation = relation;
  }

  /**
   * The tag values to match against.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionProductTag{id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionProductTag that = (CollectionSourceExclusionConditionProductTag) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(matchType, that.matchType) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchType, relation, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier for this exclusion condition.
     */
    private String id;

    /**
     * Determines how many values a metafield must match against in order to satisfy
     * this condition. Will be either at least one given value, or all of the given values.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The relationship between the product tag and the condition values.
     */
    private CollectionSourceExclusionConditionProductTagRelation relation;

    /**
     * The tag values to match against.
     */
    private List<String> values;

    public CollectionSourceExclusionConditionProductTag build() {
      CollectionSourceExclusionConditionProductTag result = new CollectionSourceExclusionConditionProductTag();
      result.id = this.id;
      result.matchType = this.matchType;
      result.relation = this.relation;
      result.values = this.values;
      return result;
    }

    /**
     * The unique identifier for this exclusion condition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Determines how many values a metafield must match against in order to satisfy
     * this condition. Will be either at least one given value, or all of the given values.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The relationship between the product tag and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductTagRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The tag values to match against.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
