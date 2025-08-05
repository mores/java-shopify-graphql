package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an inventory transfer.
 */
public class InventoryTransferCreateGraphQLQuery extends GraphQLQuery {
  public InventoryTransferCreateGraphQLQuery(InventoryTransferCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryTransferCreateInput input;

    private String queryName;

    public InventoryTransferCreateGraphQLQuery build() {
      return new InventoryTransferCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the inventory transfer.
     */
    public Builder input(InventoryTransferCreateInput input) {
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
