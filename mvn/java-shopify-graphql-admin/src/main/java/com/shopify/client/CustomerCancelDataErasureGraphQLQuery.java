package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerCancelDataErasureGraphQLQuery extends GraphQLQuery {
  public CustomerCancelDataErasureGraphQLQuery(String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerCancelDataErasureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerCancelDataErasure";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String queryName;

    public CustomerCancelDataErasureGraphQLQuery build() {
      return new CustomerCancelDataErasureGraphQLQuery(customerId, queryName, fieldsSet);
               
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
