package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on collections for excluding products from a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceExclusionConditionCollection implements com.shopify.admin.types.CollectionSourceExclusionCondition {
  /**
   * The unique identifier for this exclusion condition.
   */
  private String id;

  /**
   * Collection exclusion conditions always match any referenced collection.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The collection values whose products are excluded.
   */
  private List<Collection> values;

  public CollectionSourceExclusionConditionCollection() {
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
   * Collection exclusion conditions always match any referenced collection.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * The collection values whose products are excluded.
   */
  public List<Collection> getValues() {
    return values;
  }

  public void setValues(List<Collection> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionCollection{id='" + id + "', matchType='" + matchType + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionCollection that = (CollectionSourceExclusionConditionCollection) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(matchType, that.matchType) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchType, values);
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
     * Collection exclusion conditions always match any referenced collection.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The collection values whose products are excluded.
     */
    private List<Collection> values;

    public CollectionSourceExclusionConditionCollection build() {
      CollectionSourceExclusionConditionCollection result = new CollectionSourceExclusionConditionCollection();
      result.id = this.id;
      result.matchType = this.matchType;
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
     * Collection exclusion conditions always match any referenced collection.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }

    /**
     * The collection values whose products are excluded.
     */
    public Builder values(List<Collection> values) {
      this.values = values;
      return this;
    }
  }
}
