package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * General inventory properties for the shop.
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
