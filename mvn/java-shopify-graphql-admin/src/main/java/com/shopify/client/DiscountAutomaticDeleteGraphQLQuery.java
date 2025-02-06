package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes an
 * [automatic discount](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
 */
public class DiscountAutomaticDeleteGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DiscountAutomaticDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DiscountAutomaticDeleteGraphQLQuery build() {
      return new DiscountAutomaticDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the automatic discount to delete.
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
