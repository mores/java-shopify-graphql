package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on product vendors for excluding products from a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceExclusionConditionProductVendor implements com.shopify.admin.types.CollectionSourceExclusionCondition {
  /**
   * The unique identifier for this exclusion condition.
   */
  private String id;

  /**
   * Specifies whether products must match any or all values.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relationship between the product vendor and the condition values.
   */
  private CollectionSourceExclusionConditionProductVendorRelation relation;

  /**
   * The product vendor values to match against.
   */
  private List<String> values;

  public CollectionSourceExclusionConditionProductVendor() {
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
   * The relationship between the product vendor and the condition values.
   */
  public CollectionSourceExclusionConditionProductVendorRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductVendorRelation relation) {
    this.relation = relation;
  }

  /**
   * The product vendor values to match against.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionProductVendor{id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionProductVendor that = (CollectionSourceExclusionConditionProductVendor) o;
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
     * The relationship between the product vendor and the condition values.
     */
    private CollectionSourceExclusionConditionProductVendorRelation relation;

    /**
     * The product vendor values to match against.
     */
    private List<String> values;

    public CollectionSourceExclusionConditionProductVendor build() {
      CollectionSourceExclusionConditionProductVendor result = new CollectionSourceExclusionConditionProductVendor();
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
     * The relationship between the product vendor and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductVendorRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product vendor values to match against.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
