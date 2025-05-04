package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventorySetOnHandQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set inventory on-hand quantities using absolute values.
 */
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

    /**
     * The information required to set inventory on hand quantities.
     */
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
