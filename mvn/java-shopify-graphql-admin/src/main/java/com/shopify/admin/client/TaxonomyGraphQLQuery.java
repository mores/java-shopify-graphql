package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Access to Shopify's [standardized product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
 * for categorizing products. The [`Taxonomy`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Taxonomy)
 * organizes products into a hierarchical tree structure with categories,
 * attributes, and values.
 *   
 * Query categories using search terms, or navigate the hierarchy by requesting
 * children, siblings, or descendants of specific categories. Each [`TaxonomyCategory`](https://shopify.dev/docs/api/admin-graphql/latest/objects/TaxonomyCategory)
 * includes its position in the tree, parent-child relationships, and associated
 * attributes for that product category.
 */
public class TaxonomyGraphQLQuery extends GraphQLQuery {
  public TaxonomyGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public TaxonomyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "taxonomy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public TaxonomyGraphQLQuery build() {
      return new TaxonomyGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
