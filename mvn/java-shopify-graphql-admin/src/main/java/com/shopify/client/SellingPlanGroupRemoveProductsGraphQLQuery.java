package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes multiple products from a selling plan group.
 */
public class SellingPlanGroupRemoveProductsGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupRemoveProductsGraphQLQuery(String id, List<String> productIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productIds != null || fieldsSet.contains("productIds")) {
        getInput().put("productIds", productIds);
    }
  }

  public SellingPlanGroupRemoveProductsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupRemoveProducts";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productIds;

    private String queryName;

    public SellingPlanGroupRemoveProductsGraphQLQuery build() {
      return new SellingPlanGroupRemoveProductsGraphQLQuery(id, productIds, queryName, fieldsSet);
               
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
     * The IDs of the products to remove.
     */
    public Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      this.fieldsSet.add("productIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
