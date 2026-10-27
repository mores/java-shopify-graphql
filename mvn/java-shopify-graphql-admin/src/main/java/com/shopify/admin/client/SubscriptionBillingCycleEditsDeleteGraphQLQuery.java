package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCyclesTargetSelection;
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
 * Delete the current and future schedule and contract edits of a list of subscription billing cycles.
 */
public class SubscriptionBillingCycleEditsDeleteGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleEditsDeleteGraphQLQuery(String contractId,
      SubscriptionBillingCyclesTargetSelection targetSelection, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (targetSelection != null || fieldsSet.contains("targetSelection")) {
        getInput().put("targetSelection", targetSelection);
    }
  }

  public SubscriptionBillingCycleEditsDeleteGraphQLQuery(String contractId,
      SubscriptionBillingCyclesTargetSelection targetSelection, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (targetSelection != null || fieldsSet.contains("targetSelection")) {
        getInput().put("targetSelection", targetSelection);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleEditsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleEditsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String contractId;

    private SubscriptionBillingCyclesTargetSelection targetSelection;

    private String queryName;

    public SubscriptionBillingCycleEditsDeleteGraphQLQuery build() {
      return new SubscriptionBillingCycleEditsDeleteGraphQLQuery(contractId, targetSelection, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The globally-unique identifier of the subscription contract that the billing cycle belongs to.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * The globally-unique identifier of the subscription contract that the billing cycle belongs to.
     */
    public Builder contractIdReference(String variableRef) {
      this.variableReferences.put("contractId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * Select billing cycles to be deleted.
     */
    public Builder targetSelection(SubscriptionBillingCyclesTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      this.fieldsSet.add("targetSelection");
      return this;
    }

    /**
     * Select billing cycles to be deleted.
     */
    public Builder targetSelectionReference(String variableRef) {
      this.variableReferences.put("targetSelection", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCyclesTargetSelection"))).build());
      this.fieldsSet.add("targetSelection");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
