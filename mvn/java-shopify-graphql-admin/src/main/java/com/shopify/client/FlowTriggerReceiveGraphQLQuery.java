package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FlowTriggerReceiveGraphQLQuery extends GraphQLQuery {
  public FlowTriggerReceiveGraphQLQuery(String handle, String payload, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (payload != null || fieldsSet.contains("payload")) {
        getInput().put("payload", payload);
    }
  }

  public FlowTriggerReceiveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "flowTriggerReceive";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String payload;

    private String queryName;

    public FlowTriggerReceiveGraphQLQuery build() {
      return new FlowTriggerReceiveGraphQLQuery(handle, payload, queryName, fieldsSet);
               
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    
    public Builder payload(String payload) {
      this.payload = payload;
      this.fieldsSet.add("payload");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
