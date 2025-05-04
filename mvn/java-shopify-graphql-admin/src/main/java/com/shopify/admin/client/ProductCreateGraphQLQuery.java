package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * with attributes such as title, description, and vendor.
 * You can use the `productCreate` mutation to define
 * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
 * [values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue)
 * for products with
 * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant),
 * such as different sizes or colors.
 *   
 * To create multiple product variants for a single product and manage prices, use the
 * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * mutation.
 *   
 * To create or update a product in a single request, use the
 * [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet) mutation.
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductCreateGraphQLQuery extends GraphQLQuery {
  public ProductCreateGraphQLQuery(ProductCreateInput product, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (product != null || fieldsSet.contains("product")) {
        getInput().put("product", product);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductCreateInput product;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductCreateGraphQLQuery build() {
      return new ProductCreateGraphQLQuery(product, media, queryName, fieldsSet);
               
    }

    /**
     * The attributes of the new product.
     */
    public Builder product(ProductCreateInput product) {
      this.product = product;
      this.fieldsSet.add("product");
      return this;
    }

    /**
     * The media to add to the product.
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
