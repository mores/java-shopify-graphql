package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Starts editing an order. Mutations are operating on `OrderEdit`.
 * All order edits start with `orderEditBegin`, have any number of `orderEdit`*
 * mutations made, and end with `orderEditCommit`.
 */
public class OrderEditBeginGraphQLQuery extends GraphQLQuery {
  public OrderEditBeginGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public OrderEditBeginGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditBegin";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public OrderEditBeginGraphQLQuery build() {
      return new OrderEditBeginGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to begin editing.
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
