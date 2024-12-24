package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.InventorySetQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class InventorySetQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventorySetQuantitiesGraphQLQuery(InventorySetQuantitiesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventorySetQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventorySetQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventorySetQuantitiesInput input;

    private String queryName;

    public InventorySetQuantitiesGraphQLQuery build() {
      return new InventorySetQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(InventorySetQuantitiesInput input) {
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
