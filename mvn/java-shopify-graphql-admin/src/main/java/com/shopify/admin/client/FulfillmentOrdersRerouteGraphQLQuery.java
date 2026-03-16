package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Route the fulfillment orders to an alternative location, according to the shop's order routing settings. This involves:
 * * Finding an alternate location that can fulfill the fulfillment orders.
 * * Assigning the fulfillment orders to the new location.
 */
public class FulfillmentOrdersRerouteGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersRerouteGraphQLQuery(List<String> fulfillmentOrderIds,
      List<String> includedLocationIds, List<String> excludedLocationIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderIds != null || fieldsSet.contains("fulfillmentOrderIds")) {
        getInput().put("fulfillmentOrderIds", fulfillmentOrderIds);
    }if (includedLocationIds != null || fieldsSet.contains("includedLocationIds")) {
        getInput().put("includedLocationIds", includedLocationIds);
    }if (excludedLocationIds != null || fieldsSet.contains("excludedLocationIds")) {
        getInput().put("excludedLocationIds", excludedLocationIds);
    }
  }

  public FulfillmentOrdersRerouteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrdersReroute";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> fulfillmentOrderIds;

    private List<String> includedLocationIds;

    private List<String> excludedLocationIds;

    private String queryName;

    public FulfillmentOrdersRerouteGraphQLQuery build() {
      return new FulfillmentOrdersRerouteGraphQLQuery(fulfillmentOrderIds, includedLocationIds, excludedLocationIds, queryName, fieldsSet);
               
    }

    /**
     * The list of IDs of the fulfillment orders.
     */
    public Builder fulfillmentOrderIds(List<String> fulfillmentOrderIds) {
      this.fulfillmentOrderIds = fulfillmentOrderIds;
      this.fieldsSet.add("fulfillmentOrderIds");
      return this;
    }

    /**
     * The list of IDs of the locations to include for rerouting. By default, all locations are included.
     */
    public Builder includedLocationIds(List<String> includedLocationIds) {
      this.includedLocationIds = includedLocationIds;
      this.fieldsSet.add("includedLocationIds");
      return this;
    }

    /**
     * The list of IDs of the locations to exclude for rerouting. Excluded
     * locations specified here take precedence over included locations provided
     * through included_location_ids.
     */
    public Builder excludedLocationIds(List<String> excludedLocationIds) {
      this.excludedLocationIds = excludedLocationIds;
      this.fieldsSet.add("excludedLocationIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
