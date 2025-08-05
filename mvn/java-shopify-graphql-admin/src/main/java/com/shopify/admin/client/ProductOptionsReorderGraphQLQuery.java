package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OptionReorderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Reorders the [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
 * [option values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue) on a
 * [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * updating the order in which [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * are presented to customers.
 *   
 * The `productOptionsReorder` mutation accepts a list of product options, each identified by `id` or `name`, and an
 * optional list of values (also by `id` or `name`) specifying the new order. The order of options in the
 * mutation's input determines their new positions (for example, the first option becomes `option1`).
 * The order of values within each option determines their new positions. The mutation recalculates the order of
 * variants based on the new option and value order.
 *   
 * Suppose a product has the following variants:
 *   
 * 1. `"Red / Small"`
 * 2. `"Green / Medium"`
 * 3. `"Blue / Small"`
 *   
 * You reorder options and values:
 *   
 * ```
 * options: [
 *   { name: "Size", values: [{ name: "Small" }, { name: "Medium" }] },
 *   { name: "Color", values: [{ name: "Green" }, { name: "Red" }, { name: "Blue" }] }
 * ]
 * ```
 *   
 * The resulting variant order will be:
 *   
 * 1. `"Small / Green"`
 * 2. `"Small / Red"`
 * 3. `"Small / Blue"`
 * 4. `"Medium / Green"`
 *   
 * Use the `productOptionsReorder` mutation for the following use cases:
 *   
 * - **Change the order of product options**: For example, display "Color" before "Size" in a store.
 * - **Reorder option values within an option**: For example, show "Red" before "Blue" in a color picker.
 * - **Control the order of product variants**: The order of options and their
 * values determines the sequence in which variants are listed and selected.
 * - **Highlight best-selling options**: Present the most popular or relevant options and values first.
 * - **Promote merchandising strategies**: Highlight seasonal colors, limited editions, or featured sizes.
 *   
 * > Note:
 * > The `productOptionsReorder` mutation enforces strict data integrity for product options and variants.
 * > All option positions must be sequential, and every option should be used by at least one variant.
 *   
 * After you reorder product options, you can further manage a product's configuration using related mutations:
 *   
 * - [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsDelete)
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [managing product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductOptionsReorderGraphQLQuery extends GraphQLQuery {
  public ProductOptionsReorderGraphQLQuery(String productId, List<OptionReorderInput> options,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }
  }

  public ProductOptionsReorderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsReorder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<OptionReorderInput> options;

    private String queryName;

    public ProductOptionsReorderGraphQLQuery build() {
      return new ProductOptionsReorderGraphQLQuery(productId, options, queryName, fieldsSet);
               
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
     * Options to reorder on the product.
     */
    public Builder options(List<OptionReorderInput> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
