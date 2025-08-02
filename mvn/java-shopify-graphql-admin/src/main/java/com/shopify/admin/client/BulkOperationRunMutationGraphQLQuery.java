package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates and runs a bulk operation mutation.
 *   
 * To learn how to bulk import large volumes of data asynchronously, refer to the
 * [bulk import data guide](https://shopify.dev/api/usage/bulk-operations/imports).
 */
public class BulkOperationRunMutationGraphQLQuery extends GraphQLQuery {
  public BulkOperationRunMutationGraphQLQuery(String mutation, String stagedUploadPath,
      boolean groupObjects, String clientIdentifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (mutation != null || fieldsSet.contains("mutation")) {
        getInput().put("mutation", mutation);
    }if (stagedUploadPath != null || fieldsSet.contains("stagedUploadPath")) {
        getInput().put("stagedUploadPath", stagedUploadPath);
    }getInput().put("groupObjects", groupObjects);                   if (clientIdentifier != null || fieldsSet.contains("clientIdentifier")) {
        getInput().put("clientIdentifier", clientIdentifier);
    }
  }

  public BulkOperationRunMutationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "bulkOperationRunMutation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String mutation;

    private String stagedUploadPath;

    private boolean groupObjects;

    private String clientIdentifier;

    private String queryName;

    public BulkOperationRunMutationGraphQLQuery build() {
      return new BulkOperationRunMutationGraphQLQuery(mutation, stagedUploadPath, groupObjects, clientIdentifier, queryName, fieldsSet);
               
    }

    /**
     * The mutation to be executed in bulk.
     */
    public Builder mutation(String mutation) {
      this.mutation = mutation;
      this.fieldsSet.add("mutation");
      return this;
    }

    /**
     * The staged upload path of the file containing mutation variables.
     */
    public Builder stagedUploadPath(String stagedUploadPath) {
      this.stagedUploadPath = stagedUploadPath;
      this.fieldsSet.add("stagedUploadPath");
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

    /**
     * An optional identifier which may be used for querying.
     */
    public Builder clientIdentifier(String clientIdentifier) {
      this.clientIdentifier = clientIdentifier;
      this.fieldsSet.add("clientIdentifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
