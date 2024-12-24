package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CurrentStaffMemberGraphQLQuery extends GraphQLQuery {
  public CurrentStaffMemberGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CurrentStaffMemberGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "currentStaffMember";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CurrentStaffMemberGraphQLQuery build() {
      return new CurrentStaffMemberGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
