package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Triggers any workflows that begin with the trigger specified in the request
 * body. To learn more, refer to [_Create Shopify Flow
 * triggers_](https://shopify.dev/apps/flow/triggers).
 */
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

    /**
     * The handle of the trigger.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The payload needed to run the Trigger.
     */
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
