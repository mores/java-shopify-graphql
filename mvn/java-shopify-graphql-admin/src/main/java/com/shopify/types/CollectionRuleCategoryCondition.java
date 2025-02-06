package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the taxonomy category to used for the condition.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionRuleCategoryCondition implements CollectionRuleConditionObject {
  /**
   * The taxonomy category used as condition.
   */
  private TaxonomyCategory value;

  public CollectionRuleCategoryCondition() {
  }

  /**
   * The taxonomy category used as condition.
   */
  public TaxonomyCategory getValue() {
    return value;
  }

  public void setValue(TaxonomyCategory value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionRuleCategoryCondition{value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleCategoryCondition that = (CollectionRuleCategoryCondition) o;
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
     * The taxonomy category used as condition.
     */
    private TaxonomyCategory value;

    public CollectionRuleCategoryCondition build() {
      CollectionRuleCategoryCondition result = new CollectionRuleCategoryCondition();
      result.value = this.value;
      return result;
    }

    /**
     * The taxonomy category used as condition.
     */
    public Builder value(TaxonomyCategory value) {
      this.value = value;
      return this;
    }
  }
}
