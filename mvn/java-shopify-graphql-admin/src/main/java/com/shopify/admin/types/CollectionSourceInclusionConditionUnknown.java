package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An inclusion condition introduced in a newer API version that is not modeled by
 * this version of the API. Clients should treat the relation and values as opaque strings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionUnknown implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * Whether products must match any or all values. Null when the condition has no concept of a match type.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relation, as a raw string. Nullable and not coerced into an enum because
   * the set of possible relations is open-ended for unknown condition types, and
   * some future conditions may not have a relation at all.
   */
  private String relation;

  /**
   * The condition values, as raw strings. Nullable because some future condition types may have no values at all.
   */
  private List<String> values;

  public CollectionSourceInclusionConditionUnknown() {
  }

  /**
   * The unique identifier for this condition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether products must match any or all values. Null when the condition has no concept of a match type.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The relation, as a raw string. Nullable and not coerced into an enum because
   * the set of possible relations is open-ended for unknown condition types, and
   * some future conditions may not have a relation at all.
   */
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  /**
   * The condition values, as raw strings. Nullable because some future condition types may have no values at all.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUnknown{id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUnknown that = (CollectionSourceInclusionConditionUnknown) o;
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
     * The unique identifier for this condition.
     */
    private String id;

    /**
     * Whether products must match any or all values. Null when the condition has no concept of a match type.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The relation, as a raw string. Nullable and not coerced into an enum because
     * the set of possible relations is open-ended for unknown condition types, and
     * some future conditions may not have a relation at all.
     */
    private String relation;

    /**
     * The condition values, as raw strings. Nullable because some future condition types may have no values at all.
     */
    private List<String> values;

    public CollectionSourceInclusionConditionUnknown build() {
      CollectionSourceInclusionConditionUnknown result = new CollectionSourceInclusionConditionUnknown();
      result.id = this.id;
      result.matchType = this.matchType;
      result.relation = this.relation;
      result.values = this.values;
      return result;
    }

    /**
     * The unique identifier for this condition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether products must match any or all values. Null when the condition has no concept of a match type.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The relation, as a raw string. Nullable and not coerced into an enum because
     * the set of possible relations is open-ended for unknown condition types, and
     * some future conditions may not have a relation at all.
     */
    public Builder relation(String relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The condition values, as raw strings. Nullable because some future condition types may have no values at all.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
