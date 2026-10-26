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
 * Sets a customer on an order.
 */
public class OrderCustomerSetGraphQLQuery extends GraphQLQuery {
  public OrderCustomerSetGraphQLQuery(String orderId, String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public OrderCustomerSetGraphQLQuery(String orderId, String customerId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderCustomerSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCustomerSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String orderId;

    private String customerId;

    private String queryName;

    public OrderCustomerSetGraphQLQuery build() {
      return new OrderCustomerSetGraphQLQuery(orderId, customerId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the order having a customer set.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The ID of the order having a customer set.
     */
    public Builder orderIdReference(String variableRef) {
      this.variableReferences.put("orderId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The ID of the customer being set on the order.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the customer being set on the order.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
