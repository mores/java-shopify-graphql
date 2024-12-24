package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class AppByHandleGraphQLQuery extends GraphQLQuery {
  public AppByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public AppByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public AppByHandleGraphQLQuery build() {
      return new AppByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
