package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes the specified metaobject definition.
 * Also deletes all related metafield definitions, metaobjects, and metafields asynchronously.
 */
public class MetaobjectDefinitionDeleteGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionDeleteGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MetaobjectDefinitionDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinitionDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public MetaobjectDefinitionDeleteGraphQLQuery build() {
      return new MetaobjectDefinitionDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the metaobjects definition to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
