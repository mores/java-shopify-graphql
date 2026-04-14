package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String id;

    private MetafieldDefinitionIdentifierInput identifier;

    private Boolean deleteAllAssociatedMetafields;

    private String queryName;

    public MetafieldDefinitionDeleteGraphQLQuery build() {
      return new MetafieldDefinitionDeleteGraphQLQuery(id, identifier, deleteAllAssociatedMetafields, queryName, fieldsSet);
               
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
     * The identifier of the metafield definition to delete.
     */
    public Builder identifier(MetafieldDefinitionIdentifierInput identifier) {
      this.identifier = identifier;
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
