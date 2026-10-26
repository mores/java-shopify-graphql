package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CurrencyCode;
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
 * Creates an alternate currency payout for a Shopify Payments account.
 */
public class ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery extends GraphQLQuery {
  public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery(String accountId,
      CurrencyCode currency, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (accountId != null || fieldsSet.contains("accountId")) {
        getInput().put("accountId", accountId);
    }if (currency != null || fieldsSet.contains("currency")) {
        getInput().put("currency", currency);
    }
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery(String accountId,
      CurrencyCode currency, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (accountId != null || fieldsSet.contains("accountId")) {
        getInput().put("accountId", accountId);
    }if (currency != null || fieldsSet.contains("currency")) {
        getInput().put("currency", currency);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopifyPaymentsPayoutAlternateCurrencyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String accountId;

    private CurrencyCode currency;

    private String queryName;

    public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery build() {
      return new ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery(accountId, currency, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Shopify Payments account on which the mutation is being performed.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      this.fieldsSet.add("accountId");
      return this;
    }

    /**
     * The ID of the Shopify Payments account on which the mutation is being performed.
     */
    public Builder accountIdReference(String variableRef) {
      this.variableReferences.put("accountId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("accountId");
      return this;
    }

    /**
     * The currency of the balance to payout.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      this.fieldsSet.add("currency");
      return this;
    }

    /**
     * The currency of the balance to payout.
     */
    public Builder currencyReference(String variableRef) {
      this.variableReferences.put("currency", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CurrencyCode"))).build());
      this.fieldsSet.add("currency");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
