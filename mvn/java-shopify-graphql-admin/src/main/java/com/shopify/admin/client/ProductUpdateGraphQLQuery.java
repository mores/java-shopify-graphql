package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * with attributes such as title, description, vendor, and media.
 *   
 * The `productUpdate` mutation helps you modify many products at once, avoiding the tedious or time-consuming
 * process of updating them one by one in the Shopify admin. Common examples including updating
 * product details like status or tags.
 *   
 * The `productUpdate` mutation doesn't support updating
 * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
 * To update multiple product variants for a single product and manage prices, use the
 * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * mutation.
 *   
 * > Note:
 * > The `productUpdate` mutation has a [throttle](https://shopify.dev/docs/api/usage/rate-limits#resource-based-rate-limits)
 * > that takes effect when a store has 50,000 product variants. After this threshold is reached, no more than
 * > 1,000 new product variants can be updated per day.
 *   
 * After updating a product, you can make additional changes using one of the following mutations:
 *   
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
 * Used to perform multiple operations on products, such as creating or modifying product options and variants.
 * - [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublish):
 * Used to publish the product and make it available to customers, if the product is currently unpublished.
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductUpdateGraphQLQuery extends GraphQLQuery {
  public ProductUpdateGraphQLQuery(ProductUpdateInput product, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (product != null || fieldsSet.contains("product")) {
        getInput().put("product", product);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductUpdateInput product;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductUpdateGraphQLQuery build() {
      return new ProductUpdateGraphQLQuery(product, media, queryName, fieldsSet);
               
    }

    /**
     * The updated properties for a product.
     */
    public Builder product(ProductUpdateInput product) {
      this.product = product;
      this.fieldsSet.add("product");
      return this;
    }

    /**
     * List of new media to be added to the product.
     */
    public Builder media(List<CreateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
