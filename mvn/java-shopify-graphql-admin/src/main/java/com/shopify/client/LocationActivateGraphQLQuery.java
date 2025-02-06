package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Activates a location so that you can stock inventory at the location. Refer to the
 * [`isActive`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-isactive) and
 * [`activatable`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-activatable)
 * fields on the `Location` object.
 */
public class LocationActivateGraphQLQuery extends GraphQLQuery {
  public LocationActivateGraphQLQuery(String locationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public LocationActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String queryName;

    public LocationActivateGraphQLQuery build() {
      return new LocationActivateGraphQLQuery(locationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of a location to activate.
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
