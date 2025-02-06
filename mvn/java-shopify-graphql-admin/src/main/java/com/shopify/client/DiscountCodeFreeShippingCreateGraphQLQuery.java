package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
 * that's applied on a cart and at checkout when a customer enters a code.
 *   
 * > Note:
 * > To create discounts that are automatically applied on a cart and at
 * checkout, use the [`discountAutomaticFreeShippingCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticFreeShippingCreate) mutation.
 */
public class DiscountCodeFreeShippingCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeFreeShippingCreateGraphQLQuery(
      DiscountCodeFreeShippingInput freeShippingCodeDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (freeShippingCodeDiscount != null || fieldsSet.contains("freeShippingCodeDiscount")) {
        getInput().put("freeShippingCodeDiscount", freeShippingCodeDiscount);
    }
  }

  public DiscountCodeFreeShippingCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeFreeShippingCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeFreeShippingInput freeShippingCodeDiscount;

    private String queryName;

    public DiscountCodeFreeShippingCreateGraphQLQuery build() {
      return new DiscountCodeFreeShippingCreateGraphQLQuery(freeShippingCodeDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the discount code.
     */
    public Builder freeShippingCodeDiscount(
        DiscountCodeFreeShippingInput freeShippingCodeDiscount) {
      this.freeShippingCodeDiscount = freeShippingCodeDiscount;
      this.fieldsSet.add("freeShippingCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
