package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferSetItemsInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * This mutation allows for the setting of line items on a Transfer. Will replace the items already set, if any.
 */
public class InventoryTransferSetItemsGraphQLQuery extends GraphQLQuery {
  public InventoryTransferSetItemsGraphQLQuery(InventoryTransferSetItemsInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferSetItemsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferSetItems";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventoryTransferSetItemsInput input;

    private String queryName;

    public InventoryTransferSetItemsGraphQLQuery build() {
      return new InventoryTransferSetItemsGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the InventoryTransferSetItems mutation.
     */
    public Builder input(InventoryTransferSetItemsInput input) {
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
