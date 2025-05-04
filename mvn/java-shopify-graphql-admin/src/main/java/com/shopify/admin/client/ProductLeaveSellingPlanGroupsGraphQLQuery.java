package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes multiple groups from a product.
 */
public class ProductLeaveSellingPlanGroupsGraphQLQuery extends GraphQLQuery {
  public ProductLeaveSellingPlanGroupsGraphQLQuery(String id, List<String> sellingPlanGroupIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (sellingPlanGroupIds != null || fieldsSet.contains("sellingPlanGroupIds")) {
        getInput().put("sellingPlanGroupIds", sellingPlanGroupIds);
    }
  }

  public ProductLeaveSellingPlanGroupsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productLeaveSellingPlanGroups";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> sellingPlanGroupIds;

    private String queryName;

    public ProductLeaveSellingPlanGroupsGraphQLQuery build() {
      return new ProductLeaveSellingPlanGroupsGraphQLQuery(id, sellingPlanGroupIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the selling plan groups to add.
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
