package com.shopify.storefront.client;

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
 * Retrieves multiple objects by their global IDs in a single request. Any object
 * that implements the
 * [`Node`](https://shopify.dev/docs/api/storefront/current/interfaces/Node)
 * interface can be fetched, including
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product), [collections](https://shopify.dev/docs/api/storefront/current/objects/Collection),
 * and [pages](https://shopify.dev/docs/api/storefront/current/objects/Page).
 *   
 * Use inline fragments to access type-specific fields on the returned objects. The input accepts up to 250 IDs.
 */
public class NodesGraphQLQuery extends GraphQLQuery {
  public NodesGraphQLQuery(List<String> ids, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public NodesGraphQLQuery(List<String> ids, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public NodesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "nodes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> ids;

    private String queryName;

    public NodesGraphQLQuery build() {
      return new NodesGraphQLQuery(ids, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The IDs of the Nodes to return.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The IDs of the Nodes to return.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder idsReference(String variableRef) {
      this.variableReferences.put("ids", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
