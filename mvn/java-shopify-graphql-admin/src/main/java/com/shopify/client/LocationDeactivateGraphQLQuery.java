package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deactivates a location and moves inventory, pending orders, and moving transfers to a destination location.
 */
public class LocationDeactivateGraphQLQuery extends GraphQLQuery {
  public LocationDeactivateGraphQLQuery(String locationId, String destinationLocationId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (destinationLocationId != null || fieldsSet.contains("destinationLocationId")) {
        getInput().put("destinationLocationId", destinationLocationId);
    }
  }

  public LocationDeactivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationDeactivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String destinationLocationId;

    private String queryName;

    public LocationDeactivateGraphQLQuery build() {
      return new LocationDeactivateGraphQLQuery(locationId, destinationLocationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of a location to deactivate.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The ID of a destination location to which inventory, pending orders and
     * moving transfers will be moved from the location to deactivate.
     */
    public Builder destinationLocationId(String destinationLocationId) {
      this.destinationLocationId = destinationLocationId;
      this.fieldsSet.add("destinationLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
