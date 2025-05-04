package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates and runs a bulk operation query.
 *   
 * See the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/queries) for more details.
 */
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

    /**
     * The query to be executed in bulk.
     */
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
