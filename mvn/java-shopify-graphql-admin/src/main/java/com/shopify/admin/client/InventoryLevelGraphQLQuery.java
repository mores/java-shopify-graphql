package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns an
 * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
 * object by ID.
 */
public class InventoryLevelGraphQLQuery extends GraphQLQuery {
  public InventoryLevelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public InventoryLevelGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "inventoryLevel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public InventoryLevelGraphQLQuery build() {
      return new InventoryLevelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `InventoryLevel` to return.
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
