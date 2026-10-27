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
 * Returns a single Shop Pay payment request receipt by its ID. Payment request
 * receipts document completed Shop Pay transactions, including the amount,
 * customer details, and payment status. Use this to look up a specific Shop Pay
 * transaction for order reconciliation or customer support.
 */
public class ShopPayPaymentRequestReceiptGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestReceiptGraphQLQuery(String token, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (token != null || fieldsSet.contains("token")) {
        getInput().put("token", token);
    }
  }

  public ShopPayPaymentRequestReceiptGraphQLQuery(String token, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (token != null || fieldsSet.contains("token")) {
        getInput().put("token", token);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopPayPaymentRequestReceiptGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopPayPaymentRequestReceipt";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String token;

    private String queryName;

    public ShopPayPaymentRequestReceiptGraphQLQuery build() {
      return new ShopPayPaymentRequestReceiptGraphQLQuery(token, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Unique identifier of the payment request receipt.
     */
    public Builder token(String token) {
      this.token = token;
      this.fieldsSet.add("token");
      return this;
    }

    /**
     * Unique identifier of the payment request receipt.
     */
    public Builder tokenReference(String variableRef) {
      this.variableReferences.put("token", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("token");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
