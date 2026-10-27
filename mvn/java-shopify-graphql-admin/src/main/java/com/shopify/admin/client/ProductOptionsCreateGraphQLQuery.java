package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OptionCreateInput;
import com.shopify.admin.types.ProductOptionCreateVariantStrategy;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates one or more [options](https://shopify.dev/docs/api/admin-graphql/current/objects/ProductOption)
 * on a [product](https://shopify.dev/docs/api/admin-graphql/current/objects/Product),
 * such as size, color, or material. Each option includes a name, position, and a list of values. The combination
 * of a product option and value creates a [product variant](https://shopify.dev/docs/api/admin-graphql/current/objects/ProductVariant).
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
 * If you use the [`CREATE` variant strategy](https://shopify.dev/docs/api/admin-graphql/current/mutations/productOptionsCreate#arguments-variantStrategy.enums.CREATE),
 * consider the maximum allowed number of variants for each product is 2048.
 *   
 * If the product already has an option with the same name, then the mutation returns an
 * `OPTION_ALREADY_EXISTS` error. A product that has only its default variant is the exception,
 * because its implicit `Title` option is a placeholder that the mutation replaces.
 * To declare the complete set of options and variants that a product
 * should have, and let Shopify create, update, or remove them to match, use the
 * [`productSet`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productSet) mutation instead.
 *   
 * After you create product options, you can further manage a product's configuration using related mutations:
 *   
 * - [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productOptionUpdate)
 * - [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productOptionsReorder)
 * - [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productOptionsDelete)
 * - [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productVariantsBulkCreate)
 * - [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productVariantsBulkUpdate)
 * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/current/mutations/productSet)
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

  public ProductOptionsCreateGraphQLQuery(String productId, List<OptionCreateInput> options,
      ProductOptionCreateVariantStrategy variantStrategy, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }if (variantStrategy != null || fieldsSet.contains("variantStrategy")) {
        getInput().put("variantStrategy", variantStrategy);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private List<OptionCreateInput> options;

    private ProductOptionCreateVariantStrategy variantStrategy;

    private String queryName;

    public ProductOptionsCreateGraphQLQuery build() {
      return new ProductOptionsCreateGraphQLQuery(productId, options, variantStrategy, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The ID of the product to update.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
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
     * Options to add to the product.
     */
    public Builder optionsReference(String variableRef) {
      this.variableReferences.put("options", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("OptionCreateInput"))))).build());
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

    /**
     * The strategy defines which behavior the mutation should observe regarding variants.
     * If not provided or set to null, the strategy `LEAVE_AS_IS` will be used.
     */
    public Builder variantStrategyReference(String variableRef) {
      this.variableReferences.put("variantStrategy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ProductOptionCreateVariantStrategy")).build());
      this.fieldsSet.add("variantStrategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
