package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition based on decimal metafield values for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionMetafieldDecimal implements com.shopify.admin.types.CollectionSourceInclusionCondition, com.shopify.admin.types.CollectionSourceInclusionConditionMetafield {
  /**
   * The metafield definition to use for the condition.
   */
  private MetafieldDefinition definition;

  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * The relationship between the metafield value and the condition value.
   */
  private CollectionSourceInclusionConditionMetafieldDecimalRelation relation;

  /**
   * The decimal value to match against.
   */
  private String value;

  public CollectionSourceInclusionConditionMetafieldDecimal() {
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
   * The relationship between the metafield value and the condition value.
   */
  public CollectionSourceInclusionConditionMetafieldDecimalRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionMetafieldDecimalRelation relation) {
    this.relation = relation;
  }

  /**
   * The decimal value to match against.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionMetafieldDecimal{definition='" + definition + "', id='" + id + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionMetafieldDecimal that = (CollectionSourceInclusionConditionMetafieldDecimal) o;
    return Objects.equals(definition, that.definition) &&
        Objects.equals(id, that.id) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, id, relation, value);
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
     * The relationship between the metafield value and the condition value.
     */
    private CollectionSourceInclusionConditionMetafieldDecimalRelation relation;

    /**
     * The decimal value to match against.
     */
    private String value;

    public CollectionSourceInclusionConditionMetafieldDecimal build() {
      CollectionSourceInclusionConditionMetafieldDecimal result = new CollectionSourceInclusionConditionMetafieldDecimal();
      result.definition = this.definition;
      result.id = this.id;
      result.relation = this.relation;
      result.value = this.value;
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
     * The relationship between the metafield value and the condition value.
     */
    public Builder relation(CollectionSourceInclusionConditionMetafieldDecimalRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The decimal value to match against.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
