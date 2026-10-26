package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldIdentifierInput;
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
 * Deletes [`Metafield`](https://shopify.dev/docs/api/admin-graphql/current/objects/Metafield) objects in bulk by specifying combinations of owner ID, namespace, and key.
 *   
 * Returns the identifiers of successfully deleted metafields. If a specified
 * metafield doesn't exist, then the mutation still succeeds but returns `null`
 * for that identifier in the response.
 */
public class MetafieldsDeleteGraphQLQuery extends GraphQLQuery {
  public MetafieldsDeleteGraphQLQuery(List<MetafieldIdentifierInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public MetafieldsDeleteGraphQLQuery(List<MetafieldIdentifierInput> metafields, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetafieldsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<MetafieldIdentifierInput> metafields;

    private String queryName;

    public MetafieldsDeleteGraphQLQuery build() {
      return new MetafieldsDeleteGraphQLQuery(metafields, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A list of identifiers specifying metafields to delete. At least one identifier must be specified.
     */
    public Builder metafields(List<MetafieldIdentifierInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    /**
     * A list of identifiers specifying metafields to delete. At least one identifier must be specified.
     */
    public Builder metafieldsReference(String variableRef) {
      this.variableReferences.put("metafields", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("MetafieldIdentifierInput"))))).build());
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
