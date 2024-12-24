package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentServiceCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceCreateGraphQLQuery(String name, String callbackUrl,
      Boolean trackingSupport, Boolean inventoryManagement, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (callbackUrl != null || fieldsSet.contains("callbackUrl")) {
        getInput().put("callbackUrl", callbackUrl);
    }if (trackingSupport != null || fieldsSet.contains("trackingSupport")) {
        getInput().put("trackingSupport", trackingSupport);
    }if (inventoryManagement != null || fieldsSet.contains("inventoryManagement")) {
        getInput().put("inventoryManagement", inventoryManagement);
    }
  }

  public FulfillmentServiceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String name;

    private String callbackUrl;

    private Boolean trackingSupport;

    private Boolean inventoryManagement;

    private String queryName;

    public FulfillmentServiceCreateGraphQLQuery build() {
      return new FulfillmentServiceCreateGraphQLQuery(name, callbackUrl, trackingSupport, inventoryManagement, queryName, fieldsSet);
               
    }

    
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      this.fieldsSet.add("callbackUrl");
      return this;
    }

    
    public Builder trackingSupport(Boolean trackingSupport) {
      this.trackingSupport = trackingSupport;
      this.fieldsSet.add("trackingSupport");
      return this;
    }

    
    public Builder inventoryManagement(Boolean inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
      this.fieldsSet.add("inventoryManagement");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
