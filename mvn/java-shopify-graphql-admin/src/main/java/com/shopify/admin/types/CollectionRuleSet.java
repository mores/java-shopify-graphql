package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The set of rules that are used to determine which products are included in the collection.
 */
public class CollectionRuleSet {
  /**
   * Whether products must match any or all of the rules to be included in the collection.
   * If true, then products must match at least one of the rules to be included in the collection.
   * If false, then products must match all of the rules to be included in the collection.
   */
  private boolean appliedDisjunctively;

  /**
   * The rules used to assign products to the collection.
   */
  private List<CollectionRule> rules;

  public CollectionRuleSet() {
  }

  /**
   * Whether products must match any or all of the rules to be included in the collection.
   * If true, then products must match at least one of the rules to be included in the collection.
   * If false, then products must match all of the rules to be included in the collection.
   */
  public boolean getAppliedDisjunctively() {
    return appliedDisjunctively;
  }

  public void setAppliedDisjunctively(boolean appliedDisjunctively) {
    this.appliedDisjunctively = appliedDisjunctively;
  }

  /**
   * The rules used to assign products to the collection.
   */
  public List<CollectionRule> getRules() {
    return rules;
  }

  public void setRules(List<CollectionRule> rules) {
    this.rules = rules;
  }

  @Override
  public String toString() {
    return "CollectionRuleSet{appliedDisjunctively='" + appliedDisjunctively + "', rules='" + rules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleSet that = (CollectionRuleSet) o;
    return appliedDisjunctively == that.appliedDisjunctively &&
        Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDisjunctively, rules);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether products must match any or all of the rules to be included in the collection.
     * If true, then products must match at least one of the rules to be included in the collection.
     * If false, then products must match all of the rules to be included in the collection.
     */
    private boolean appliedDisjunctively;

    /**
     * The rules used to assign products to the collection.
     */
    private List<CollectionRule> rules;

    public CollectionRuleSet build() {
      CollectionRuleSet result = new CollectionRuleSet();
      result.appliedDisjunctively = this.appliedDisjunctively;
      result.rules = this.rules;
      return result;
    }

    /**
     * Whether products must match any or all of the rules to be included in the collection.
     * If true, then products must match at least one of the rules to be included in the collection.
     * If false, then products must match all of the rules to be included in the collection.
     */
    public Builder appliedDisjunctively(boolean appliedDisjunctively) {
      this.appliedDisjunctively = appliedDisjunctively;
      return this;
    }

    /**
     * The rules used to assign products to the collection.
     */
    public Builder rules(List<CollectionRule> rules) {
      this.rules = rules;
      return this;
    }
  }
}
