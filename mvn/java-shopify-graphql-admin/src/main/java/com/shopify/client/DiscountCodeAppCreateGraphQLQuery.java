package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeAppInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountCodeAppCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeAppCreateGraphQLQuery(DiscountCodeAppInput codeAppDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (codeAppDiscount != null || fieldsSet.contains("codeAppDiscount")) {
        getInput().put("codeAppDiscount", codeAppDiscount);
    }
  }

  public DiscountCodeAppCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeAppCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeAppInput codeAppDiscount;

    private String queryName;

    public DiscountCodeAppCreateGraphQLQuery build() {
      return new DiscountCodeAppCreateGraphQLQuery(codeAppDiscount, queryName, fieldsSet);
               
    }

    
    public Builder codeAppDiscount(DiscountCodeAppInput codeAppDiscount) {
      this.codeAppDiscount = codeAppDiscount;
      this.fieldsSet.add("codeAppDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
