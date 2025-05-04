package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the server pixel to connect to an EventBridge endpoint.
 * Running this mutation deletes any previous subscriptions for the server pixel.
 */
public class EventBridgeServerPixelUpdateGraphQLQuery extends GraphQLQuery {
  public EventBridgeServerPixelUpdateGraphQLQuery(String arn, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (arn != null || fieldsSet.contains("arn")) {
        getInput().put("arn", arn);
    }
  }

  public EventBridgeServerPixelUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "eventBridgeServerPixelUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String arn;

    private String queryName;

    public EventBridgeServerPixelUpdateGraphQLQuery build() {
      return new EventBridgeServerPixelUpdateGraphQLQuery(arn, queryName, fieldsSet);
               
    }

    /**
     * The ARN for the EventBridge endpoint to which customer events are to be sent.
     */
    public Builder arn(String arn) {
      this.arn = arn;
      this.fieldsSet.add("arn");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
