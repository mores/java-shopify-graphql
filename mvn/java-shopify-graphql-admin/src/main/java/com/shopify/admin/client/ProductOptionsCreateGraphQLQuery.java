package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OptionCreateInput;
import com.shopify.admin.types.ProductOptionCreateVariantStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates one or more [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
 * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * such as size, color, or material. Each option includes a name, position, and a list of values. The combination
 * of a product option and value creates a [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
 *   
 * Use the `productOptionsCreate` mutation for the following use cases:
 *   
 * - **Add product choices**: Add a new option, like "Size" (Small, Medium, Large) or
 * "Color" (Red, Blue, Green), to an existing product so customers can select their preferred variant.
 * - **Enable personalization features**: Add options such as "Engraving text" to let customers customize their purchase.
 * - **Offer seasonal or limited edition products**: Add a new value
 * (for example, "Holiday red") to an existing option to support limited-time or seasonal variants.
 * - **Integrate with apps that manage product configuration**: Allow third-party apps to add options, like
 * "Bundle size", when customers select or customize
 * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
 * - **Link options to metafields**: Associate a product option with a custom
 * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
 * richer integrations with other systems or apps.
 *   
 * > Note:
 * > The `productOptionsCreate` mutation enforces strict data integrity for product options and variants.
 * All option positions must be sequential, and every option should be used by at least one variant.
 * If you use the [`CREATE` variant strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate#arguments-variantStrategy.enums.CREATE),
 * consider the maximum allowed number of variants for each product
 * (100 by default, and 2,048 if you've
 * [enabled the **Extended Variants** developer preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#create-a-development-store-that-allows-2-048-variants-per-product)).
 *   
 * After you create product options, you can further manage a product's configuration using related mutations:
 *   
 * - [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpdate)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsReorder)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsDelete)
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductOptionsCreateGraphQLQuery extends GraphQLQuery {
  public ProductOptionsCreateGraphQLQuery(String productId, List<OptionCreateInput> options,
      ProductOptionCreateVariantStrategy variantStrategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }if (variantStrategy != null || fieldsSet.contains("variantStrategy")) {
        getInput().put("variantStrategy", variantStrategy);
    }
  }

  public ProductOptionsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<OptionCreateInput> options;

    private ProductOptionCreateVariantStrategy variantStrategy;

    private String queryName;

    public ProductOptionsCreateGraphQLQuery build() {
      return new ProductOptionsCreateGraphQLQuery(productId, options, variantStrategy, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product to update.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Options to add to the product.
     */
    public Builder options(List<OptionCreateInput> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    /**
     * The strategy defines which behavior the mutation should observe regarding variants.
     * If not provided or set to null, the strategy `LEAVE_AS_IS` will be used.
     */
    public Builder variantStrategy(ProductOptionCreateVariantStrategy variantStrategy) {
      this.variantStrategy = variantStrategy;
      this.fieldsSet.add("variantStrategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
