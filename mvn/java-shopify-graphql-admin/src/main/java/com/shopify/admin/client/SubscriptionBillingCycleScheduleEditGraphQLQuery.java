package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCycleInput;
import com.shopify.admin.types.SubscriptionBillingCycleScheduleEditInput;
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
 * Modify the schedule of a specific billing cycle.
 */
public class SubscriptionBillingCycleScheduleEditGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleScheduleEditGraphQLQuery(
      SubscriptionBillingCycleInput billingCycleInput,
      SubscriptionBillingCycleScheduleEditInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionBillingCycleScheduleEditGraphQLQuery(
      SubscriptionBillingCycleInput billingCycleInput,
      SubscriptionBillingCycleScheduleEditInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleScheduleEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleScheduleEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionBillingCycleInput billingCycleInput;

    private SubscriptionBillingCycleScheduleEditInput input;

    private String queryName;

    public SubscriptionBillingCycleScheduleEditGraphQLQuery build() {
      return new SubscriptionBillingCycleScheduleEditGraphQLQuery(billingCycleInput, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Input object for selecting and using billing cycles.
     */
    public Builder billingCycleInput(SubscriptionBillingCycleInput billingCycleInput) {
      this.billingCycleInput = billingCycleInput;
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    /**
     * Input object for selecting and using billing cycles.
     */
    public Builder billingCycleInputReference(String variableRef) {
      this.variableReferences.put("billingCycleInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleInput"))).build());
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    /**
     * Data used to create or modify billing cycle schedule edit.
     */
    public Builder input(SubscriptionBillingCycleScheduleEditInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Data used to create or modify billing cycle schedule edit.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleScheduleEditInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
