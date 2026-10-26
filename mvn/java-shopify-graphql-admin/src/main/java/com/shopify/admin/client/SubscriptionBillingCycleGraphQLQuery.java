package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCycleInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns a subscription billing cycle found either by cycle index or date.
 */
public class SubscriptionBillingCycleGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleGraphQLQuery(SubscriptionBillingCycleInput billingCycleInput,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
  }

  public SubscriptionBillingCycleGraphQLQuery(SubscriptionBillingCycleInput billingCycleInput,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionBillingCycleInput billingCycleInput;

    private String queryName;

    public SubscriptionBillingCycleGraphQLQuery build() {
      return new SubscriptionBillingCycleGraphQLQuery(billingCycleInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Input object used to select and use billing cycles.
     */
    public Builder billingCycleInput(SubscriptionBillingCycleInput billingCycleInput) {
      this.billingCycleInput = billingCycleInput;
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    /**
     * Input object used to select and use billing cycles.
     */
    public Builder billingCycleInputReference(String variableRef) {
      this.variableReferences.put("billingCycleInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleInput"))).build());
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
