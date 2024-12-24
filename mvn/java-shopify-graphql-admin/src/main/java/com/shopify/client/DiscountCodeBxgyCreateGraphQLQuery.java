package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeBxgyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountCodeBxgyCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBxgyCreateGraphQLQuery(DiscountCodeBxgyInput bxgyCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (bxgyCodeDiscount != null || fieldsSet.contains("bxgyCodeDiscount")) {
        getInput().put("bxgyCodeDiscount", bxgyCodeDiscount);
    }
  }

  public DiscountCodeBxgyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBxgyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeBxgyInput bxgyCodeDiscount;

    private String queryName;

    public DiscountCodeBxgyCreateGraphQLQuery build() {
      return new DiscountCodeBxgyCreateGraphQLQuery(bxgyCodeDiscount, queryName, fieldsSet);
               
    }

    
    public Builder bxgyCodeDiscount(DiscountCodeBxgyInput bxgyCodeDiscount) {
      this.bxgyCodeDiscount = bxgyCodeDiscount;
      this.fieldsSet.add("bxgyCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
