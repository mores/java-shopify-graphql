package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Reopens a closed return.
 */
public class ReturnReopenGraphQLQuery extends GraphQLQuery {
  public ReturnReopenGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ReturnReopenGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnReopen";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ReturnReopenGraphQLQuery build() {
      return new ReturnReopenGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the return to reopen.
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
