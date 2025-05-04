package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes media for a product.
 */
public class ProductDeleteMediaGraphQLQuery extends GraphQLQuery {
  public ProductDeleteMediaGraphQLQuery(String productId, List<String> mediaIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (mediaIds != null || fieldsSet.contains("mediaIds")) {
        getInput().put("mediaIds", mediaIds);
    }
  }

  public ProductDeleteMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDeleteMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<String> mediaIds;

    private String queryName;

    public ProductDeleteMediaGraphQLQuery build() {
      return new ProductDeleteMediaGraphQLQuery(productId, mediaIds, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product ID from which the media will be deleted.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * The media IDs to be deleted.
     */
    public Builder mediaIds(List<String> mediaIds) {
      this.mediaIds = mediaIds;
      this.fieldsSet.add("mediaIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
