package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CatalogType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of publications.
 */
public class PublicationsCountGraphQLQuery extends GraphQLQuery {
  public PublicationsCountGraphQLQuery(CatalogType catalogType, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (catalogType != null || fieldsSet.contains("catalogType")) {
        getInput().put("catalogType", catalogType);
    }
  }

  public PublicationsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "publicationsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CatalogType catalogType;

    private String queryName;

    public PublicationsCountGraphQLQuery build() {
      return new PublicationsCountGraphQLQuery(catalogType, queryName, fieldsSet);
               
    }

    /**
     * Filter publications by catalog type.
     */
    public Builder catalogType(CatalogType catalogType) {
      this.catalogType = catalogType;
      this.fieldsSet.add("catalogType");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
