package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a
 * [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
 */
public class DiscountCodeDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountCodeDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountCodeDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountCodeDeleteGraphQLQuery build() {
      return new DiscountCodeDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the code discount to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
