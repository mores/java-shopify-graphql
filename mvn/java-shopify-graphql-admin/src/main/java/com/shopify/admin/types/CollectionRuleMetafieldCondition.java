package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Identifies a metafield definition used as a rule for the smart collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionRuleMetafieldCondition implements CollectionRuleConditionObject, CollectionRuleConditionsRuleObject {
  /**
   * The metafield definition associated with the condition.
   */
  private MetafieldDefinition metafieldDefinition;

  public CollectionRuleMetafieldCondition() {
  }

  /**
   * The metafield definition associated with the condition.
   */
  public MetafieldDefinition getMetafieldDefinition() {
    return metafieldDefinition;
  }

  public void setMetafieldDefinition(MetafieldDefinition metafieldDefinition) {
    this.metafieldDefinition = metafieldDefinition;
  }

  @Override
  public String toString() {
    return "CollectionRuleMetafieldCondition{metafieldDefinition='" + metafieldDefinition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleMetafieldCondition that = (CollectionRuleMetafieldCondition) o;
    return Objects.equals(metafieldDefinition, that.metafieldDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metafieldDefinition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The metafield definition associated with the condition.
     */
    private MetafieldDefinition metafieldDefinition;

    public CollectionRuleMetafieldCondition build() {
      CollectionRuleMetafieldCondition result = new CollectionRuleMetafieldCondition();
      result.metafieldDefinition = this.metafieldDefinition;
      return result;
    }

    /**
     * The metafield definition associated with the condition.
     */
    public Builder metafieldDefinition(MetafieldDefinition metafieldDefinition) {
      this.metafieldDefinition = metafieldDefinition;
      return this;
    }
  }
}
