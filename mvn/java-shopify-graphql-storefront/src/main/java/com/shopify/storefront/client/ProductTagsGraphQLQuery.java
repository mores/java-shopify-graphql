package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Tags added to products.
 * Additional access scope required: unauthenticated_read_product_tags.
 */
public class ProductTagsGraphQLQuery extends GraphQLQuery {
  public ProductTagsGraphQLQuery(int first, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    getInput().put("first", first);                   
  }

  public ProductTagsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productTags";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private int first;

    private String queryName;

    public ProductTagsGraphQLQuery build() {
      return new ProductTagsGraphQLQuery(first, queryName, fieldsSet);
               
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder first(int first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
