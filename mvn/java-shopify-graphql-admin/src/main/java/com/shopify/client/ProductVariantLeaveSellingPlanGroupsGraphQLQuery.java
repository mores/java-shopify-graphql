package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove multiple groups from a product variant.
 */
public class ProductVariantLeaveSellingPlanGroupsGraphQLQuery extends GraphQLQuery {
  public ProductVariantLeaveSellingPlanGroupsGraphQLQuery(String id,
      List<String> sellingPlanGroupIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (sellingPlanGroupIds != null || fieldsSet.contains("sellingPlanGroupIds")) {
        getInput().put("sellingPlanGroupIds", sellingPlanGroupIds);
    }
  }

  public ProductVariantLeaveSellingPlanGroupsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantLeaveSellingPlanGroups";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> sellingPlanGroupIds;

    private String queryName;

    public ProductVariantLeaveSellingPlanGroupsGraphQLQuery build() {
      return new ProductVariantLeaveSellingPlanGroupsGraphQLQuery(id, sellingPlanGroupIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product variant.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the selling plan groups to leave.
     */
    public Builder sellingPlanGroupIds(List<String> sellingPlanGroupIds) {
      this.sellingPlanGroupIds = sellingPlanGroupIds;
      this.fieldsSet.add("sellingPlanGroupIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
