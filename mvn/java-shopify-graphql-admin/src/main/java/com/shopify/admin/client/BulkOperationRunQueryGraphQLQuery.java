package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Creates and runs a [bulk operation](https://shopify.dev/docs/api/admin-graphql/latest/objects/BulkOperation)
 * to fetch data asynchronously. The operation processes your GraphQL query in
 * the background and returns results in a [JSONL](http://jsonlines.org/) file when complete.
 *   
 * Bulk query and bulk mutation operations can run at the same time per shop. The
 * number of concurrent operations that an app can run depends on the API
 * version. For the applicable concurrency limits, refer to the [bulk operations
 * guide](https://shopify.dev/docs/api/usage/bulk-operations/queries). The query
 * must include at least one connection field and supports up to five connections
 * with a maximum nesting depth of two levels.
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

  public BulkOperationRunQueryGraphQLQuery(String query, boolean groupObjects, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }getInput().put("groupObjects", groupObjects);                   
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String query;

    private boolean groupObjects;

    private String queryName;

    public BulkOperationRunQueryGraphQLQuery build() {
      return new BulkOperationRunQueryGraphQLQuery(query, groupObjects, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The query to be executed in bulk.
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
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

    /**
     * Enables grouping objects directly under their corresponding parent objects
     * in the JSONL output. Enabling grouping slows down bulk operations and
     * increases the likelihood of timeouts. Only enable grouping if you depend on
     * the grouped format.
     */
    public Builder groupObjectsReference(String variableRef) {
      this.variableReferences.put("groupObjects", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Boolean"))).build());
      this.fieldsSet.add("groupObjects");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
