package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.ProductRecommendationIntent;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns recommended products for a given product, identified by either ID or
 * handle. Use the [`intent`](https://shopify.dev/docs/api/storefront/current/enums/ProductRecommendationIntent)
 * argument to control the recommendation strategy.
 *   
 * Shopify [auto-generates related recommendations](https://shopify.dev/docs/storefronts/themes/product-merchandising/recommendations)
 * based on sales data, product descriptions, and collection relationships.
 * Complementary recommendations require [manual configuration](https://help.shopify.com/manual/online-store/storefront-search/search-and-discovery-recommendations)
 * through the Shopify Search & Discovery app. Returns up to ten
 * [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product) objects.
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
