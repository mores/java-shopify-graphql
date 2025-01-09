package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Releases the fulfillment hold on a fulfillment order.
 */
public class FulfillmentOrderReleaseHoldGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderReleaseHoldGraphQLQuery(String id, List<String> holdIds, String externalId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (holdIds != null || fieldsSet.contains("holdIds")) {
        getInput().put("holdIds", holdIds);
    }if (externalId != null || fieldsSet.contains("externalId")) {
        getInput().put("externalId", externalId);
    }
  }

  public FulfillmentOrderReleaseHoldGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderReleaseHold";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> holdIds;

    private String externalId;

    private String queryName;

    public FulfillmentOrderReleaseHoldGraphQLQuery build() {
      return new FulfillmentOrderReleaseHoldGraphQLQuery(id, holdIds, externalId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order for which to release the fulfillment hold.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the fulfillment holds to release.<br/>
     *             <br/>
     *             Holds will only be released if they belong to the fulfillment order specified by the `id` argument.<br/>
     *             <br/>
     *             <strong>NOTE:</strong> If not supplied, all holds for the fulfillment order will be released.
     *             It is highly recommended that apps supply the ids of the holds that they intend to release.
     *             Releasing all holds on a fulfillment order will result in the fulfillment order being released prematurely
     *             and items being incorrectly fulfilled.
     */
    public Builder holdIds(List<String> holdIds) {
      this.holdIds = holdIds;
      this.fieldsSet.add("holdIds");
      return this;
    }

    /**
     * A configurable ID used to track the automation system releasing this hold.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      this.fieldsSet.add("externalId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
