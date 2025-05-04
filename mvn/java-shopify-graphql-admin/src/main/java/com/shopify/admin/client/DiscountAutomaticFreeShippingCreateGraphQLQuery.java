package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a
 * [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
 * that's automatically applied on a cart and at checkout.
 *   
 * > Note:
 * > To create code discounts, use the
 * [`discountCodeFreeShippingCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeFreeShippingCreate)
 * mutation.
 */
public class DiscountAutomaticFreeShippingCreateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticFreeShippingCreateGraphQLQuery(
      DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (freeShippingAutomaticDiscount != null || fieldsSet.contains("freeShippingAutomaticDiscount")) {
        getInput().put("freeShippingAutomaticDiscount", freeShippingAutomaticDiscount);
    }
  }

  public DiscountAutomaticFreeShippingCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticFreeShippingCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount;

    private String queryName;

    public DiscountAutomaticFreeShippingCreateGraphQLQuery build() {
      return new DiscountAutomaticFreeShippingCreateGraphQLQuery(freeShippingAutomaticDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the automatic free shipping discount.
     */
    public Builder freeShippingAutomaticDiscount(
        DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount) {
      this.freeShippingAutomaticDiscount = freeShippingAutomaticDiscount;
      this.fieldsSet.add("freeShippingAutomaticDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
