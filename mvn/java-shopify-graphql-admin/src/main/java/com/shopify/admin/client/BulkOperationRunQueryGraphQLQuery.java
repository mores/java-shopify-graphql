package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates and runs a [bulk operation](https://shopify.dev/docs/api/admin-graphql/latest/objects/BulkOperation)
 * to fetch data asynchronously. The operation processes your GraphQL query in
 * the background and returns results in a [JSONL](http://jsonlines.org/) file when complete.
 *   
 * Apps can run one bulk query operation and one bulk mutation operation at a
 * time per shop. The query must include at least one connection field and
 * supports up to five connections with a maximum nesting depth of two levels.
 *   
 * > Note: Results remain available for seven days after completion.
 *   
 * For more information, see the [bulk operations guide](https://shopify.dev/docs/api/usage/bulk-operations/queries).
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
     * Enables grouping objects directly under their corresponding parent objects
     * in the JSONL output. Enabling grouping slows down bulk operations and
     * increases the likelihood of timeouts. Only enable grouping if you depend on
     * the grouped format.
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
