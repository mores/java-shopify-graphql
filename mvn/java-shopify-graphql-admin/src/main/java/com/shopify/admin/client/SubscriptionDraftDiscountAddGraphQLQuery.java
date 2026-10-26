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
 * Adds a subscription discount to a subscription draft.
 */
public class SubscriptionDraftDiscountAddGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountAddGraphQLQuery(String draftId,
      SubscriptionManualDiscountInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftDiscountAddGraphQLQuery(String draftId,
      SubscriptionManualDiscountInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
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

  public SubscriptionDraftDiscountAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private SubscriptionManualDiscountInput input;

    private String queryName;

    public SubscriptionDraftDiscountAddGraphQLQuery build() {
      return new SubscriptionDraftDiscountAddGraphQLQuery(draftId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Subscription Contract draft to add a subscription discount to.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The ID of the Subscription Contract draft to add a subscription discount to.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The properties of the new Subscription Discount.
     */
    public Builder input(SubscriptionManualDiscountInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The properties of the new Subscription Discount.
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
