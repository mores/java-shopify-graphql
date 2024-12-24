package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder holdIds(List<String> holdIds) {
      this.holdIds = holdIds;
      this.fieldsSet.add("holdIds");
      return this;
    }

    
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
