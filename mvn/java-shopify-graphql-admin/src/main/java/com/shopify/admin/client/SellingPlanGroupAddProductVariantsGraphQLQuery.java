package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds multiple product variants to a selling plan group.
 */
public class SellingPlanGroupAddProductVariantsGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupAddProductVariantsGraphQLQuery(String id, List<String> productVariantIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productVariantIds != null || fieldsSet.contains("productVariantIds")) {
        getInput().put("productVariantIds", productVariantIds);
    }
  }

  public SellingPlanGroupAddProductVariantsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupAddProductVariants";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productVariantIds;

    private String queryName;

    public SellingPlanGroupAddProductVariantsGraphQLQuery build() {
      return new SellingPlanGroupAddProductVariantsGraphQLQuery(id, productVariantIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the selling plan group.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the product variants to add.
     */
    public Builder productVariantIds(List<String> productVariantIds) {
      this.productVariantIds = productVariantIds;
      this.fieldsSet.add("productVariantIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
