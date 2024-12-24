package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class LocationLocalPickupDisableGraphQLQuery extends GraphQLQuery {
  public LocationLocalPickupDisableGraphQLQuery(String locationId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public LocationLocalPickupDisableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationLocalPickupDisable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String queryName;

    public LocationLocalPickupDisableGraphQLQuery build() {
      return new LocationLocalPickupDisableGraphQLQuery(locationId, queryName, fieldsSet);
               
    }

    
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
