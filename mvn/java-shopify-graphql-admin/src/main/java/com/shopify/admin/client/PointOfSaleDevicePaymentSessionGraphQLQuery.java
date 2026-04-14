package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Lookup a point of sale device payment session by ID.
 */
public class PointOfSaleDevicePaymentSessionGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDevicePaymentSessionGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PointOfSaleDevicePaymentSessionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevicePaymentSession";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public PointOfSaleDevicePaymentSessionGraphQLQuery build() {
      return new PointOfSaleDevicePaymentSessionGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the point of sale device payment session.
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
