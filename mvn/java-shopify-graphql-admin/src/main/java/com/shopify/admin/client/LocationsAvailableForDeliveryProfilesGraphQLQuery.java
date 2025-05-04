package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of all origin locations available for a delivery profile.
 */
public class LocationsAvailableForDeliveryProfilesGraphQLQuery extends GraphQLQuery {
  public LocationsAvailableForDeliveryProfilesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public LocationsAvailableForDeliveryProfilesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "locationsAvailableForDeliveryProfiles";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public LocationsAvailableForDeliveryProfilesGraphQLQuery build() {
      return new LocationsAvailableForDeliveryProfilesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
