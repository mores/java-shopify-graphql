package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Assigns a location as the shipping origin while using legacy compatibility mode for multi-location delivery profiles.
 */
public class DeliveryShippingOriginAssignGraphQLQuery extends GraphQLQuery {
  public DeliveryShippingOriginAssignGraphQLQuery(String locationId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public DeliveryShippingOriginAssignGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryShippingOriginAssign";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private String queryName;

    public DeliveryShippingOriginAssignGraphQLQuery build() {
      return new DeliveryShippingOriginAssignGraphQLQuery(locationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the location to assign as the shipping origin.
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
