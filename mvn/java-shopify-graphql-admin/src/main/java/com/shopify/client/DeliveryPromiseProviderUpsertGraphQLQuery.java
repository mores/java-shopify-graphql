package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DeliveryPromiseProviderUpsertGraphQLQuery extends GraphQLQuery {
  public DeliveryPromiseProviderUpsertGraphQLQuery(Boolean active, Integer fulfillmentDelay,
      String timeZone, String locationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (active != null || fieldsSet.contains("active")) {
        getInput().put("active", active);
    }if (fulfillmentDelay != null || fieldsSet.contains("fulfillmentDelay")) {
        getInput().put("fulfillmentDelay", fulfillmentDelay);
    }if (timeZone != null || fieldsSet.contains("timeZone")) {
        getInput().put("timeZone", timeZone);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }
  }

  public DeliveryPromiseProviderUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryPromiseProviderUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Boolean active;

    private Integer fulfillmentDelay;

    private String timeZone;

    private String locationId;

    private String queryName;

    public DeliveryPromiseProviderUpsertGraphQLQuery build() {
      return new DeliveryPromiseProviderUpsertGraphQLQuery(active, fulfillmentDelay, timeZone, locationId, queryName, fieldsSet);
               
    }

    
    public Builder active(Boolean active) {
      this.active = active;
      this.fieldsSet.add("active");
      return this;
    }

    
    public Builder fulfillmentDelay(Integer fulfillmentDelay) {
      this.fulfillmentDelay = fulfillmentDelay;
      this.fieldsSet.add("fulfillmentDelay");
      return this;
    }

    
    public Builder timeZone(String timeZone) {
      this.timeZone = timeZone;
      this.fieldsSet.add("timeZone");
      return this;
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
