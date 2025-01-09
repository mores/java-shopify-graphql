package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.InventoryAdjustQuantitiesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Apply changes to inventory quantities.
 */
public class InventoryAdjustQuantitiesGraphQLQuery extends GraphQLQuery {
  public InventoryAdjustQuantitiesGraphQLQuery(InventoryAdjustQuantitiesInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryAdjustQuantitiesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryAdjustQuantities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryAdjustQuantitiesInput input;

    private String queryName;

    public InventoryAdjustQuantitiesGraphQLQuery build() {
      return new InventoryAdjustQuantitiesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to adjust inventory quantities.
     */
    public Builder input(InventoryAdjustQuantitiesInput input) {
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
