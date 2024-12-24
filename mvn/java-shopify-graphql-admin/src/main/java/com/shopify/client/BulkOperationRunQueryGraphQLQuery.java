package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class BulkOperationRunQueryGraphQLQuery extends GraphQLQuery {
  public BulkOperationRunQueryGraphQLQuery(String query, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public BulkOperationRunQueryGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "bulkOperationRunQuery";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String queryName;

    public BulkOperationRunQueryGraphQLQuery build() {
      return new BulkOperationRunQueryGraphQLQuery(query, queryName, fieldsSet);
               
    }

    
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
