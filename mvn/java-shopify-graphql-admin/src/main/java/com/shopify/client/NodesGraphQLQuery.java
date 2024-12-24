package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class NodesGraphQLQuery extends GraphQLQuery {
  public NodesGraphQLQuery(List<String> ids, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public NodesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "nodes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private String queryName;

    public NodesGraphQLQuery build() {
      return new NodesGraphQLQuery(ids, queryName, fieldsSet);
               
    }

    
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
