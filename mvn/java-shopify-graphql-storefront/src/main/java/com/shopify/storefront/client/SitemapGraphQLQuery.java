package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.SitemapType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains all fields required to generate sitemaps.
 */
public class SitemapGraphQLQuery extends GraphQLQuery {
  public SitemapGraphQLQuery(SitemapType type, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public SitemapGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "sitemap";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SitemapType type;

    private String queryName;

    public SitemapGraphQLQuery build() {
      return new SitemapGraphQLQuery(type, queryName, fieldsSet);
               
    }

    /**
     * The type of the resource for the sitemap.
     */
    public Builder type(SitemapType type) {
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
