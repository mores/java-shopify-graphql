package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AppRevokeAccessScopesGraphQLQuery extends GraphQLQuery {
  public AppRevokeAccessScopesGraphQLQuery(List<String> scopes, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (scopes != null || fieldsSet.contains("scopes")) {
        getInput().put("scopes", scopes);
    }
  }

  public AppRevokeAccessScopesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appRevokeAccessScopes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> scopes;

    private String queryName;

    public AppRevokeAccessScopesGraphQLQuery build() {
      return new AppRevokeAccessScopesGraphQLQuery(scopes, queryName, fieldsSet);
               
    }

    
    public Builder scopes(List<String> scopes) {
      this.scopes = scopes;
      this.fieldsSet.add("scopes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
