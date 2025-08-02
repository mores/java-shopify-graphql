package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductVariantsBulkInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates multiple [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one operation.
 * You can run this mutation directly or as part of a [bulk
 * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
 * for large-scale catalog updates.
 *   
 * Use the `productVariantsBulkUpdate` mutation to efficiently modify product variants—such as different sizes,
 * colors, or materials—associated with an existing product. The mutation is helpful if you need to update a
 * product's variants in bulk, such as importing from an external system.
 *   
 * The mutation supports:
 *   
 * - Updating variants with custom options and values
 * - Associating media (for example, images, videos, and 3D models) with the product or its variants
 * - Handling complex product configurations
 *   
 * > Note:
 * > By default, stores have a limit of 100 product variants for each product. You can create a development store and
 * > [enable the **Extended Variants** developer preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#create-a-development-store-that-allows-2-048-variants-per-product)
 * > to update a maximum of 2,048 product variants in a single operation.
 *   
 * After creating variants, you can make additional changes using the
 * [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet) mutation,
 * which is used to perform multiple operations on products, such as creating or modifying product options and variants.
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
public class ProductVariantsBulkUpdateGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkUpdateGraphQLQuery(List<ProductVariantsBulkInput> variants,
      String productId, List<CreateMediaInput> media, Boolean allowPartialUpdates, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variants != null || fieldsSet.contains("variants")) {
        getInput().put("variants", variants);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }if (allowPartialUpdates != null || fieldsSet.contains("allowPartialUpdates")) {
        getInput().put("allowPartialUpdates", allowPartialUpdates);
    }
  }

  public ProductVariantsBulkUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantsBulkInput> variants;

    private String productId;

    private List<CreateMediaInput> media;

    private Boolean allowPartialUpdates;

    private String queryName;

    public ProductVariantsBulkUpdateGraphQLQuery build() {
      return new ProductVariantsBulkUpdateGraphQLQuery(variants, productId, media, allowPartialUpdates, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants to update.
     */
    public Builder variants(List<ProductVariantsBulkInput> variants) {
      this.variants = variants;
      this.fieldsSet.add("variants");
      return this;
    }

    /**
     * The ID of the product associated with the variants to update.
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
     * When partial updates are allowed, valid variant changes may be persisted even if some of
     * the variants updated have invalid data and cannot be persisted.
     * When partial updates are not allowed, any error will prevent all variants from updating.
     */
    public Builder allowPartialUpdates(Boolean allowPartialUpdates) {
      this.allowPartialUpdates = allowPartialUpdates;
      this.fieldsSet.add("allowPartialUpdates");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
