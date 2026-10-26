package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionManualDiscountInput;
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
 * Updates a subscription discount on a subscription draft.
 */
public class SubscriptionDraftDiscountUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountUpdateGraphQLQuery(String draftId, String discountId,
      SubscriptionManualDiscountInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftDiscountUpdateGraphQLQuery(String draftId, String discountId,
      SubscriptionManualDiscountInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
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

  public SubscriptionDraftDiscountUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountUpdate";
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

    private SubscriptionManualDiscountInput input;

    private String queryName;

    public SubscriptionDraftDiscountUpdateGraphQLQuery build() {
      return new SubscriptionDraftDiscountUpdateGraphQLQuery(draftId, discountId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Subscription Contract draft to update a subscription discount on.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The ID of the Subscription Contract draft to update a subscription discount on.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Discount to update.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The gid of the Subscription Discount to update.
     */
    public Builder discountIdReference(String variableRef) {
      this.variableReferences.put("discountId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The properties to update on the Subscription Discount.
     */
    public Builder input(SubscriptionManualDiscountInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The properties to update on the Subscription Discount.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionManualDiscountInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
