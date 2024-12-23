package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete a metafield definition.
 * Optionally deletes all associated metafields asynchronously when specified.
 */
public class MetafieldDefinitionDeleteGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionDeleteGraphQLQuery(String id, Boolean deleteAllAssociatedMetafields,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
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

    private Boolean deleteAllAssociatedMetafields;

    private String queryName;

    public MetafieldDefinitionDeleteGraphQLQuery build() {
      return new MetafieldDefinitionDeleteGraphQLQuery(id, deleteAllAssociatedMetafields, queryName, fieldsSet);
               
    }

    /**
     * The id of the metafield definition to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
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
