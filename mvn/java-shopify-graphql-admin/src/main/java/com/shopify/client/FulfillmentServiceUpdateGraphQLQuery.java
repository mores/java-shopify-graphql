package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentServiceUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceUpdateGraphQLQuery(String id, String name, String callbackUrl,
      Boolean trackingSupport, Boolean inventoryManagement, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (callbackUrl != null || fieldsSet.contains("callbackUrl")) {
        getInput().put("callbackUrl", callbackUrl);
    }if (trackingSupport != null || fieldsSet.contains("trackingSupport")) {
        getInput().put("trackingSupport", trackingSupport);
    }if (inventoryManagement != null || fieldsSet.contains("inventoryManagement")) {
        getInput().put("inventoryManagement", inventoryManagement);
    }
  }

  public FulfillmentServiceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String name;

    private String callbackUrl;

    private Boolean trackingSupport;

    private Boolean inventoryManagement;

    private String queryName;

    public FulfillmentServiceUpdateGraphQLQuery build() {
      return new FulfillmentServiceUpdateGraphQLQuery(id, name, callbackUrl, trackingSupport, inventoryManagement, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
