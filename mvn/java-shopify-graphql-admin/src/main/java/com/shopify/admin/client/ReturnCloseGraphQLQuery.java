package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Indicates a return is complete, either when a refund has been made and items restocked,
 * or simply when it has been marked as returned in the system.
 */
public class ReturnCloseGraphQLQuery extends GraphQLQuery {
  public ReturnCloseGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ReturnCloseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnClose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ReturnCloseGraphQLQuery build() {
      return new ReturnCloseGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the return to close.
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
