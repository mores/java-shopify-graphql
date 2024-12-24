package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountAutomaticBasicInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DiscountAutomaticBasicUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBasicUpdateGraphQLQuery(String id,
      DiscountAutomaticBasicInput automaticBasicDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBasicDiscount != null || fieldsSet.contains("automaticBasicDiscount")) {
        getInput().put("automaticBasicDiscount", automaticBasicDiscount);
    }
  }

  public DiscountAutomaticBasicUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBasicUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountAutomaticBasicInput automaticBasicDiscount;

    private String queryName;

    public DiscountAutomaticBasicUpdateGraphQLQuery build() {
      return new DiscountAutomaticBasicUpdateGraphQLQuery(id, automaticBasicDiscount, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
