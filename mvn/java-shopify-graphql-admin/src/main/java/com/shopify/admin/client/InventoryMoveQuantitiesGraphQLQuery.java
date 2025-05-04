package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryMoveQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Moves inventory between inventory quantity names at a single location.
 */
public class InventoryMoveQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryMoveQuantitiesGraphQLQuery(InventoryMoveQuantitiesInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryMoveQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryMoveQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryMoveQuantitiesInput input;

    private String queryName;

    public InventoryMoveQuantitiesGraphQLQuery build() {
      return new InventoryMoveQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to move inventory quantities.
     */
    public Builder input(InventoryMoveQuantitiesInput input) {
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
