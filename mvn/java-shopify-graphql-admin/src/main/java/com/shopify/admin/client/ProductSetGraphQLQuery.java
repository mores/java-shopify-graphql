package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductSetIdentifiers;
import com.shopify.admin.types.ProductSetInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Performs multiple operations to create or update products in a single request.
 *   
 * Use the `productSet` mutation to sync information from an external data source into Shopify, manage large
 * product catalogs, and perform batch updates. The mutation is helpful for bulk product management, including price
 * adjustments, inventory updates, and product lifecycle management.
 *   
 * The behavior of `productSet` depends on the type of field it's modifying:
 *   
 * - **For list fields**: Creates new entries, updates existing entries, and deletes existing entries
 * that aren't included in the mutation's input. Common examples of list fields include
 * [`collections`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-input.fields.collections),
 * [`metafields`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-input.fields.metafields),
 * and [`variants`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-input.fields.variants).
 *   
 * - **For all other field types**: Updates only the included fields. Any omitted fields will remain unchanged.
 *   
 * > Note:
 * > By default, stores have a limit of 100 product variants for each product. You can create a development store and
 * > [enable the **Extended Variants** developer preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#create-a-development-store-that-allows-2-048-variants-per-product)
 * > to create or update a maximum of 2,048 product variants in a single operation.
 *   
 * You can run `productSet` in one of the following modes:
 *   
 * - **Synchronously**: Returns the updated product in the response.
 * - **Asynchronously**: Returns a [`ProductSetOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductSetOperation) object.
 * Use the [`productOperation`](https://shopify.dev/api/admin-graphql/latest/queries/productOperation) query to check the status of the operation and
 * retrieve details of the updated product and its product variants.
 *   
 * If you need to only manage product variants, then use one of the following mutations:
 *   
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * - [`productVariantsBulkDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkDelete)
 *   
 * If you need to only manage product options, then use one of the following mutations:
 *   
 * - [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate)
 * - [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpdate)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsReorder)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsDelete)
 *   
 * Learn more about [syncing product data from an external source](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/sync-data).
 */
public class ProductSetGraphQLQuery extends GraphQLQuery {
  public ProductSetGraphQLQuery(ProductSetInput input, Boolean synchronous,
      ProductSetIdentifiers identifier, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
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

    private ProductSetIdentifiers identifier;

    private String queryName;

    public ProductSetGraphQLQuery build() {
      return new ProductSetGraphQLQuery(input, synchronous, identifier, queryName, fieldsSet);
               
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

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifier(ProductSetIdentifiers identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
