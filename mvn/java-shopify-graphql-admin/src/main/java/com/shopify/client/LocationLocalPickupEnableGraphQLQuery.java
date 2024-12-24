package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DeliveryLocationLocalPickupEnableInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class LocationLocalPickupEnableGraphQLQuery extends GraphQLQuery {
  public LocationLocalPickupEnableGraphQLQuery(
      DeliveryLocationLocalPickupEnableInput localPickupSettings, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (localPickupSettings != null || fieldsSet.contains("localPickupSettings")) {
        getInput().put("localPickupSettings", localPickupSettings);
    }
  }

  public LocationLocalPickupEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationLocalPickupEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryLocationLocalPickupEnableInput localPickupSettings;

    private String queryName;

    public LocationLocalPickupEnableGraphQLQuery build() {
      return new LocationLocalPickupEnableGraphQLQuery(localPickupSettings, queryName, fieldsSet);
               
    }

    
    public Builder localPickupSettings(DeliveryLocationLocalPickupEnableInput localPickupSettings) {
      this.localPickupSettings = localPickupSettings;
      this.fieldsSet.add("localPickupSettings");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
