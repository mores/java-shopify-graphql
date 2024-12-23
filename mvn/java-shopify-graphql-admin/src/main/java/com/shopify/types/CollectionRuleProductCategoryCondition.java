package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the condition for a Product Category field.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionRuleProductCategoryCondition implements CollectionRuleConditionObject {
  /**
   * The value of the condition.
   */
  private ProductTaxonomyNode value;

  public CollectionRuleProductCategoryCondition() {
  }

  /**
   * The value of the condition.
   */
  public ProductTaxonomyNode getValue() {
    return value;
  }

  public void setValue(ProductTaxonomyNode value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionRuleProductCategoryCondition{value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleProductCategoryCondition that = (CollectionRuleProductCategoryCondition) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The value of the condition.
     */
    private ProductTaxonomyNode value;

    public CollectionRuleProductCategoryCondition build() {
      CollectionRuleProductCategoryCondition result = new CollectionRuleProductCategoryCondition();
      result.value = this.value;
      return result;
    }

    /**
     * The value of the condition.
     */
    public Builder value(ProductTaxonomyNode value) {
      this.value = value;
      return this;
    }
  }
}
