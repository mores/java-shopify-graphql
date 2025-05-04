package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * This object defines all columns and allowed relations that can be used in rules
 * for smart collections to automatically include the matching products.
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
