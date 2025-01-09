package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductVariantRelationshipUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates new bundles, updates existing bundles, and removes bundle components for one or multiple bundles.
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
