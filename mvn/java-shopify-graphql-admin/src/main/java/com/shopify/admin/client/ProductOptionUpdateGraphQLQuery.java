package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OptionUpdateInput;
import com.shopify.admin.types.OptionValueCreateInput;
import com.shopify.admin.types.OptionValueUpdateInput;
import com.shopify.admin.types.ProductOptionUpdateVariantStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates an [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
 * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * such as size, color, or material. Each option includes a name, position, and a list of values. The combination
 * of a product option and value creates a [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
 *   
 * Use the `productOptionUpdate` mutation for the following use cases:
 *   
 * - **Update product choices**: Modify an existing option, like "Size" (Small, Medium, Large) or
 * "Color" (Red, Blue, Green), so customers can select their preferred variant.
 * - **Enable personalization features**: Update an option (for example,
 * "Engraving text") to let customers customize their purchase.
 * - **Offer seasonal or limited edition products**: Update a value
 * (for example, "Holiday red") on an existing option to support limited-time or seasonal variants.
 * - **Integrate with apps that manage product configuration**: Allow third-party apps to update options, like
 * "Bundle size", when customers select or customize
 * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
 * - **Link options to metafields**: Associate a product option with a custom
 * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
 * richer integrations with other systems or apps.
 *   
 * > Note:
 * > The `productOptionUpdate` mutation enforces strict data integrity for product options and variants.
 * All option positions must be sequential, and every option should be used by at least one variant.
 *   
 * After you update a product option, you can further manage a product's configuration using related mutations:
 *   
 * - [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsDelete)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsReorder)
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVariantsBulkUpdate)
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
 *   
 * Learn more about the [product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
 * and [adding product data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
 */
public class ProductOptionUpdateGraphQLQuery extends GraphQLQuery {
  public ProductOptionUpdateGraphQLQuery(OptionUpdateInput option, String productId,
      List<OptionValueCreateInput> optionValuesToAdd,
      List<OptionValueUpdateInput> optionValuesToUpdate, List<String> optionValuesToDelete,
      ProductOptionUpdateVariantStrategy variantStrategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (option != null || fieldsSet.contains("option")) {
        getInput().put("option", option);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (optionValuesToAdd != null || fieldsSet.contains("optionValuesToAdd")) {
        getInput().put("optionValuesToAdd", optionValuesToAdd);
    }if (optionValuesToUpdate != null || fieldsSet.contains("optionValuesToUpdate")) {
        getInput().put("optionValuesToUpdate", optionValuesToUpdate);
    }if (optionValuesToDelete != null || fieldsSet.contains("optionValuesToDelete")) {
        getInput().put("optionValuesToDelete", optionValuesToDelete);
    }if (variantStrategy != null || fieldsSet.contains("variantStrategy")) {
        getInput().put("variantStrategy", variantStrategy);
    }
  }

  public ProductOptionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OptionUpdateInput option;

    private String productId;

    private List<OptionValueCreateInput> optionValuesToAdd;

    private List<OptionValueUpdateInput> optionValuesToUpdate;

    private List<String> optionValuesToDelete;

    private ProductOptionUpdateVariantStrategy variantStrategy;

    private String queryName;

    public ProductOptionUpdateGraphQLQuery build() {
      return new ProductOptionUpdateGraphQLQuery(option, productId, optionValuesToAdd, optionValuesToUpdate, optionValuesToDelete, variantStrategy, queryName, fieldsSet);
               
    }

    /**
     * Option to update.
     */
    public Builder option(OptionUpdateInput option) {
      this.option = option;
      this.fieldsSet.add("option");
      return this;
    }

    /**
     * The ID of the Product the Option belongs to.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * New option values to create.
     */
    public Builder optionValuesToAdd(List<OptionValueCreateInput> optionValuesToAdd) {
      this.optionValuesToAdd = optionValuesToAdd;
      this.fieldsSet.add("optionValuesToAdd");
      return this;
    }

    /**
     * Existing option values to update.
     */
    public Builder optionValuesToUpdate(List<OptionValueUpdateInput> optionValuesToUpdate) {
      this.optionValuesToUpdate = optionValuesToUpdate;
      this.fieldsSet.add("optionValuesToUpdate");
      return this;
    }

    /**
     * IDs of the existing option values to delete.
     */
    public Builder optionValuesToDelete(List<String> optionValuesToDelete) {
      this.optionValuesToDelete = optionValuesToDelete;
      this.fieldsSet.add("optionValuesToDelete");
      return this;
    }

    /**
     * The strategy defines which behavior the mutation should observe regarding variants,
     * such as creating variants or deleting them in response to option values to add or to delete.
     * If not provided or set to null, the strategy `LEAVE_AS_IS` will be used.
     */
    public Builder variantStrategy(ProductOptionUpdateVariantStrategy variantStrategy) {
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
