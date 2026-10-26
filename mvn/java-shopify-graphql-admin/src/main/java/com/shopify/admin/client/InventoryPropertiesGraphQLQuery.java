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
 * Returns the shop's inventory configuration, including all inventory quantity
 * names. Quantity names represent different [inventory states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventory-states)
 * that merchants use to track inventory.
 */
public class InventoryPropertiesGraphQLQuery extends GraphQLQuery {
  public InventoryPropertiesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public InventoryPropertiesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "inventoryProperties";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public InventoryPropertiesGraphQLQuery build() {
      return new InventoryPropertiesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
