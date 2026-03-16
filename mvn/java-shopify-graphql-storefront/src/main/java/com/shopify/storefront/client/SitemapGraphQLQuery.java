package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.SitemapType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns sitemap data for a specific resource type, enabling headless
 * storefronts to generate XML sitemaps for search engine optimization. The query
 * provides a page count and paginated access to resources like
 * [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product), [`Collection`](https://shopify.dev/docs/api/storefront/current/objects/Collection),
 * [`Page`](https://shopify.dev/docs/api/storefront/current/objects/Page), and
 * [`Blog`](https://shopify.dev/docs/api/storefront/current/objects/Blog) objects.
 *   
 * When paginating through resources, the number of items per page varies from 0
 * to 250, and empty pages can occur without indicating the end of results. Always check [`hasNextPage`](https://shopify.dev/docs/api/storefront/current/objects/PaginatedSitemapResources#field-PaginatedSitemapResources.fields.hasNextPage)
 * to determine if more pages are available.
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
