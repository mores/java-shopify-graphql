package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductJoinSellingPlanGroupsGraphQLQuery extends GraphQLQuery {
  public ProductJoinSellingPlanGroupsGraphQLQuery(String id, List<String> sellingPlanGroupIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (sellingPlanGroupIds != null || fieldsSet.contains("sellingPlanGroupIds")) {
        getInput().put("sellingPlanGroupIds", sellingPlanGroupIds);
    }
  }

  public ProductJoinSellingPlanGroupsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productJoinSellingPlanGroups";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> sellingPlanGroupIds;

    private String queryName;

    public ProductJoinSellingPlanGroupsGraphQLQuery build() {
      return new ProductJoinSellingPlanGroupsGraphQLQuery(id, sellingPlanGroupIds, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
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
