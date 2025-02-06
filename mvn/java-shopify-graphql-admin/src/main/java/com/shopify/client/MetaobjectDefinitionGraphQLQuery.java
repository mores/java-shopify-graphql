package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a metaobject definition by ID.
 */
public class MetaobjectDefinitionGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public MetaobjectDefinitionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinition";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public MetaobjectDefinitionGraphQLQuery build() {
      return new MetaobjectDefinitionGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the metaobject to return.
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
