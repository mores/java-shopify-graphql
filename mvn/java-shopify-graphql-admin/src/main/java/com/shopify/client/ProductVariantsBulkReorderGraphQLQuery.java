package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductVariantPositionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Reorders multiple variants in a single product. This mutation can be called directly or via the bulkOperation.
 */
public class ProductVariantsBulkReorderGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkReorderGraphQLQuery(String productId,
      List<ProductVariantPositionInput> positions, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (positions != null || fieldsSet.contains("positions")) {
        getInput().put("positions", positions);
    }
  }

  public ProductVariantsBulkReorderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkReorder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<ProductVariantPositionInput> positions;

    private String queryName;

    public ProductVariantsBulkReorderGraphQLQuery build() {
      return new ProductVariantsBulkReorderGraphQLQuery(productId, positions, queryName, fieldsSet);
               
    }

    /**
     * The product ID of the variants to be reordered.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * An array of variant positions.
     */
    public Builder positions(List<ProductVariantPositionInput> positions) {
      this.positions = positions;
      this.fieldsSet.add("positions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
