package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventoryTransferEditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Edits an inventory transfer.
 */
public class InventoryTransferEditGraphQLQuery extends GraphQLQuery {
  public InventoryTransferEditGraphQLQuery(String id, InventoryTransferEditInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventoryTransferEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransferEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private InventoryTransferEditInput input;

    private String queryName;

    public InventoryTransferEditGraphQLQuery build() {
      return new InventoryTransferEditGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory Transfer to be edited.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields to edit the inventory transfer.
     */
    public Builder input(InventoryTransferEditInput input) {
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
