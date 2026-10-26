package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Commits the updates of a Subscription Billing Cycle Contract draft.
 *   
 * Commits are rate limited per subscription contract across all apps on the
 * store. If you exceed the limit, then the mutation returns a top-level
 * `THROTTLED` error and doesn't commit. Wait before you retry.
 */
public class SubscriptionBillingCycleContractDraftCommitGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractDraftCommitGraphQLQuery(String draftId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }
  }

  public SubscriptionBillingCycleContractDraftCommitGraphQLQuery(String draftId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleContractDraftCommitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractDraftCommit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private String queryName;

    public SubscriptionBillingCycleContractDraftCommitGraphQLQuery build() {
      return new SubscriptionBillingCycleContractDraftCommitGraphQLQuery(draftId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the Subscription Contract draft to commit.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Contract draft to commit.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
