package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductSetInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates or updates a product in a single request.
 *   
 * Use this mutation when syncing information from an external data source into Shopify.
 *   
 * When using this mutation to update a product, specify that product's `id` in the input.
 *   
 * Any list field (e.g.
 * [collections](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-productsetinput-collections),
 * [metafields](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-productsetinput-metafields),
 * [variants](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-productsetinput-variants))
 * will be updated so that all included entries are either created or updated, and all existing entries not
 * included will be deleted.
 *   
 * All other fields will be updated to the value passed. Omitted fields will not be updated.
 *   
 * When run in synchronous mode, you will get the product back in the response.
 * For versions `2024-04` and earlier, the synchronous mode has an input limit of 100 variants.
 * This limit has been removed for versions `2024-07` and later.
 *   
 * In asynchronous mode, you will instead get a
 * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation)
 * object back. You can then use the
 * [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query to
 * retrieve the updated product data. This query uses the `ProductSetOperation` object to
 * check the status of the operation and to retrieve the details of the updated product and its variants.
 *   
 * If you need to update a subset of variants, use one of the bulk variant mutations:
 * - [productVariantsBulkCreate](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsBulkCreate)
 * - [productVariantsBulkUpdate](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsBulkUpdate)
 * - [productVariantsBulkDelete](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsBulkDelete)
 *   
 * If you need to update options, use one of the product option mutations:
 * - [productOptionsCreate](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsCreate)
 * - [productOptionUpdate](https://shopify.dev/api/admin-graphql/current/mutations/productOptionUpdate)
 * - [productOptionsDelete](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsDelete)
 * - [productOptionsReorder](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsReorder)
 *   
 * See our guide to
 * [sync product data from an external source](https://shopify.dev/api/admin/migrate/new-product-model/sync-data)
 * for more.
 */
public class ProductSetGraphQLQuery extends GraphQLQuery {
  public ProductSetGraphQLQuery(ProductSetInput input, Boolean synchronous, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }
  }

  public ProductSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductSetInput input;

    private Boolean synchronous;

    private String queryName;

    public ProductSetGraphQLQuery build() {
      return new ProductSetGraphQLQuery(input, synchronous, queryName, fieldsSet);
               
    }

    /**
     * The properties of the newly created or updated product.
     */
    public Builder input(ProductSetInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Whether the mutation should be run synchronously or asynchronously.
     *     
     * If `true`, the mutation will return the updated `product`.
     *     
     * If `false`, the mutation will return a `productSetOperation`.
     *     
     * Defaults to `true`.
     *     
     * Setting `synchronous: false` may be desirable depending on the input
     * complexity/size, and should be used if you are experiencing timeouts.
     *     
     * **Note**: When run in the context of a
     * [bulk operation](https://shopify.dev/api/usage/bulk-operations/imports), the mutation will
     * always run synchronously and this argument will be ignored.
     */
    public Builder synchronous(Boolean synchronous) {
      this.synchronous = synchronous;
      this.fieldsSet.add("synchronous");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
