package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels a return and restores the items back to being fulfilled.
 * Canceling a return is only available before any work has been done
 * on the return (such as an inspection or refund).
 */
public class ReturnCancelGraphQLQuery extends GraphQLQuery {
  public ReturnCancelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ReturnCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ReturnCancelGraphQLQuery build() {
      return new ReturnCancelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the return to cancel.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
