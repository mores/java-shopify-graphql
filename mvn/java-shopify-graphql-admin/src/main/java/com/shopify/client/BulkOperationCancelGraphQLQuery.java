package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Starts the cancelation process of a running bulk operation.
 *   
 * There may be a short delay from when a cancelation starts until the operation is actually canceled.
 */
public class BulkOperationCancelGraphQLQuery extends GraphQLQuery {
  public BulkOperationCancelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public BulkOperationCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "bulkOperationCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public BulkOperationCancelGraphQLQuery build() {
      return new BulkOperationCancelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the bulk operation to cancel.
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
