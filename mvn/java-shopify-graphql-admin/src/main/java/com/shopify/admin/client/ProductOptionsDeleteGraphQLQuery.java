package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductOptionDeleteStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes one or more [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
 * from a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product). Product options
 * define the choices available for a product, such as size, color, or material.
 *   
 * > Caution:
 * > Removing an option can affect a product's
 * > [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) and their
 * > configuration. Deleting an option might also delete associated option values and, depending on the chosen
 * > [strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productoptionsdelete#arguments-strategy),
 * > might affect variants.
 *   
 * Use the `productOptionsDelete` mutation for the following use cases:
 *   
 * - **Simplify product configuration**: Remove obsolete or unnecessary options
 * (for example, discontinue "Material" if all variants are now the same material).
 * - **Clean up after seasonal or limited-time offerings**: Delete options that are no longer
 * relevant (for example, "Holiday edition").
 * - **Automate catalog management**: Enable apps or integrations to programmatically remove options as product
 * data changes.
 *   
 * > Note:
 * > The `productOptionsDelete` mutation enforces strict data integrity for product options and variants.
 * > All option positions must remain sequential, and every remaining option must be used by at least one variant.
 *   
 * After you delete a product option, you can further manage a product's configuration using related mutations:
 *   
 * - [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate)
 * - [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpdate)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsReorder)
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductOptionsDeleteGraphQLQuery extends GraphQLQuery {
  public ProductOptionsDeleteGraphQLQuery(String productId, List<String> options,
      ProductOptionDeleteStrategy strategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }if (strategy != null || fieldsSet.contains("strategy")) {
        getInput().put("strategy", strategy);
    }
  }

  public ProductOptionsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<String> options;

    private ProductOptionDeleteStrategy strategy;

    private String queryName;

    public ProductOptionsDeleteGraphQLQuery build() {
      return new ProductOptionsDeleteGraphQLQuery(productId, options, strategy, queryName, fieldsSet);
               
    }

    /**
     * ID of the product from which to delete the options.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * IDs of the options to delete from the product.
     */
    public Builder options(List<String> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    /**
     * The strategy defines which behavior the mutation should observe,such as how
     * to handle a situation where deleting an option would result in duplicate variants.
     */
    public Builder strategy(ProductOptionDeleteStrategy strategy) {
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
