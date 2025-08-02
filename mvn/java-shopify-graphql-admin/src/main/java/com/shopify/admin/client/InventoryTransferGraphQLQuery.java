package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns an inventory transfer by ID.
 */
public class InventoryTransferGraphQLQuery extends GraphQLQuery {
  public InventoryTransferGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public InventoryTransferGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "inventoryTransfer";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public InventoryTransferGraphQLQuery build() {
      return new InventoryTransferGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the inventory transfer.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
