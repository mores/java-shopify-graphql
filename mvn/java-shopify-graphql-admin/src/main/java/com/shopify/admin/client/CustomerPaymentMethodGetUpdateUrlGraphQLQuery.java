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
 * Returns a URL that allows the customer to update a specific payment method.
 *   
 * Currently, `customerPaymentMethodGetUpdateUrl` only supports Shop Pay.
 */
public class CustomerPaymentMethodGetUpdateUrlGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodGetUpdateUrlGraphQLQuery(String customerPaymentMethodId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }
  }

  public CustomerPaymentMethodGetUpdateUrlGraphQLQuery(String customerPaymentMethodId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerPaymentMethodGetUpdateUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodGetUpdateUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerPaymentMethodId;

    private String queryName;

    public CustomerPaymentMethodGetUpdateUrlGraphQLQuery build() {
      return new CustomerPaymentMethodGetUpdateUrlGraphQLQuery(customerPaymentMethodId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The payment method to be updated.
     */
    public Builder customerPaymentMethodId(String customerPaymentMethodId) {
      this.customerPaymentMethodId = customerPaymentMethodId;
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    /**
     * The payment method to be updated.
     */
    public Builder customerPaymentMethodIdReference(String variableRef) {
      this.variableReferences.put("customerPaymentMethodId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
