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
 * Concatenates a contract to a Subscription Draft.
 */
public class SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery(String draftId,
      List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (concatenatedBillingCycleContracts != null || fieldsSet.contains("concatenatedBillingCycleContracts")) {
        getInput().put("concatenatedBillingCycleContracts", concatenatedBillingCycleContracts);
    }
  }

  public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery(String draftId,
      List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (concatenatedBillingCycleContracts != null || fieldsSet.contains("concatenatedBillingCycleContracts")) {
        getInput().put("concatenatedBillingCycleContracts", concatenatedBillingCycleContracts);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractDraftConcatenate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts;

    private String queryName;

    public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery build() {
      return new SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery(draftId, concatenatedBillingCycleContracts, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the Subscription Contract draft to update.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Contract draft to update.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * An array of Subscription Contracts with their selected billing cycles to concatenate to the subscription draft.
     */
    public Builder concatenatedBillingCycleContracts(
        List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts) {
      this.concatenatedBillingCycleContracts = concatenatedBillingCycleContracts;
      this.fieldsSet.add("concatenatedBillingCycleContracts");
      return this;
    }

    /**
     * An array of Subscription Contracts with their selected billing cycles to concatenate to the subscription draft.
     */
    public Builder concatenatedBillingCycleContractsReference(String variableRef) {
      this.variableReferences.put("concatenatedBillingCycleContracts", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleInput"))))).build());
      this.fieldsSet.add("concatenatedBillingCycleContracts");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
