package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
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
 * Edit the contents of a subscription contract for the specified billing cycle.
 */
public class SubscriptionBillingCycleContractEditGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractEditGraphQLQuery(SubscriptionActor actor,
      SubscriptionBillingCycleInput billingCycleInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
  }

  public SubscriptionBillingCycleContractEditGraphQLQuery(SubscriptionActor actor,
      SubscriptionBillingCycleInput billingCycleInput, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleContractEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionActor actor;

    private SubscriptionBillingCycleInput billingCycleInput;

    private String queryName;

    public SubscriptionBillingCycleContractEditGraphQLQuery build() {
      return new SubscriptionBillingCycleContractEditGraphQLQuery(actor, billingCycleInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actorReference(String variableRef) {
      this.variableReferences.put("actor", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionActor")).build());
      this.fieldsSet.add("actor");
      return this;
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
