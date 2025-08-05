package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductVariantsBulkCreateStrategy;
import com.shopify.admin.types.ProductVariantsBulkInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates multiple [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one operation.
 * You can run this mutation directly or as part of a [bulk
 * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
 * for large-scale catalog updates.
 *   
 * Use the `productVariantsBulkCreate` mutation to efficiently add new product variants—such as different sizes,
 * colors, or materials—to an existing product. The mutation is helpful if you need to add product variants in bulk,
 * such as importing from an external system.
 *   
 * The mutation supports:
 *   
 * - Creating variants with custom options and values
 * - Associating media (for example, images, videos, and 3D models) with the product or its variants
 * - Handling complex product configurations
 *   
 * > Note:
 * > By default, stores have a limit of 100 product variants for each product. You can create a development store and
 * > [enable the **Extended Variants** developer preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#create-a-development-store-that-allows-2-048-variants-per-product)
 * > to create a maximum of 2,048 product variants in a single operation.
 *   
 * After creating variants, you can make additional changes using one of the following mutations:
 *   
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate):
 * Updates multiple product variants for a single product in one operation.
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
 * Used to perform multiple operations on products, such as creating or modifying product options and variants.
 *   
 * You can also specifically manage product options through related mutations:
 *   
 * - [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate)
 * - [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpdate)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsReorder)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsDelete)
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductVariantsBulkCreateGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkCreateGraphQLQuery(List<ProductVariantsBulkInput> variants,
      String productId, List<CreateMediaInput> media, ProductVariantsBulkCreateStrategy strategy,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variants != null || fieldsSet.contains("variants")) {
        getInput().put("variants", variants);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }if (strategy != null || fieldsSet.contains("strategy")) {
        getInput().put("strategy", strategy);
    }
  }

  public ProductVariantsBulkCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantsBulkInput> variants;

    private String productId;

    private List<CreateMediaInput> media;

    private ProductVariantsBulkCreateStrategy strategy;

    private String queryName;

    public ProductVariantsBulkCreateGraphQLQuery build() {
      return new ProductVariantsBulkCreateGraphQLQuery(variants, productId, media, strategy, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants to be created.
     */
    public Builder variants(List<ProductVariantsBulkInput> variants) {
      this.variants = variants;
      this.fieldsSet.add("variants");
      return this;
    }

    /**
     * The ID of the product on which to create the variants.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
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

    /**
     * The strategy defines which behavior the mutation should observe, such as
     * whether to keep or delete the standalone variant (when product has only a
     * single or default variant) when creating new variants in bulk.
     */
    public Builder strategy(ProductVariantsBulkCreateStrategy strategy) {
      this.strategy = strategy;
      this.fieldsSet.add("strategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
