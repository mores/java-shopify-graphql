package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerSegmentMembersQueryInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerSegmentMembersQueryCreateGraphQLQuery extends GraphQLQuery {
  public CustomerSegmentMembersQueryCreateGraphQLQuery(CustomerSegmentMembersQueryInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerSegmentMembersQueryCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSegmentMembersQueryCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerSegmentMembersQueryInput input;

    private String queryName;

    public CustomerSegmentMembersQueryCreateGraphQLQuery build() {
      return new CustomerSegmentMembersQueryCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CustomerSegmentMembersQueryInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
