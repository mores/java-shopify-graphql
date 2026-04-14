package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines the available columns and relationships that can be used when creating
 * rules for smart collections. This provides the schema for building automated
 * collection logic based on product attributes.
 *
 * For example, merchants can create rules like "product type equals 'Shirts'" or
 * "vendor contains 'Nike'" using the conditions defined in this object to
 * automatically populate collections.
 *
 * Use `CollectionRuleConditions` to:
 * - Discovering valid field options for smart collection rule interfaces
 * - Understanding which conditions are available for automated collections
 * - Exploring available product attributes for collection automation
 * - Learning about proper field relationships for rule implementation
 *
 * The conditions define which product fields can be used in smart collection rules
 * and what types of comparisons are allowed for each field.
 *
 * Learn more about [smart collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionRuleConditions {
  /**
   * Allowed relations of the rule.
   */
  private List<CollectionRuleRelation> allowedRelations;

  /**
   * Most commonly used relation for this rule.
   */
  private CollectionRuleRelation defaultRelation;

  /**
   * Additional attributes defining the rule.
   */
  private CollectionRuleConditionsRuleObject ruleObject;

  /**
   * Type of the rule.
   */
  private CollectionRuleColumn ruleType;

  public CollectionRuleConditions() {
  }

  /**
   * Allowed relations of the rule.
   */
  public List<CollectionRuleRelation> getAllowedRelations() {
    return allowedRelations;
  }

  public void setAllowedRelations(List<CollectionRuleRelation> allowedRelations) {
    this.allowedRelations = allowedRelations;
  }

  /**
   * Most commonly used relation for this rule.
   */
  public CollectionRuleRelation getDefaultRelation() {
    return defaultRelation;
  }

  public void setDefaultRelation(CollectionRuleRelation defaultRelation) {
    this.defaultRelation = defaultRelation;
  }

  /**
   * Additional attributes defining the rule.
   */
  public CollectionRuleConditionsRuleObject getRuleObject() {
    return ruleObject;
  }

  public void setRuleObject(CollectionRuleConditionsRuleObject ruleObject) {
    this.ruleObject = ruleObject;
  }

  /**
   * Type of the rule.
   */
  public CollectionRuleColumn getRuleType() {
    return ruleType;
  }

  public void setRuleType(CollectionRuleColumn ruleType) {
    this.ruleType = ruleType;
  }

  @Override
  public String toString() {
    return "CollectionRuleConditions{allowedRelations='" + allowedRelations + "', defaultRelation='" + defaultRelation + "', ruleObject='" + ruleObject + "', ruleType='" + ruleType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleConditions that = (CollectionRuleConditions) o;
    return Objects.equals(allowedRelations, that.allowedRelations) &&
        Objects.equals(defaultRelation, that.defaultRelation) &&
        Objects.equals(ruleObject, that.ruleObject) &&
        Objects.equals(ruleType, that.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRelations, defaultRelation, ruleObject, ruleType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Allowed relations of the rule.
     */
    private List<CollectionRuleRelation> allowedRelations;

    /**
     * Most commonly used relation for this rule.
     */
    private CollectionRuleRelation defaultRelation;

    /**
     * Additional attributes defining the rule.
     */
    private CollectionRuleConditionsRuleObject ruleObject;

    /**
     * Type of the rule.
     */
    private CollectionRuleColumn ruleType;

    public CollectionRuleConditions build() {
      CollectionRuleConditions result = new CollectionRuleConditions();
      result.allowedRelations = this.allowedRelations;
      result.defaultRelation = this.defaultRelation;
      result.ruleObject = this.ruleObject;
      result.ruleType = this.ruleType;
      return result;
    }

    /**
     * Allowed relations of the rule.
     */
    public Builder allowedRelations(List<CollectionRuleRelation> allowedRelations) {
      this.allowedRelations = allowedRelations;
      return this;
    }

    /**
     * Most commonly used relation for this rule.
     */
    public Builder defaultRelation(CollectionRuleRelation defaultRelation) {
      this.defaultRelation = defaultRelation;
      return this;
    }

    /**
     * Additional attributes defining the rule.
     */
    public Builder ruleObject(CollectionRuleConditionsRuleObject ruleObject) {
      this.ruleObject = ruleObject;
      return this;
    }

    /**
     * Type of the rule.
     */
    public Builder ruleType(CollectionRuleColumn ruleType) {
      this.ruleType = ruleType;
      return this;
    }
  }
}
