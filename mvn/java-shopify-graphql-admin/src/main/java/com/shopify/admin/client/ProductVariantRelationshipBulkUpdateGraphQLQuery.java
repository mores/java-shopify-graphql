package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantRelationshipUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates new bundles, updates component quantities in existing bundles, and
 * removes bundle components for one or multiple [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) objects.
 *   
 * Each bundle variant can contain up to 30 component variants with specified
 * quantities. After an app assigns components to a bundle, only that app can
 * manage those components.
 *   
 * > Note:
 * > For most use cases, use [`productBundleCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productBundleCreate)
 * instead, which creates product fixed bundles.
 * `productVariantRelationshipBulkUpdate` is for [variant fixed bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-variant-fixed-bundle),
 * where each variant has its own component configuration.
 */
public class ProductVariantRelationshipBulkUpdateGraphQLQuery extends GraphQLQuery {
  public ProductVariantRelationshipBulkUpdateGraphQLQuery(
      List<ProductVariantRelationshipUpdateInput> input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductVariantRelationshipBulkUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantRelationshipBulkUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantRelationshipUpdateInput> input;

    private String queryName;

    public ProductVariantRelationshipBulkUpdateGraphQLQuery build() {
      return new ProductVariantRelationshipBulkUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input options for the product variant being updated.
     */
    public Builder input(List<ProductVariantRelationshipUpdateInput> input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
