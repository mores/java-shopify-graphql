package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.LocationAddInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a new [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location) where you can stock inventory and fulfill orders. Locations represent physical
 * places like warehouses, retail stores, or fulfillment centers.
 *   
 * The location requires a name and address with at least a country code. You can
 * specify whether the location fulfills online orders, which determines if its
 * inventory is available for online sales. You can also attach custom
 * [metafields](https://shopify.dev/docs/apps/build/custom-data) to store
 * additional information about the location.
 */
public class LocationAddGraphQLQuery extends GraphQLQuery {
  public LocationAddGraphQLQuery(LocationAddInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public LocationAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private LocationAddInput input;

    private String queryName;

    public LocationAddGraphQLQuery build() {
      return new LocationAddGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the location to add.
     */
    public Builder input(LocationAddInput input) {
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
