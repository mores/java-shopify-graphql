package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a location.
 */
public class LocationDeleteGraphQLQuery extends GraphQLQuery {
  public LocationDeleteGraphQLQuery(String locationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public LocationDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String queryName;

    public LocationDeleteGraphQLQuery build() {
      return new LocationDeleteGraphQLQuery(locationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of a location to delete.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
