package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Finds a metaobject definition by type.
 */
public class MetaobjectDefinitionByTypeGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionByTypeGraphQLQuery(String type, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public MetaobjectDefinitionByTypeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinitionByType";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String type;

    private String queryName;

    public MetaobjectDefinitionByTypeGraphQLQuery build() {
      return new MetaobjectDefinitionByTypeGraphQLQuery(type, queryName, fieldsSet);
               
    }

    /**
     * The type of the metaobject definition to return.
     */
    public Builder type(String type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
