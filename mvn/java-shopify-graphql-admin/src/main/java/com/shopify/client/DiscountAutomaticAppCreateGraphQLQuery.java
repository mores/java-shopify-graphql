package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountAutomaticAppInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountAutomaticAppCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticAppCreateGraphQLQuery(DiscountAutomaticAppInput automaticAppDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (automaticAppDiscount != null || fieldsSet.contains("automaticAppDiscount")) {
        getInput().put("automaticAppDiscount", automaticAppDiscount);
    }
  }

  public DiscountAutomaticAppCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticAppCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountAutomaticAppInput automaticAppDiscount;

    private String queryName;

    public DiscountAutomaticAppCreateGraphQLQuery build() {
      return new DiscountAutomaticAppCreateGraphQLQuery(automaticAppDiscount, queryName, fieldsSet);
               
    }

    
    public Builder automaticAppDiscount(DiscountAutomaticAppInput automaticAppDiscount) {
      this.automaticAppDiscount = automaticAppDiscount;
      this.fieldsSet.add("automaticAppDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
