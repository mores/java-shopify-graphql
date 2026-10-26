package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
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
 * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
 * The order of your pinned metafield definitions determines the order in which your metafields are displayed
 * on the corresponding pages in your Shopify admin. By default, only pinned metafields are automatically displayed.
 */
public class MetafieldDefinitionPinGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionPinGraphQLQuery(String definitionId,
      MetafieldDefinitionIdentifierInput identifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definitionId != null || fieldsSet.contains("definitionId")) {
        getInput().put("definitionId", definitionId);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public MetafieldDefinitionPinGraphQLQuery(String definitionId,
      MetafieldDefinitionIdentifierInput identifier, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (definitionId != null || fieldsSet.contains("definitionId")) {
        getInput().put("definitionId", definitionId);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetafieldDefinitionPinGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionPin";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String definitionId;

    private MetafieldDefinitionIdentifierInput identifier;

    private String queryName;

    public MetafieldDefinitionPinGraphQLQuery build() {
      return new MetafieldDefinitionPinGraphQLQuery(definitionId, identifier, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The id of the metafield definition to pin. Using `identifier` is preferred.
     */
    public Builder definitionId(String definitionId) {
      this.definitionId = definitionId;
      this.fieldsSet.add("definitionId");
      return this;
    }

    /**
     * The id of the metafield definition to pin. Using `identifier` is preferred.
     */
    public Builder definitionIdReference(String variableRef) {
      this.variableReferences.put("definitionId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("definitionId");
      return this;
    }

    /**
     * The identifier of the metafield definition to pin.
     */
    public Builder identifier(MetafieldDefinitionIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * The identifier of the metafield definition to pin.
     */
    public Builder identifierReference(String variableRef) {
      this.variableReferences.put("identifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("MetafieldDefinitionIdentifierInput")).build());
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
