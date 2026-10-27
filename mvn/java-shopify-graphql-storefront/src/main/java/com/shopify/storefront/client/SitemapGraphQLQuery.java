package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.SitemapType;
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

  public SitemapGraphQLQuery(SitemapType type, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SitemapType type;

    private String queryName;

    public SitemapGraphQLQuery build() {
      return new SitemapGraphQLQuery(type, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The type of the resource for the sitemap.
     */
    public Builder type(SitemapType type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    /**
     * The type of the resource for the sitemap.
     */
    public Builder typeReference(String variableRef) {
      this.variableReferences.put("type", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SitemapType"))).build());
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
