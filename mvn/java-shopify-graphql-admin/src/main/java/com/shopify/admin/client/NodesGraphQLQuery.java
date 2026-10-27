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
 * Returns the list of nodes (any objects that implement the
 * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
 * interface) with the given IDs, in accordance with the
 * [Relay specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
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
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The IDs of the Nodes to return.
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
