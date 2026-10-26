package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Deletes a [`MetafieldDefinition`](https://shopify.dev/docs/api/admin-graphql/current/objects/MetafieldDefinition). You can identify the definition by providing either its owner type, namespace,
 * and key, or its global ID.
 *   
 * When you set [`deleteAllAssociatedMetafields`](https://shopify.dev/docs/api/admin-graphql/current/mutations/metafieldDefinitionDelete#arguments-deleteAllAssociatedMetafields) to `true`, the mutation asynchronously deletes all [`Metafield`](https://shopify.dev/docs/api/admin-graphql/current/objects/Metafield)
 * objects that use this definition. This option must be `true` when deleting
 * definitions under the `$app` namespace.
 *   
 * Learn more about [deleting metafield definitions](https://shopify.dev/docs/apps/build/custom-data/metafields/definitions).
 */
public class MetafieldDefinitionDeleteGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionDeleteGraphQLQuery(String id,
      MetafieldDefinitionIdentifierInput identifier, Boolean deleteAllAssociatedMetafields,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }if (deleteAllAssociatedMetafields != null || fieldsSet.contains("deleteAllAssociatedMetafields")) {
        getInput().put("deleteAllAssociatedMetafields", deleteAllAssociatedMetafields);
    }
  }

  public MetafieldDefinitionDeleteGraphQLQuery(String id,
      MetafieldDefinitionIdentifierInput identifier, Boolean deleteAllAssociatedMetafields,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }if (deleteAllAssociatedMetafields != null || fieldsSet.contains("deleteAllAssociatedMetafields")) {
        getInput().put("deleteAllAssociatedMetafields", deleteAllAssociatedMetafields);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetafieldDefinitionDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private MetafieldDefinitionIdentifierInput identifier;

    private Boolean deleteAllAssociatedMetafields;

    private String queryName;

    public MetafieldDefinitionDeleteGraphQLQuery build() {
      return new MetafieldDefinitionDeleteGraphQLQuery(id, identifier, deleteAllAssociatedMetafields, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The id of the metafield definition to delete. Using `identifier` is preferred.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The id of the metafield definition to delete. Using `identifier` is preferred.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The identifier of the metafield definition to delete.
     */
    public Builder identifier(MetafieldDefinitionIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * The identifier of the metafield definition to delete.
     */
    public Builder identifierReference(String variableRef) {
      this.variableReferences.put("identifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("MetafieldDefinitionIdentifierInput")).build());
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * Whether to delete all associated metafields.
     */
    public Builder deleteAllAssociatedMetafields(Boolean deleteAllAssociatedMetafields) {
      this.deleteAllAssociatedMetafields = deleteAllAssociatedMetafields;
      this.fieldsSet.add("deleteAllAssociatedMetafields");
      return this;
    }

    /**
     * Whether to delete all associated metafields.
     */
    public Builder deleteAllAssociatedMetafieldsReference(String variableRef) {
      this.variableReferences.put("deleteAllAssociatedMetafields", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("deleteAllAssociatedMetafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
