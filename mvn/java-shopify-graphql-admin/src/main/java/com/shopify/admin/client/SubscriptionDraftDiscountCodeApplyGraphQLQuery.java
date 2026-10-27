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
 * Applies a code discount on the subscription draft.
 */
public class SubscriptionDraftDiscountCodeApplyGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountCodeApplyGraphQLQuery(String draftId, String redeemCode,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (redeemCode != null || fieldsSet.contains("redeemCode")) {
        getInput().put("redeemCode", redeemCode);
    }
  }

  public SubscriptionDraftDiscountCodeApplyGraphQLQuery(String draftId, String redeemCode,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (redeemCode != null || fieldsSet.contains("redeemCode")) {
        getInput().put("redeemCode", redeemCode);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionDraftDiscountCodeApplyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountCodeApply";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private String redeemCode;

    private String queryName;

    public SubscriptionDraftDiscountCodeApplyGraphQLQuery build() {
      return new SubscriptionDraftDiscountCodeApplyGraphQLQuery(draftId, redeemCode, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the subscription contract draft to apply a subscription code discount on.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the subscription contract draft to apply a subscription code discount on.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * Code discount redeem code.
     */
    public Builder redeemCode(String redeemCode) {
      this.redeemCode = redeemCode;
      this.fieldsSet.add("redeemCode");
      return this;
    }

    /**
     * Code discount redeem code.
     */
    public Builder redeemCodeReference(String variableRef) {
      this.variableReferences.put("redeemCode", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("redeemCode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
