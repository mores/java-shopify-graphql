package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on product category IDs for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionProductCategory implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * Specifies whether products must match any or all values.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relationship between the product category ID and the condition values.
   */
  private CollectionSourceInclusionConditionProductCategoryRelation relation;

  /**
   * The product category values to match against.
   */
  private List<CollectionSourceInclusionConditionProductCategoryValue> values;

  public CollectionSourceInclusionConditionProductCategory() {
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
  public CollectionSourceInclusionConditionProductCategoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionProductCategoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The product category values to match against.
   */
  public List<CollectionSourceInclusionConditionProductCategoryValue> getValues() {
    return values;
  }

  public void setValues(List<CollectionSourceInclusionConditionProductCategoryValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionProductCategory{id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionProductCategory that = (CollectionSourceInclusionConditionProductCategory) o;
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
     * Specifies whether products must match any or all values.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The relationship between the product category ID and the condition values.
     */
    private CollectionSourceInclusionConditionProductCategoryRelation relation;

    /**
     * The product category values to match against.
     */
    private List<CollectionSourceInclusionConditionProductCategoryValue> values;

    public CollectionSourceInclusionConditionProductCategory build() {
      CollectionSourceInclusionConditionProductCategory result = new CollectionSourceInclusionConditionProductCategory();
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
     * Specifies whether products must match any or all values.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The relationship between the product category ID and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionProductCategoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product category values to match against.
     */
    public Builder values(List<CollectionSourceInclusionConditionProductCategoryValue> values) {
      this.values = values;
      return this;
    }
  }
}
