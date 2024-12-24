package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeBxgyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountCodeBxgyUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBxgyUpdateGraphQLQuery(String id, DiscountCodeBxgyInput bxgyCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (bxgyCodeDiscount != null || fieldsSet.contains("bxgyCodeDiscount")) {
        getInput().put("bxgyCodeDiscount", bxgyCodeDiscount);
    }
  }

  public DiscountCodeBxgyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBxgyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeBxgyInput bxgyCodeDiscount;

    private String queryName;

    public DiscountCodeBxgyUpdateGraphQLQuery build() {
      return new DiscountCodeBxgyUpdateGraphQLQuery(id, bxgyCodeDiscount, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
