package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a `PointOfSaleDevice` resource by ID.
 */
public class PointOfSaleDeviceGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDeviceGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PointOfSaleDeviceGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevice";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PointOfSaleDeviceGraphQLQuery build() {
      return new PointOfSaleDeviceGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `PointOfSaleDevice` to return.
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
