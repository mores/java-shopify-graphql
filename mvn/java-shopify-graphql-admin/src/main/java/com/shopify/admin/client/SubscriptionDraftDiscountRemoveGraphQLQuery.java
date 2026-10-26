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
 * Removes a subscription discount from a subscription draft.
 */
public class SubscriptionDraftDiscountRemoveGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountRemoveGraphQLQuery(String draftId, String discountId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }
  }

  public SubscriptionDraftDiscountRemoveGraphQLQuery(String draftId, String discountId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionDraftDiscountRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private String discountId;

    private String queryName;

    public SubscriptionDraftDiscountRemoveGraphQLQuery build() {
      return new SubscriptionDraftDiscountRemoveGraphQLQuery(draftId, discountId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the subscription contract draft to remove a subscription discount from.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the subscription contract draft to remove a subscription discount from.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the subscription draft discount to remove.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The gid of the subscription draft discount to remove.
     */
    public Builder discountIdReference(String variableRef) {
      this.variableReferences.put("discountId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("discountId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
