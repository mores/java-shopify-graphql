package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.InventorySetOnHandQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class InventorySetOnHandQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventorySetOnHandQuantitiesGraphQLQuery(InventorySetOnHandQuantitiesInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventorySetOnHandQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventorySetOnHandQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventorySetOnHandQuantitiesInput input;

    private String queryName;

    public InventorySetOnHandQuantitiesGraphQLQuery build() {
      return new InventorySetOnHandQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(InventorySetOnHandQuantitiesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
