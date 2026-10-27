package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A condition based on list of metaobject reference metafield values for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionMetafieldMetaobjectList implements com.shopify.admin.types.CollectionSourceInclusionCondition, com.shopify.admin.types.CollectionSourceInclusionConditionMetafield {
  /**
   * The metafield definition to use for the condition.
   */
  private MetafieldDefinition definition;

  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * Determines how many values a metafield must match against in order to satisfy
   * this condition. Will be either at least one given value, or all of the given values.
   */
  private CollectionConditionMatchType matchType;

  /**
   * The relationship between the metafield value and the condition values.
   */
  private CollectionSourceInclusionConditionMetafieldMetaobjectListRelation relation;

  /**
   * The metaobjects to match against.
   */
  private List<Metaobject> values;

  public CollectionSourceInclusionConditionMetafieldMetaobjectList() {
  }

  /**
   * The metafield definition to use for the condition.
   */
  public MetafieldDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(MetafieldDefinition definition) {
    this.definition = definition;
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
   * The relationship between the metafield value and the condition values.
   */
  public CollectionSourceInclusionConditionMetafieldMetaobjectListRelation getRelation() {
    return relation;
  }

  public void setRelation(
      CollectionSourceInclusionConditionMetafieldMetaobjectListRelation relation) {
    this.relation = relation;
  }

  /**
   * The metaobjects to match against.
   */
  public List<Metaobject> getValues() {
    return values;
  }

  public void setValues(List<Metaobject> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionMetafieldMetaobjectList{definition='" + definition + "', id='" + id + "', matchType='" + matchType + "', relation='" + relation + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionMetafieldMetaobjectList that = (CollectionSourceInclusionConditionMetafieldMetaobjectList) o;
    return Objects.equals(definition, that.definition) &&
        Objects.equals(id, that.id) &&
        Objects.equals(matchType, that.matchType) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, id, matchType, relation, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition to use for the condition.
     */
    private MetafieldDefinition definition;

    /**
     * The unique identifier for this condition.
     */
    private String id;

    /**
     * Determines how many values a metafield must match against in order to satisfy
     * this condition. Will be either at least one given value, or all of the given values.
     */
    private CollectionConditionMatchType matchType;

    /**
     * The relationship between the metafield value and the condition values.
     */
    private CollectionSourceInclusionConditionMetafieldMetaobjectListRelation relation;

    /**
     * The metaobjects to match against.
     */
    private List<Metaobject> values;

    public CollectionSourceInclusionConditionMetafieldMetaobjectList build() {
      CollectionSourceInclusionConditionMetafieldMetaobjectList result = new CollectionSourceInclusionConditionMetafieldMetaobjectList();
      result.definition = this.definition;
      result.id = this.id;
      result.matchType = this.matchType;
      result.relation = this.relation;
      result.values = this.values;
      return result;
    }

    /**
     * The metafield definition to use for the condition.
     */
    public Builder definition(MetafieldDefinition definition) {
      this.definition = definition;
      return this;
    }

    /**
     * The unique identifier for this condition.
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
     * The relationship between the metafield value and the condition values.
     */
    public Builder relation(
        CollectionSourceInclusionConditionMetafieldMetaobjectListRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The metaobjects to match against.
     */
    public Builder values(List<Metaobject> values) {
      this.values = values;
      return this;
    }
  }
}
