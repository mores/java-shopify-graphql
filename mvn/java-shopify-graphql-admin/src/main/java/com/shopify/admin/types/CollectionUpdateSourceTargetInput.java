package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a collection source - provide the one field that represents the type of source to update.
 */
public class CollectionUpdateSourceTargetInput {
  /**
   * An update to a shareable conditions-based source.
   */
  private CollectionUpdateConditionsSourceInput condition;

  /**
   * An update to a sub-collection source whose membership comes from one or more referenced collections.
   */
  private CollectionUpdateSubCollectionsSourceInput subCollections;

  public CollectionUpdateSourceTargetInput() {
  }

  /**
   * An update to a shareable conditions-based source.
   */
  public CollectionUpdateConditionsSourceInput getCondition() {
    return condition;
  }

  public void setCondition(CollectionUpdateConditionsSourceInput condition) {
    this.condition = condition;
  }

  /**
   * An update to a sub-collection source whose membership comes from one or more referenced collections.
   */
  public CollectionUpdateSubCollectionsSourceInput getSubCollections() {
    return subCollections;
  }

  public void setSubCollections(CollectionUpdateSubCollectionsSourceInput subCollections) {
    this.subCollections = subCollections;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSourceTargetInput{condition='" + condition + "', subCollections='" + subCollections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSourceTargetInput that = (CollectionUpdateSourceTargetInput) o;
    return Objects.equals(condition, that.condition) &&
        Objects.equals(subCollections, that.subCollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, subCollections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An update to a shareable conditions-based source.
     */
    private CollectionUpdateConditionsSourceInput condition;

    /**
     * An update to a sub-collection source whose membership comes from one or more referenced collections.
     */
    private CollectionUpdateSubCollectionsSourceInput subCollections;

    public CollectionUpdateSourceTargetInput build() {
      CollectionUpdateSourceTargetInput result = new CollectionUpdateSourceTargetInput();
      result.condition = this.condition;
      result.subCollections = this.subCollections;
      return result;
    }

    /**
     * An update to a shareable conditions-based source.
     */
    public Builder condition(CollectionUpdateConditionsSourceInput condition) {
      this.condition = condition;
      return this;
    }

    /**
     * An update to a sub-collection source whose membership comes from one or more referenced collections.
     */
    public Builder subCollections(CollectionUpdateSubCollectionsSourceInput subCollections) {
      this.subCollections = subCollections;
      return this;
    }
  }
}
