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
  public BulkOperationRunQueryGraphQLQuery(String query, boolean groupObjects, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }getInput().put("groupObjects", groupObjects);                   
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

    private boolean groupObjects;

    private String queryName;

    public BulkOperationRunQueryGraphQLQuery build() {
      return new BulkOperationRunQueryGraphQLQuery(query, groupObjects, queryName, fieldsSet);
               
    }

    /**
     * The query to be executed in bulk.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * Whether to group objects under their corresponding parent objects in the
     * JSONL output. Grouping is costly, causes bulk operations to take longer to
     * complete, and increases the chances of failures such as timeouts.
     */
    public Builder groupObjects(boolean groupObjects) {
      this.groupObjects = groupObjects;
      this.fieldsSet.add("groupObjects");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
