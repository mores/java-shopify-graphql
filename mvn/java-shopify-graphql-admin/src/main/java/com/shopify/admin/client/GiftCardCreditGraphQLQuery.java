package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.GiftCardCreditInput;
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
 * Adds funds to an existing gift card, increasing its available balance. Use
 * this when a merchant wants to top up a customer's gift card — for example, as
 * a promotional bonus, a customer service gesture, or to reload a reusable gift card.
 */
public class GiftCardCreditGraphQLQuery extends GraphQLQuery {
  public GiftCardCreditGraphQLQuery(String id, GiftCardCreditInput creditInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (creditInput != null || fieldsSet.contains("creditInput")) {
        getInput().put("creditInput", creditInput);
    }
  }

  public GiftCardCreditGraphQLQuery(String id, GiftCardCreditInput creditInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (creditInput != null || fieldsSet.contains("creditInput")) {
        getInput().put("creditInput", creditInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public GiftCardCreditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "giftCardCredit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private GiftCardCreditInput creditInput;

    private String queryName;

    public GiftCardCreditGraphQLQuery build() {
      return new GiftCardCreditGraphQLQuery(id, creditInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the gift card to be credited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the gift card to be credited.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to credit a gift card.
     */
    public Builder creditInput(GiftCardCreditInput creditInput) {
      this.creditInput = creditInput;
      this.fieldsSet.add("creditInput");
      return this;
    }

    /**
     * The input fields to credit a gift card.
     */
    public Builder creditInputReference(String variableRef) {
      this.variableReferences.put("creditInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("GiftCardCreditInput"))).build());
      this.fieldsSet.add("creditInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
