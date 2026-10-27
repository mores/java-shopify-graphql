package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on product category IDs for excluding products from a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceExclusionConditionProductCategory implements com.shopify.admin.types.CollectionSourceExclusionCondition {
  /**
   * The unique identifier for this exclusion condition.
   */
  private String id;

  /**
   * Specifies whether products must match any or all values.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relationship between the product category ID and the condition values.
   */
  private CollectionSourceExclusionConditionProductCategoryRelation relation;

  /**
   * The product category values to match against.
   */
  private List<CollectionSourceExclusionConditionProductCategoryValue> values;

  public CollectionSourceExclusionConditionProductCategory() {
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
   * Specifies whether products must match any or all values.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The relationship between the product category ID and the condition values.
   */
  public CollectionSourceExclusionConditionProductCategoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductCategoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The product category values to match against.
   */
  public List<CollectionSourceExclusionConditionProductCategoryValue> getValues() {
    return values;
  }

  public void setValues(List<CollectionSourceExclusionConditionProductCategoryValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionProductCategory{id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionProductCategory that = (CollectionSourceExclusionConditionProductCategory) o;
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
     * Specifies whether products must match any or all values.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The relationship between the product category ID and the condition values.
     */
    private CollectionSourceExclusionConditionProductCategoryRelation relation;

    /**
     * The product category values to match against.
     */
    private List<CollectionSourceExclusionConditionProductCategoryValue> values;

    public CollectionSourceExclusionConditionProductCategory build() {
      CollectionSourceExclusionConditionProductCategory result = new CollectionSourceExclusionConditionProductCategory();
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
     * Specifies whether products must match any or all values.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The relationship between the product category ID and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductCategoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product category values to match against.
     */
    public Builder values(List<CollectionSourceExclusionConditionProductCategoryValue> values) {
      this.values = values;
      return this;
    }
  }
}
