package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a store credit account resource by ID.
 */
public class StoreCreditAccountGraphQLQuery extends GraphQLQuery {
  public StoreCreditAccountGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public StoreCreditAccountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "storeCreditAccount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public StoreCreditAccountGraphQLQuery build() {
      return new StoreCreditAccountGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the store credit account to return.
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
