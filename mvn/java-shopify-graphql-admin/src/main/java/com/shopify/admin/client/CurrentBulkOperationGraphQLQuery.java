package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BulkOperationType;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns the current app's most recent [`BulkOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/BulkOperation).
 * Bulk query and bulk mutation operations can run at the same time per shop. The
 * number of concurrent operations that an app can run depends on the API
 * version. For the applicable concurrency limits, refer to the [bulk operations
 * guide](https://shopify.dev/docs/api/usage/bulk-operations/queries).
 *   
 * The operation type parameter determines whether to retrieve the most recent
 * query or mutation bulk operation. Use this query to check the operation's
 * status, track its progress, and retrieve the result URL when it completes.
 */
public class CurrentBulkOperationGraphQLQuery extends GraphQLQuery {
  public CurrentBulkOperationGraphQLQuery(BulkOperationType type, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public CurrentBulkOperationGraphQLQuery(BulkOperationType type, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private BulkOperationType type;

    private String queryName;

    public CurrentBulkOperationGraphQLQuery build() {
      return new CurrentBulkOperationGraphQLQuery(type, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The current bulk operation's type.
     */
    public Builder type(BulkOperationType type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    /**
     * The current bulk operation's type.
     */
    public Builder typeReference(String variableRef) {
      this.variableReferences.put("type", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("BulkOperationType")).build());
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
