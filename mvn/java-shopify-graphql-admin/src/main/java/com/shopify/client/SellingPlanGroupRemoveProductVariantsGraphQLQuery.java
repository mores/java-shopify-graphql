package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SellingPlanGroupRemoveProductVariantsGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupRemoveProductVariantsGraphQLQuery(String id,
      List<String> productVariantIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productVariantIds != null || fieldsSet.contains("productVariantIds")) {
        getInput().put("productVariantIds", productVariantIds);
    }
  }

  public SellingPlanGroupRemoveProductVariantsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupRemoveProductVariants";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<String> productVariantIds;

    private String queryName;

    public SellingPlanGroupRemoveProductVariantsGraphQLQuery build() {
      return new SellingPlanGroupRemoveProductVariantsGraphQLQuery(id, productVariantIds, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
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
