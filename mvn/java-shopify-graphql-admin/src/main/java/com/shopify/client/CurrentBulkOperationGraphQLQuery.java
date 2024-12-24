package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.BulkOperationType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CurrentBulkOperationGraphQLQuery extends GraphQLQuery {
  public CurrentBulkOperationGraphQLQuery(BulkOperationType type, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public CurrentBulkOperationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "currentBulkOperation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private BulkOperationType type;

    private String queryName;

    public CurrentBulkOperationGraphQLQuery build() {
      return new CurrentBulkOperationGraphQLQuery(type, queryName, fieldsSet);
               
    }

    
    public Builder type(BulkOperationType type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
