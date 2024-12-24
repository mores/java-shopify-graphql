package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountAutomaticBasicInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountAutomaticBasicCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBasicCreateGraphQLQuery(
      DiscountAutomaticBasicInput automaticBasicDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (automaticBasicDiscount != null || fieldsSet.contains("automaticBasicDiscount")) {
        getInput().put("automaticBasicDiscount", automaticBasicDiscount);
    }
  }

  public DiscountAutomaticBasicCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBasicCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountAutomaticBasicInput automaticBasicDiscount;

    private String queryName;

    public DiscountAutomaticBasicCreateGraphQLQuery build() {
      return new DiscountAutomaticBasicCreateGraphQLQuery(automaticBasicDiscount, queryName, fieldsSet);
               
    }

    
    public Builder automaticBasicDiscount(DiscountAutomaticBasicInput automaticBasicDiscount) {
      this.automaticBasicDiscount = automaticBasicDiscount;
      this.fieldsSet.add("automaticBasicDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
