package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ProductRecommendationIntent;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Find recommended products related to a given `product_id`.
 * To learn more about how recommendations are generated, see
 * [*Showing product recommendations on product pages*](https://help.shopify.com/themes/development/recommended-products).
 */
public class ProductRecommendationsGraphQLQuery extends GraphQLQuery {
  public ProductRecommendationsGraphQLQuery(String productId, String productHandle,
      ProductRecommendationIntent intent, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (productHandle != null || fieldsSet.contains("productHandle")) {
        getInput().put("productHandle", productHandle);
    }if (intent != null || fieldsSet.contains("intent")) {
        getInput().put("intent", intent);
    }
  }

  public ProductRecommendationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productRecommendations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private String productHandle;

    private ProductRecommendationIntent intent;

    private String queryName;

    public ProductRecommendationsGraphQLQuery build() {
      return new ProductRecommendationsGraphQLQuery(productId, productHandle, intent, queryName, fieldsSet);
               
    }

    /**
     * The id of the product.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * The handle of the product.
     */
    public Builder productHandle(String productHandle) {
      this.productHandle = productHandle;
      this.fieldsSet.add("productHandle");
      return this;
    }

    /**
     * The recommendation intent that is used to generate product recommendations.
     * You can use intent to generate product recommendations on various pages
     * across the channels, according to different strategies.
     */
    public Builder intent(ProductRecommendationIntent intent) {
      this.intent = intent;
      this.fieldsSet.add("intent");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
