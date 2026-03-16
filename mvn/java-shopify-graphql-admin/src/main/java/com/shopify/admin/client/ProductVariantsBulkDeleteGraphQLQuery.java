package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes multiple variants in a single [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
 * Specify the product ID and an array of variant IDs to remove variants in bulk.
 * You can call this mutation directly or through the [`bulkOperationRunMutation`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/bulkOperationRunMutation)
 * mutation. Returns the updated product and any [`UserError`](https://shopify.dev/docs/api/admin-graphql/latest/objects/UserError) objects.
 */
public class ProductVariantsBulkDeleteGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkDeleteGraphQLQuery(List<String> variantsIds, String productId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variantsIds != null || fieldsSet.contains("variantsIds")) {
        getInput().put("variantsIds", variantsIds);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }
  }

  public ProductVariantsBulkDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> variantsIds;

    private String productId;

    private String queryName;

    public ProductVariantsBulkDeleteGraphQLQuery build() {
      return new ProductVariantsBulkDeleteGraphQLQuery(variantsIds, productId, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants IDs to delete.
     */
    public Builder variantsIds(List<String> variantsIds) {
      this.variantsIds = variantsIds;
      this.fieldsSet.add("variantsIds");
      return this;
    }

    /**
     * The ID of the product with the variants to update.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
